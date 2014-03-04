

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.blueprints.model.nodes.CommentTypeNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.comment.BasicComment;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author ppareja
 */
public abstract class BasicCommentRel extends Edge implements BasicComment{

    // public static final String NAME = "BASIC_COMMENT";
    public static String NAME;

    public static final String TEXT_PROPERTY = "comment_text";
    public static final String STATUS_PROPERTY = "comment_status";
    public static final String EVIDENCE_PROPERTY = "comment_evidence";


    public BasicCommentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String getText(){
        return String.valueOf(edge.getProperty(TEXT_PROPERTY));
    }
    @Override
    public String getStatus(){
        return String.valueOf(edge.getProperty(STATUS_PROPERTY));
    }
    @Override
    public String getEvidence(){
        return String.valueOf(edge.getProperty(EVIDENCE_PROPERTY));
    }

    @Override
    public void setText(String value){
        edge.setProperty(TEXT_PROPERTY, value);
    }    
    @Override
    public void setStatus(String value){
        edge.setProperty(STATUS_PROPERTY, value);
    }
    @Override
    public void setEvidence(String value){
        edge.setProperty(EVIDENCE_PROPERTY, value);
    }

    @Override
    public String toString(){
        return "text = " + getText() + "\n" +
                "status = " + getStatus();
    }

    @Override
    public ProteinNode getProtein() {
        return new ProteinNode(getVertex(Direction.IN));
    }

    @Override
    public CommentTypeNode getCommentType() {
        return new CommentTypeNode(getVertex(Direction.OUT));
    }

}

