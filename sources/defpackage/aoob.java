package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: aoob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoob extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final double[] a;
    final int b;
    final int c;

    public aoob(double[] dArr, int i, int i2) {
        this.a = dArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Double) && aooc.a(this.a, ((Double) obj).doubleValue(), this.b, this.c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aoob)) {
            return super.equals(obj);
        }
        aoob aoob = (aoob) obj;
        int size = size();
        if (aoob.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != aoob.a[aoob.b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + aooc.a(this.a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a2;
        if (!(obj instanceof Double) || (a2 = aooc.a(this.a, ((Double) obj).doubleValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return a2 - this.b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Double) {
            double[] dArr = this.a;
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.b;
            int i2 = this.c - 1;
            int i3 = aooc.a;
            while (true) {
                if (i2 >= i) {
                    if (dArr[i2] == doubleValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.b;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Double d = (Double) obj;
        amrl.a(i, size());
        double[] dArr = this.a;
        int i2 = this.b + i;
        double d2 = dArr[i2];
        amrl.a((Object) d);
        dArr[i2] = d.doubleValue();
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.c - this.b;
    }

    public final List subList(int i, int i2) {
        amrl.a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        double[] dArr = this.a;
        int i3 = this.b;
        return new aoob(dArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 12);
        sb.append('[');
        sb.append(this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(", ");
                sb.append(this.a[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        amrl.a(i, size());
        return Double.valueOf(this.a[this.b + i]);
    }
}
