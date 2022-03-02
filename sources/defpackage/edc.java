package defpackage;

import android.media.AudioTrack;

/* renamed from: edc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class edc implements Runnable {
    private final edf a;
    private final int b;

    public edc(edf edf, int i) {
        this.a = edf;
        this.b = i;
    }

    public final void run() {
        edf edf = this.a;
        int i = this.b;
        AudioTrack audioTrack = edf.a[i];
        if (audioTrack != null) {
            audioTrack.release();
        }
        edf.d[i].getLooper().quit();
    }
}
