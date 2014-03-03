

package com.bio4j.blueprints.model.relationships.ncbi;

import com.bio4j.model.relationships.ncbi.NCBITaxon;
import com.bio4j.blueprints.model.Edge;

/**
 * Relationship linking Uniprot and NCBI taxonomy
 * @author ppareja
 */
public final class NCBITaxonRel extends Edge implements NCBITaxon{

    public static final String NAME = "TAXON_NCBI";

    public NCBITaxonRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public String getType() {
        return NAME;
    }

}