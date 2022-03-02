package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: lft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lft implements lgd {
    private final lgm a;
    private final Context b;
    private final Map c = new HashMap();

    public lft(lgm lgm, Context context) {
        iva.a((Object) lgm);
        this.a = lgm;
        iva.a((Object) context);
        this.b = context;
    }

    public final void a() {
    }

    public final void b() {
        throw null;
    }

    public final void a(lgc lgc) {
        lgl lgl;
        int i;
        String str = lgc.d;
        synchronized (this.c) {
            if (this.c.containsKey(str)) {
                lgl = (lgl) this.c.get(str);
            } else {
                if (str != null) {
                    i = 15;
                } else {
                    i = 5;
                }
                lgl lgl2 = new lgl(new agyh().a(this.a.a(str), lge.a(i)), this.b);
                lgl2.a();
                this.c.put(str, lgl2);
                lgl = lgl2;
            }
        }
        lgl.a(lgc);
    }

    public final /* bridge */ /* synthetic */ lfq c() {
        return new lgc(this, this.b);
    }
}
