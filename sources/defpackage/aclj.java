package defpackage;

import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: aclj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aclj implements Runnable {
    final /* synthetic */ BootstrapProgressResult a;
    final /* synthetic */ acll b;

    public aclj(acll acll, BootstrapProgressResult bootstrapProgressResult) {
        this.b = acll;
        this.a = bootstrapProgressResult;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
