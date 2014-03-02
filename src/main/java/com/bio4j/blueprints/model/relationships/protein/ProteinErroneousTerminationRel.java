
package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.model.relationships.protein.ProteinErroneousTermination;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinErroneousTerminationRel extends BasicProteinSequenceCautionRel implements ProteinErroneousTermination{

    public static final String NAME = "PROTEIN_ERRONEOUS_TERMINATION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "erroneous termination";

    public ProteinErroneousTerminationRel(com.tinkerpop.blueprints.Edge e){
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
