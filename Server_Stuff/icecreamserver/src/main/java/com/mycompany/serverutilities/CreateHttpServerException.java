/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serverutilities;

/**
 *
 * @author thoma
 */
public class CreateHttpServerException extends Exception {
        public CreateHttpServerException(String errorMessageToUse) {
            super(errorMessageToUse);
        }
}
