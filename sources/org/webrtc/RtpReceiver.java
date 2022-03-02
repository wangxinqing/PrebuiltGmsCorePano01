package org.webrtc;

import org.webrtc.MediaStreamTrack;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RtpReceiver {
    private long a;
    private MediaStreamTrack b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Observer {
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    public RtpReceiver(long j) {
        this.a = j;
        this.b = MediaStreamTrack.a(nativeGetTrack(j));
    }

    private static native long nativeGetTrack(long j);

    public void dispose() {
        if (this.a != 0) {
            this.b.a();
            JniCommon.nativeReleaseRef(this.a);
            this.a = 0;
            return;
        }
        throw new IllegalStateException("RtpReceiver has been disposed.");
    }
}
