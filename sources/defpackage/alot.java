package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: alot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alot implements alpn, alov {
    public final alpf a;
    public volatile long b = 0;
    public alpq c;
    private final Map d = new HashMap();
    private final alqf e;

    public alot(alpf alpf, String str, String str2) {
        this.a = alpf;
        aloq aloq = new aloq(this);
        alqd a2 = alpf.a(str, str2);
        a2.a(aloq);
        this.e = a2.a();
    }

    public final synchronized void a() {
        alpq alpq = this.c;
        if (alpq != null) {
            alpq.b();
            this.c = null;
        }
        alpq alpq2 = new alpq(this.e, ((aloz) this.a).a, new alqm(this.a), new alpt(this.a), this);
        this.c = alpq2;
        alpq2.a();
    }

    public final synchronized void b() {
        alpq alpq = this.c;
        if (alpq != null) {
            alpq.b();
            this.c = null;
        }
    }

    public final synchronized void c() {
        if (this.c == null) {
            a();
        }
    }

    public final void a(int i, int i2) {
        if (this.c != null) {
            if (i == 2) {
                this.a.a(i2);
            }
            if (this.c.c()) {
                ((aloz) this.a).a.a(i != 5 ? alrg.FAILURE : alrg.SUCCESS, new alos(this));
            }
        }
    }

    public final void a(Class cls, alpk alpk) {
        List list = (List) this.d.get(cls);
        if (list == null) {
            list = new ArrayList();
            this.d.put(cls, list);
        }
        list.add(alpk);
    }

    public final void a(Object obj) {
        List<alpk> list;
        if (this.c != null && (list = (List) this.d.get(obj.getClass())) != null) {
            for (alpk a2 : list) {
                a2.a(obj);
            }
        }
    }
}
