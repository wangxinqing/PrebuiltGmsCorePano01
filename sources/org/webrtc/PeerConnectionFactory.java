package org.webrtc;

import android.content.Context;
import org.webrtc.PeerConnection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeerConnectionFactory {
    public long a;
    private volatile bayj b;
    private volatile bayj c;
    private volatile bayj d;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Options {
        /* access modifiers changed from: package-private */
        public boolean getDisableEncryption() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getDisableNetworkMonitor() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public int getNetworkIgnoreMask() {
            return 0;
        }
    }

    PeerConnectionFactory(long j) {
        a();
        if (j != 0) {
            this.a = j;
            return;
        }
        throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
    }

    public static String a(String str) {
        return !baxu.a() ? "" : nativeFindFieldTrialsFullName(str);
    }

    public static native long nativeCreatePeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j, long j2, long j3, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j4, long j5, long j6, long j7, long j8, long j9);

    public static native void nativeDeleteLoggable();

    private static native String nativeFindFieldTrialsFullName(String str);

    public static native void nativeInitializeAndroidGlobals();

    public static native void nativeInitializeFieldTrials(String str);

    private void onNetworkThreadReady() {
        this.b = bayj.a();
        Logging.a("PeerConnectionFactory", "onNetworkThreadReady");
    }

    private void onSignalingThreadReady() {
        this.d = bayj.a();
        Logging.a("PeerConnectionFactory", "onSignalingThreadReady");
    }

    private void onWorkerThreadReady() {
        this.c = bayj.a();
        Logging.a("PeerConnectionFactory", "onWorkerThreadReady");
    }

    public static void a() {
        if (!baxu.a() || ContextUtils.getApplicationContext() == null) {
            throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }
}
