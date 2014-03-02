

package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.citation.onarticle.OnlineArticleJournalRel;
import com.bio4j.model.nodes.citation.OnlineArticle;
import com.bio4j.model.nodes.citation.OnlineJournal;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Online journals where online article protein citations are published
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OnlineJournalNode extends Vertex implements OnlineJournal{

    public static final String NODE_TYPE = OnlineJournalNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "online_journal_name";


    public OnlineJournalNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}

    
    @Override
    public List<OnlineArticle> getOnlineArticles(){
        List<OnlineArticle> list = new LinkedList<OnlineArticle>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, OnlineArticleJournalRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new OnlineArticleNode(iterator.next()));
        }
        return list;
    }
    

    @Override
    public String toString(){
        return "name = " + getName();
    }

}

