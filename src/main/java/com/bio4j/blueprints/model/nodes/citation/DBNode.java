
package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.citation.submission.SubmissionDbRel;
import com.bio4j.model.nodes.citation.DB;
import com.bio4j.model.nodes.citation.Submission;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * Databases where submission protein citations are submitted to
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DBNode extends Vertex implements DB{

    public static final String NODE_TYPE = DBNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "db_name";


    public DBNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}

    
    @Override
    public List<Submission> getAssociatedSubmissions(){
        List<Submission> list = new LinkedList<Submission>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, SubmissionDbRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new SubmissionNode(iterator.next()));
        }        
        return list;
    }


    @Override
    public String toString(){
        return "name = " + getName();
    }

}
