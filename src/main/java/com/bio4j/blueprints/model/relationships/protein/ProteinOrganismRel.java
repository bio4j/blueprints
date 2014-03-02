

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.OrganismNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.protein.ProteinOrganism;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinOrganismRel extends Edge implements ProteinOrganism{

    public static final String NAME = "PROTEIN_ORGANISM";

    public ProteinOrganismRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public OrganismNode getOrganism(){
        return new OrganismNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}