
package com.bio4j.blueprints.model.relationships.refseq;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.nodes.refseq.rna.RRNANode;
import com.bio4j.model.relationships.refseq.GenomeElementRRna;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GenomeElementRRnaRel extends Edge implements GenomeElementRRna{

    public static final String NAME = "GENOME_ELEMENT_RRNA";

    public GenomeElementRRnaRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.IN));
    }
    
    @Override
    public RRNANode getRRNA(){
        return new RRNANode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
