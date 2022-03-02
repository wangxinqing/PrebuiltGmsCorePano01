package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aglj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aglj implements agll {
    private static final int[] a = {0, 4, 8, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 150, 200, 300, 400, 500, 600, 700, 800, 900, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS};
    private final int[] b = new int[a.length];
    private int c;
    private int d;
    private int e;
    private int f;

    public final void a(int i, int i2) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        this.d++;
        if (i > i2) {
            this.c++;
        }
        int[] iArr = this.b;
        int binarySearch = Arrays.binarySearch(a, i);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        iArr[binarySearch] = iArr[binarySearch] + 1;
        this.e = Math.max(this.e, i);
        this.f += i;
    }

    public final boolean a() {
        return this.d != 0;
    }

    public final bask b() {
        Integer num;
        boolean z;
        if (!a()) {
            return null;
        }
        aucd o = bask.h.o();
        int i = this.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        bask bask = (bask) o.b;
        int i2 = bask.a | 1;
        bask.a = i2;
        bask.b = i;
        int i3 = this.d;
        int i4 = i2 | 2;
        bask.a = i4;
        bask.c = i3;
        int i5 = this.f;
        int i6 = i4 | 8;
        bask.a = i6;
        bask.e = i5;
        int i7 = this.e;
        bask.a = i6 | 4;
        bask.d = i7;
        int[] iArr = this.b;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            int[] iArr2 = a;
            if (i8 >= iArr2.length) {
                break;
            }
            if (iArr[i8] > 0) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = iArr2[i8];
                if (i9 != iArr2.length) {
                    num = Integer.valueOf(iArr2[i9] - 1);
                } else {
                    num = null;
                }
                if (i10 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.a(z);
                aucd o2 = basj.e.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                basj basj = (basj) o2.b;
                int i12 = basj.a | 2;
                basj.a = i12;
                basj.c = i11;
                basj.a = i12 | 1;
                basj.b = i10;
                if (num != null) {
                    int intValue = num.intValue();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    basj basj2 = (basj) o2.b;
                    basj2.a |= 4;
                    basj2.d = intValue;
                }
                arrayList.add((basj) o2.i());
            }
            i8++;
        }
        List asList = Arrays.asList((basj[]) arrayList.toArray(new basj[0]));
        if (o.c) {
            o.c();
            o.c = false;
        }
        bask bask2 = (bask) o.b;
        if (!bask2.f.a()) {
            bask2.f = aucj.a(bask2.f);
        }
        auab.a((Iterable) asList, (List) bask2.f);
        return (bask) o.i();
    }
}
