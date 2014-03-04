

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.InitiatorMethionineFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Cleavage of the initiator methionine
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class InitiatorMethionineFeatureRel extends BasicFeatureRel implements InitiatorMethionineFeature{

    public static final String NAME = "FEATURE_INITIATOR_METHIONINE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "initiator methionine";

    public InitiatorMethionineFeatureRel(com.tinkerpop.blueprints.Edge e){
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

