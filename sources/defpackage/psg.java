package defpackage;

import android.content.Context;

/* renamed from: psg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psg implements awdt {
    private final pse a;

    public psg(pse pse) {
        this.a = pse;
    }

    /* renamed from: b */
    public final Context a() {
        Context context = this.a.a;
        awdx.a((Object) context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
