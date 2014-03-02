
package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.ModifiedResidueFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * Modified residues excluding lipids, glycans and protein cross-links
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ModifiedResidueFeatureRel extends BasicFeatureRel implements ModifiedResidueFeature{

    public static final String NAME = "FEATURE_MODIFIED_RESIDUE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "modified residue";

    public ModifiedResidueFeatureRel(com.tinkerpop.blueprints.Edge e){
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

