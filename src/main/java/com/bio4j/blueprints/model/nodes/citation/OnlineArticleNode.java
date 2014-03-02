

package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.nodes.ConsortiumNode;
import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.relationships.citation.onarticle.OnlineArticleAuthorRel;
import com.bio4j.blueprints.model.relationships.citation.onarticle.OnlineArticleJournalRel;
import com.bio4j.blueprints.model.relationships.citation.onarticle.OnlineArticleProteinCitationRel;
import com.bio4j.model.nodes.Consortium;
import com.bio4j.model.nodes.Person;
import com.bio4j.model.nodes.Protein;
import com.bio4j.model.nodes.citation.OnlineArticle;
import com.bio4j.model.nodes.citation.OnlineJournal;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * The reference information for a online article citation includes the online journal,
 * the locator and the title, (plus author list information).
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OnlineArticleNode extends Vertex implements OnlineArticle{

    public static final String NODE_TYPE = OnlineArticleNode.class.getCanonicalName();


    /** Online article title **/
    public static final String TITLE_PROPERTY = "online_article_title";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "online journal article";


    public OnlineArticleNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getTitle(){    return String.valueOf(vertex.getProperty(TITLE_PROPERTY));}

    @Override
    public void setTitle(String value){  vertex.setProperty(TITLE_PROPERTY, value);}
    
    
    /**
     * Gets the online journal where the online article was submitted
     * @return 
     */
    @Override
    public OnlineJournal getOnlineJournal(){
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, OnlineArticleJournalRel.NAME).iterator();
        if(iterator.hasNext()){
            return new OnlineJournalNode(iterator.next());
        }else{
            return null;
        }
    }
    
    /**
     * gets consortium authors (if any) of the online article
     * @return 
     */
    @Override
    public List<Consortium> getConsortiumAuthors(){
        List<Consortium> list = new LinkedList<Consortium>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, OnlineArticleAuthorRel.NAME).iterator();
        while(iterator.hasNext()){
        	com.tinkerpop.blueprints.Vertex currentNode = iterator.next();
            if (currentNode.getProperty(Vertex.NODE_TYPE_PROPERTY).equals(ConsortiumNode.NODE_TYPE)) {
                list.add(new ConsortiumNode(currentNode));
            }           
        }
        return list;
    }
    /**
     * gets person authors (if any) of the online article
     * @return 
     */
    @Override
    public List<Person> getPersonAuthors(){
        List<Person> list = new LinkedList<Person>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, OnlineArticleAuthorRel.NAME).iterator();
        while(iterator.hasNext()){
        	com.tinkerpop.blueprints.Vertex currentNode = iterator.next();
            if(currentNode.getProperty(Vertex.NODE_TYPE_PROPERTY).equals(PersonNode.NODE_TYPE)){
                list.add(new PersonNode(currentNode));
            } 
        }         
        return list;
    }
    
    @Override
    public List<Protein> getProteinCitations(){
        List<Protein> list = new LinkedList<Protein>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, OnlineArticleProteinCitationRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new ProteinNode(iterator.next()));
        }
        return list;
    }

    @Override
    public String toString(){
        return "title = " + getTitle();
    }

}
