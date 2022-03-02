package defpackage;

import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: gmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmf implements acvp {
    final /* synthetic */ gmm a;
    final /* synthetic */ long b;

    public gmf(gmm gmm, long j) {
        this.a = gmm;
        this.b = j;
    }

    public final void a(acwa acwa) {
        this.a.a();
        PreAddAccountChimeraActivity.a.a("Phenotype registration took %dms", Long.valueOf(System.currentTimeMillis() - this.b));
    }
}
