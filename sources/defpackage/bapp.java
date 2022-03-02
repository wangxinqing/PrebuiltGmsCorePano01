package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: bapp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bapp extends bapn implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    public transient long[] a;
    public int b;

    public bapp() {
        this(16);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new long[this.b];
        for (int i = 0; i < this.b; i++) {
            this.a[i] = objectInputStream.readLong();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeLong(this.a[i]);
        }
    }

    public final long a(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    public final long b(int i) {
        int i2 = this.b;
        if (i < i2) {
            long[] jArr = this.a;
            long j = jArr[i];
            int i3 = i2 - 1;
            this.b = i3;
            if (i != i3) {
                System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
            }
            return j;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    public final bapt c(int i) {
        d(i);
        return new bapo(this, i);
    }

    public final void clear() {
        this.b = 0;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        bapp bapp = new bapp(this.b);
        System.arraycopy(this.a, 0, bapp.a, 0, this.b);
        bapp.b = this.b;
        return bapp;
    }

    public final int d(long j) {
        for (int i = 0; i < this.b; i++) {
            if (j == this.a[i]) {
                return i;
            }
        }
        return -1;
    }

    public final int e(long j) {
        int i = this.b;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (j == this.a[i2]) {
                return i2;
            }
            i = i2;
        }
    }

    public final void h(int i) {
        long[] jArr = this.a;
        int i2 = this.b;
        int length = jArr.length;
        if (i > length) {
            long j = (long) length;
            long[] jArr2 = new long[((int) Math.max(Math.min(j + j, 2147483639), (long) i))];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            jArr = jArr2;
        }
        this.a = jArr;
    }

    public final boolean isEmpty() {
        return this.b == 0;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    public final boolean removeAll(Collection collection) {
        int i;
        long[] jArr = this.a;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!collection.contains(Long.valueOf(jArr[i2]))) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        if (i != i3) {
            z = true;
        }
        this.b = i3;
        return z;
    }

    public final int size() {
        return this.b;
    }

    public bapp(int i) {
        if (i >= 0) {
            this.a = new long[i];
            return;
        }
        throw new IllegalArgumentException("Initial capacity (" + i + ") is negative");
    }

    public final void a(int i, int i2) {
        int i3 = this.b;
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Start index (" + i + ") is negative");
        } else if (i > i2) {
            throw new IllegalArgumentException("Start index (" + i + ") is greater than end index (" + i2 + ")");
        } else if (i2 <= i3) {
            long[] jArr = this.a;
            System.arraycopy(jArr, i2, jArr, i, i3 - i2);
            this.b -= i2 - i;
        } else {
            throw new ArrayIndexOutOfBoundsException("End index (" + i2 + ") is greater than array length (" + i3 + ")");
        }
    }

    public final boolean c(long j) {
        int d = d(j);
        if (d == -1) {
            return false;
        }
        b(d);
        return true;
    }

    public final long b(int i, long j) {
        if (i < this.b) {
            long[] jArr = this.a;
            long j2 = jArr[i];
            jArr[i] = j;
            return j2;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    public final void a(int i, long j) {
        d(i);
        h(this.b + 1);
        int i2 = this.b;
        if (i != i2) {
            long[] jArr = this.a;
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        }
        this.a[i] = j;
        this.b++;
    }

    public final boolean a(long j) {
        h(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
        return true;
    }
}
