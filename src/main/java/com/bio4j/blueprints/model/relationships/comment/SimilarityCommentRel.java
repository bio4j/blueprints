

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.SimilarityComment;
import com.bio4j.blueprints.model.Edge;


/**
 * Description of the sequence similarities with other proteins and family attribution
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SimilarityCommentRel extends BasicCommentRel implements SimilarityComment{

    public static final String NAME = "COMMENT_SIMILARITY";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "similarity";

    public SimilarityCommentRel(com.tinkerpop.blueprints.Edge e){
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
