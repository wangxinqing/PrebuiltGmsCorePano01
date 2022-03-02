package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cw extends AbstractList {
    public static final List a = new ArrayList();
    public int b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public cw() {
        this.b = 0;
        this.c = new ArrayList();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 1;
        this.i = 0;
        this.j = 0;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i2 = this.b;
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list = (List) this.c.get(i3);
            if (list != null && list != a) {
                break;
            }
            i2 += this.h;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        int i2 = this.d;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            List list = (List) this.c.get(size);
            if (list != null && list != a) {
                break;
            }
            i2 += this.h;
        }
        return i2;
    }

    public final Object get(int i2) {
        int i3;
        if (i2 < 0 || i2 >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + size());
        }
        int i4 = i2 - this.b;
        if (i4 < 0 || i4 >= this.g) {
            return null;
        }
        int i5 = this.h;
        if (i5 <= 0) {
            int size = this.c.size();
            i3 = 0;
            while (i3 < size) {
                int size2 = ((List) this.c.get(i3)).size();
                if (size2 > i4) {
                    break;
                }
                i4 -= size2;
                i3++;
            }
        } else {
            i3 = i4 / i5;
            i4 %= i5;
        }
        List list = (List) this.c.get(i3);
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(i4);
    }

    public final int size() {
        return this.b + this.g + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("leading " + this.b + ", storage " + this.g + ", trailing " + this.d);
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            sb.append(" ");
            sb.append(this.c.get(i2));
        }
        return sb.toString();
    }

    public cw(cw cwVar) {
        this.b = cwVar.b;
        this.c = new ArrayList(cwVar.c);
        this.d = cwVar.d;
        this.e = cwVar.e;
        this.f = cwVar.f;
        this.g = cwVar.g;
        this.h = cwVar.h;
        this.i = cwVar.i;
        this.j = cwVar.j;
    }
}
