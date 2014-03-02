

package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.nodes.InstituteNode;
import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.relationships.citation.thesis.ThesisAuthorRel;
import com.bio4j.blueprints.model.relationships.citation.thesis.ThesisInstituteRel;
import com.bio4j.blueprints.model.relationships.citation.thesis.ThesisProteinCitationRel;
import com.bio4j.model.nodes.Institute;
import com.bio4j.model.nodes.Person;
import com.bio4j.model.nodes.Protein;
import com.bio4j.model.nodes.citation.Thesis;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Thesis protein citations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ThesisNode extends Vertex implements Thesis{

    public static final String NODE_TYPE = ThesisNode.class.getCanonicalName();

    public static final String TITLE_PROPERTY = "thesis_title";
    public static final String DATE_PROPERTY = "thesis_date";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "thesis";


    public ThesisNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getTitle(){    return String.valueOf(vertex.getProperty(TITLE_PROPERTY));}
    @Override
    public String getDate(){    return String.valueOf(vertex.getProperty(DATE_PROPERTY));}


    @Override
    public void setTitle(String value){  vertex.setProperty(TITLE_PROPERTY, value);}
    @Override
    public void setDate(String value){  vertex.setProperty(DATE_PROPERTY, value);}
    
    
    /**
     * Gets the thesis Institute
     * @return 
     */
    public Institute getInstitute(){
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, ThesisInstituteRel.NAME).iterator();
        if(iterator.hasNext()){
            return new InstituteNode(iterator.next());
        }else{
            return null;
        }
    }
    
    /**
     * Gets the thesis author
     * @return 
     */
    @Override
    public Person getAuthor(){
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, ThesisAuthorRel.NAME).iterator();
        if(iterator.hasNext()){
            return new PersonNode(iterator.next());
        }else{
            return null;
        }
    }
    
    
    @Override
    public List<Protein> getProteinCitations(){
        List<Protein> list = new LinkedList<Protein>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, ThesisProteinCitationRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new ProteinNode(iterator.next()));
        }
        return list;
    }

    @Override
    public String toString(){
        return "title = " + getTitle() + "\n" +
                "date = " + getDate();
    }

}

