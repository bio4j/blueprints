
package com.bio4j.blueprints.model.nodes.refseq.rna;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.relationships.refseq.GenomeElementMRnaRel;
import com.bio4j.model.nodes.refseq.GenomeElement;
import com.bio4j.model.nodes.refseq.rna.TmRNA;
import com.bio4j.blueprints.model.Vertex;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TmRNANode extends RNANode implements TmRNA{
    
    public static final String NODE_TYPE = TmRNANode.class.getCanonicalName();
    
    public TmRNANode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }
    
    @Override
    public GenomeElement getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(com.tinkerpop.blueprints.Direction.IN, GenomeElementMRnaRel.NAME).iterator().next());
    }
    
}  
    