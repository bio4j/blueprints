

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.nodes.citation.BookNode;
import com.bio4j.blueprints.model.relationships.citation.book.BookCityRel;
import com.bio4j.model.nodes.City;
import com.bio4j.model.nodes.citation.Book;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Just nodes representing different cities of the world
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class CityNode extends Vertex implements City{

    public static final String NODE_TYPE = CityNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "city_name";


    public CityNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}
    
    
    @Override
    public List<Book> getBooks(){
        List<Book> list = new LinkedList<Book>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, BookCityRel.NAME).iterator();
        while(iterator.hasNext()){
            list.add(new BookNode(iterator.next()));
        }
        return list;
    }


    @Override
    public String toString(){
        return "name = " + getName();
    }

}
