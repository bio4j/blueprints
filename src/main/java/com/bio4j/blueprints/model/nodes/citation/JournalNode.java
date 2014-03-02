
package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.citation.article.ArticleJournalRel;
import com.bio4j.model.nodes.citation.Article;
import com.bio4j.model.nodes.citation.Journal;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Journals where article citations are published
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class JournalNode extends Vertex implements Journal{

    public static final String NODE_TYPE = JournalNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "journal_name";


    public JournalNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}
    
    
    @Override
    public List<Article> getArticles(){
        List<Article> list = new LinkedList<Article>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, ArticleJournalRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new ArticleNode(iterator.next()));
        }
        return list;
    }


    @Override
    public String toString(){
        return "name = " + getName();
    }

}
