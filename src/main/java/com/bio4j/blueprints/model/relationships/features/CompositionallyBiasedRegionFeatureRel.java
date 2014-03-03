

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.CompositionallyBiasedRegionFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Region of compositional bias in the protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class CompositionallyBiasedRegionFeatureRel extends BasicFeatureRel implements CompositionallyBiasedRegionFeature{

    public static final String NAME = "FEATURE_COMPOSITIONALLY_BIASED_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "compositionally biased region";

    public CompositionallyBiasedRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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
