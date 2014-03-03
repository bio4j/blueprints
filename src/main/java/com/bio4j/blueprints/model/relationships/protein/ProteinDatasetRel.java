

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.DatasetNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.protein.ProteinDataset;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Protein's dataset (Swiss-prot or trembl)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ProteinDatasetRel extends Edge implements ProteinDataset{

    public static final String NAME = "PROTEIN_DATASET";

    public ProteinDatasetRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public DatasetNode getDataset(){
        return new DatasetNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}