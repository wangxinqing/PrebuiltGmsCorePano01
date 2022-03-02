package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RtpSender {
    private long a;
    private MediaStreamTrack b;
    private boolean c = true;
    private final DtmfSender d;

    public RtpSender(long j) {
        this.a = j;
        this.b = MediaStreamTrack.a(nativeGetTrack(j));
        long nativeGetDtmfSender = nativeGetDtmfSender(j);
        this.d = nativeGetDtmfSender != 0 ? new DtmfSender(nativeGetDtmfSender) : null;
    }

    private static native long nativeGetDtmfSender(long j);

    private static native long nativeGetTrack(long j);

    public final void a() {
        if (this.a != 0) {
            DtmfSender dtmfSender = this.d;
            if (dtmfSender != null) {
                long j = dtmfSender.a;
                if (j != 0) {
                    JniCommon.nativeReleaseRef(j);
                    dtmfSender.a = 0;
                } else {
                    throw new IllegalStateException("DtmfSender has been disposed.");
                }
            }
            MediaStreamTrack mediaStreamTrack = this.b;
            if (mediaStreamTrack != null && this.c) {
                mediaStreamTrack.a();
            }
            JniCommon.nativeReleaseRef(this.a);
            this.a = 0;
            return;
        }
        throw new IllegalStateException("RtpSender has been disposed.");
    }
}
