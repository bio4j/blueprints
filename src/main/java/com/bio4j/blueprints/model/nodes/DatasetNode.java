

package com.bio4j.blueprints.model.nodes;

import com.bio4j.blueprints.model.Vertex;
import com.bio4j.model.nodes.Dataset;


/**
 * Datasets proteins come from (either SwissProt or Trembl)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public final class DatasetNode extends Vertex implements Dataset{
    
    public static final String SWISS_PROT_DATASET_NAME = "Swiss-Prot";
    public static final String TREMBL_DATASET_NAME = "TrEMBL";

    public static final String NODE_TYPE = DatasetNode.class.getCanonicalName();

    public static final String NAME_PROPERTY = "dataset_name";


    public DatasetNode(com.tinkerpop.blueprints.Vertex v){
        super(v, NODE_TYPE);
    }


    @Override
    public String getName(){    return String.valueOf(vertex.getProperty(NAME_PROPERTY));}


    @Override
    public void setName(String value){  vertex.setProperty(NAME_PROPERTY, value);}

}
