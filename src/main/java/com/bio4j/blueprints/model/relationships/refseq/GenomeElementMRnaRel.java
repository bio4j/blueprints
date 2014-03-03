
package com.bio4j.blueprints.model.relationships.refseq;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.nodes.refseq.rna.MRNANode;
import com.bio4j.model.relationships.refseq.GenomeElementMRna;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class GenomeElementMRnaRel extends Edge implements GenomeElementMRna{

    public static final String NAME = "GENOME_ELEMENT_MRNA";

    public GenomeElementMRnaRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.IN));
    }
    
    @Override
    public MRNANode getMRNA(){
        return new MRNANode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
