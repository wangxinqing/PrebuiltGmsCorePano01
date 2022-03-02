package defpackage;

import android.content.SharedPreferences;

/* renamed from: afqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afqe implements amqy {
    private final SharedPreferences a;

    public afqe(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final Object a(Object obj) {
        SharedPreferences sharedPreferences = this.a;
        Void voidR = (Void) obj;
        boolean z = afqn.a;
        sharedPreferences.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
        return null;
    }
}
