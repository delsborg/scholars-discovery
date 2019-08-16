package edu.tamu.scholars.middleware.graphql.model.collection;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.graphql.model.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "CollectionParticipatesIn"
)
@JsonInclude(NON_EMPTY)
public class ParticipatesIn extends AbstractNestedDocument {
  private static final long serialVersionUID = 1940287428L;

  public ParticipatesIn() {
    super();
  }
}