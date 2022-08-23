import Activity.PopulationSearch
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.String as String1

class PopulationSearchTest {
    @Test
    fun findPopulation() {
        //Arrange
        val city: String1 = "Banglore"
        val expextedPopulationCount = 200000
        //Act
        val count = PopulationSearch.getPopulation(city)
        //Assert
        Assertions.assertEquals(expextedPopulationCount, count)
    }
}