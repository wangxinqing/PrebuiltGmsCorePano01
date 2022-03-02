package defpackage;

import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abbn implements aora {
    final /* synthetic */ long a;
    final /* synthetic */ ConsentChimeraActivity b;

    public abbn(ConsentChimeraActivity consentChimeraActivity, long j) {
        this.b = consentChimeraActivity;
        this.a = j;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amri amri = (amri) obj;
        ConsentChimeraActivity consentChimeraActivity = this.b;
        consentChimeraActivity.a(this.a, consentChimeraActivity.i, true);
        if (amri.a()) {
            this.b.i = ((Integer) amri.b()).intValue();
            this.b.e();
        }
    }

    public final void a(Throwable th) {
        ConsentChimeraActivity consentChimeraActivity = this.b;
        consentChimeraActivity.a(this.a, consentChimeraActivity.i, false);
        this.b.a(4, "");
    }
}
