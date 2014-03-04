
package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.refseq.GenomeElementNode;
import com.bio4j.model.relationships.protein.ProteinGenomeElement;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ProteinGenomeElementRel extends Edge implements ProteinGenomeElement{
    
    public static final String NAME = "PROTEIN_GENOME_ELEMENT";

    public ProteinGenomeElementRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public GenomeElementNode getGenomeElement(){
        return new GenomeElementNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }
}
