
import com.kazurayam.inspectus.core.Festum
import com.kazurayam.inspectus.core.Service
import com.kazurayam.inspectus.katalon.KatalonTestCaseCaller

/**
 * Test Cases/main
 */
Service service = new Service()
Festum festum = new KatalonTestCaseCaller()
service.setFestum(festum)
service.execute([:])