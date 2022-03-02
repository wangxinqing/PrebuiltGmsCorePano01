package defpackage;

/* renamed from: amyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amyx extends amwv {
    final amzf a;
    final Object b;
    int c;

    public amyx(amzf amzf, int i) {
        this.a = amzf;
        this.b = amzf.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            amzf amzf = this.a;
            if (i <= amzf.c && amqx.a(this.b, amzf.b[i])) {
                return;
            }
        }
        this.c = this.a.b(this.b);
    }

    public final Object getKey() {
        return this.b;
    }

    public final Object getValue() {
        a();
        int i = this.c;
        if (i != -1) {
            return this.a.a[i];
        }
        return null;
    }

    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            return this.a.a(this.b, obj);
        }
        Object obj2 = this.a.a[i];
        if (amqx.a(obj2, obj)) {
            return obj;
        }
        this.a.a(this.c, obj);
        return obj2;
    }
}
