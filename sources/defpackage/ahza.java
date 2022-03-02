package defpackage;

import com.google.android.location.contexthub.NanoAppClearcutLoggingP$1;

/* renamed from: ahza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ahza implements Runnable {
    private final NanoAppClearcutLoggingP$1 a;

    public ahza(NanoAppClearcutLoggingP$1 nanoAppClearcutLoggingP$1) {
        this.a = nanoAppClearcutLoggingP$1;
    }

    public final void run() {
        ahzc ahzc = this.a.a;
        int i = ahzc.f;
        if (ahzc.e) {
            ahzc.b.a(ahzc, ahzc.d());
        }
    }
}
