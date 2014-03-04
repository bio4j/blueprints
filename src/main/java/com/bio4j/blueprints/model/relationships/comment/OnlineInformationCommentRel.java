

package com.bio4j.blueprints.model.relationships.comment;

import com.bio4j.model.relationships.comment.OnlineInformationComment;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author ppareja
 */
public final class OnlineInformationCommentRel extends BasicCommentRel implements OnlineInformationComment{

    public static final String NAME = "COMMENT_ONLINE_INFORMATION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "online information";

    public static final String NAME_PROPERTY = "online_information_comment_name";
    public static final String LINK_PROPERTY = "online_information_comment_link";

    public OnlineInformationCommentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getName(){
        return String.valueOf(edge.getProperty(NAME_PROPERTY));
    }
    @Override
    public String getLink(){
        return String.valueOf(edge.getProperty(LINK_PROPERTY));
    }

    @Override
    public void setName(String value){
        edge.setProperty(NAME_PROPERTY, value);
    }
    @Override
    public void setLink(String value){
        edge.setProperty(LINK_PROPERTY, value);
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

