package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: ils  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ils implements ilh {
    public final ilh a;
    private final Integer[] b;

    public ils(ilh ilh, Comparator comparator) {
        this.a = ilh;
        this.b = new Integer[ilh.a()];
        int i = 0;
        while (true) {
            Integer[] numArr = this.b;
            if (i < numArr.length) {
                numArr[i] = Integer.valueOf(i);
                i++;
            } else {
                Arrays.sort(numArr, new ilr(this, comparator));
                return;
            }
        }
    }

    public final int a() {
        return this.b.length;
    }

    public final Bundle b() {
        return this.a.b();
    }

    public final void c() {
        this.a.c();
    }

    public final void close() {
        this.a.c();
    }

    public final Iterator iterator() {
        return new ili(this);
    }

    public final Object a(int i) {
        return ((xfe) this.a).a(this.b[i].intValue());
    }
}
