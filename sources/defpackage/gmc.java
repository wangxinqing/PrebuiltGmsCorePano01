package defpackage;

import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: gmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmc implements acvf {
    final /* synthetic */ PreAddAccountChimeraActivity a;

    public gmc(PreAddAccountChimeraActivity preAddAccountChimeraActivity) {
        this.a = preAddAccountChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        if (((acwi) acwa).d) {
            PreAddAccountChimeraActivity.a.d("Task is cancelled", new Object[0]);
            return acws.a();
        } else if (acwa.b()) {
            if (!awlm.a.a().a()) {
                jix.g(this.a);
                return acws.a((Object) null);
            } else if (PreAddAccountChimeraActivity.d == null) {
                PreAddAccountChimeraActivity.a.d("PhenotypeClient is null", new Object[0]);
                return acws.a();
            } else {
                PreAddAccountChimeraActivity.a.b("Doing Phenotype commit", new Object[0]);
                return PreAddAccountChimeraActivity.d.a(((Configurations) acwa.d()).a);
            }
        } else if (acwa.e() != null) {
            return acws.a(acwa.e());
        } else {
            PreAddAccountChimeraActivity.a.d("Task was not successful, but exception is null", new Object[0]);
            return acws.a();
        }
    }
}
