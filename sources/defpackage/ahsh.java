package defpackage;

import android.os.Handler;

/* renamed from: ahsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahsh implements Runnable {
    private final ahsr a;
    private final ahuj b;
    private final Handler c;

    public ahsh(ahsr ahsr, ahuj ahuj, Handler handler) {
        this.a = ahsr;
        this.b = ahuj;
        this.c = handler;
    }

    public final void run() {
        ahsr ahsr = this.a;
        ahuj ahuj = this.b;
        Handler handler = this.c;
        if (!ahsr.b) {
            ahuj.a();
            handler.sendEmptyMessage(2);
            ahsr.b = true;
        }
    }
}
