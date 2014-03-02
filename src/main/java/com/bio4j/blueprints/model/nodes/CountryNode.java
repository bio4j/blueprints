

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.Country;


/**
 * It simply models a country of the world
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CountryNode extends Vertex implements Country{

    public static final String NODE_TYPE = CountryNode.class.getCanonicalName();

    /** Country name **/
    public static final String NAME_PROPERTY = "country_name";


    public CountryNode(com.tinkerpop.blueprints.Vertex v){
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
