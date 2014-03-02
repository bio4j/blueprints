

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.FunctionComment;
import com.bio4j.blueprints.model.Edge;

/**
 * General function(s) of a protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class FunctionCommentRel extends BasicCommentRel implements FunctionComment{

    public static final String NAME = "COMMENT_FUNCTION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "function";

    public FunctionCommentRel(com.tinkerpop.blueprints.Edge e){
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

