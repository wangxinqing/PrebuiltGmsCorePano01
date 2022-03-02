package defpackage;

import android.content.SharedPreferences;

/* renamed from: afpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpl implements aoqb {
    private final afqn a;
    private final SharedPreferences b;

    public afpl(afqn afqn, SharedPreferences sharedPreferences) {
        this.a = afqn;
        this.b = sharedPreferences;
    }

    public final aorr a(Object obj) {
        afqn afqn = this.a;
        SharedPreferences sharedPreferences = this.b;
        if (!sharedPreferences.getBoolean("mdd_migrated_to_offroad", false)) {
            return aopr.a(afqn.e(), (amqy) new afqe(sharedPreferences), afqn.n);
        }
        return aorl.a((Object) null);
    }
}
