package defpackage;

import com.google.android.gms.gcm.GcmChimeraDiagnostics;

/* renamed from: nrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nrw implements Runnable {
    final /* synthetic */ GcmChimeraDiagnostics a;

    public nrw(GcmChimeraDiagnostics gcmChimeraDiagnostics) {
        this.a = gcmChimeraDiagnostics;
    }

    public final void run() {
        this.a.e();
        GcmChimeraDiagnostics.c.postDelayed(this, 5000);
    }
}
