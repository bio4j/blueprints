

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.DisruptionPhenotypeComment;
import com.bio4j.blueprints.model.Edge;


/**
 * Description of the effects caused by the disruption of a protein-encoding gene
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DisruptionPhenotypeCommentRel extends BasicCommentRel implements DisruptionPhenotypeComment{

    public static final String NAME = "COMMENT_DISRUPTION_PHENOTYPE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "disruption phenotype";

    public DisruptionPhenotypeCommentRel(com.tinkerpop.blueprints.Edge e){
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
