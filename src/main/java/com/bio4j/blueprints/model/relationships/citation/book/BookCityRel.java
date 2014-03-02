

package com.bio4j.blueprints.model.relationships.citation.book;

import com.bio4j.blueprints.model.nodes.CityNode;
import com.bio4j.blueprints.model.nodes.citation.BookNode;
import com.bio4j.model.relationships.citation.book.BookCity;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * City where a book is published in
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class BookCityRel extends Edge implements BookCity{

    public static final String NAME = "BOOK_CITY_REL";

    public BookCityRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public BookNode getBook(){
        return new BookNode(getVertex(Direction.IN));
    }
    
    @Override
    public CityNode getCity(){
        return new CityNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
