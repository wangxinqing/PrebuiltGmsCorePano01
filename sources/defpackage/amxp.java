package defpackage;

import java.util.Map;

/* renamed from: amxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxp extends amwv {
    final /* synthetic */ amxr a;
    private final Object b;
    private int c;

    public amxp(amxr amxr, int i) {
        this.a = amxr;
        this.b = amxr.d[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i == -1 || i >= this.a.size() || !amqx.a(this.b, this.a.d[this.c])) {
            this.c = this.a.a(this.b);
        }
    }

    public final Object getKey() {
        return this.b;
    }

    public final Object getValue() {
        Map d = this.a.d();
        if (d != null) {
            return d.get(this.b);
        }
        a();
        int i = this.c;
        if (i != -1) {
            return this.a.e[i];
        }
        return null;
    }

    public final Object setValue(Object obj) {
        Map d = this.a.d();
        if (d != null) {
            return d.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        Object[] objArr = this.a.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
