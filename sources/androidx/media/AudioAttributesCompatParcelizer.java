package androidx.media;

import android.support.v4.media.AudioAttributesCompat;
import android.support.v4.media.AudioAttributesImpl;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(atl atl) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) atl.b((atq) audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, atl atl) {
        atl.a(false, false);
        atl.a((atq) audioAttributesCompat.a, 1);
    }
}
