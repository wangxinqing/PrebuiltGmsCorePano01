package defpackage;

import org.webrtc.IceCandidate;

/* renamed from: umc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class umc implements Runnable {
    private final umm a;
    private final IceCandidate b;

    public umc(umm umm, IceCandidate iceCandidate) {
        this.a = umm;
        this.b = iceCandidate;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
