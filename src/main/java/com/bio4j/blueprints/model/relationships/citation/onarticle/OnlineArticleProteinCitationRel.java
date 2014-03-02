

package com.bio4j.blueprints.model.relationships.citation.onarticle;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.citation.OnlineArticleNode;
import com.bio4j.model.relationships.citation.onarticle.OnlineArticleProteinCitation;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;

/**
 * Proteins that an online articles references
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OnlineArticleProteinCitationRel extends Edge implements OnlineArticleProteinCitation{

    public static final String NAME = "ONLINE_ARTICLE_PROTEIN_CITATION";

    public OnlineArticleProteinCitationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public OnlineArticleNode getOnlineArticle(){
        return new OnlineArticleNode(getVertex(Direction.IN));
    }
    
    @Override
    public ProteinNode getProtein(){
        return new ProteinNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
