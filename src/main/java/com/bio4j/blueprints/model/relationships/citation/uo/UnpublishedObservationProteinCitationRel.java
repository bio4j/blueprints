

package com.bio4j.blueprints.model.relationships.citation.uo;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.citation.UnpublishedObservationNode;
import com.bio4j.model.relationships.citation.uo.UnpublishedObservationProteinCitation;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;


/**
 * Proteins referenced by unpublished observations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class UnpublishedObservationProteinCitationRel extends Edge implements UnpublishedObservationProteinCitation{

    public static final String NAME = "UNPUBLISHED_OBSERVATION_PROTEIN_CITATION";

    public UnpublishedObservationProteinCitationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public UnpublishedObservationNode getUnpublishedObservation(){
        return new UnpublishedObservationNode(getVertex(Direction.IN));
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
