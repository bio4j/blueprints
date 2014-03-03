

package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.relationships.citation.uo.UnpublishedObservationAuthorRel;
import com.bio4j.blueprints.model.relationships.citation.uo.UnpublishedObservationProteinCitationRel;
import com.bio4j.model.nodes.Person;
import com.bio4j.model.nodes.Protein;
import com.bio4j.model.nodes.citation.UnpublishedObservation;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Protein unpublished observation citations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class UnpublishedObservationNode extends Vertex implements UnpublishedObservation{

    public static final String DATE_PROPERTY = "unpublished_observation_date";

    public static final String NODE_TYPE = UnpublishedObservationNode.class.getCanonicalName();

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "unpublished observations";


    public UnpublishedObservationNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getDate(){    return String.valueOf(vertex.getProperty(DATE_PROPERTY));}

    @Override
    public void setDate(String value){  vertex.setProperty(DATE_PROPERTY, value);}
    
    
    /**
     * Gets the author of the unpublished observation
     * @return 
     */
    @Override
    public Person getAuthor(){
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, UnpublishedObservationAuthorRel.NAME).iterator();
        if(iterator.hasNext()){
            return new PersonNode(iterator.next());
        }else{
            return null;
        }
    }
    
    @Override
    public List<Protein> getProteinCitations(){
        List<Protein> list = new LinkedList<Protein>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.OUT, UnpublishedObservationProteinCitationRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new ProteinNode(iterator.next()));
        }
        return list;
    }

    @Override
    public String toString(){
        return "date = " + getDate();
    }

}
