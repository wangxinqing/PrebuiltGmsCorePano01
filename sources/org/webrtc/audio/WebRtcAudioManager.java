package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WebRtcAudioManager {
    WebRtcAudioManager() {
    }

    private static int a(AudioManager audioManager) {
        int i = Build.VERSION.SDK_INT;
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        return property != null ? Integer.parseInt(property) : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    static int getOutputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        int i3;
        if (a(context)) {
            return a(audioManager);
        }
        int i4 = i2 + i2;
        if (i2 == 1) {
            i3 = 4;
        } else {
            i3 = 12;
        }
        return AudioTrack.getMinBufferSize(i, i3, 2) / i4;
    }

    static int getInputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (a(context)) {
            return a(audioManager);
        }
        int i5 = i2 + i2;
        if (i2 == 1) {
            i3 = 16;
        } else {
            i3 = 12;
        }
        return AudioRecord.getMinBufferSize(i, i3, 2) / i5;
    }

    public static int getSampleRate(AudioManager audioManager) {
        int i;
        if (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic_")) {
            int i2 = Build.VERSION.SDK_INT;
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (property != null) {
                i = Integer.parseInt(property);
            } else {
                i = 16000;
            }
            StringBuilder sb = new StringBuilder(36);
            sb.append("Sample rate is set to ");
            sb.append(i);
            sb.append(" Hz");
            Logging.a("WebRtcAudioManagerExternal", sb.toString());
            return i;
        }
        Logging.a("WebRtcAudioManagerExternal", "Running emulator, overriding sample rate to 8 kHz.");
        return 8000;
    }

    private static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
