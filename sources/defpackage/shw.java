package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: shw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class shw implements awdt {
    private final bapu a;
    private final bapu b;

    public shw(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aekn b2 = aeko.b();
        aoru a2 = jfm.a(10);
        apxx p = apxy.p();
        p.a((Context) this.a.a());
        p.a = b2;
        p.a(shv.a);
        p.a((Executor) a2);
        p.b(a2);
        p.c(a2);
        p.b = (apyr) this.b.a();
        apxy a3 = p.a();
        awdx.a((Object) a3, "Cannot return null from a non-@Nullable @Provides method");
        return a3;
    }
}
