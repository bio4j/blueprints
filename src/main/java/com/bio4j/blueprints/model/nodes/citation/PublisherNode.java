

package com.bio4j.blueprints.model.nodes.citation;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.citation.book.BookPublisherRel;
import com.bio4j.model.nodes.citation.Book;
import com.bio4j.model.nodes.citation.Publisher;
import com.tinkerpop.blueprints.Direction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Publishers regarding to book protein citations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class PublisherNode extends Vertex implements Publisher{

    public static final String NODE_TYPE = PublisherNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "publisher_name";


    public PublisherNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}

    
    @Override
    public List<Book> getBooks(){
        List<Book> list = new LinkedList<Book>();
        Iterator<com.tinkerpop.blueprints.Vertex> iterator = vertex.getVertices(Direction.IN, BookPublisherRel.NAME).iterator();
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
