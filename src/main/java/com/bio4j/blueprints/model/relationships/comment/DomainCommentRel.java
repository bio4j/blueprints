

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.DomainComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Relevant information on protein domain(s)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DomainCommentRel extends BasicCommentRel implements DomainComment{

    public static final String NAME = "COMMENT_DOMAIN";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "domain";

    public DomainCommentRel(com.tinkerpop.blueprints.Edge e){
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

