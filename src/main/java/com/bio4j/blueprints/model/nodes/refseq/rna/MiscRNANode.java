
package com.bio4j.blueprints.model.nodes.refseq.rna;

import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.blueprints.model.relationships.refseq.GenomeElementMRnaRel;
import com.bio4j.model.nodes.refseq.GenomeElement;
import com.bio4j.model.nodes.refseq.rna.MiscRNA;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Vertex;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class MiscRNANode extends RNANode implements MiscRNA{
    
    public static final String NODE_TYPE = MiscRNANode.class.getCanonicalName();
    
    public MiscRNANode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }
    
    @Override
    public GenomeElement getGenomeElement(){
        return new GenomeElementNode(vertex.getVertices(Direction.IN, GenomeElementMRnaRel.NAME).iterator().next());
    }
}
