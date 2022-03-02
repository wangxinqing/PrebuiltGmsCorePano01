package org.webrtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RtpTransceiver {
    public long a;
    private RtpSender b;
    private RtpReceiver c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);
        
        private final int e;

        private RtpTransceiverDirection(int i) {
            this.e = i;
        }

        static RtpTransceiverDirection fromNativeIndex(int i) {
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i) {
                    return rtpTransceiverDirection;
                }
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("Uknown native RtpTransceiverDirection type");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public int getNativeIndex() {
            return this.e;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class RtpTransceiverInit {
        private final RtpTransceiverDirection a;
        private final List b;
        private final List c;

        public RtpTransceiverInit() {
            RtpTransceiverDirection rtpTransceiverDirection = RtpTransceiverDirection.SEND_RECV;
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            this.a = rtpTransceiverDirection;
            this.b = new ArrayList(emptyList);
            this.c = new ArrayList(emptyList2);
        }

        /* access modifiers changed from: package-private */
        public int getDirectionNativeIndex() {
            return this.a.getNativeIndex();
        }

        /* access modifiers changed from: package-private */
        public List getSendEncodings() {
            return new ArrayList(this.c);
        }

        /* access modifiers changed from: package-private */
        public List getStreamIds() {
            return new ArrayList(this.b);
        }
    }

    protected RtpTransceiver(long j) {
        this.a = j;
        this.b = nativeGetSender(j);
        this.c = nativeGetReceiver(j);
    }

    private static native RtpReceiver nativeGetReceiver(long j);

    private static native RtpSender nativeGetSender(long j);

    public static native void nativeStop(long j);

    public final void a() {
        if (this.a == 0) {
            throw new IllegalStateException("RtpTransceiver has been disposed.");
        }
    }

    public void dispose() {
        a();
        this.b.a();
        this.c.dispose();
        JniCommon.nativeReleaseRef(this.a);
        this.a = 0;
    }
}
