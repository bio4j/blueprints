
package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.nodes.ConsortiumNode;
import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.relationships.citation.article.ArticleAuthorRel;
import com.bio4j.blueprints.model.relationships.citation.article.ArticleJournalRel;
import com.bio4j.blueprints.model.relationships.citation.article.ArticleProteinCitationRel;
import com.bio4j.model.nodes.Consortium;
import com.bio4j.model.nodes.Person;
import com.bio4j.model.nodes.Protein;
import com.bio4j.model.nodes.citation.Article;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * The reference information for a journal citation includes the journal abbreviation, the volume number,
 * the page range and the year of publication.<p/>
 * Journal names are abbreviated according to the conventions used by the National Library of Medicine (NLM)
 * and are based on the existing ISO and ANSI standards.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ArticleNode extends Vertex implements Article{

    public static final String NODE_TYPE = ArticleNode.class.getCanonicalName();

    /** Article title */
    public static final String TITLE_PROPERTY = "article_title";
    /** Article PubMed Id (if known)*/
    public static final String PUBMED_ID_PROPERTY = "pubmed_id";
    /** Article MedLine Id (if known)*/
    public static final String MEDLINE_ID_PROPERTY = "medline_id";
    /** Article DOI Id (if known)*/
    public static final String DOI_ID_PROPERTY = "doi_id";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "journal article";


    public ArticleNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getTitle(){    return String.valueOf(vertex.getProperty(TITLE_PROPERTY));}
    @Override
    public String getPubmedId(){    return String.valueOf(vertex.getProperty(PUBMED_ID_PROPERTY));}
    @Override
    public String getMedlineId(){    return String.valueOf(vertex.getProperty(MEDLINE_ID_PROPERTY));}
    @Override
    public String getDoiId(){    return String.valueOf(vertex.getProperty(DOI_ID_PROPERTY));}


    @Override
    public void setTitle(String value){  vertex.setProperty(TITLE_PROPERTY, value);}
    @Override
    public void setPubmedId(String value){  vertex.setProperty(PUBMED_ID_PROPERTY, value);}
    @Override
    public void setMedlineId(String value){  vertex.setProperty(MEDLINE_ID_PROPERTY, value);}
    @Override
    public void setDoiId(String value){  vertex.setProperty(DOI_ID_PROPERTY, value);}


    
    @Override
    public List<Protein> getProteinCitations(){
        List<Protein> list = new LinkedList<Protein>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, ArticleProteinCitationRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new ProteinNode(iterator.next()));
        }
        return list;
    }
    /**
     * gets the article journal
     * @return 
     */
    @Override
    public JournalNode getJournal(){
        
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, ArticleJournalRel.NAME).iterator();
        if(iterator.hasNext()){
            return new JournalNode(iterator.next());
        }else{
            return null;
        }
    }
    /**
     * gets consortium authors (if any) of the article
     * @return 
     */
    @Override
    public List<Consortium> getConsortiumAuthors(){
        List<Consortium> list = new LinkedList<Consortium>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, ArticleAuthorRel.NAME).iterator();
        while(iterator.hasNext()){
        	com.tinkerpop.blueprints.Vertex currentNode = iterator.next();
            if(currentNode.getProperty(Vertex.NODE_TYPE_PROPERTY).equals(ConsortiumNode.NODE_TYPE)){
                list.add(new ConsortiumNode(currentNode));
            } 
        }
        return list;
    }
    /**
     * gets person authors (if any) of the article
     * @return 
     */
    @Override
    public List<Person> getPersonAuthors(){
        List<Person> list = new LinkedList<Person>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, ArticleAuthorRel.NAME).iterator();
        while(iterator.hasNext()){
        	com.tinkerpop.blueprints.Vertex currentNode = iterator.next();
            if(currentNode.getProperty(Vertex.NODE_TYPE_PROPERTY).equals(PersonNode.NODE_TYPE)){
                list.add(new PersonNode(currentNode));
            } 
        }
        return list;
    }

    @Override
    public String toString(){
        return "title = " + getTitle() + "\n" +
                "pubmed id = " + getPubmedId() + "\n" +
                "medline id = " + getMedlineId() + "\n" +
                "doi id = " + getDoiId();
    }

}