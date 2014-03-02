package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.IsoformEventGeneratorRel;
import com.bio4j.model.nodes.AlternativeProduct;
import com.bio4j.model.nodes.Isoform;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Protein alternative products
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class AlternativeProductNode extends Vertex implements AlternativeProduct{

    public static final String NODE_TYPE = AlternativeProductNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "alternative_product_name";


    public AlternativeProductNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){ return String.valueOf(vertex.getProperty(NAME_PROPERTY)); }


    @Override
    public void setName(String value){ vertex.setProperty(NAME_PROPERTY, value); }


    @Override
    public List<Isoform> getIsoforms(){
        List<Isoform> list = new LinkedList<Isoform>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, IsoformEventGeneratorRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new IsoformNode(iterator.next()));
        }
        return list;
    }
    

    @Override
    public String toString(){
        return "name = " + getName();
    }

}
