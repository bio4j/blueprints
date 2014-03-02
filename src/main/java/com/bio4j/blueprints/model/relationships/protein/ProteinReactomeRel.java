

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.reactome.ReactomeTermNode;
import com.bio4j.model.relationships.protein.ProteinReactome;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinReactomeRel extends Edge implements ProteinReactome{

    public static final String NAME = "PROTEIN_REACTOME";

    public ProteinReactomeRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public ReactomeTermNode getReactomeTerm(){
        return new ReactomeTermNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }


}
