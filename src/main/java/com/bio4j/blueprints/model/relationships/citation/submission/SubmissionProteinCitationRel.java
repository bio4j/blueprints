

package com.bio4j.blueprints.model.relationships.citation.submission;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.citation.SubmissionNode;
import com.bio4j.model.relationships.citation.submission.SubmissionProteinCitation;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Proteins referenced by a submission
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class SubmissionProteinCitationRel extends Edge implements SubmissionProteinCitation{

    public static final String NAME = "SUBMISSION_PROTEIN_CITATION";

    public SubmissionProteinCitationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.OUT));
    }
    
    @Override
    public SubmissionNode getSubmission(){
        return new SubmissionNode(getVertex(Direction.IN));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
