package defpackage;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.audio.WebRtcAudioManager;

/* renamed from: bayq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayq {
    public final Context a;
    public final AudioManager b;
    public final int c;
    public final int d;
    public final boolean e = bayu.a();
    public final boolean f = bayu.b();

    public bayq(Context context) {
        this.a = context;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.b = audioManager;
        this.c = WebRtcAudioManager.getSampleRate(audioManager);
        this.d = WebRtcAudioManager.getSampleRate(this.b);
    }
}
