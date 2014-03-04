

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.MiscellaneousComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Any relevant information that doesn’t fit in any other defined sections
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class MiscellaneousCommentRel extends BasicCommentRel implements MiscellaneousComment{

    public static final String NAME = "COMMENT_MISCELLANEOUS";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "miscellaneous";

    public MiscellaneousCommentRel(com.tinkerpop.blueprints.Edge e){
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

