package defpackage;

import com.google.android.gms.mdh.LatestFootprintFilter;
import java.util.concurrent.Executor;

/* renamed from: afjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afjc implements aepf {
    public final afiz a;
    public final afhs b;
    public final afhr c;
    public final String d;
    public final Executor e;

    public afjc(afiz afiz, afhs afhs, String str, Executor executor) {
        this.a = afiz;
        this.b = afhs;
        afhq b2 = afhr.b();
        b2.a((byte[]) null, 1);
        this.c = b2.a();
        this.d = str;
        this.e = executor;
    }

    public final void a() {
        afhs afhs = this.b;
        afhr afhr = this.c;
        afij afij = (afij) afhs;
        Executor executor = afij.a;
        sac sac = afij.f;
        LatestFootprintFilter a2 = afie.a(afhr);
        acwd acwd = new acwd();
        sac.a(new rzx(acwd, new rzd(sac, a2, acwd)));
        aorl.a(afip.a(executor, acwd.a, new afih(afij)), new afjb(this), this.e);
    }
}
