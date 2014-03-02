

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.SiteFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Any interesting single amino acid site on the sequence
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SiteFeatureRel extends BasicFeatureRel implements SiteFeature{

    public static final String NAME = "FEATURE_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "site";

    public SiteFeatureRel(com.tinkerpop.blueprints.Edge e){
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

