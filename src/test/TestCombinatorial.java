/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import cezeri.matrix_processing.CMatrix;
import cezeri.utils.FactoryCombination;

/**
 * Get All combination pairs as matlab nchoosek but nchoosek(n,k) 
 * generates only subset k pairs
 * @author BAP1
 */
public class TestCombinatorial {
    public static void main(String[] args) {
        String[] s={"a","b","c","d","e","f","g","h"};
        FactoryCombination.toString(FactoryCombination.getAllCombinations(s));
    }
}
