

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.DevelopmentalStageComment;
import com.bio4j.blueprints.model.Edge;


/**
 * Expression of the gene product according to the cell stage and/or tissue or organism development
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class DevelopmentalStageCommentRel extends BasicCommentRel implements DevelopmentalStageComment{

    public static final String NAME = "COMMENT_DEVELOPMENTAL_STAGE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "developmental stage";

    public DevelopmentalStageCommentRel(com.tinkerpop.blueprints.Edge e){
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
