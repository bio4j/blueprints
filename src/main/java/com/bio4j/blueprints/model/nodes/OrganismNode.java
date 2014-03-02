

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.protein.ProteinOrganismRel;
import com.bio4j.model.nodes.Organism;
import com.bio4j.model.nodes.Protein;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Uniprot taxonomy organism
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OrganismNode extends Vertex implements Organism{

    public static final String NODE_TYPE = OrganismNode.class.getCanonicalName();

    public static final String SCIENTIFIC_NAME_PROPERTY = "organism_scientific_name";
    public static final String COMMON_NAME_PROPERTY = "organism_common_name";
    public static final String SYNONYM_NAME_PROPERTY = "organism_synonym_name";
    public static final String NCBI_TAXONOMY_ID_PROPERTY = "organism_ncbi_taxonomy_id";


    public OrganismNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getScientificName(){    return String.valueOf(vertex.getProperty(SCIENTIFIC_NAME_PROPERTY));}
    @Override
    public String getCommonName(){    return String.valueOf(vertex.getProperty(COMMON_NAME_PROPERTY));}
    @Override
    public String getSynonymName(){    return String.valueOf(vertex.getProperty(SYNONYM_NAME_PROPERTY));}
    @Override
    public String getNcbiTaxonomyId(){    return String.valueOf(vertex.getProperty(NCBI_TAXONOMY_ID_PROPERTY));}

    @Override
    public void setScientificName(String value){  vertex.setProperty(SCIENTIFIC_NAME_PROPERTY, value);}
    @Override
    public void setCommonName(String value){  vertex.setProperty(COMMON_NAME_PROPERTY, value);}
    @Override
    public void setSynonymName(String value){  vertex.setProperty(SYNONYM_NAME_PROPERTY, value);}
    @Override
    public void setNcbiTaxonomyId(String value){    vertex.setProperty(NCBI_TAXONOMY_ID_PROPERTY, value);}
    
    
    @Override
    public List<Protein> getAssociatedProteins(){
        List<Protein> proteins = new LinkedList<Protein>();
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, ProteinOrganismRel.NAME).iterator();
        while(iterator.hasNext()){
            ProteinNode protein = new ProteinNode(iterator.next());
            proteins.add(protein);                        
        }
        return proteins;  
    }
    
}
