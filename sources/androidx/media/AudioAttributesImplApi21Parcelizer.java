package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import android.support.v4.media.AudioAttributesImplApi21;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(atl atl) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) atl.b((Parcelable) audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = atl.b(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, atl atl) {
        atl.a(false, false);
        atl.a((Parcelable) audioAttributesImplApi21.a, 1);
        atl.a(audioAttributesImplApi21.b, 2);
    }
}
