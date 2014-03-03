

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.CatalyticActivityComment;
import com.bio4j.blueprints.model.Edge;


/**
 * Reaction(s) catalyzed by an enzyme
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class CatalyticActivityCommentRel extends BasicCommentRel implements CatalyticActivityComment{

    public static final String NAME = "COMMENT_CATALYTIC_ACTIVITY";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "catalytic activity";

    public CatalyticActivityCommentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    /**
     *
     * @return
     */
    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
