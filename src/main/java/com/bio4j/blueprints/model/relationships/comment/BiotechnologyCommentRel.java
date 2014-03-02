

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.BiotechnologyComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Use in a biotechnological process
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class BiotechnologyCommentRel extends BasicCommentRel implements BiotechnologyComment{

    public static final String NAME = "COMMENT_BIOTECHNOLOGY";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "biotechnology";

    public BiotechnologyCommentRel(com.tinkerpop.blueprints.Edge e){
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


