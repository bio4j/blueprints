

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.DomainFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Position and type of each modular protein domain
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DomainFeatureRel extends BasicFeatureRel implements DomainFeature{

    public static final String NAME = "FEATURE_DOMAIN";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "domain";

    public DomainFeatureRel(com.tinkerpop.blueprints.Edge e){
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
