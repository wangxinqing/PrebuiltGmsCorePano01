package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.Callable;

/* renamed from: aksl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksl implements Callable {
    private final aksc a;
    private final assn[] b;

    public aksl(aksc aksc, assn[] assnArr) {
        this.a = aksc;
        this.b = assnArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        aksc aksc = this.a;
        assn[] assnArr = this.b;
        iyn iyn = aksc.e;
        Context context = aksc.a;
        PlacesParams placesParams = PlacesParams.a;
        int b2 = jlo.b();
        int i = ModuleManager.get(aksc.a).getCurrentModule().moduleVersion;
        aucd o = assk.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        assk assk = (assk) o.b;
        int i2 = assk.a | 2;
        assk.a = i2;
        assk.c = b2;
        assk.a = i2 | 4;
        assk.d = i;
        asuu a2 = aksd.a(context, placesParams);
        if (o.c) {
            o.c();
            o.c = false;
        }
        assk assk2 = (assk) o.b;
        a2.getClass();
        assk2.b = a2;
        assk2.a |= 1;
        for (assn assn : assnArr) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            assk assk3 = (assk) o.b;
            assn.getClass();
            if (!assk3.e.a()) {
                assk3.e = aucj.a(assk3.e);
            }
            assk3.e.add(assn);
        }
        return (assl) iyn.a("getPlaceInferenceModelWeights", ((assk) o.i()).k(), (Object) assl.d, aksc.c, aksc.d, azcl.c(), 10269);
    }
}
