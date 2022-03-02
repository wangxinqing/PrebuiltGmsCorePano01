package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: aap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aap extends acy {
    final /* synthetic */ aas a;

    public aap(aas aas) {
        this.a = aas;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        aas aas = this.a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = aas.l.computeVerticalScrollRange();
        int i3 = aas.k;
        aas.m = computeVerticalScrollRange - i3 > 0 ? i3 >= aas.a : false;
        int computeHorizontalScrollRange = aas.l.computeHorizontalScrollRange();
        int i4 = aas.j;
        if (computeHorizontalScrollRange - i4 > 0) {
            z = i4 >= aas.a;
        } else {
            z = false;
        }
        aas.n = z;
        if (aas.m) {
            float f = (float) i3;
            aas.e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
            aas.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        } else if (!z) {
            if (aas.o != 0) {
                aas.a(0);
                return;
            }
            return;
        }
        if (aas.n) {
            float f2 = (float) i4;
            aas.h = (int) ((f2 * (((float) computeHorizontalScrollOffset) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
            aas.g = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = aas.o;
        if (i5 == 0 || i5 == 1) {
            aas.a(1);
        }
    }
}
