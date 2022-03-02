package defpackage;

import android.util.Pair;
import java.io.File;

/* renamed from: afmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afmz implements ahb {
    private final afnb a;
    private final afmv b;
    private final File c;
    private final String d;
    private final agae e;

    public afmz(afnb afnb, afmv afmv, File file, String str, agae agae) {
        this.a = afnb;
        this.b = afmv;
        this.c = file;
        this.d = str;
        this.e = agae;
    }

    public final Object a(agz agz) {
        afnb afnb = this.a;
        afmv afmv = this.b;
        File file = this.c;
        String str = this.d;
        afmq afmq = (afmq) afmv;
        afzs afzs = new afzs(afnb.a, afmq.b, file, str, new afmy(agz), this.e);
        afzs.k = afnb.b;
        if (afmt.b == afmq.c) {
            afzs.a(afzr.WIFI_OR_CELLULAR);
        } else {
            afzs.a(afzr.WIFI_ONLY);
        }
        int i = afmq.d;
        if (i > 0) {
            afzs.j = i;
        }
        anhk i2 = afmq.e.listIterator();
        while (i2.hasNext()) {
            Pair pair = (Pair) i2.next();
            afzs.f.a((Object) (String) pair.first, (Object) (String) pair.second);
        }
        afna afna = new afna(afnb, file, str);
        aoqm aoqm = aoqm.a;
        ahf ahf = agz.c;
        if (ahf != null) {
            ahf.a(afna, aoqm);
        }
        afzs.c();
        String valueOf = String.valueOf(afmq.b);
        return valueOf.length() == 0 ? new String("Data download scheduled for file ") : "Data download scheduled for file ".concat(valueOf);
    }
}
