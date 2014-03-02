

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.CrossLinkFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Residues participating in covalent linkage(s) between proteins
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CrossLinkFeatureRel extends BasicFeatureRel implements CrossLinkFeature{

    public static final String NAME = "FEATURE_CROSS_LINK";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "cross-link";

    public static final String POSITION_PROPERTY = "cross_link_feature_position";

    public CrossLinkFeatureRel(com.tinkerpop.blueprints.Edge e){
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

