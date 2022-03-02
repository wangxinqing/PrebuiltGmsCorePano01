package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: jbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbf implements jbi {
    public static final List a;
    public static final List b;
    public static final aoru c;
    public Context d;
    public jbj e;
    public List f = amzy.h();
    public List g = amzy.h();
    private ExecutorService h;
    private nkn i;

    @Deprecated
    private jbf() {
    }

    @Deprecated
    public static jbf a() {
        return new jbf();
    }

    public final void b() {
        List list = this.f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jbm) list.get(i2)).a();
        }
        List list2 = this.g;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((jbl) list2.get(i3)).a();
        }
        List list3 = a;
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((jbm) list3.get(i4)).a();
        }
        List list4 = b;
        int size4 = list4.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((jbl) list4.get(i5)).a();
        }
    }

    static {
        amzy h2 = amzy.h();
        amzy h3 = amzy.h();
        aoru a2 = jfb.a(4, 10);
        a = h2;
        b = h3;
        c = a2;
    }

    @Deprecated
    public final void a(jaz jaz, jba jba) {
        this.d = jaz;
        this.e = jaz.d;
        this.h = jaz.e;
        this.e.e.a(this, true);
        List list = jaz.b;
        if (list != null) {
            this.f = list;
        }
        List list2 = jaz.c;
        if (list2 != null) {
            this.g = list2;
        }
        this.i = new nkn(jaz, jaz.getClass(), 2);
        a(jba);
    }

    public final void a(jba jba) {
        ExecutorService executorService = this.h;
        amsv amsv = jbc.a;
        nkn nkn = this.i;
        int i2 = jba.c;
        String str = jba.b;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(i2);
        sb.append("-");
        sb.append(str);
        amky a2 = nkn.a(sb.toString(), amsv);
        try {
            executorService.execute(amll.a((Runnable) new jbe(this, jba)));
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
