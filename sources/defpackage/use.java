package defpackage;

import java.util.List;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;

/* renamed from: use  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class use implements Runnable {
    private final usp a;

    public use(usp usp) {
        this.a = usp;
    }

    public final void run() {
        usp usp = this.a;
        usp.a.nativeClose();
        PeerConnection peerConnection = usp.a;
        peerConnection.nativeClose();
        List list = peerConnection.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MediaStream mediaStream = (MediaStream) list.get(i);
            mediaStream.a();
            peerConnection.nativeRemoveLocalStream(mediaStream.d);
            mediaStream.dispose();
        }
        peerConnection.a.clear();
        List list2 = peerConnection.c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((RtpSender) list2.get(i2)).a();
        }
        peerConnection.c.clear();
        List list3 = peerConnection.d;
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((RtpReceiver) list3.get(i3)).dispose();
        }
        List list4 = peerConnection.e;
        int size4 = list4.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((RtpTransceiver) list4.get(i4)).dispose();
        }
        peerConnection.e.clear();
        peerConnection.d.clear();
        PeerConnection.nativeFreeOwnedPeerConnection(peerConnection.b);
    }
}
