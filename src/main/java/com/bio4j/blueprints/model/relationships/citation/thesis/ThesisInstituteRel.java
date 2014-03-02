

package com.bio4j.blueprints.model.relationships.citation.thesis;

import com.bio4j.blueprints.model.nodes.InstituteNode;
import com.bio4j.blueprints.model.nodes.citation.ThesisNode;
import com.bio4j.model.relationships.citation.thesis.ThesisInstitute;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Thesis institute
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ThesisInstituteRel extends Edge implements ThesisInstitute{

    public static final String NAME = "THESIS_INSTITUTE";

    public ThesisInstituteRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ThesisNode getThesis(){
        return new ThesisNode(getVertex(Direction.IN));
    }
    
    @Override
    public InstituteNode getInstitute(){
        return new InstituteNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
