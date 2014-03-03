

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.protein.ProteinPfamRel;
import com.bio4j.model.nodes.Pfam;
import com.bio4j.model.nodes.Protein;
import com.tinkerpop.blueprints.Direction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Pfam family
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PfamNode extends Vertex implements Pfam{

    public static final String NODE_TYPE = PfamNode.class.getCanonicalName();

    /** Pfam family id **/
    public static final String ID_PROPERTY = "pfam_id";
    /** Pfam family name **/
    public static final String NAME_PROPERTY = "pfam_name";


    public PfamNode(com.tinkerpop.blueprints.Vertex v){
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
        List<Protein> proteins = new ArrayList<Protein>();
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, ProteinPfamRel.NAME).iterator();
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
