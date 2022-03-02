package defpackage;

/* renamed from: oh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oh implements Cloneable {
    public static final Object a = new Object();
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;

    public oh() {
        this(10);
    }

    private final void d() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final long a(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public final int b() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public final void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            Object b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public oh(int i) {
        this.b = false;
        if (i != 0) {
            int b2 = og.b(i);
            this.c = new long[b2];
            this.d = new Object[b2];
            return;
        }
        this.c = og.b;
        this.d = og.c;
    }

    public final int b(long j) {
        if (this.b) {
            d();
        }
        return og.a(this.c, this.e, j);
    }

    public final void c(long j, Object obj) {
        int i = this.e;
        if (i == 0 || j > this.c[i - 1]) {
            if (this.b && i >= this.c.length) {
                d();
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int b2 = og.b(i2 + 1);
                long[] jArr = new long[b2];
                Object[] objArr = new Object[b2];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = jArr;
                this.d = objArr;
            }
            this.c[i2] = j;
            this.d[i2] = obj;
            this.e = i2 + 1;
            return;
        }
        b(j, obj);
    }

    public final Object a(long j) {
        return a(j, (Object) null);
    }

    public final Object a(long j, Object obj) {
        int a2 = og.a(this.c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != a) {
                return objArr[a2];
            }
        }
        return obj;
    }

    public final Object b(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
    }

    public final void b(long j, Object obj) {
        int a2 = og.a(this.c, this.e, j);
        if (a2 < 0) {
            int i = a2 ^ -1;
            if (i < this.e) {
                Object[] objArr = this.d;
                if (objArr[i] == a) {
                    this.c[i] = j;
                    objArr[i] = obj;
                    return;
                }
            }
            if (this.b && this.e >= this.c.length) {
                d();
                i = og.a(this.c, this.e, j) ^ -1;
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int b2 = og.b(i2 + 1);
                long[] jArr = new long[b2];
                Object[] objArr2 = new Object[b2];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.c = jArr;
                this.d = objArr2;
            }
            int i3 = this.e - i;
            if (i3 != 0) {
                long[] jArr3 = this.c;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3);
                Object[] objArr4 = this.d;
                System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
            }
            this.c[i] = j;
            this.d[i] = obj;
            this.e++;
            return;
        }
        this.d[a2] = obj;
    }

    /* renamed from: a */
    public final oh clone() {
        try {
            oh ohVar = (oh) super.clone();
            ohVar.c = (long[]) this.c.clone();
            ohVar.d = (Object[]) this.d.clone();
            return ohVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
