

package com.bio4j.blueprints.model.nodes.reactome;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.relationships.protein.ProteinReactomeRel;
import com.bio4j.model.nodes.Protein;
import com.bio4j.model.nodes.reactome.ReactomeTerm;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Gene ontology term
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ReactomeTermNode extends Vertex implements ReactomeTerm{

    public static final String NODE_TYPE = ReactomeTermNode.class.getCanonicalName();

    /** Reactome Term id **/
    public static final String ID_PROPERTY = "reactome_term_id";
    /** Reactome term pathway name **/
    public static final String PATHWAY_NAME_PROPERTY = "reactome_term_pathway_name";


    public ReactomeTermNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getId(){  return String.valueOf(vertex.getProperty(ID_PROPERTY));}
    @Override
    public String getPathwayName(){    return String.valueOf(vertex.getProperty(PATHWAY_NAME_PROPERTY));}


    @Override
    public void setId(String value){    vertex.setProperty(ID_PROPERTY, value);}
    @Override
    public void setPathwayName(String value){  vertex.setProperty(PATHWAY_NAME_PROPERTY, value);}
  
    
    @Override
    public List<Protein> getAssociatedProteins(){
        List<Protein> proteins = new LinkedList<Protein>();
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, ProteinReactomeRel.NAME).iterator();
        while(iterator.hasNext()){
            ProteinNode protein = new ProteinNode(iterator.next());
            proteins.add(protein);                        
        }
        return proteins;  
    }
      
    @Override
    public String toString(){
        return "id = " + getId() +
                "\npathway name = " + getPathwayName();
    }

}
