/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculate;

/**
 *
 * @author Nhan
 */
public class TaxCalculator {

    public static float fncPersonalIncomeTax(float sal, float te, int nod) {
        // Check for invalid salary
        if (sal < 0) {
            return -1; // Invalid salary
        }

        // Check for invalid tax-exempt amount
        if (te < 0) {
            return -1; // Invalid tax-exempt amount
        }

        // Check for invalid number of dependents
        if (nod < 0) {
            return -1; // Invalid number of dependents
        }

        // Calculate taxable income
        float ti = sal * te - 9000000 - nod * 4000000;

        // Check if taxable income is positive
        if (ti <= 0) {
            return 0; // No tax
        }

        // Calculate tax based on taxable income
        if (ti >80000000) {
            return 0.30f * ti - 16250000; // 30% tax
        } else if (ti > 40000000) {
            return 0.25f * ti - 6250000; // 25% tax
        } else if (ti > 20000000) {
            return 0.20f * ti - 2250000; // 20% tax
        } else if (ti > 10000000) {
            return 0.15f * ti - 750000; // 15% tax
        } else if (ti > 5000000) {
            return 0.1f * ti - 250000;
        } else {
            return 0.05f * ti; // 5% tax
        }
    }

}
