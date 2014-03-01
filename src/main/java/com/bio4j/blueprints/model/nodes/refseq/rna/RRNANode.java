package com.bio4j.blueprints.model.nodes.refseq.rna;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.relationships.refseq.GenomeElementMRnaRel;
import com.bio4j.model.nodes.refseq.GenomeElement;
import com.bio4j.model.nodes.refseq.rna.RRNA;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class RRNANode extends RNANode implements RRNA{
    
    public static final String NODE_TYPE = RRNANode.class.getCanonicalName();
    
    public RRNANode(com.tinkerpop.blueprints.Vertex v){
        super(v);
    }
    
    @Override
    public GenomeElement getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(com.tinkerpop.blueprints.Direction.IN, GenomeElementMRnaRel.NAME).iterator().next());
    }
      
}
