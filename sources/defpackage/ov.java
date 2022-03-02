package defpackage;

/* renamed from: ov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ov implements Cloneable {
    private static final Object d = new Object();
    public boolean a;
    public Object[] b;
    public int c;
    private int[] e;

    public ov() {
        this(10);
    }

    public final Object a(int i) {
        return a(i, (Object) null);
    }

    public final void b() {
        int i = this.c;
        int[] iArr = this.e;
        Object[] objArr = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != d) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.c = i2;
    }

    public final int c() {
        if (this.a) {
            b();
        }
        return this.c;
    }

    public final Object d(int i) {
        if (this.a) {
            b();
        }
        return this.b[i];
    }

    public final int e(int i) {
        if (this.a) {
            b();
        }
        return og.a(this.e, this.c, i);
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(c(i));
            sb.append('=');
            Object d2 = d(i);
            if (d2 != this) {
                sb.append(d2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ov(int i) {
        this.a = false;
        if (i != 0) {
            int a2 = og.a(i);
            this.e = new int[a2];
            this.b = new Object[a2];
            return;
        }
        this.e = og.a;
        this.b = og.c;
    }

    public final Object a(int i, Object obj) {
        int a2 = og.a(this.e, this.c, i);
        if (a2 >= 0) {
            Object[] objArr = this.b;
            if (objArr[a2] != d) {
                return objArr[a2];
            }
        }
        return obj;
    }

    public final int c(int i) {
        if (this.a) {
            b();
        }
        return this.e[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.e
            int r1 = r3.c
            int r4 = defpackage.og.a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.b
            r1 = r0[r4]
            java.lang.Object r2 = d
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.a = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov.b(int):void");
    }

    public final void c(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0 || i > this.e[i2 - 1]) {
            if (this.a && i2 >= this.e.length) {
                b();
            }
            int i3 = this.c;
            if (i3 >= this.e.length) {
                int a2 = og.a(i3 + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                int[] iArr2 = this.e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.e = iArr;
                this.b = objArr;
            }
            this.e[i3] = i;
            this.b[i3] = obj;
            this.c = i3 + 1;
            return;
        }
        b(i, obj);
    }

    /* renamed from: a */
    public final ov clone() {
        try {
            ov ovVar = (ov) super.clone();
            ovVar.e = (int[]) this.e.clone();
            ovVar.b = (Object[]) this.b.clone();
            return ovVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void b(int i, Object obj) {
        int a2 = og.a(this.e, this.c, i);
        if (a2 < 0) {
            int i2 = a2 ^ -1;
            if (i2 < this.c) {
                Object[] objArr = this.b;
                if (objArr[i2] == d) {
                    this.e[i2] = i;
                    objArr[i2] = obj;
                    return;
                }
            }
            if (this.a && this.c >= this.e.length) {
                b();
                i2 = og.a(this.e, this.c, i) ^ -1;
            }
            int i3 = this.c;
            if (i3 >= this.e.length) {
                int a3 = og.a(i3 + 1);
                int[] iArr = new int[a3];
                Object[] objArr2 = new Object[a3];
                int[] iArr2 = this.e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.b;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.e = iArr;
                this.b = objArr2;
            }
            int i4 = this.c - i2;
            if (i4 != 0) {
                int[] iArr3 = this.e;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4);
                Object[] objArr4 = this.b;
                System.arraycopy(objArr4, i2, objArr4, i5, this.c - i2);
            }
            this.e[i2] = i;
            this.b[i2] = obj;
            this.c++;
            return;
        }
        this.b[a2] = obj;
    }
}
