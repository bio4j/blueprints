

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.GlycosylationSiteFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Covalently attached glycan group(s)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class GlycosylationSiteFeatureRel extends BasicFeatureRel implements GlycosylationSiteFeature{

    public static final String NAME = "FEATURE_GLYCOSYLATION_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "glycosylation site";


    public GlycosylationSiteFeatureRel(com.tinkerpop.blueprints.Edge e){
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
