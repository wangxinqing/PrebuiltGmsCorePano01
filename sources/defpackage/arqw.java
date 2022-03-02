package defpackage;

import java.util.Comparator;

/* renamed from: arqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arqw implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        double d = ((arqx) obj2).d.a;
        double d2 = ((arqx) obj).d.a;
        if (d >= d2) {
            if (d > d2) {
                return 1;
            }
            long doubleToLongBits = Double.doubleToLongBits(d);
            long doubleToLongBits2 = Double.doubleToLongBits(d2);
            if (doubleToLongBits == doubleToLongBits2) {
                return 0;
            }
            if (doubleToLongBits >= doubleToLongBits2) {
                return 1;
            }
        }
        return -1;
    }
}
