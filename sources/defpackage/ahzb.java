package defpackage;

import com.google.android.location.contexthub.NanoAppClearcutLoggingP$1;

/* renamed from: ahzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ahzb implements Runnable {
    private final NanoAppClearcutLoggingP$1 a;

    public ahzb(NanoAppClearcutLoggingP$1 nanoAppClearcutLoggingP$1) {
        this.a = nanoAppClearcutLoggingP$1;
    }

    public final void run() {
        NanoAppClearcutLoggingP$1 nanoAppClearcutLoggingP$1 = this.a;
        ahzc ahzc = nanoAppClearcutLoggingP$1.a;
        int i = ahzc.f;
        ahzc.d.clear();
        nanoAppClearcutLoggingP$1.a.b.a();
    }
}
