package defpackage;

import org.webrtc.PeerConnection;

/* renamed from: usj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class usj implements Runnable {
    private final usk a;
    private final PeerConnection.PeerConnectionState b;

    public usj(usk usk, PeerConnection.PeerConnectionState peerConnectionState) {
        this.a = usk;
        this.b = peerConnectionState;
    }

    public final void run() {
        usk usk = this.a;
        usk.a.a(this.b);
    }
}
