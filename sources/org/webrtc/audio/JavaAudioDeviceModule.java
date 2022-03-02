package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class JavaAudioDeviceModule {
    public final Context a;
    public final AudioManager b;
    public final WebRtcAudioRecord c;
    public final WebRtcAudioTrack d;
    public final int e;
    public final int f;
    public final Object g = new Object();
    public long h;

    public JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2) {
        this.a = context;
        this.b = audioManager;
        this.c = webRtcAudioRecord;
        this.d = webRtcAudioTrack;
        this.e = i;
        this.f = i2;
    }

    public static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2);
}
