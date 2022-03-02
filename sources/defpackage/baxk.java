package defpackage;

import org.webrtc.VideoFrame;

/* renamed from: baxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class baxk implements Runnable {
    private final VideoFrame.I420Buffer a;

    public baxk(VideoFrame.I420Buffer i420Buffer) {
        this.a = i420Buffer;
    }

    public final void run() {
        this.a.release();
    }
}
