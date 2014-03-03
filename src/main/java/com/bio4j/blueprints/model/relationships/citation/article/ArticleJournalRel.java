

package com.bio4j.blueprints.model.relationships.citation.article;

import com.bio4j.blueprints.model.nodes.citation.ArticleNode;
import com.bio4j.blueprints.model.nodes.citation.JournalNode;
import com.bio4j.model.relationships.citation.article.ArticleJournal;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Article journal
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ArticleJournalRel extends Edge implements ArticleJournal{

    public static final String NAME = "ARTICLE_JOURNAL";

    public static final String DATE_PROPERTY = "date";
    public static final String VOLUME_PROPERTY = "volume";
    public static final String FIRST_PROPERTY = "first";
    public static final String LAST_PROPERTY = "last";

    public ArticleJournalRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getDate(){    return String.valueOf(edge.getProperty(DATE_PROPERTY));}
    @Override
    public String getVolume(){    return String.valueOf(edge.getProperty(VOLUME_PROPERTY));}
    @Override
    public String getFirst(){    return String.valueOf(edge.getProperty(FIRST_PROPERTY));}
    @Override
    public String getLast(){    return String.valueOf(edge.getProperty(LAST_PROPERTY));}

    @Override
    public void setDate(String value){  edge.setProperty(DATE_PROPERTY, value);}
    @Override
    public void setVolume(String value){  edge.setProperty(VOLUME_PROPERTY, value);}
    @Override
    public void setFirst(String value){  edge.setProperty(FIRST_PROPERTY, value);}
    @Override
    public void setLast(String value){  edge.setProperty(LAST_PROPERTY, value);}

    @Override
    public ArticleNode getArticle(){
        return new ArticleNode(getVertex(Direction.IN));
    }
    @Override
    public JournalNode getJournal(){
        return new JournalNode(getVertex(Direction.OUT));
    }
    

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "date = " + getDate() + "\n" +
                "volume = " + getVolume() + "\n" +
                "first = " + getFirst() + "\n" +
                "last = " + getLast();
    }

}