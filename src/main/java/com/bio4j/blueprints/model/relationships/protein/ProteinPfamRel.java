

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.PfamNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.protein.ProteinPfam;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ProteinPfamRel extends Edge implements ProteinPfam{

    public static final String NAME = "PROTEIN_PFAM";

    public ProteinPfamRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public PfamNode getPfam(){
        return new PfamNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}