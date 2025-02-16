package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.assertj.core.api.Assertions.assertThat;

public class TravelCalculatePremiumServiceImplAIEachFieldTest {

    @Test
    void shouldReturnCorrectResponseForFirstName() {
        // Arrange
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
            "John",
            null,
            null,
            null
        );

        TravelCalculatePremiumService service = new TravelCalculatePremiumServiceImpl();

        // Act
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getPersonFirstName()).isEqualTo("John");
    }

    @Test
    void shouldReturnCorrectResponseForLastName() {
        // Arrange
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
            null,
            "Doe",
            null,
            null
        );

        TravelCalculatePremiumService service = new TravelCalculatePremiumServiceImpl();

        // Act
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getPersonLastName()).isEqualTo("Doe");
    }

    @Test
    void shouldReturnCorrectResponseForAgreementDateFrom() {
        // Arrange
        Date dateFrom = new Date();
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
            null,
            null,
            dateFrom,
            null
        );

        TravelCalculatePremiumService service = new TravelCalculatePremiumServiceImpl();

        // Act
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getAgreementDateFrom()).isEqualTo(dateFrom);
    }

    @Test
    void shouldReturnCorrectResponseForAgreementDateTo() {
        // Arrange
        Date dateTo = new Date();
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
            null,
            null,
            null,
            dateTo
        );

        TravelCalculatePremiumService service = new TravelCalculatePremiumServiceImpl();

        // Act
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getAgreementDateTo()).isEqualTo(dateTo);
    }
}
