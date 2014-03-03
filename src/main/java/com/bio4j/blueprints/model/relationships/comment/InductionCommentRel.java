

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.InductionComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Effects of environmental factors on gene expression
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class InductionCommentRel extends BasicCommentRel implements InductionComment{

    public static final String NAME = "COMMENT_INDUCTION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "induction";

    public InductionCommentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
