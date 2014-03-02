

package com.bio4j.blueprints.model.relationships.citation.book;

import com.bio4j.blueprints.model.nodes.citation.BookNode;
import com.bio4j.blueprints.model.nodes.citation.PublisherNode;
import com.bio4j.model.relationships.citation.book.BookPublisher;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;


/**
 * Book publisher
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class BookPublisherRel extends Edge implements BookPublisher{

    public static final String NAME = "BOOK_PUBLISHER";

    public BookPublisherRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public BookNode getBook(){
        return new BookNode(getVertex(Direction.IN));
    }
    
    @Override
    public PublisherNode getPublisher(){
        return new PublisherNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
