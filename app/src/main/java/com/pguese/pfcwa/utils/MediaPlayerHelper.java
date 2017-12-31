package com.pguese.pfcwa.utils;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;

import com.pguese.pfcwa.utils.FileHelper;

import java.io.IOException;

/**
 * Created by Neds Leano on 21/12/2017.
 */

public class MediaPlayerHelper {

    private static MediaPlayer mediaPlayer;

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

    public static void repeat() {
        if (mediaPlayer != null)
            if (mediaPlayer.isPlaying())
                mediaPlayer.stop();
        mediaPlayer.start();
    }
}
