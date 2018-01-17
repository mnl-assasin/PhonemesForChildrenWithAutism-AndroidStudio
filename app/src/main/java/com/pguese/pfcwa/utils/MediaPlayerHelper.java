package com.pguese.pfcwa.utils;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

import com.pguese.pfcwa.builder.ToastBuilder;

/**
 * Created by Neds Leano on 21/12/2017.
 */

public class MediaPlayerHelper {

    private static String TAG = "TAG_" + MediaPlayerHelper.class.getSimpleName();

    private static MediaPlayer mediaPlayer;

    public static void initMediaPlayer(final Context ctx, int playbackObject) {
        mediaPlayer = MediaPlayer.create(ctx, playbackObject);
        mediaPlayer.start();
    }

    public static void playFlashcard(final Context ctx, int playbackLetter, final int playbackObject) {
        mediaPlayer = MediaPlayer.create(ctx, playbackLetter);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer = MediaPlayer.create(ctx, playbackObject);
                mediaPlayer.start();
            }
        });
    }

    public static void playADAlphabet(final Context ctx, String object, int playbackObject) {

        // LETTER ANG ITATAP;

        Log.d(TAG, "Playback object: " + playbackObject);

        if (playbackObject != -1) {
            ToastBuilder.createShortToast(ctx, "Tap the letter...: " + object);
        }
    }

    public static void playADVocabulary(final Context ctx, String object, int playbackObject){
        Log.d(TAG, "Playback object: " + playbackObject);

        // OBJECT ANG ITATAP;
        if (playbackObject != -1) {
            ToastBuilder.createShortToast(ctx, "Tap the letter...: " + object);
        }
    }

    public static void playAnswerCorrect(final Context ctx){



    }

    public static void playAnswerIncorrect(final Context ctx ){

    }

    public static void repeat() {
        if (mediaPlayer != null)
            if (mediaPlayer.isPlaying())
                mediaPlayer.stop();
        mediaPlayer.start();
    }
}
