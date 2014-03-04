

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.protein.ProteinKeywordRel;
import com.bio4j.model.nodes.Keyword;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Keyword
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class KeywordNode extends Vertex implements Keyword{

    public static final String NODE_TYPE = KeywordNode.class.getCanonicalName();

    /** Keyword id **/
    public static final String ID_PROPERTY = "keyword_id";
    /** Keyword name **/
    public static final String NAME_PROPERTY = "keyword_name";


    public KeywordNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }
    
    
    @Override
    public String getId(){  return String.valueOf(vertex.getProperty(ID_PROPERTY));}
    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setId(String value){    vertex.setProperty(ID_PROPERTY, value);}
    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}

    public List<ProteinNode> getAssociatedProteins(){
        List<ProteinNode> proteins = new LinkedList<ProteinNode>();
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, ProteinKeywordRel.NAME).iterator();
        while(iterator.hasNext()){
            ProteinNode protein = new ProteinNode(iterator.next());
            proteins.add(protein);                        
        }
        return proteins;  
    }

    @Override
    public String toString(){
        return "id = " + getId() + "\n" +
                "name = " + getName();
    }

}
