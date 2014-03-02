

package com.bio4j.blueprints.model.relationships.sc;

import com.bio4j.model.relationships.sc.ErroneousGeneModelPrediction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ErroneousGeneModelPredictionRel extends Edge implements ErroneousGeneModelPrediction{

    public static final String NAME = "ERRONEOUS_GENE_MODEL_PREDICTION";

    public ErroneousGeneModelPredictionRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}