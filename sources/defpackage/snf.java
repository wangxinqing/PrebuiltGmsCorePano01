package defpackage;

import android.media.ToneGenerator;
import android.os.SystemClock;

/* renamed from: snf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snf extends Thread {
    public volatile boolean a = false;

    public final void run() {
        ToneGenerator toneGenerator = new ToneGenerator(4, 100);
        while (!this.a) {
            toneGenerator.startTone(25);
            SystemClock.sleep(2000);
        }
        toneGenerator.stopTone();
    }
}
