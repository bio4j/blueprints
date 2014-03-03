
package com.bio4j.blueprints.model.relationships.refseq;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.nodes.refseq.rna.TRNANode;
import com.bio4j.model.relationships.refseq.GenomeElementTRna;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class GenomeElementTRnaRel extends Edge implements GenomeElementTRna{

    public static final String NAME = "GENOME_ELEMENT_TRNA";

    public GenomeElementTRnaRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.IN));
    }
    
    @Override
    public TRNANode getTRNA(){
        return new TRNANode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
