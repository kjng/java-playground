package com.kevinjang.headfirst;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.sound.midi.*;

public class MiniMiniMusicApp {

	public static void main(String[] args) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	}
	
	public void play() {
		while (true) {
			try {
				Sequencer player = MidiSystem.getSequencer();
				player.open();
				
				Sequence seq = new Sequence(Sequence.PPQ, 4);
				Track track = seq.createTrack();
				
				BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter a note to play: ");
				int note = Integer.parseInt(is.readLine());
				
				ShortMessage b = new ShortMessage();
				b.setMessage(144, 1, note, 100);
				MidiEvent noteOff = new MidiEvent(b, 1);
				track.add(noteOff);
				
				player.setSequence(seq);
				player.start();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}

}
