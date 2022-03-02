package defpackage;

import android.content.Context;

/* renamed from: tvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tvb extends arwm {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ tzj c;
    final /* synthetic */ aucd d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tvb(String str, Context context, aucd aucd, String str2, tzj tzj) {
        super(str);
        this.a = context;
        this.d = aucd;
        this.b = str2;
        this.c = tzj;
    }

    public final void run() {
        ubv ubv = (ubv) thl.a(this.a, ubv.class);
        ttg a2 = tvd.a(this.a, this.d, this.b, this.c.b.k());
        ubv.c.b();
        ubv.a.b(a2);
        ubv.a(0, a2.j());
    }
}
