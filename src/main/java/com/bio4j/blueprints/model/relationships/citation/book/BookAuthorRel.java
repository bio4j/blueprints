

package com.bio4j.blueprints.model.relationships.citation.book;

import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.citation.BookNode;
import com.bio4j.model.relationships.citation.book.BookAuthor;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Book authors
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class BookAuthorRel extends Edge implements BookAuthor{

    public static final String NAME = "BOOK_AUTHOR";

    public BookAuthorRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public BookNode getBook(){
        return new BookNode(getVertex(Direction.IN));
    }
    
    @Override
    public PersonNode getAuthor(){
        return new PersonNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
