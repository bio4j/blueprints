

package com.bio4j.blueprints.model.relationships.citation.submission;

import com.bio4j.blueprints.model.nodes.citation.DBNode;
import com.bio4j.blueprints.model.nodes.citation.SubmissionNode;
import com.bio4j.model.relationships.citation.submission.SubmissionDb;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Submission database
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class SubmissionDbRel extends Edge implements SubmissionDb{

    public static final String NAME = "SUBMISSION_DB";

    public static final String DATE_PROPERTY = "submission_db_date";

    public SubmissionDbRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getDate(){    return String.valueOf(edge.getProperty(DATE_PROPERTY));}

    @Override
    public void setDate(String value){  edge.setProperty(DATE_PROPERTY, value);}
    
    @Override
    public DBNode getDB(){
        return new DBNode(getVertex(Direction.OUT));
    }
    
    @Override
    public SubmissionNode getSubmission(){
        return new SubmissionNode(getVertex(Direction.IN));
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "date = " + getDate();
    }

}
