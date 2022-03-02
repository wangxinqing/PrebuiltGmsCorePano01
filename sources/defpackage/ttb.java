package defpackage;

import java.util.Comparator;

/* renamed from: ttb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ttb implements Comparator {
    public static final Comparator a = new ttb();

    private ttb() {
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        ttg ttg = (ttg) obj;
        ttg ttg2 = (ttg) obj2;
        int i2 = 0;
        if (ttg.H() != 0) {
            int H = ttg.H();
            i = H - 1;
            if (H == 0) {
                throw null;
            }
        } else {
            i = 0;
        }
        if (ttg2.H() != 0) {
            int H2 = ttg2.H();
            i2 = H2 - 1;
            if (H2 == 0) {
                throw null;
            }
        }
        return i - i2;
    }
}
