

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.EnzymeRegulationComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Enzyme regulatory mechanism
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class EnzymeRegulationCommentRel extends BasicCommentRel implements EnzymeRegulationComment{

    public static final String NAME = "COMMENT_ENZYME_REGULATION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "enzyme regulation";

    public EnzymeRegulationCommentRel(com.tinkerpop.blueprints.Edge e){
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
