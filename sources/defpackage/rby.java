package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: rby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rby implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public rby(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Context context = (Context) ((awdu) this.a).a;
        Executor executor = (Executor) ((awdu) this.b).a;
        aekn b2 = aeko.b();
        bapu bapu = this.d;
        apxx p = apxy.p();
        p.a(context);
        p.a = b2;
        p.a((apyp) new rbv(context, bapu));
        p.c(executor);
        p.a(executor);
        p.b(executor);
        p.b = (apyr) this.c.a();
        p.a(rbw.a);
        awdx.a((Object) p, "Cannot return null from a non-@Nullable @Provides method");
        return p;
    }
}
