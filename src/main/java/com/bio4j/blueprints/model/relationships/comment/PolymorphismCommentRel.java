

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.PolymorphismComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Description of polymorphism(s)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PolymorphismCommentRel extends BasicCommentRel implements PolymorphismComment{

    public static final String NAME = "COMMENT_POLYMORPHISM";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "polymorphism";

    public PolymorphismCommentRel(com.tinkerpop.blueprints.Edge e){
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


