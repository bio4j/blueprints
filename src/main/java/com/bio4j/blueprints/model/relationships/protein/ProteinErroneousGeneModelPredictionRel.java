

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.model.relationships.protein.ProteinErroneousGeneModelPrediction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinErroneousGeneModelPredictionRel extends BasicProteinSequenceCautionRel implements ProteinErroneousGeneModelPrediction{

    public static final String NAME = "PROTEIN_ERRONEOUS_GENE_MODEL_PREDICTION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "erroneous gene model prediction";

    public ProteinErroneousGeneModelPredictionRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
