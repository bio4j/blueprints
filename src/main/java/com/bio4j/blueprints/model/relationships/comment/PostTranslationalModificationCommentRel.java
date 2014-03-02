

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.blueprints.model.Edge;

/**
 * Post-translational modifications
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PostTranslationalModificationCommentRel extends BasicCommentRel{

    public static final String NAME = "COMMENT_POST_TRANSLATIONAL_MODIFICATION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "PTM";

    public PostTranslationalModificationCommentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String getLabel() {
        return NAME;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}

