

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.PathwayComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Associated metabolic pathways
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PathwayCommentRel extends BasicCommentRel implements PathwayComment{

    public static final String NAME = "COMMENT_PATHWAY";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "pathway";

    public PathwayCommentRel(com.tinkerpop.blueprints.Edge e){
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
