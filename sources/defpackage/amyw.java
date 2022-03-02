package defpackage;

/* renamed from: amyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amyw extends amwv {
    final Object a;
    int b;
    final /* synthetic */ amzf c;

    public amyw(amzf amzf, int i) {
        this.c = amzf;
        this.a = amzf.a[i];
        this.b = i;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int i = this.b;
        if (i != -1) {
            amzf amzf = this.c;
            if (i <= amzf.c && amqx.a(amzf.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.a(this.a);
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        a();
        int i = this.b;
        if (i != -1) {
            return this.c.b[i];
        }
        return null;
    }

    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            return this.c.put(this.a, obj);
        }
        Object obj2 = this.c.b[i];
        if (amqx.a(obj2, obj)) {
            return obj;
        }
        this.c.b(this.b, obj);
        return obj2;
    }
}
