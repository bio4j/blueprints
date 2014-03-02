

package com.bio4j.blueprints.model.relationships.citation.onarticle;

import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.citation.OnlineArticleNode;
import com.bio4j.model.relationships.citation.onarticle.OnlineArticleAuthor;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Online article authors 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OnlineArticleAuthorRel extends Edge implements OnlineArticleAuthor{

    public static final String NAME = "ONLINE_ARTICLE_AUTHOR";

    public OnlineArticleAuthorRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public OnlineArticleNode getOnlineArticle(){
        return new OnlineArticleNode(getVertex(Direction.IN));
    }
    
    @Override
    public PersonNode getAuthor(){
        return new PersonNode(getVertex(Direction.OUT));
    }
    
    @Override
    public String getType() {
        return NAME;
    }

}
