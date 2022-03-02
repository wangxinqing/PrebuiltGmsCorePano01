package defpackage;

import android.content.SharedPreferences;

/* renamed from: afpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpw implements aoqb {
    private final afqn a;

    public afpw(afqn afqn) {
        this.a = afqn;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        afqr afqr = afqn.f;
        SharedPreferences a2 = afst.a(afqr.a, "gms_icing_mdd_shared_file_manager_metadata", afqr.j);
        if (a2.contains("migrated_to_new_file_key")) {
            if (a2.getBoolean("migrated_to_new_file_key", false)) {
                afpk.c(afqr.a);
            }
            a2.edit().remove("migrated_to_new_file_key").commit();
        }
        return aopr.a(aorl.a((Object) true), (aoqb) new afqd(afqn), afqn.n);
    }
}
