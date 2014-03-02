

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.BindingSiteFeature;
import com.bio4j.blueprints.model.Edge;


/**
 * Binding site for any chemical group (co-enzyme, prosthetic group, etc.)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class BindingSiteFeatureRel extends BasicFeatureRel implements BindingSiteFeature{

    public static final String NAME = "FEATURE_BINDING_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "binding site";

    public BindingSiteFeatureRel(com.tinkerpop.blueprints.Edge e){
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
