

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.TransitPeptideFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Extent of a transit peptide for organelle targeting
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TransitPeptideFeatureRel extends BasicFeatureRel implements TransitPeptideFeature{

    public static final String NAME = "FEATURE_TRANSIT_PEPTIDE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "transit peptide";

    public TransitPeptideFeatureRel(com.tinkerpop.blueprints.Edge e){
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

