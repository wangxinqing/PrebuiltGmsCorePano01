package defpackage;

import android.widget.SectionIndexer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: lqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqo implements SectionIndexer {
    private final String[] a;
    private final int[] b;

    public lqo(List list, List list2) {
        boolean z;
        int size = list2.size();
        this.a = new String[size];
        this.b = new int[size];
        if (size != 0) {
            Iterator it = list.iterator();
            lqp lqp = (lqp) it.next();
            boolean z2 = false;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                boolean z3 = true;
                if (i >= size) {
                    break;
                }
                lqp lqp2 = (lqp) list2.get(i);
                int i4 = lqp2.b;
                this.a[i] = lqp2.a;
                this.b[i] = i3;
                i3 = (i2 == 0 ? i3 + 1 : i3) + i4;
                i2 += i4;
                iva.a(i2 > lqp.b ? false : z3, (Object) "a fast scroller group should never \"straddle\" two display groups");
                if (i2 == lqp.b) {
                    lqp = it.hasNext() ? (lqp) it.next() : null;
                    i2 = 0;
                }
                i++;
            }
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z);
            iva.a(lqp == null ? true : z2);
        }
    }

    public final int getPositionForSection(int i) {
        return this.b[i];
    }

    public final int getSectionForPosition(int i) {
        int binarySearch = Arrays.binarySearch(this.b, i);
        return binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
    }

    public final Object[] getSections() {
        return this.a;
    }
}
