

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.RegionOfInterestFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Region of interest in the sequence
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class RegionOfInterestFeatureRel extends BasicFeatureRel implements RegionOfInterestFeature{

    public static final String NAME = "FEATURE_REGION_OF_INTEREST";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "region of interest";

    public RegionOfInterestFeatureRel(com.tinkerpop.blueprints.Edge e){
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

