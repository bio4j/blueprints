

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.Person;


/**
 * Normally people involved on protein citations (authors, editors...)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PersonNode extends Vertex implements Person{

    public static final String NAME_PROPERTY = "person_name";
    public static final String NODE_TYPE = PersonNode.class.getCanonicalName();


    public PersonNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}


    @Override
    public String toString(){
        return "name = " + getName();
    }

}
