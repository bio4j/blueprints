
package com.bio4j.blueprints.model.relationships.refseq;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.nodes.refseq.rna.NcRNANode;
import com.bio4j.model.relationships.refseq.GenomeElementNcRna;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class GenomeElementNcRnaRel extends Edge implements GenomeElementNcRna{

    public static final String NAME = "GENOME_ELEMENT_NCRNA";

    public GenomeElementNcRnaRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.IN));
    }
    
    @Override
    public NcRNANode getNcRNA(){
        return new NcRNANode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
