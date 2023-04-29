/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.audio.speech;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javax.swing.JOptionPane;

public class Text_TO_Speach {

    public Voice v;
    public VoiceManager vm;

    public void PlaySoundwithOptionPane(final String s) {

        vm = VoiceManager.getInstance();
          System.setProperty("mbrola.base","mbrola");
        v = vm.getVoice("kevin16");
        v.allocate();
        new Thread() {
            public void run() {
                v.speak(s);

            }
        }.start();

        JOptionPane.showMessageDialog(null, s);
    }

    public void PlaySoundwithoutOptionPane(final String s) {

        vm = VoiceManager.getInstance();
          System.setProperty("mbrola.base","mbrola");
        v = vm.getVoice("kevin16");
        v.allocate();
        new Thread() {
            public void run() {
                v.speak(s);

            }
        }.start();

    }

    public void PlaySoundwithoutOptionPanebyfemale(final String s) {

        vm = VoiceManager.getInstance();
        System.setProperty("mbrola.base", "mbrola");
        v = vm.getVoice("mbrola_us1");
        v.allocate();
        new Thread() {
            public void run() {
                v.speak(s);

            }
        }.start();

    }

    public void PlaySoundbyFemale(final String s) {

        vm = VoiceManager.getInstance();
        System.setProperty("mbrola.base", "mbrola");
        v = vm.getVoice("mbrola_us1");
        v.allocate();
        new Thread() {
            public void run() {
                v.speak(s);

            }
        }.start();

        JOptionPane.showMessageDialog(null, s);
    }

    public static void main(String[] args) {

        Text_TO_Speach tts = new Text_TO_Speach();
        tts.PlaySoundwithOptionPane("Welcome to registration");
        tts.PlaySoundbyFemale("Welcome to registration");
    }
}
