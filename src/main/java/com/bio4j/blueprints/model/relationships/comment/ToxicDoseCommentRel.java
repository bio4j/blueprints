
package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.ToxicDoseComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Lethal, paralytic, effect dose or lethal concentration of a toxin
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ToxicDoseCommentRel extends BasicCommentRel implements ToxicDoseComment{ 

    public static final String NAME = "COMMENT_TOXIC_DOSE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "toxic dose";

    public ToxicDoseCommentRel(com.tinkerpop.blueprints.Edge e){
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

