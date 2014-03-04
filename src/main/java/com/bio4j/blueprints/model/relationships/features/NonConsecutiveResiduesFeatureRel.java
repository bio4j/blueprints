

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.NonConsecutiveResiduesFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Indicates that two residues in a sequence are not consecutive
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class NonConsecutiveResiduesFeatureRel extends BasicFeatureRel implements NonConsecutiveResiduesFeature{

    public static final String NAME = "FEATURE_NON_CONSECUTIVE_RESIDUES";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "non-consecutive residues";

    public NonConsecutiveResiduesFeatureRel(com.tinkerpop.blueprints.Edge e){
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
