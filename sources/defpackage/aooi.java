package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: aooi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aooi extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final long[] a;
    final int b;
    final int c;

    public aooi(long[] jArr, int i, int i2) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Long) && aook.a(this.a, ((Long) obj).longValue(), this.b, this.c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aooi)) {
            return super.equals(obj);
        }
        aooi aooi = (aooi) obj;
        int size = size();
        if (aooi.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != aooi.a[aooi.b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + aook.a(this.a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a2;
        if (!(obj instanceof Long) || (a2 = aook.a(this.a, ((Long) obj).longValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return a2 - this.b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.a;
            long longValue = ((Long) obj).longValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 >= i) {
                    if (jArr[i2] == longValue) {
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
        Long l = (Long) obj;
        amrl.a(i, size());
        long[] jArr = this.a;
        int i2 = this.b + i;
        long j = jArr[i2];
        amrl.a((Object) l);
        jArr[i2] = l.longValue();
        return Long.valueOf(j);
    }

    public final int size() {
        return this.c - this.b;
    }

    public final List subList(int i, int i2) {
        amrl.a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        long[] jArr = this.a;
        int i3 = this.b;
        return new aooi(jArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 10);
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
        return Long.valueOf(this.a[this.b + i]);
    }
}
