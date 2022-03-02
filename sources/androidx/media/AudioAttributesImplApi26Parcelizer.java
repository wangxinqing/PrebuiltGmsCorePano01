package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import android.support.v4.media.AudioAttributesImplApi26;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(atl atl) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) atl.b((Parcelable) audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = atl.b(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, atl atl) {
        atl.a(false, false);
        atl.a((Parcelable) audioAttributesImplApi26.a, 1);
        atl.a(audioAttributesImplApi26.b, 2);
    }
}
