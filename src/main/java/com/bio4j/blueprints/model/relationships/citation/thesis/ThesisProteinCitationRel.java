

package com.bio4j.blueprints.model.relationships.citation.thesis;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.citation.ThesisNode;
import com.bio4j.model.relationships.citation.thesis.ThesisProteinCitation;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Proteins referenced by a Thesis
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ThesisProteinCitationRel extends Edge implements ThesisProteinCitation{

    public static final String NAME = "THESIS_PROTEIN_CITATION";

    public ThesisProteinCitationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ThesisNode getThesis(){
        return new ThesisNode(getVertex(Direction.IN));
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
