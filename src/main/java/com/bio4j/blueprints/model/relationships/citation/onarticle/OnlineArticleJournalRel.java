

package com.bio4j.blueprints.model.relationships.citation.onarticle;

import com.bio4j.blueprints.model.nodes.citation.OnlineArticleNode;
import com.bio4j.blueprints.model.nodes.citation.OnlineJournalNode;
import com.bio4j.model.relationships.citation.onarticle.OnlineArticleJournal;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Online journal where an online article is published
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class OnlineArticleJournalRel extends Edge implements OnlineArticleJournal{

    public static final String NAME = "ONLINE_ARTICLE_JOURNAL";

    public static final String LOCATOR_PROPERTY = "locator";

    public OnlineArticleJournalRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }


    @Override
    public String getLocator(){    return String.valueOf(edge.getProperty(LOCATOR_PROPERTY));}

    @Override
    public void setLocator(String value){  edge.setProperty(LOCATOR_PROPERTY, value);}
    
    @Override
    public OnlineArticleNode getOnlineArticle(){
        return new OnlineArticleNode(getVertex(Direction.IN));
    }
    
    @Override
    public OnlineJournalNode getOnlineJournal(){
        return new OnlineJournalNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "locator = " + getLocator();
    }

}