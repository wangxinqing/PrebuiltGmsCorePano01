package defpackage;

/* renamed from: anfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfo extends amzl {
    static final anfo b = new anfo();
    final transient Object[] c;
    public final transient anfo d;
    private final transient Object e;
    private final transient int f;
    private final transient int g;

    private anfo() {
        this.e = null;
        this.c = new Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }

    public final amzl b() {
        return this.d;
    }

    public final boolean bo() {
        return false;
    }

    public final anax f() {
        return new anfs(this, new anft(this.c, this.f, this.g));
    }

    public final anax g() {
        return new anfr(this, this.c, this.f, this.g);
    }

    public final Object get(Object obj) {
        return anfu.a(this.e, this.c, this.g, this.f, obj);
    }

    public final int size() {
        return this.g;
    }

    private anfo(Object obj, Object[] objArr, int i, anfo anfo) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = anfo;
    }

    public anfo(Object[] objArr, int i) {
        int i2;
        this.c = objArr;
        this.g = i;
        this.f = 0;
        if (i >= 2) {
            i2 = anax.b(i);
        } else {
            i2 = 0;
        }
        this.e = anfu.a(objArr, i, i2, 0);
        this.d = new anfo(anfu.a(objArr, i, i2, 1), objArr, i, this);
    }
}
