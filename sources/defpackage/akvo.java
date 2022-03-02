package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: akvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvo extends akwd {
    private final AddPlaceRequest b;
    private final rka c;

    public akvo(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "AddPlace", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) addPlaceRequest);
        iva.a((Object) rka);
        this.b = addPlaceRequest;
        this.c = rka;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 1;
    }

    public final aoei c() {
        AddPlaceRequest addPlaceRequest = this.b;
        PlacesParams placesParams = this.a;
        aoei c2 = akig.c(1, placesParams);
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aofe a = akig.a(4, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a.c(5);
        aucd2.a((aucj) a);
        aucd o = aodx.h.o();
        String str = addPlaceRequest.a;
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aodx aodx = (aodx) o.b;
            str.getClass();
            aodx.a |= 1;
            aodx.b = str;
        }
        LatLng latLng = addPlaceRequest.b;
        if (latLng != null) {
            aucd o2 = anze.d.o();
            int i = (int) (latLng.a * 1.0E7d);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anze anze = (anze) o2.b;
            int i2 = 1 | anze.a;
            anze.a = i2;
            anze.b = i;
            double d = latLng.b;
            anze.a = i2 | 2;
            anze.c = (int) (d * 1.0E7d);
            anze anze2 = (anze) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aodx aodx2 = (aodx) o.b;
            anze2.getClass();
            aodx2.c = anze2;
            aodx2.a |= 2;
        }
        String str2 = addPlaceRequest.c;
        if (str2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aodx aodx3 = (aodx) o.b;
            str2.getClass();
            aodx3.a = 4 | aodx3.a;
            aodx3.d = str2;
        }
        List list = addPlaceRequest.d;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                String a2 = akic.a(((Integer) list.get(i3)).intValue());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aodx aodx4 = (aodx) o.b;
                a2.getClass();
                if (!aodx4.e.a()) {
                    aodx4.e = aucj.a(aodx4.e);
                }
                aodx4.e.add(a2);
            }
        }
        String str3 = addPlaceRequest.e;
        if (str3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aodx aodx5 = (aodx) o.b;
            str3.getClass();
            aodx5.a |= 8;
            aodx5.f = str3;
        }
        Uri uri = addPlaceRequest.f;
        if (uri != null) {
            String uri2 = uri.toString();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aodx aodx6 = (aodx) o.b;
            uri2.getClass();
            aodx6.a |= 16;
            aodx6.g = uri2;
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aodx aodx7 = (aodx) o.i();
        aofe aofe2 = aofe.s;
        aodx7.getClass();
        aofe.g = aodx7;
        aofe.a |= 64;
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

    public final void a(Context context) {
        ArrayList arrayList;
        super.a(context);
        aksc f = f();
        try {
            AddPlaceRequest addPlaceRequest = this.b;
            PlacesParams placesParams = this.a;
            iyn iyn = f.e;
            String str = f.c;
            String str2 = f.d;
            Context context2 = f.a;
            aucd o = asqu.i.o();
            asuu a = aksd.a(context2, placesParams);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asqu asqu = (asqu) o.b;
            a.getClass();
            asqu.b = a;
            int i = asqu.a | 1;
            asqu.a = i;
            String str3 = addPlaceRequest.a;
            str3.getClass();
            asqu.a = i | 2;
            asqu.d = str3;
            avoq a2 = aksd.a(addPlaceRequest.b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asqu asqu2 = (asqu) o.b;
            a2.getClass();
            asqu2.g = a2;
            int i2 = asqu2.a | 16;
            asqu2.a = i2;
            String str4 = addPlaceRequest.c;
            str4.getClass();
            int i3 = i2 | 4;
            asqu2.a = i3;
            asqu2.e = str4;
            String str5 = addPlaceRequest.e;
            str5.getClass();
            asqu2.a = i3 | 8;
            asqu2.f = str5;
            List list = addPlaceRequest.d;
            if (list != null) {
                List a3 = akic.a((Collection) list);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asqu asqu3 = (asqu) o.b;
                if (!asqu3.c.a()) {
                    asqu3.c = aucj.a(asqu3.c);
                }
                auab.a((Iterable) a3, (List) asqu3.c);
            }
            Uri uri = addPlaceRequest.f;
            if (uri != null) {
                String uri2 = uri.toString();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asqu asqu4 = (asqu) o.b;
                uri2.getClass();
                asqu4.a |= 32;
                asqu4.h = uri2;
            }
            asqv asqv = (asqv) f.a((aktf) new akss(iyn, str, str2, "addPlace", ((asqu) o.i()).k(), asqv.d, 2, 10241), placesParams);
            Context context3 = f.a;
            if (asqv != null) {
                if ((asqv.a & 2) != 0) {
                    asuv asuv = asqv.b;
                    if (asuv == null) {
                        asuv = asuv.c;
                    }
                    aksd.a(context3, asuv);
                    assu assu = asqv.c;
                    if (assu == null) {
                        assu = assu.q;
                    }
                    PlaceEntity a4 = aksd.a(assu);
                    arrayList = new ArrayList();
                    arrayList.add(a4);
                    alfs.a(0, (List) arrayList, this.c);
                }
            }
            arrayList = new ArrayList();
            alfs.a(0, (List) arrayList, this.c);
        } catch (VolleyError | eif | TimeoutException e) {
            throw akwd.a(e);
        }
    }

    public final void a(Status status) {
        alfs.a(status.i, Collections.emptyList(), this.c);
    }
}
