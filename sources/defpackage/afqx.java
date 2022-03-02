package defpackage;

import android.content.Context;

/* renamed from: afqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afqx implements awdt {
    private final afqw a;

    public afqx(afqw afqw) {
        this.a = afqw;
    }

    public static Context a(afqw afqw) {
        Context context = afqw.a;
        awdx.a((Object) context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    /* renamed from: b */
    public final Context a() {
        return a(this.a);
    }
}
