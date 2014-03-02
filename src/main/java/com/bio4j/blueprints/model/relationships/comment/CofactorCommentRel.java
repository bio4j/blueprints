

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.CofactorComment;
import com.bio4j.blueprints.model.Edge;


/**
 * Non-protein substance required for enzyme activity
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CofactorCommentRel extends BasicCommentRel implements CofactorComment{

    public static final String NAME = "COMMENT_COFACTOR";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "cofactor";

    public CofactorCommentRel(com.tinkerpop.blueprints.Edge e){
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
