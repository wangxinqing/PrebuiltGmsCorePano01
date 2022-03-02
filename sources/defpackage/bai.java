package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bai implements bao {
    public static final bai a = new bai();
    private static final bar b = bar.a("c", "v", "i", "o");

    private bai() {
    }

    public final /* bridge */ /* synthetic */ Object a(bat bat, float f) {
        if (bat.n() == 1) {
            bat.a();
        }
        bat.c();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (bat.e()) {
            int a2 = bat.a(b);
            if (a2 == 0) {
                z = bat.i();
            } else if (a2 == 1) {
                list = azw.a(bat, f);
            } else if (a2 == 2) {
                list2 = azw.a(bat, f);
            } else if (a2 != 3) {
                bat.g();
                bat.l();
            } else {
                list3 = azw.a(bat, f);
            }
        }
        bat.d();
        if (bat.n() == 2) {
            bat.b();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new ayl(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new axe(bba.a((PointF) list.get(i2), (PointF) list3.get(i2)), bba.a(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                arrayList.add(new axe(bba.a((PointF) list.get(i3), (PointF) list3.get(i3)), bba.a(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new ayl(pointF, z, arrayList);
        }
    }
}
