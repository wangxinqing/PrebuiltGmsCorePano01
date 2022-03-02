package defpackage;

import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;

/* renamed from: usr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class usr implements PeerConnection.Observer {
    public final void onAddStream(MediaStream mediaStream) {
        ((anih) ((anih) ulh.a.b()).a("usr", "onAddStream", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onAddStream should not be called.");
    }

    public final void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        ((anih) ((anih) ulh.a.b()).a("usr", "onAddTrack", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onAddTrack should not be called.");
    }

    public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onConnectionChange", 30, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onConnectionChange %s.", (Object) peerConnectionState);
    }

    public void onDataChannel(DataChannel dataChannel) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onDataChannel", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onDataChannel %s.", (Object) dataChannel.a());
    }

    public void onIceCandidate(IceCandidate iceCandidate) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onIceCandidate", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onIceCandidate %s.", (Object) iceCandidate);
    }

    public final void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onIceCandidatesRemoved", 50, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onIceCandidatesRemoved %s.", (Object) iceCandidateArr);
    }

    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onIceConnectionChange", 25, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onIceConnectionChange %s.", (Object) iceConnectionState);
    }

    public final void onIceConnectionReceivingChange(boolean z) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onIceConnectionReceivingChange", 35, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onIceConnectionReceiveChange %s.", (Object) Boolean.valueOf(z));
    }

    public final void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onIceGatheringChange", 40, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onIceGatheringChange %s.", (Object) iceGatheringState);
    }

    public final void onRemoveStream(MediaStream mediaStream) {
        ((anih) ((anih) ulh.a.b()).a("usr", "onRemoveStream", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onRemoveStream should not be called.");
    }

    public final void onRenegotiationNeeded() {
        ((anih) ((anih) ulh.a.d()).a("usr", "onRenegotiationNeeded", 60, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onRenegotationNeeded.");
    }

    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
    }

    public final void onSignalingChange(PeerConnection.SignalingState signalingState) {
        ((anih) ((anih) ulh.a.d()).a("usr", "onSignalingChange", 20, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onSignalingChange %s.", (Object) signalingState);
    }

    public final void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
    }

    public final void onTrack(RtpTransceiver rtpTransceiver) {
        ((anih) ((anih) ulh.a.b()).a("usr", "onTrack", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PeerConnection.Observer.onTrack should not be called.");
        rtpTransceiver.a();
        RtpTransceiver.nativeStop(rtpTransceiver.a);
    }
}
