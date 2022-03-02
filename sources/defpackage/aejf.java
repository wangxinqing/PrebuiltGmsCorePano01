package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: aejf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aejf {
    public static final String a = aejf.class.getSimpleName();
    final aejz b = new aejc(this);
    final ConcurrentMap c = new ConcurrentHashMap();
    public final Context d;
    public final aekl e;

    static {
        TimeUnit.SECONDS.toMillis(5);
    }

    public aejf(Context context, aejv aejv) {
        amrl.a((Object) context);
        amrl.a((Object) aejv);
        aekl aekl = new aekl(5);
        new aejd(this);
        this.d = context;
        this.e = aekl;
    }

    public final aeiy a(aejw aejw, aejb aejb) {
        aeiy aeiy;
        new Object[1][0] = aejw;
        long currentTimeMillis = System.currentTimeMillis();
        aeiz aeiz = new aeiz(this, new Object[]{aeje.CONNECT, aejw}, aejw, aejb);
        if (aejb.a()) {
            aeiy = (aeiy) this.e.a((aekj) aeiz);
        } else {
            aeiy = (aeiy) this.e.a((aekj) aeiz, aejb.b());
        }
        new Object[1][0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        return aeiy;
    }
}
