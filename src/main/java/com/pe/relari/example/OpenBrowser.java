package com.pe.relari.example;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OpenBrowser {

    public static void main(String[] args) {

        var iURL = "https://api.whatsapp.com/send?phone=+51979896723&text=Hola";

        goToURL(iURL);

    }

    public static void goToURL(String url) {

        if (Desktop.isDesktopSupported()) {
            var desktop = Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    desktop.browse(new URI(url));
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(OpenBrowser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
