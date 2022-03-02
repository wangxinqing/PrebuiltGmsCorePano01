package defpackage;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: aksj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksj implements Callable {
    private final aksc a;
    private final PlacesParams b;
    private final List c;

    public aksj(aksc aksc, List list, PlacesParams placesParams) {
        this.a = aksc;
        this.c = list;
        this.b = placesParams;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        aksc aksc = this.a;
        List list = this.c;
        PlacesParams placesParams = this.b;
        asst asst = (asst) aksc.a((aktf) new aksw(aksc.e, aksc.a, aksc.c, aksc.d, list, "getNearbyAlertDataById", placesParams), placesParams);
        Context context = aksc.a;
        if (asst == null || asst.b.size() == 0) {
            return new ArrayList();
        }
        asuv asuv = asst.a;
        if (asuv == null) {
            asuv = asuv.c;
        }
        aksd.a(context, asuv);
        return asst.b;
    }
}
