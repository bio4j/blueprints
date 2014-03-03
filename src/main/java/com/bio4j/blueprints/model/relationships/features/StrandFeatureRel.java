

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.StrandFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Beta strand regions within the experimentally determined protein structure
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class StrandFeatureRel extends BasicFeatureRel implements StrandFeature{

    public static final String NAME = "FEATURE_STRAND";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "strand";

    public StrandFeatureRel(com.tinkerpop.blueprints.Edge e){
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
