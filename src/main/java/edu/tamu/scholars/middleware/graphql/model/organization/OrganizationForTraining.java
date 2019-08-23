package edu.tamu.scholars.middleware.graphql.model.organization;

import edu.tamu.scholars.middleware.graphql.model.organization.OrganizationForTrainingTrainee;

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
    name = "OrganizationOrganizationForTraining"
)
@JsonInclude(NON_EMPTY)
public class OrganizationForTraining extends AbstractNestedDocument {
  private static final long serialVersionUID = -1226629253L;

  private String label;

  private OrganizationForTrainingTrainee trainee;

  private String startDate;

  private String endDate;

  public OrganizationForTraining() {
    super();
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public OrganizationForTrainingTrainee getTrainee() {
    return trainee;
  }

  public void setTrainee(OrganizationForTrainingTrainee trainee) {
    this.trainee = trainee;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
}
