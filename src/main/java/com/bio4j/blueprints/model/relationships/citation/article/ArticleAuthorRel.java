

package com.bio4j.blueprints.model.relationships.citation.article;

import com.bio4j.blueprints.model.nodes.PersonNode;
import com.bio4j.blueprints.model.nodes.citation.ArticleNode;
import com.bio4j.model.relationships.citation.article.ArticleAuthor;
import com.tinkerpop.blueprints.Direction;
import com.bio4j.blueprints.model.Edge;


/**
 * Article authors
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ArticleAuthorRel extends Edge implements ArticleAuthor{

    public static final String NAME = "ARTICLE_AUTHOR";

    public ArticleAuthorRel(com.tinkerpop.blueprints.Edge e){
        super(e);
    }
    
    public ArticleNode getArticle(){
        return new ArticleNode(getVertex(Direction.IN));
    }
    public PersonNode getAuthor(){
        return new PersonNode(getVertex(Direction.OUT));
    }

    @Override
    public String getType() {
        return NAME;
    }

}
