

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.DiseaseComment;
import com.bio4j.blueprints.model.Edge;

/**
 * Disease(s) associated with protein defect(s)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DiseaseCommentRel extends BasicCommentRel implements DiseaseComment{

    public static final String NAME = "COMMENT_DISEASE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "disease";

    public DiseaseCommentRel(com.tinkerpop.blueprints.Edge e){
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

