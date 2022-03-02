package defpackage;

/* renamed from: anfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfp extends amzy {
    static final amzy a = new anfp(new Object[0], 0);
    final transient Object[] b;
    private final transient int c;

    public anfp(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    public final Object[] b() {
        return this.b;
    }

    public final int c() {
        return 0;
    }

    public final int d() {
        return this.c;
    }

    public final boolean f() {
        return false;
    }

    public final Object get(int i) {
        amrl.a(i, this.c);
        return this.b[i];
    }

    public final int size() {
        return this.c;
    }
}
