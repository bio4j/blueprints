

package com.bio4j.blueprints.model.relationships;

import com.bio4j.blueprints.model.Edge;
import com.bio4j.blueprints.model.nodes.AlternativeProductNode;
import com.bio4j.blueprints.model.nodes.IsoformNode;
import com.bio4j.model.nodes.AlternativeProduct;
import com.bio4j.model.nodes.Isoform;
import com.bio4j.model.relationships.IsoformEventGenerator;
import com.tinkerpop.blueprints.Direction;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class IsoformEventGeneratorRel extends Edge implements IsoformEventGenerator{

    public static final String NAME = "ISOFORM_EVENT_GENERATOR";

    public IsoformEventGeneratorRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    

    @Override
    public String getType() {
        return NAME;
    }

    @Override
    public Isoform getIsoform() {
        return new IsoformNode(getVertex(Direction.IN));
    }

    @Override
    public AlternativeProduct getAlternativeProduct() {
        return new AlternativeProductNode(getVertex(Direction.OUT));
    }

}
