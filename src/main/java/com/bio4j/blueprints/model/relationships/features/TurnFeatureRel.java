

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.TurnFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Turns within the experimentally determined protein structure
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class TurnFeatureRel extends BasicFeatureRel implements TurnFeature{

    public static final String NAME = "FEATURE_TURN";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "turn";


    public TurnFeatureRel(com.tinkerpop.blueprints.Edge e){
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

