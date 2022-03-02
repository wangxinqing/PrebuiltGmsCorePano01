package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: baaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baaf {
    public static final azzx a = new azzv();
    static final anml b = anml.e.a();
    public static final azzu e = new azzu();
    public Object[] c;
    public int d;

    public baaf() {
    }

    private final void a(int i, Object obj) {
        if (this.c instanceof byte[][]) {
            d(c());
        }
        this.c[i + i + 1] = obj;
    }

    private final int c() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void d(int i) {
        Object[] objArr = new Object[i];
        if (!d()) {
            System.arraycopy(this.c, 0, objArr, 0, a());
        }
        this.c = objArr;
    }

    private final boolean d() {
        return this.d == 0;
    }

    public final int a() {
        int i = this.d;
        return i + i;
    }

    public final Object b(baab baab) {
        for (int i = this.d - 1; i >= 0; i--) {
            if (Arrays.equals(baab.b, a(i))) {
                return a(i, baab);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.d; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(a(i), amqn.a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(b.a(b(i)));
            } else {
                sb.append(new String(b(i), amqn.a));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public baaf(int i, Object[] objArr) {
        this.d = i;
        this.c = objArr;
    }

    private final Object c(int i) {
        return this.c[i + i + 1];
    }

    public final void c(baab baab) {
        if (!d()) {
            int i = 0;
            for (int i2 = 0; i2 < this.d; i2++) {
                if (!Arrays.equals(baab.b, a(i2))) {
                    a(i, a(i2));
                    a(i, c(i2));
                    i++;
                }
            }
            Arrays.fill(this.c, i + i, a(), (Object) null);
            this.d = i;
        }
    }

    public final void d(baab baab) {
        if (!d()) {
            ArrayList arrayList = null;
            int i = 0;
            for (int i2 = 0; i2 < this.d; i2++) {
                if (!Arrays.equals(baab.b, a(i2))) {
                    a(i, a(i2));
                    a(i, c(i2));
                    i++;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a(i2, baab));
                }
            }
            Arrays.fill(this.c, i + i, a(), (Object) null);
            this.d = i;
        }
    }

    private final void a(int i, byte[] bArr) {
        this.c[i + i] = bArr;
    }

    public final Set b() {
        if (d()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.d);
        for (int i = 0; i < this.d; i++) {
            hashSet.add(new String(a(i), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final Object a(int i, baab baab) {
        Object c2 = c(i);
        if (c2 instanceof byte[]) {
            return baab.a((byte[]) c2);
        }
        baac baac = (baac) c2;
        throw null;
    }

    public final byte[] b(int i) {
        Object c2 = c(i);
        if (c2 instanceof byte[]) {
            return (byte[]) c2;
        }
        baac baac = (baac) c2;
        throw null;
    }

    public final void a(baab baab, Object obj) {
        amrl.a((Object) baab, (Object) "key");
        amrl.a(obj, (Object) "value");
        if (a() == 0 || a() == c()) {
            int a2 = a();
            d(Math.max(a2 + a2, 8));
        }
        a(this.d, baab.b);
        int i = this.d;
        this.c[i + i + 1] = baab.a(obj);
        this.d++;
    }

    public final void a(baaf baaf) {
        if (!baaf.d()) {
            int c2 = c() - a();
            if (d() || c2 < baaf.a()) {
                d(a() + baaf.a());
            }
            System.arraycopy(baaf.c, 0, this.c, a(), baaf.a());
            this.d += baaf.d;
        }
    }

    public final boolean a(baab baab) {
        for (int i = 0; i < this.d; i++) {
            if (Arrays.equals(baab.b, a(i))) {
                return true;
            }
        }
        return false;
    }

    public final byte[] a(int i) {
        return (byte[]) this.c[i + i];
    }
}
