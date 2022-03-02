package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: amwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amwu extends amwz implements Serializable {
    private static final long serialVersionUID = 0;
    transient anfj a;
    transient long b;

    public amwu(int i) {
        a(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        a(3);
        for (int i = 0; i < readInt; i++) {
            b(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(e().size());
        for (anfd anfd : e()) {
            objectOutputStream.writeObject(anfd.a);
            objectOutputStream.writeInt(anfd.a());
        }
    }

    public final int a(Object obj) {
        anfj anfj = this.a;
        int a2 = anfj.a(obj);
        if (a2 != -1) {
            return anfj.b[a2];
        }
        return 0;
    }

    public abstract void a(int i);

    public final Iterator b() {
        return new amws(this);
    }

    public final int c() {
        return this.a.c;
    }

    public final void clear() {
        anfj anfj = this.a;
        anfj.d++;
        Arrays.fill(anfj.a, 0, anfj.c, (Object) null);
        Arrays.fill(anfj.b, 0, anfj.c, 0);
        Arrays.fill(anfj.e, -1);
        Arrays.fill(anfj.f, -1);
        anfj.c = 0;
        this.b = 0;
    }

    public final Iterator iterator() {
        return new anfg(this, e().iterator());
    }

    public final int size() {
        return aoog.b(this.b);
    }

    public final void b(Object obj, int i) {
        boolean z;
        Object obj2 = obj;
        int i2 = i;
        if (i2 == 0) {
            a(obj);
            return;
        }
        amrl.a(i2 > 0, "occurrences cannot be negative: %s", i2);
        int a2 = this.a.a(obj2);
        if (a2 != -1) {
            long j = (long) i2;
            long d = ((long) this.a.d(a2)) + j;
            if (d <= 2147483647L) {
                z = true;
            } else {
                z = false;
            }
            amrl.a(z, "too many occurrences: %s", d);
            this.a.a(a2, (int) d);
            this.b += j;
            return;
        }
        anfj anfj = this.a;
        if (i2 > 0) {
            long[] jArr = anfj.f;
            Object[] objArr = anfj.a;
            int[] iArr = anfj.b;
            int a3 = amzi.a(obj);
            int a4 = anfj.a() & a3;
            int i3 = anfj.c;
            int[] iArr2 = anfj.e;
            int i4 = iArr2[a4];
            if (i4 != -1) {
                while (true) {
                    long j2 = jArr[i4];
                    if (anfj.a(j2) == a3 && amqx.a(obj2, objArr[i4])) {
                        int i5 = iArr[i4];
                        iArr[i4] = i2;
                        break;
                    }
                    int i6 = (int) j2;
                    if (i6 == -1) {
                        jArr[i4] = anfj.a(j2, i3);
                        break;
                    }
                    i4 = i6;
                }
            } else {
                iArr2[a4] = i3;
            }
            if (i3 != Integer.MAX_VALUE) {
                int i7 = i3 + 1;
                int length = anfj.f.length;
                if (i7 > length) {
                    int max = Math.max(1, length >>> 1) + length;
                    if (max < 0) {
                        max = Integer.MAX_VALUE;
                    }
                    if (max != length) {
                        anfj.a = Arrays.copyOf(anfj.a, max);
                        anfj.b = Arrays.copyOf(anfj.b, max);
                        long[] jArr2 = anfj.f;
                        int length2 = jArr2.length;
                        long[] copyOf = Arrays.copyOf(jArr2, max);
                        if (max > length2) {
                            Arrays.fill(copyOf, length2, max, -1);
                        }
                        anfj.f = copyOf;
                    }
                }
                anfj.f[i3] = (((long) a3) << 32) | 4294967295L;
                anfj.a[i3] = obj2;
                anfj.b[i3] = i2;
                anfj.c = i7;
                if (i3 >= anfj.h) {
                    int length3 = anfj.e.length;
                    int i8 = length3 + length3;
                    if (length3 < 1073741824) {
                        int i9 = ((int) (((float) i8) * anfj.g)) + 1;
                        int[] a5 = anfj.a(i8);
                        long[] jArr3 = anfj.f;
                        int length4 = a5.length - 1;
                        for (int i10 = 0; i10 < anfj.c; i10++) {
                            int a6 = anfj.a(jArr3[i10]);
                            int i11 = a6 & length4;
                            int i12 = a5[i11];
                            a5[i11] = i10;
                            jArr3[i10] = (((long) i12) & 4294967295L) | (((long) a6) << 32);
                        }
                        anfj.h = i9;
                        anfj.e = a5;
                    } else {
                        anfj.h = Integer.MAX_VALUE;
                    }
                }
                anfj.d++;
                this.b += (long) i2;
                return;
            }
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("count must be positive but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean c(Object obj, int i) {
        amxg.a(i, "oldCount");
        amxg.a(0, "newCount");
        int a2 = this.a.a(obj);
        if (a2 == -1) {
            return i == 0;
        }
        if (this.a.d(a2) != i) {
            return false;
        }
        this.a.e(a2);
        this.b -= (long) i;
        return true;
    }

    public final int a(Object obj, int i) {
        amrl.a(true, "occurrences cannot be negative: %s", i);
        int a2 = this.a.a(obj);
        if (a2 == -1) {
            return 0;
        }
        int d = this.a.d(a2);
        if (d > i) {
            this.a.a(a2, d - i);
        } else {
            this.a.e(a2);
            i = d;
        }
        this.b -= (long) i;
        return d;
    }

    public final Iterator a() {
        return new amwr(this);
    }
}
