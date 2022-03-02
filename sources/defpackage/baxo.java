package defpackage;

import java.util.concurrent.CountDownLatch;
import org.webrtc.Logging;
import org.webrtc.MediaCodecVideoEncoder;

/* renamed from: baxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxo implements Runnable {
    final /* synthetic */ baxp a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ MediaCodecVideoEncoder c;

    public baxo(MediaCodecVideoEncoder mediaCodecVideoEncoder, baxp baxp, CountDownLatch countDownLatch) {
        this.c = mediaCodecVideoEncoder;
        this.a = baxp;
        this.b = countDownLatch;
    }

    public final void run() {
        Logging.a("MediaCodecVideoEncoder", "Java releaseEncoder on release thread");
        try {
            this.c.a.stop();
        } catch (Exception e) {
            Logging.a("MediaCodecVideoEncoder", "Media encoder stop failed", (Throwable) e);
        }
        try {
            this.c.a.release();
        } catch (Exception e2) {
            Logging.a("MediaCodecVideoEncoder", "Media encoder release failed", (Throwable) e2);
            this.a.a = e2;
        }
        Logging.a("MediaCodecVideoEncoder", "Java releaseEncoder on release thread done");
        this.b.countDown();
    }
}
