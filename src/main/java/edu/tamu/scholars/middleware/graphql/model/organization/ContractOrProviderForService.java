package edu.tamu.scholars.middleware.graphql.model.organization;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.graphql.model.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "OrganizationContractOrProviderForService"
)
@JsonInclude(NON_EMPTY)
public class ContractOrProviderForService extends AbstractNestedDocument {
  private static final long serialVersionUID = -1155154201L;

  private String label;

  public ContractOrProviderForService() {
    super();
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
