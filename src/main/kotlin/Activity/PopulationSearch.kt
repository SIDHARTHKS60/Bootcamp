package Activity

class PopulationSearch {
    companion object {
        @Throws(java.lang.NullPointerException::class)
        fun getPopulation(city: String): Int? {
            val population = getPopulationStatistic()
            val populationCount = population.get(city)
            if (city.isEmpty()) {
                throw NullPointerException("Input is empty")

            }
            if (!population.containsKey(city)) {
                throw java.lang.NullPointerException("input is invalid/not present in db")

            }

            return populationCount

        }

        fun getPopulationStatistic(): HashMap<String, Int> {
            val populationMap = HashMap<String, Int>()
            populationMap.put("Banglore", 200000)
            return populationMap
        }
    }
}