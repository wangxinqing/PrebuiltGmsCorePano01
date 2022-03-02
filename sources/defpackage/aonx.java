package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: aonx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aonx extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final boolean[] a;
    final int b;
    final int c;

    public aonx(boolean[] zArr, int i, int i2) {
        this.a = zArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Boolean) && aony.a(this.a, ((Boolean) obj).booleanValue(), this.b, this.c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aonx)) {
            return super.equals(obj);
        }
        aonx aonx = (aonx) obj;
        int size = size();
        if (aonx.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != aonx.a[aonx.b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + (!this.a[i2] ? 1237 : 1231);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a2;
        if (!(obj instanceof Boolean) || (a2 = aony.a(this.a, ((Boolean) obj).booleanValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return a2 - this.b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean[] zArr = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 >= i) {
                    if (zArr[i2] == booleanValue) {
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
        Boolean bool = (Boolean) obj;
        amrl.a(i, size());
        boolean[] zArr = this.a;
        int i2 = this.b + i;
        boolean z = zArr[i2];
        amrl.a((Object) bool);
        zArr[i2] = bool.booleanValue();
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.c - this.b;
    }

    public final List subList(int i, int i2) {
        amrl.a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        boolean[] zArr = this.a;
        int i3 = this.b;
        return new aonx(zArr, i + i3, i3 + i2);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(size() * 7);
        if (!this.a[this.b]) {
            str = "[false";
        } else {
            str = "[true";
        }
        sb.append(str);
        int i = this.b;
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(!this.a[i] ? ", false" : ", true");
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        amrl.a(i, size());
        return Boolean.valueOf(this.a[this.b + i]);
    }
}
