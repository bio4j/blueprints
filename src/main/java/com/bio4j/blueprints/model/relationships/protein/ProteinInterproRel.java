

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.InterproNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.protein.ProteinInterpro;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinInterproRel extends Edge implements ProteinInterpro{

    public static final String NAME = "PROTEIN_INTERPRO";

    public ProteinInterproRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public InterproNode getInterpro(){
        return new InterproNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}