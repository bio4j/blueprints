

package com.bio4j.blueprints.model.relationships.citation.book;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.citation.BookNode;
import com.bio4j.model.relationships.citation.book.BookProteinCitation;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Proteins one book references
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class BookProteinCitationRel extends Edge implements BookProteinCitation{

    public static final String NAME = "BOOK_PROTEIN_CITATION";

    public static final String TITLE_PROPERTY = "book_protein_citation_title";
    public static final String VOLUME_PROPERTY = "book_protein_citation_volume";
    public static final String FIRST_PROPERTY = "book_protein_citation_first";
    public static final String LAST_PROPERTY = "book_protein_citation_last";

    public BookProteinCitationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getTitle(){    return String.valueOf(edge.getProperty(TITLE_PROPERTY));}
    @Override
    public String getVolume(){    return String.valueOf(edge.getProperty(VOLUME_PROPERTY));}
    @Override
    public String getFirst(){    return String.valueOf(edge.getProperty(FIRST_PROPERTY));}
    @Override
    public String getLast(){    return String.valueOf(edge.getProperty(LAST_PROPERTY));}

    @Override
    public void setTitle(String value){  edge.setProperty(TITLE_PROPERTY, value);}
    @Override
    public void setVolume(String value){  edge.setProperty(VOLUME_PROPERTY, value);}
    @Override
    public void setFirst(String value){  edge.setProperty(FIRST_PROPERTY, value);}
    @Override
    public void setLast(String value){  edge.setProperty(LAST_PROPERTY, value);}

    @Override
    public BookNode getBook(){
        return new BookNode(getVertex(Direction.IN));
    }
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return "title = " + getTitle() + "\n" +
                "volume = " + getVolume() + "\n" +
                "first = " + getFirst() + "\n" +
                "last = " + getLast();
    }

}