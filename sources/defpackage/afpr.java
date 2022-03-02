package defpackage;

import android.content.SharedPreferences;

/* renamed from: afpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpr implements aoqb {
    private final afqn a;

    public afpr(afqn afqn) {
        this.a = afqn;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        Void voidR = (Void) obj;
        SharedPreferences a2 = afst.a(afqn.b, "gms_icing_mdd_manager_metadata", afqn.m);
        if (!a2.contains("gms_icing_mdd_reset_trigger")) {
            a2.edit().putInt("gms_icing_mdd_reset_trigger", (int) axsv.i()).commit();
        }
        int i = a2.getInt("gms_icing_mdd_reset_trigger", 0);
        int i2 = (int) axsv.i();
        if (i >= i2) {
            return aorl.a((Object) null);
        }
        a2.edit().putInt("gms_icing_mdd_reset_trigger", i2).commit();
        afqn.c.b(1045);
        return afqn.f();
    }
}
