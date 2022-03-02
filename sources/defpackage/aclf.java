package defpackage;

import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: aclf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aclf implements Runnable {
    final /* synthetic */ VerificationInfo a;
    final /* synthetic */ acll b;

    public aclf(acll acll, VerificationInfo verificationInfo) {
        this.b = acll;
        this.a = verificationInfo;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
