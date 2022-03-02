package defpackage;

import com.google.android.gms.gcm.GcmChimeraDiagnostics;

/* renamed from: nru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class nru implements Runnable {
    private final GcmChimeraDiagnostics a;

    public nru(GcmChimeraDiagnostics gcmChimeraDiagnostics) {
        this.a = gcmChimeraDiagnostics;
    }

    public final void run() {
        this.a.h();
    }
}
