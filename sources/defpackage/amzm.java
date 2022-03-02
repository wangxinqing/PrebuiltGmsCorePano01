package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: amzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class amzm {
    Object[] a;
    int b = 0;
    boolean c;

    static int a(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public /* bridge */ /* synthetic */ void b(Object obj) {
        throw null;
    }

    public amzm(int i) {
        amxg.a(i, "initialCapacity");
        this.a = new Object[i];
    }

    private final void a(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, a(length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    public final void a(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            a(this.b + collection.size());
            if (collection instanceof amzn) {
                this.b = ((amzn) collection).a(this.a, this.b);
                return;
            }
        }
        for (Object b2 : iterable) {
            b(b2);
        }
    }

    public final void a(Object obj) {
        amrl.a(obj);
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void a(Object... objArr) {
        anfi.a(objArr);
        int i = this.b;
        int length = objArr.length;
        a(i + length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }
}
