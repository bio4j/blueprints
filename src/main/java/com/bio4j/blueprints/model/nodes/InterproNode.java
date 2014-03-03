

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.protein.ProteinInterproRel;
import com.bio4j.model.nodes.Interpro;
import com.bio4j.model.nodes.Protein;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Interpro term
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class InterproNode extends Vertex implements Interpro{

    public static final String NODE_TYPE = InterproNode.class.getCanonicalName();

    /** Interpro term id **/
    public static final String ID_PROPERTY = "interpro_id";
    /** Interpro term name **/
    public static final String NAME_PROPERTY = "interpro_name";


    public InterproNode(com.tinkerpop.blueprints.Vertex v){
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

    
    @Override
    public List<Protein> getAssociatedProteins(){
        List<Protein> proteins = new LinkedList<Protein>();
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, ProteinInterproRel.NAME).iterator();
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
