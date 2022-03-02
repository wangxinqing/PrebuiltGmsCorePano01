package defpackage;

/* renamed from: anfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfv extends anax {
    public static final anfv a = new anfv(new Object[0], 0, (Object[]) null, 0, 0);
    final transient Object[] b;
    final transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient int f;

    public anfv(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i2;
        this.e = i;
        this.f = i3;
    }

    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.f);
        return i + this.f;
    }

    public final Object[] b() {
        return this.b;
    }

    public final int c() {
        return 0;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.c;
        if (obj != null && objArr != null) {
            int a2 = amzi.a(obj);
            while (true) {
                int i = a2 & this.d;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    a2 = i + 1;
                }
            }
        }
        return false;
    }

    public final int d() {
        return this.f;
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return this.e;
    }

    public final amzy i() {
        return amzy.b(this.b, this.f);
    }

    public final int size() {
        return this.f;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return e().listIterator();
    }
}
