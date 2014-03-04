

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.ActiveSiteFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Amino acid(s) directly involved in the activity of an enzyme
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ActiveSiteFeatureRel extends BasicFeatureRel implements ActiveSiteFeature{

    public static final String NAME = "FEATURE_ACTIVE_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "active site";


    public ActiveSiteFeatureRel(com.tinkerpop.blueprints.Edge e){
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

