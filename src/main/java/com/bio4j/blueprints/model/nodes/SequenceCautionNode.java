package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.SequenceCaution;

/**
 * Sequence caution
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class SequenceCautionNode extends Vertex implements SequenceCaution {

    public static final String NODE_TYPE = SequenceCautionNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "name";


    public SequenceCautionNode(com.tinkerpop.blueprints.Vertex v){
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