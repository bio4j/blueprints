package com.bio4j.blueprints.model.relationships;

import com.bio4j.model.relationships.TaxonParent;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class TaxonParentRel extends Edge implements TaxonParent{

    public static final String NAME = "TAXON_PARENT";

    public TaxonParentRel(com.tinkerpop.blueprints.Edge e){ super(e); }

    @Override
    public String getType() {
        return NAME;
    }
}