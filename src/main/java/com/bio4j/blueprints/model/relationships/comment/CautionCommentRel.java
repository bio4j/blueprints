

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.CautionComment;
import com.bio4j.blueprints.model.Edge;


/**
 * Warning about possible errors and/or grounds for confusion
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CautionCommentRel extends BasicCommentRel implements CautionComment{

    public static final String NAME = "COMMENT_CAUTION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "caution";

    public CautionCommentRel(com.tinkerpop.blueprints.Edge e){
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

