

package com.bio4j.blueprints.model.relationships.protein;

import com.bio4j.blueprints.model.nodes.KeywordNode;
import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.model.relationships.protein.ProteinKeyword;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class ProteinKeywordRel extends Edge implements ProteinKeyword{

    public static final String NAME = "PROTEIN_KEYWORD";

    public ProteinKeywordRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }

    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.IN));
    }
    
    @Override
    public KeywordNode getKeyword(){
        return new KeywordNode(getVertex(Direction.OUT));
    }
    
    @Override
    public String getType() {
        return NAME;
    }

}