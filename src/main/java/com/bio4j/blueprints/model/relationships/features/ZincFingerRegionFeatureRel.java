

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.ZincFingerRegionFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Position(s) and type(s) of zinc fingers within the protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ZincFingerRegionFeatureRel extends BasicFeatureRel implements ZincFingerRegionFeature{

    public static final String NAME = "FEATURE_ZINC_FINGER_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "zinc finger region";

    public ZincFingerRegionFeatureRel(com.tinkerpop.blueprints.Edge e){
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

