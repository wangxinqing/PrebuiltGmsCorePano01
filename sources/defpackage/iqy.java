package defpackage;

import android.content.ContextWrapper;

/* renamed from: iqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqy implements awdt {
    private final bapu a;

    public iqy(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        ContextWrapper contextWrapper = (ContextWrapper) this.a.a();
        awdx.a((Object) contextWrapper, "Cannot return null from a non-@Nullable @Provides method");
        return contextWrapper;
    }
}
