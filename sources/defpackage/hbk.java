package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: hbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hbk implements awdt {
    private final bapu a;
    private final bapu b;

    public hbk(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        List e = hbb.e((Context) this.a.a(), ((Boolean) this.b.a()).booleanValue());
        awdx.a((Object) e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
