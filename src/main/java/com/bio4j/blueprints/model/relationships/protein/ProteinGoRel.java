

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.GoTermNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.protein.ProteinGo;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinGoRel extends Edge implements ProteinGo{

    public static final String NAME = "PROTEIN_GO";

    public static final String EVIDENCE_PROPERTY = "evidence";

    public ProteinGoRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getEvidence(){    return String.valueOf(edge.getProperty(EVIDENCE_PROPERTY));}

    @Override
    public void setEvidence(String value){  edge.setProperty(EVIDENCE_PROPERTY, value);}

    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public GoTermNode getGoTerm(){
        return new GoTermNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "evidence = " + getEvidence();
    }

}
