package edu.tamu.scholars.middleware.graphql.model.person;

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
    name = "PersonCredentialEligibilityAttained"
)
@JsonInclude(NON_EMPTY)
public class CredentialEligibilityAttained extends AbstractNestedDocument {
  private static final long serialVersionUID = 374193159L;

  private String label;

  private String type;

  public CredentialEligibilityAttained() {
    super();
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
