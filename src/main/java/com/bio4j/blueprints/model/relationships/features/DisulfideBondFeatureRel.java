

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.DisulfideBondFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Cysteine residues participating in disulfide bonds
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DisulfideBondFeatureRel extends BasicFeatureRel implements DisulfideBondFeature{

    public static final String NAME = "FEATURE_DISULFIDE_BOND";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "disulfide bond";

    public DisulfideBondFeatureRel(com.tinkerpop.blueprints.Edge e){
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
