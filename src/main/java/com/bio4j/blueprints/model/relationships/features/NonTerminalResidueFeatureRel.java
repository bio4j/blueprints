

package com.bio4j.blueprints.model.relationships.features;

import com.bio4j.model.relationships.features.NonTerminalResidueFeature;
import com.bio4j.blueprints.model.Edge;

/**
 * The sequence is incomplete. Indicate that a residue is not the terminal residue of the complete protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class NonTerminalResidueFeatureRel extends BasicFeatureRel implements NonTerminalResidueFeature{

    public static final String NAME = "FEATURE_NON_TERMINAL_RESIDUE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "non-terminal residue";

    public NonTerminalResidueFeatureRel(com.tinkerpop.blueprints.Edge e){
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
