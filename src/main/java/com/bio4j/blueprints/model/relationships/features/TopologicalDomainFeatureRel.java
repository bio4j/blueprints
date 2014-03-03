

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.TopologicalDomainFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Location of non-membrane regions of membrane-spanning proteins
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class TopologicalDomainFeatureRel extends BasicFeatureRel implements TopologicalDomainFeature{

    public static final String NAME = "FEATURE_TOPOLOGICAL_DOMAIN";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "topological domain";

    public TopologicalDomainFeatureRel(com.tinkerpop.blueprints.Edge e){
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
