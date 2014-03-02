

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.SignalPeptideFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Sequence targeting proteins to the secretory pathway or periplasmic space
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SignalPeptideFeatureRel extends BasicFeatureRel implements SignalPeptideFeature{

    public static final String NAME = "FEATURE_SIGNAL_PEPTIDE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "signal peptide";

    public SignalPeptideFeatureRel(com.tinkerpop.blueprints.Edge e){
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
