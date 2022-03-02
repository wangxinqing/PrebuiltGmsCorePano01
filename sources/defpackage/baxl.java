package defpackage;

import java.util.concurrent.CountDownLatch;
import org.webrtc.Logging;
import org.webrtc.MediaCodecVideoDecoder;

/* renamed from: baxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxl implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ MediaCodecVideoDecoder b;

    public baxl(MediaCodecVideoDecoder mediaCodecVideoDecoder, CountDownLatch countDownLatch) {
        this.b = mediaCodecVideoDecoder;
        this.a = countDownLatch;
    }

    public final void run() {
        try {
            Logging.a("MediaCodecVideoDecoder", "Java releaseDecoder on release thread");
            this.b.a.stop();
            this.b.a.release();
            Logging.a("MediaCodecVideoDecoder", "Java releaseDecoder on release thread done");
        } catch (Exception e) {
            Logging.a("MediaCodecVideoDecoder", "Media decoder release failed", (Throwable) e);
        }
        this.a.countDown();
    }
}
