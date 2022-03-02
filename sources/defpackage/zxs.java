package defpackage;

import java.util.Comparator;

/* renamed from: zxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zxs implements Comparator {
    static final Comparator a = new zxs();

    private zxs() {
    }

    public final int compare(Object obj, Object obj2) {
        zyi zyi = (zyi) obj;
        zyi zyi2 = (zyi) obj2;
        zsg zsg = zyg.c;
        if (zyi != null) {
            if (zyi2 == null) {
                return -1;
            }
            long j = zyi.c;
            long j2 = zyi2.c;
            if (j != j2) {
                return j <= j2 ? 1 : -1;
            }
            return 0;
        }
    }
}
