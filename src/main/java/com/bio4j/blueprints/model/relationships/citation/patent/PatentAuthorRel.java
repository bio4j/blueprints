

package com.bio4j.blueprints.model.relationships.citation.patent;

import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.citation.PatentNode;
import com.bio4j.model.relationships.citation.patent.PatentAuthor;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Patent author
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PatentAuthorRel extends Edge implements PatentAuthor{

    public static final String NAME = "PATENT_AUTHOR";

    public PatentAuthorRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public PatentNode getPatent(){
        return new PatentNode(getVertex(Direction.IN));
    }
    
    @Override
    public PersonNode getAuthor(){
        return new PersonNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
