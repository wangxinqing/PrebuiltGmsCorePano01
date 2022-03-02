package defpackage;

import android.util.Pair;
import java.util.List;

/* renamed from: afsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class afsc implements aoqb {
    private final afsg a;
    private final int b;

    public afsc(afsg afsg, int i) {
        this.a = afsg;
        this.b = i;
    }

    public final aorr a(Object obj) {
        afsg afsg = this.a;
        int i = this.b;
        aorr a2 = aorl.a((Object) null);
        aorr aorr = a2;
        for (Pair pair : (List) obj) {
            aflf aflf = (aflf) pair.first;
            afkr afkr = (afkr) pair.second;
            if (afkr != null) {
                aucd o = aojg.g.o();
                String str = aflf.b;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojg aojg = (aojg) o.b;
                str.getClass();
                int i2 = aojg.a | 1;
                aojg.a = i2;
                aojg.b = str;
                String str2 = aflf.c;
                str2.getClass();
                int i3 = i2 | 4;
                aojg.a = i3;
                aojg.d = str2;
                int i4 = afkr.e;
                aojg.a = i3 | 2;
                aojg.c = i4;
                int size = afkr.j.size();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojg aojg2 = (aojg) o.b;
                aojg2.a |= 8;
                aojg2.e = size;
                boolean z = !aflf.d.isEmpty();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojg aojg3 = (aojg) o.b;
                aojg3.a |= 16;
                aojg3.f = z;
                aorr = aopr.a(aorr, (aoqb) new afse(afsg, afkr, aflf, (aojg) o.i(), i), afsg.d);
            }
        }
        return aorr;
    }
}
