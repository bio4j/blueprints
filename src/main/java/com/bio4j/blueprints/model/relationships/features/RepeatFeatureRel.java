

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.RepeatFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Positions of repeated sequence motifs or repeated domains
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class RepeatFeatureRel extends BasicFeatureRel implements RepeatFeature{

    public static final String NAME = "FEATURE_REPEAT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "repeat";


    public RepeatFeatureRel(com.tinkerpop.blueprints.Edge e){
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
