
package com.bio4j.blueprints.model.relationships.refseq;

import com.bio4j.blueprints.model.nodes.refseq.CDSNode;
import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.model.relationships.refseq.GenomeElementCDS;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class GenomeElementCDSRel extends Edge implements GenomeElementCDS{

    public static final String NAME = "GENOME_ELEMENT_CDS";

    public GenomeElementCDSRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.IN));
    }
    
    @Override
    public CDSNode getCDS(){
        return new CDSNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
