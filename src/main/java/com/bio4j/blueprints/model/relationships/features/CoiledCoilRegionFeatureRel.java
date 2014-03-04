

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.CoiledCoilRegionFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Positions of regions of coiled coil within the protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class CoiledCoilRegionFeatureRel extends BasicFeatureRel implements CoiledCoilRegionFeature{

    public static final String NAME = "FEATURE_COILED_COIL_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "coiled-coil region";

    public CoiledCoilRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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

