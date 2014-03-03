
package com.bio4j.blueprints.model.relationships.refseq;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.nodes.refseq.rna.MiscRNANode;
import com.bio4j.model.relationships.refseq.GenomeElementMiscRna;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class GenomeElementMiscRnaRel extends Edge implements GenomeElementMiscRna{

    public static final String NAME = "GENOME_ELEMENT_MISCRNA";

    public GenomeElementMiscRnaRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.IN));
    }
    
    @Override
    public MiscRNANode getMiscRNA(){
        return new MiscRNANode(getVertex(Direction.OUT));
    }
        

    @Override
    public String getType() {
        return NAME;
    }

}
