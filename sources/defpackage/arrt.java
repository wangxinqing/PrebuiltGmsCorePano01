package defpackage;

import java.util.ArrayList;

/* renamed from: arrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arrt implements arre {
    private final Iterable a;

    public arrt(arre arre, arre arre2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(arre);
        arrayList.add(arre2);
        this.a = arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.lang.Iterable] */
    public final double a(double d, double d2, arpu arpu) {
        ? r1 = this.a;
        int size = r1.size();
        double d3 = 0.0d;
        for (int i = 0; i < size; i++) {
            d3 += ((arre) r1.get(i)).a(d, d2, arpu);
        }
        return d3;
    }
}
