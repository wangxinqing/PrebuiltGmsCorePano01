package defpackage;

import android.content.Context;
import java.util.Set;

/* renamed from: uxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxq implements vgt {
    final /* synthetic */ Context a;
    final /* synthetic */ ased b;
    final /* synthetic */ avch c;
    final /* synthetic */ Set d;
    final /* synthetic */ uxu e;
    private asfz f;

    public uxq(uxu uxu, Context context, ased ased, avch avch, Set set) {
        this.e = uxu;
        this.a = context;
        this.b = ased;
        this.c = avch;
        this.d = set;
    }

    public final void a(vgr vgr, auzb auzb) {
        this.e.e.b();
        this.e.c.put(this.c.k, this);
        this.f = this.b.a(uxu.a(this.c, auzb), this.e.a(this.c, vgr, (uxl) null), vgy.a(this.a), this.e.a(this.d));
    }

    public final void b() {
        this.e.e.b();
        this.e.c.remove(this.c.k);
        this.b.a(this.f.b);
    }

    public final boolean a() {
        return uxu.a(this.a, this.b, this.c, 0);
    }
}
