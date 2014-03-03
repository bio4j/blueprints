

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.model.relationships.protein.ProteinErroneousInitiation;
import com.bio4j.blueprints.model.Edge;


/**
 *
 * @author ppareja
 */
public final class ProteinErroneousInitiationRel extends BasicProteinSequenceCautionRel implements ProteinErroneousInitiation{

    public static final String NAME = "PROTEIN_ERRONEOUS_INITIATION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "erroneous initiation";

    public ProteinErroneousInitiationRel(com.tinkerpop.blueprints.Edge e){
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
