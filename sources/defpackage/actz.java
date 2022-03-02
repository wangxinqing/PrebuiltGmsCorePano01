package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: actz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actz extends yfa {
    private final Context d;

    public actz(Context context) {
        super(yef.a((Context) ihs.b()), "com.google.android.metrics");
        this.d = context;
    }

    /* access modifiers changed from: protected */
    public final void a(Configurations configurations) {
        SharedPreferences sharedPreferences = this.d.getSharedPreferences("com.google.android.metrics", 0);
        if (!configurations.f) {
            sharedPreferences.edit().clear().commit();
        }
        yfa.a(sharedPreferences, configurations.d);
    }
}
