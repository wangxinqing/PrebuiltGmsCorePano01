package defpackage;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: aksk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksk implements Callable {
    private final aksc a;
    private final long[] b;

    public aksk(aksc aksc, long[] jArr) {
        this.a = aksc;
        this.b = jArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        aksc aksc = this.a;
        long[] jArr = this.b;
        iyn iyn = aksc.e;
        Context context = aksc.a;
        PlacesParams placesParams = PlacesParams.a;
        ArrayList arrayList = new ArrayList(r4);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        aucd o = asuw.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asuw asuw = (asuw) o.b;
        if (!asuw.b.a()) {
            asuw.b = aucj.a(asuw.b);
        }
        auab.a((Iterable) arrayList, (List) asuw.b);
        aucd o2 = astx.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        astx astx = (astx) o2.b;
        astx.a |= 1;
        astx.b = 64723;
        astx.a(astx);
        astx astx2 = (astx) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asuw asuw2 = (asuw) o.b;
        astx2.getClass();
        asuw2.c = astx2;
        asuw2.a |= 1;
        asuw asuw3 = (asuw) o.i();
        aucd o3 = assz.d.o();
        asuu a2 = aksd.a(context, placesParams);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        assz assz = (assz) o3.b;
        a2.getClass();
        assz.b = a2;
        int i = assz.a | 1;
        assz.a = i;
        asuw3.getClass();
        assz.c = asuw3;
        assz.a = i | 32;
        asta asta = (asta) iyn.a("getPlaceInferenceModels", ((assz) o3.i()).k(), (Object) asta.d, aksc.c, aksc.d, azcl.c(), 10248);
        Context context2 = aksc.a;
        asux asux = null;
        if (!(asta == null || (asta.a & 32) == 0)) {
            asuv asuv = asta.b;
            if (asuv == null) {
                asuv = asuv.c;
            }
            aksd.a(context2, asuv);
            asux = asta.c;
            if (asux == null) {
                return asux.c;
            }
        }
        return asux;
    }
}
