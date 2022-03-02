package defpackage;

import java.util.Set;

/* renamed from: kqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class kqs {
    private int a = 4;
    public int c = 1;
    public int[] d = new int[4];
    public Object[] e = new Object[4];
    protected Object f = null;
    protected int g = 0;

    public static kqs b() {
        return new kqs();
    }

    public final kqh a(int i, kql kql) {
        return new kqh(i, kql, this);
    }

    public final void c(int i, String str) {
        boolean z;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "No field definition to rename");
        kqp kqp = (kqp) this.f;
        kqp kqp2 = new kqp(str, kqp.i, kqp.b, kqp.d, kqp.e, kqp.g, kqp.f, kqp.c, kqp.h);
        b(i);
        a(i, (Object) kqp2);
    }

    private final void b(int i, Object obj) {
        if (i == this.g) {
            this.e[this.c - 1] = obj;
        } else {
            int i2 = this.c;
            int i3 = this.a;
            if (i2 == i3) {
                int i4 = i3 + 4;
                this.a = i4;
                int[] iArr = new int[i4];
                Object[] objArr = new Object[i4];
                System.arraycopy(this.d, 0, iArr, 0, i2);
                System.arraycopy(this.e, 0, objArr, 0, this.c);
                this.d = iArr;
                this.e = objArr;
            }
            int[] iArr2 = this.d;
            int i5 = this.c;
            iArr2[i5] = i;
            this.e[i5] = obj;
            this.c = i5 + 1;
        }
        this.f = obj;
        this.g = i;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Object obj) {
        if (this.f != null) {
            throw new IllegalStateException("Cannot add a new definition until the existing definition is removed");
        } else if (i >= this.g) {
            b(i, obj);
        } else {
            throw new IllegalArgumentException("Versions must be 0 or greater and specified in non-descending order");
        }
    }

    public final void a(int i, kqm kqm) {
        boolean z;
        Set set = kqm.e;
        if (set == null || !set.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = kqm.c;
        if (z2) {
            if (kqm.i != 1) {
                kqm.f = true;
            }
            if (z) {
                kqm.e = null;
            }
            kqm.d = false;
        } else if (z) {
            kqm.d = false;
        }
        a(i, (Object) new kqp(kqm.a, kqm.i, z2, kqm.d, kqm.e, kqm.f, kqm.g, kqm.b, kqm.h));
    }

    public final void b(int i) {
        if (this.f == null) {
            throw new IllegalStateException("No definition to remove");
        } else if (i > this.g) {
            b(i, (Object) null);
        } else {
            throw new IllegalArgumentException("Versions must be 0 or greater and specified in ascending order");
        }
    }
}
