
package com.bio4j.blueprints.model.relationships.refseq;

import com.bio4j.blueprints.model.nodes.refseq.GeneNode;
import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.model.relationships.refseq.GenomeElementGene;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GenomeElementGeneRel extends Edge implements GenomeElementGene{

    public static final String NAME = "GENOME_ELEMENT_GENE";

    public GenomeElementGeneRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.IN));
    }
    
    @Override
    public GeneNode getGene(){
        return new GeneNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
