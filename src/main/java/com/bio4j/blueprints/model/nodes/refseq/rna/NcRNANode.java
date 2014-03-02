
package com.bio4j.blueprints.model.nodes.refseq.rna;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.relationships.refseq.GenomeElementMRnaRel;
import com.bio4j.model.nodes.refseq.GenomeElement;
import com.bio4j.model.nodes.refseq.rna.NcRNA;
import com.bio4j.blueprints.model.Vertex;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class NcRNANode extends RNANode implements NcRNA{
    
    public static final String NODE_TYPE = NcRNANode.class.getCanonicalName();
    
    public NcRNANode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }
    
    @Override
    public GenomeElement getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(com.tinkerpop.blueprints.Direction.IN, GenomeElementMRnaRel.NAME).iterator().next());
    }
    
}
