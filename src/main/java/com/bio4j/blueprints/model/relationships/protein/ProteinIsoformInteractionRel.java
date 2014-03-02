

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.IsoformNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.protein.ProteinIsoformInteraction;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinIsoformInteractionRel extends Edge implements ProteinIsoformInteraction{

    public static final String NAME = "PROTEIN_ISOFORM_INTERACTION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "interaction";

    public static final String ORGANISMS_DIFFER_PROPERTY = "protein_isoform_interaction_organisms_differ";
    public static final String EXPERIMENTS_PROPERTY = "protein_isoform_interaction_experiments";
    public static final String INTACT_ID_1_PROPERTY = "protein_isoform_interaction_intact_id_1";
    public static final String INTACT_ID_2_PROPERTY = "protein_isoform_interaction_intact_id_2";

    public ProteinIsoformInteractionRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getOrganismsDiffer(){    return String.valueOf(edge.getProperty(ORGANISMS_DIFFER_PROPERTY));}
    @Override
    public String getExperiments(){  return String.valueOf(edge.getProperty(EXPERIMENTS_PROPERTY));}
    @Override
    public String getIntactId2(){    return String.valueOf(edge.getProperty(INTACT_ID_2_PROPERTY));}
    @Override
    public String getIntactId1(){  return String.valueOf(edge.getProperty(INTACT_ID_1_PROPERTY));}

    @Override
    public void setOrganismsDiffer(String value){  edge.setProperty(ORGANISMS_DIFFER_PROPERTY, value);}
    @Override
    public void setExperiments(String value){    edge.setProperty(EXPERIMENTS_PROPERTY, value);}
    @Override
    public void setIntactId2(String value){  edge.setProperty(INTACT_ID_2_PROPERTY, value);}
    @Override
    public void setIntactId1(String value){    edge.setProperty(INTACT_ID_1_PROPERTY, value);}

    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public IsoformNode getIsoformNode(){
        return new IsoformNode(getVertex(Direction.OUT));
    }
    
    
    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "organisms differ = " + getOrganismsDiffer() + "\n" +
                "experiments = " + getExperiments() + "\n" +
                "intactId 1 = " + getIntactId1() + "\n" +
                "intactId 2 = " + getIntactId2();
    }

}