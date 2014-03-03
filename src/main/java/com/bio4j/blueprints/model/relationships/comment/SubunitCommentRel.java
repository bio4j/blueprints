

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.SubunitComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Interaction with other protein(s)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class SubunitCommentRel extends BasicCommentRel implements SubunitComment{

    public static final String NAME = "COMMENT_SUBUNIT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "subunit";

    public SubunitCommentRel(com.tinkerpop.blueprints.Edge e){
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


