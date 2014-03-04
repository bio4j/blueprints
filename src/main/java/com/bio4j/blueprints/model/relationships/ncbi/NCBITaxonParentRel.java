

package com.bio4j.blueprints.model.relationships.ncbi;

import com.bio4j.model.relationships.ncbi.NCBITaxonParent;
import com.bio4j.blueprints.model.Edge;


/**
 * Rel. leading to the child of the current NCBITaxon node
 * @author ppareja
 */
public final class NCBITaxonParentRel extends Edge implements NCBITaxonParent{

    public static final String NAME = "TAXON_PARENT_NCBI";

    public NCBITaxonParentRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}