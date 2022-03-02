package defpackage;

import com.google.android.gms.gcm.GcmChimeraDiagnostics;

/* renamed from: nrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class nrs implements Runnable {
    private final GcmChimeraDiagnostics a;

    public nrs(GcmChimeraDiagnostics gcmChimeraDiagnostics) {
        this.a = gcmChimeraDiagnostics;
    }

    public final void run() {
        this.a.i();
    }
}
