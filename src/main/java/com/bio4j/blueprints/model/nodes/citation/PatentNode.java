

package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.relationships.citation.patent.PatentAuthorRel;
import com.bio4j.blueprints.model.relationships.citation.patent.PatentProteinCitationRel;
import com.bio4j.model.nodes.Person;
import com.bio4j.model.nodes.Protein;
import com.bio4j.model.nodes.citation.Patent;
import com.tinkerpop.blueprints.Direction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Patent protein citations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PatentNode extends Vertex implements Patent{

    public static final String NODE_TYPE = PatentNode.class.getCanonicalName();

    public static final String NUMBER_PROPERTY = "patent_number";
    public static final String DATE_PROPERTY = "patent_date";
    public static final String TITLE_PROPERTY = "patent_title";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "patent";


    public PatentNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getNumber(){    return String.valueOf(vertex.getProperty(NUMBER_PROPERTY));}
    @Override
    public String getDate(){    return String.valueOf(vertex.getProperty(DATE_PROPERTY));}
    @Override
    public String getTitle(){    return String.valueOf(vertex.getProperty(TITLE_PROPERTY));}


    @Override
    public void setNumber(String value){  vertex.setProperty(NUMBER_PROPERTY, value);}
    @Override
    public void setDate(String value){  vertex.setProperty(DATE_PROPERTY, value);}
    @Override
    public void setTitle(String value){  vertex.setProperty(TITLE_PROPERTY, value);}


    /**
     * gets authors (if any) of the patent
     * @return 
     */
    @Override
    public List<Person> getAuthors(){
        List<Person> list = new ArrayList<Person>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, PatentAuthorRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new PersonNode(iterator.next()));
        }
        return list;
    }
    
    
    @Override
    public List<Protein> getProteinCitations(){
        List<Protein> list = new LinkedList<Protein>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, PatentProteinCitationRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new ProteinNode(iterator.next()));
        }
        return list;
    }
    

    @Override
    public String toString(){
        return "number = " + getNumber() + "\n" +
                "date = " + getDate() + "\n" +
                "title = " + getTitle();
    }

}
