

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.HelixFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Helical regions within the experimentally determined protein structure
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class HelixFeatureRel extends BasicFeatureRel implements HelixFeature{

    public static final String NAME = "FEATURE_HELIX";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "helix";

    public HelixFeatureRel(com.tinkerpop.blueprints.Edge e){
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

