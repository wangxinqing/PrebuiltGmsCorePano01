package defpackage;

import android.content.Context;

/* renamed from: tvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tvc extends arwm {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tvc(String str, Context context, String str2) {
        super(str);
        this.a = context;
        this.b = str2;
    }

    public final void run() {
        ubv ubv = (ubv) thl.a(this.a, ubv.class);
        String str = this.b;
        ubv.c.b();
        ttf ttf = ubv.a;
        boolean z = false;
        for (ttg ttg : ttf.b()) {
            if (str.equals(ttg.m())) {
                jjg jjg = tsp.a;
                ttg.i();
                ttg.a(ttf.a.a());
                z = true;
            }
        }
        if (z) {
            ubv.a(1, avbx.NEARBY_DEVICE);
        }
    }
}
