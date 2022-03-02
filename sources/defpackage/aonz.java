package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: aonz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aonz extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;
    final int b;
    final int c;

    public aonz(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Byte) && aooa.a(this.a, ((Byte) obj).byteValue(), this.b, this.c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aonz)) {
            return super.equals(obj);
        }
        aonz aonz = (aonz) obj;
        int size = size();
        if (aonz.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != aonz.a[aonz.b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a2;
        if (!(obj instanceof Byte) || (a2 = aooa.a(this.a, ((Byte) obj).byteValue(), this.b, this.c)) < 0) {
            return -1;
        }
        return a2 - this.b;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Byte) {
            byte[] bArr = this.a;
            byte byteValue = ((Byte) obj).byteValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (true) {
                if (i2 >= i) {
                    if (bArr[i2] == byteValue) {
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
        Byte b2 = (Byte) obj;
        amrl.a(i, size());
        byte[] bArr = this.a;
        int i2 = this.b + i;
        byte b3 = bArr[i2];
        amrl.a((Object) b2);
        bArr[i2] = b2.byteValue();
        return Byte.valueOf(b3);
    }

    public final int size() {
        return this.c - this.b;
    }

    public final List subList(int i, int i2) {
        amrl.a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        return new aonz(bArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
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
        return Byte.valueOf(this.a[this.b + i]);
    }
}
