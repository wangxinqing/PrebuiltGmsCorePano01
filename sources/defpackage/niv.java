package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: niv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class niv implements Runnable {
    private final niw a;
    private final Status b;

    public niv(niw niw, Status status) {
        this.a = niw;
        this.b = status;
    }

    public final void run() {
        amkr a2;
        amkr a3;
        niw niw = this.a;
        Status status = this.b;
        try {
            a2 = amlv.a("ServicePostProcessing");
            for (njb a4 : niw.b.g) {
                a4.a(niw.a, status);
            }
            if (a2 != null) {
                a2.close();
            }
            a3 = amlv.a("GlobalPostProcessing");
            for (njb a5 : nix.b) {
                a5.a(niw.a, status);
            }
            if (a3 != null) {
                a3.close();
            }
            niw.b.e.onAfterExecution();
            return;
            throw th;
            throw th;
        } catch (Throwable th) {
            niw.b.e.onAfterExecution();
            throw th;
        }
    }
}
