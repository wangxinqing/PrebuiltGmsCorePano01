package androidx.media;

import android.support.v4.media.AudioAttributesImplBase;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(atl atl) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = atl.b(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = atl.b(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = atl.b(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = atl.b(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, atl atl) {
        atl.a(false, false);
        atl.a(audioAttributesImplBase.a, 1);
        atl.a(audioAttributesImplBase.b, 2);
        atl.a(audioAttributesImplBase.c, 3);
        atl.a(audioAttributesImplBase.d, 4);
    }
}
