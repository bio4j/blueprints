

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.SubcellularLocationNode;
import com.bio4j.model.relationships.protein.ProteinSubcellularLocation;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ProteinSubcellularLocationRel extends Edge implements ProteinSubcellularLocation{

    public static final String NAME = "PROTEIN_SUBCELLULAR_LOCATION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "subcellular location";

    public static final String EVIDENCE_PROPERTY = "protein_subcellular_location_evidence";
    public static final String STATUS_PROPERTY = "protein_subcellular_location_status";
    public static final String TOPOLOGY_STATUS_PROPERTY = "protein_subcellular_location_topology_status";
    public static final String TOPOLOGY_PROPERTY = "protein_subcellular_location_topology";

    public ProteinSubcellularLocationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getEvidence(){    return String.valueOf(edge.getProperty(EVIDENCE_PROPERTY));}
    @Override
    public String getStatus(){  return String.valueOf(edge.getProperty(STATUS_PROPERTY));}
    @Override
    public String getTopology(){    return String.valueOf(edge.getProperty(TOPOLOGY_PROPERTY));}
    @Override
    public String getTopologyStatus(){  return String.valueOf(edge.getProperty(TOPOLOGY_STATUS_PROPERTY));}

    @Override
    public void setEvidence(String value){  edge.setProperty(EVIDENCE_PROPERTY, value);}
    @Override
    public void setStatus(String value){    edge.setProperty(STATUS_PROPERTY, value);}
    @Override
    public void setTopology(String value){  edge.setProperty(TOPOLOGY_PROPERTY, value);}
    @Override
    public void setTopologyStatus(String value){    edge.setProperty(TOPOLOGY_STATUS_PROPERTY, value);}

    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public SubcellularLocationNode getSubcellularLocation(){
        return new SubcellularLocationNode(getVertex(Direction.OUT));
    }
    
    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "status = " + getStatus() +
                "\nevidence = " + getEvidence() +
                "\ntopology = " + getTopology() +
                "\ntopology status = " + getTopologyStatus();
    }


}