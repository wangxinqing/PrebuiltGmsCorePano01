package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: anbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anbb extends anab {
    private transient Object[] c = new Object[4];
    private transient Object[] d = new Object[4];
    private final Comparator e;

    /* renamed from: b */
    public final anbd a() {
        int i = this.b;
        if (i == 0) {
            return anbd.a(this.e);
        }
        if (i == 1) {
            return anbd.a(this.e, this.c[0], this.d[0]);
        }
        Object[] copyOf = Arrays.copyOf(this.c, i);
        Arrays.sort(copyOf, this.e);
        Object[] objArr = new Object[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (this.e.compare(copyOf[i3], copyOf[i2]) == 0) {
                    String valueOf = String.valueOf(copyOf[i3]);
                    String valueOf2 = String.valueOf(copyOf[i2]);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
                    sb.append("keys required to be distinct but compared as equal: ");
                    sb.append(valueOf);
                    sb.append(" and ");
                    sb.append(valueOf2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            objArr[Arrays.binarySearch(copyOf, this.c[i2], this.e)] = this.d[i2];
        }
        return new anbd(new anfw(amzy.b(copyOf), this.e), amzy.b(objArr));
    }

    public anbb(Comparator comparator) {
        amrl.a((Object) comparator);
        this.e = comparator;
    }

    /* renamed from: b */
    public final void a(Object obj, Object obj2) {
        int i = this.b + 1;
        int length = this.c.length;
        if (i > length) {
            int a = amzm.a(length, i);
            this.c = Arrays.copyOf(this.c, a);
            this.d = Arrays.copyOf(this.d, a);
        }
        amxg.a(obj, obj2);
        Object[] objArr = this.c;
        int i2 = this.b;
        objArr[i2] = obj;
        this.d[i2] = obj2;
        this.b = i2 + 1;
    }
}
