

package com.bio4j.blueprints.model.nodes.refseq;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.blueprints.model.relationships.refseq.GenomeElementCDSRel;
import com.bio4j.model.nodes.refseq.Gene;
import com.tinkerpop.blueprints.Direction;

/**
 * Gene
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class GeneNode extends Vertex implements Gene{

    public static final String NODE_TYPE = GeneNode.class.getCanonicalName();

    public static final String NOTE_PROPERTY = "note";
    public static final String POSITIONS_PROPERTY = "positions";


    public GeneNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getPositions(){   return String.valueOf(vertex.getProperty(POSITIONS_PROPERTY));}
    @Override
    public String getNote(){   return String.valueOf(vertex.getProperty(NOTE_PROPERTY));}


    @Override
    public void setPositions(String value){ vertex.setProperty(POSITIONS_PROPERTY, value);}
    @Override
    public void setNote(String value){ vertex.setProperty(NOTE_PROPERTY, value);}

    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(Direction.IN, GenomeElementCDSRel.NAME).iterator().next());
    }   

}
