

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.IsoformNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.protein.ProteinIsoform;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ProteinIsoformRel extends Edge implements ProteinIsoform{

    public static final String NAME = "PROTEIN_ISOFORM";

    public ProteinIsoformRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

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

}