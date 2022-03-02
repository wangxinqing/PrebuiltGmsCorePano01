package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: agbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agbo implements agcm {
    public final Executor a;
    private final Context b;
    private final iby c;

    public agbo(Context context, Executor executor, wls wls) {
        amrl.a((Object) context);
        amrl.a((Object) wls);
        iby a2 = wlt.a(context, wls);
        amrl.a((Object) context);
        this.b = context;
        amrl.a((Object) a2);
        this.c = a2;
        amrl.a((Object) executor);
        this.a = executor;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i, agcl agcl) {
        iby iby = this.c;
        String b2 = ((agbl) obj).b();
        Context context = this.b;
        int i2 = 2;
        if (i > 0) {
            float f = ((float) i) / context.getResources().getDisplayMetrics().density;
            if (f > 64.0f) {
                i2 = 3;
            } else if (f <= 48.0f) {
                i2 = f > 32.0f ? 1 : 0;
            }
        }
        iby.a(b2, i2, 1).a(new agbn(this, agcl), 3, TimeUnit.SECONDS);
    }
}
