

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.TissueSpecificityComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Expression of the gene product in different tissues
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TissueSpecificityCommentRel extends BasicCommentRel implements TissueSpecificityComment{

    public static final String NAME = "COMMENT_TISSUE_SPECIFICITY";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "tissue specificity";

    public TissueSpecificityCommentRel(com.tinkerpop.blueprints.Edge e){
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

