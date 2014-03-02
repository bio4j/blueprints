
package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.Consortium;


/**
 * Models consortium entities that take part in publications.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ConsortiumNode extends Vertex implements Consortium{

    public static final String NODE_TYPE = ConsortiumNode.class.getCanonicalName();

    /** Consortium name **/
    public static final String NAME_PROPERTY = "consortium_name";


    public ConsortiumNode(com.tinkerpop.blueprints.Vertex v){
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
