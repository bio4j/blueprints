

package com.bio4j.blueprints.model.relationships.citation.thesis;

import com.bio4j.blueprints.model.nodes.citation.ThesisNode;
import com.bio4j.model.relationships.citation.thesis.ThesisAuthor;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Thesis author
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ThesisAuthorRel extends Edge implements ThesisAuthor{

    public static final String NAME = "THESIS_AUTHOR";

    public ThesisAuthorRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ThesisNode getThesis(){
        return new ThesisNode(getVertex(Direction.IN));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
