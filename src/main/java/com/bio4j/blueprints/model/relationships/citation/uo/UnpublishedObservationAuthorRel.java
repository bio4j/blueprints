

package com.bio4j.blueprints.model.relationships.citation.uo;

import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.citation.UnpublishedObservationNode;
import com.bio4j.model.relationships.citation.uo.UnpublishedObservationAuthor;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Unpublished observation authors
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class UnpublishedObservationAuthorRel extends Edge implements UnpublishedObservationAuthor {

    public static final String NAME = "UNPUBLISHED_OBSERVATION_AUTHOR";

    public UnpublishedObservationAuthorRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public UnpublishedObservationNode getUnpublishedObservation(){
        return new UnpublishedObservationNode(getVertex(Direction.IN));
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
