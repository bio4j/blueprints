

package com.bio4j.blueprints.model.relationships.citation.article;

import com.bio4j.blueprints.model.nodes.ProteinNode;
import com.bio4j.blueprints.model.nodes.citation.ArticleNode;
import com.bio4j.model.relationships.citation.article.ArticleProteinCitation;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;


/**
 * Proteins one article references
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ArticleProteinCitationRel extends Edge implements ArticleProteinCitation{

    public static final String NAME = "ARTICLE_PROTEIN_CITATION";

    public ArticleProteinCitationRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    @Override
    public ArticleNode getArticle(){
        return new ArticleNode(getVertex(Direction.IN));
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
