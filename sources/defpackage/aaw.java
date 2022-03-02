package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: aaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaw implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        aay aay = (aay) obj;
        aay aay2 = (aay) obj2;
        RecyclerView recyclerView = aay.d;
        if (recyclerView != null) {
            z = false;
        } else {
            z = true;
        }
        if (aay2.d != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            boolean z3 = aay.a;
            if (z3 != aay2.a) {
                return !z3 ? 1 : -1;
            }
            int i = aay2.b - aay.b;
            if (i != 0) {
                return i;
            }
            int i2 = aay.c - aay2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        } else if (recyclerView != null) {
            return -1;
        } else {
            return 1;
        }
    }
}
