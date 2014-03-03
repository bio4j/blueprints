

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.PharmaceuticalComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Use of as a pharmaceutical drug
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PharmaceuticalCommentRel extends BasicCommentRel implements PharmaceuticalComment{

    public static final String NAME = "COMMENT_PHARMACEUTICAL";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "pharmaceutical";

    public PharmaceuticalCommentRel(com.tinkerpop.blueprints.Edge e){
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
