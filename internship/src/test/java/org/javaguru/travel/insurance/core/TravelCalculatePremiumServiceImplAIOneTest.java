package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.assertj.core.api.Assertions.assertThat;

public class TravelCalculatePremiumServiceImplAIOneTest {
    @Test
    void shouldReturnCorrectResponseWithAllFieldsSet() {
        // Arrange
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
            "John",
            "Doe",
            new Date(),
            new Date()
        );

        TravelCalculatePremiumService service = new TravelCalculatePremiumServiceImpl();

        // Act
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Assert
        assertThat(response).isNotNull();
        assertThat(response.getPersonFirstName()).isEqualTo("John");
        assertThat(response.getPersonLastName()).isEqualTo("Doe");
        assertThat(response.getAgreementDateFrom()).isEqualTo(request.getAgreementDateFrom());
        assertThat(response.getAgreementDateTo()).isEqualTo(request.getAgreementDateTo());
    }
}
