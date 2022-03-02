package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: akvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvy extends akwd {
    private final LatLng b;
    private final rka c;

    public akvy(LatLng latLng, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "GetPlaceByLocation", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) latLng);
        iva.a((Object) rka);
        this.b = latLng;
        this.c = rka;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 1;
    }

    public final aoei c() {
        PlacesParams placesParams = this.a;
        aoei c2 = akig.c(1, placesParams);
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aofe a = akig.a(9, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a.c(5);
        aucd2.a((aucj) a);
        aoeo aoeo = aoeo.a;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aofe aofe2 = aofe.s;
        aoeo.getClass();
        aofe.l = aoeo;
        aofe.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofe aofe3 = (aofe) aucd2.i();
        aoei aoei2 = aoei.w;
        aofe3.getClass();
        aoei.i = aofe3;
        aoei.a |= 64;
        return (aoei) aucd.i();
    }

    /* access modifiers changed from: protected */
    public final String[] d() {
        return azbe.a.a().j().split(",");
    }

    public final void a(Context context) {
        super.a(context);
        try {
            List a = f().a(this.b, (int) azbe.a.a().i(), false, this.a, (PlaceFilter) null);
            ArrayList arrayList = new ArrayList(a.size());
            int size = a.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((PlaceLikelihoodEntity) a.get(i)).a);
            }
            alfs.a(0, (List) arrayList, this.c);
        } catch (VolleyError | eif | TimeoutException e) {
            throw akwd.a(e);
        }
    }

    public final void a(Status status) {
        alfs.a(status.i, Collections.emptyList(), this.c);
    }
}
