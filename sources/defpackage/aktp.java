package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: aktp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktp implements Callable {
    private final aktg a;
    private final PlacesParams b;
    private final List c;

    public aktp(aktg aktg, List list, PlacesParams placesParams) {
        this.a = aktg;
        this.c = list;
        this.b = placesParams;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        aktg aktg = this.a;
        List list = this.c;
        aszz aszz = (aszz) aktg.a(new aktv(aktg.b, list), this.b);
        if (aszz == null || aszz.a.size() == 0) {
            return amzy.h();
        }
        return aszz.a;
    }
}
