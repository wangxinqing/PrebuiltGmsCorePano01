package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: roq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class roq extends yfa {
    private final Context d;

    public roq(Context context) {
        super(yef.a(context), "com.google.android.gms.lockbox");
        this.d = context;
    }

    /* access modifiers changed from: protected */
    public final void a(Configurations configurations) {
        SharedPreferences sharedPreferences = this.d.getSharedPreferences("com.google.android.gms.lockbox", 0);
        if (!configurations.f) {
            sharedPreferences.edit().clear().commit();
        }
        yfa.a(sharedPreferences, configurations.d);
    }
}
