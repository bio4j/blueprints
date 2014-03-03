

package com.bio4j.blueprints.model.nodes.refseq;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.refseq.GenomeElementCDSRel;
import com.bio4j.model.nodes.refseq.CDS;
import com.tinkerpop.blueprints.Direction;


/**
 * CDS
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class CDSNode extends Vertex implements CDS{

    public static final String NODE_TYPE = CDSNode.class.getCanonicalName();
    
    public static final String NOTE_PROPERTY = "note";
    public static final String POSITIONS_PROPERTY = "positions";


    public CDSNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getPositions(){   return String.valueOf(vertex.getProperty(POSITIONS_PROPERTY));}
    @Override
    public String getNote(){   return String.valueOf(vertex.getProperty(NOTE_PROPERTY));}

    @Override
    public void setPositions(String value){ vertex.setProperty(POSITIONS_PROPERTY, value);}
    public void setNote(String value){ vertex.setProperty(NOTE_PROPERTY, value);}

    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(Direction.IN, GenomeElementCDSRel.NAME).iterator().next());
    }

    @Override
    public String toString(){
        return "positions = " + getPositions() + "\n" +
                "note = " + getNote();
    }
    
}
