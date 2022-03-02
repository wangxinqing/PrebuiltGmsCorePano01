package defpackage;

import android.content.Context;

/* renamed from: qqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqe implements awdt {
    private final qqd a;

    public qqe(qqd qqd) {
        this.a = qqd;
    }

    public static qqe a(qqd qqd) {
        return new qqe(qqd);
    }

    /* renamed from: b */
    public final Context a() {
        Context context = this.a.c;
        awdx.a((Object) context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
