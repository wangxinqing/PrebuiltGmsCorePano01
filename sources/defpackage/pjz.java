package defpackage;

import android.content.Context;

/* renamed from: pjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pjz implements awdt {
    private final pjq a;

    public pjz(pjq pjq) {
        this.a = pjq;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Context context = this.a.b;
        awdx.a((Object) context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
