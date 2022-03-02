package defpackage;

import android.content.Context;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: tza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tza {
    public final AtomicInteger a = new AtomicInteger(19729255);
    public final LruCache b = new LruCache((int) aymt.t());
    public final LruCache c = new LruCache((int) aymt.t());
    public final Context d;
    public final tyy e;
    public final tzb f;
    public final thb g;
    public final tyx h;
    public final arwg i;
    public final tsu j;
    public final arxg k;
    public final jiq l;

    public tza(Context context) {
        tyy tyy = new tyy(context);
        tzb tzb = new tzb(context);
        tyx tyx = new tyx(context);
        this.d = context;
        this.g = (thb) thl.a(context, thb.class);
        this.e = tyy;
        this.f = tzb;
        this.h = tyx;
        this.i = (arwg) thl.a(context, arwg.class);
        this.j = (tsu) thl.a(context, tsu.class);
        this.k = (arxg) thl.a(context, arxg.class);
        this.l = (jiq) thl.a(context, jiq.class);
    }

    public final void a(int i2) {
        jjg jjg = tsp.a;
        this.g.a(i2);
        this.e.a(i2, 6);
    }

    public final void a(String str) {
        Integer num = (Integer) this.b.get(str);
        jjg jjg = tsp.a;
        if (num != null) {
            this.e.b(num.intValue());
            this.b.remove(str);
        }
    }
}
