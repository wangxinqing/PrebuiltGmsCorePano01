package defpackage;

import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;

/* renamed from: usk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class usk extends usr {
    final /* synthetic */ usp a;

    public usk(usp usp) {
        this.a = usp;
    }

    public final void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onConnectionChange", 30, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onConnectionChange %s.", (Object) peerConnectionState);
        this.a.a((Runnable) new usj(this, peerConnectionState));
    }

    public final void onDataChannel(DataChannel dataChannel) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onDataChannel", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onDataChannel %s.", (Object) dataChannel.a());
        dataChannel.a(new usn(this.a, dataChannel));
    }

    public final void onIceCandidate(IceCandidate iceCandidate) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onIceCandidate", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onIceCandidate %s.", (Object) iceCandidate);
        umm umm = this.a.c.a;
        umm.a((Runnable) new umc(umm, iceCandidate));
    }
}
