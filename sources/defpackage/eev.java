package defpackage;

import android.media.AudioManager;

/* renamed from: eev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eev {
    private final AudioManager a;

    public eev(AudioManager audioManager) {
        this.a = audioManager;
    }

    public final float a(int i) {
        float streamMaxVolume = ((float) (100 - ((int) ((((float) i) / ((float) this.a.getStreamMaxVolume(3))) * 100.0f)))) * -0.5f;
        if (streamMaxVolume < 0.0f) {
            return (float) Math.exp((double) ((streamMaxVolume * 2.3025851f) / 20.0f));
        }
        return 1.0f;
    }
}
