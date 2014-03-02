

package com.bio4j.blueprints.model.nodes.refseq.rna;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.refseq.rna.RNA;

/**
 * Misc RNA
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public abstract class RNANode extends Vertex implements RNA{

    public static final String NOTE_PROPERTY = "note";
    public static final String POSITIONS_PROPERTY = "positions";


    protected RNANode(com.tinkerpop.blueprints.Vertex v, String type) { super(v, type); }


    @Override
    public String getPositions(){   return String.valueOf(vertex.getProperty(POSITIONS_PROPERTY));}
    @Override
    public String getNote(){   return String.valueOf(vertex.getProperty(NOTE_PROPERTY));}


    @Override
    public void setPositions(String value){ vertex.setProperty(POSITIONS_PROPERTY, value);}
    @Override
    public void setNote(String value){ vertex.setProperty(NOTE_PROPERTY, value);}
    
    
}