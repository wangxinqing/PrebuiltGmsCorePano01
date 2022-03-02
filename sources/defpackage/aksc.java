package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* renamed from: aksc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksc {
    public final Context a;
    public final ClientContext b;
    public final String c;
    public final String d;
    public final iyn e;
    private final akhj f;

    public aksc(Context context, String str, ClientContext clientContext, String str2, String str3, akhj akhj) {
        iyn iyn = new iyn(context, azcl.a.a().g(), azcl.a.a().a(), azcl.a.a().e(), azcl.a.a().h(), azcl.a.a().b(), azcl.a.a().d(), str, (byte[]) null);
        this.a = context;
        this.b = clientContext;
        this.c = str2;
        this.d = str3;
        this.f = akhj;
        this.e = iyn;
        iyn.g = 10240;
    }

    public static int a(VolleyError volleyError) {
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null) {
            return 7;
        }
        if (networkResponse.statusCode == 404) {
            return 8;
        }
        String a2 = jad.a(volleyError);
        if ("dailyLimitExceededUnreg".equals(a2) || "keyInvalid".equals(a2)) {
            if (!Log.isLoggable("Places", 6)) {
                return 9002;
            }
            Log.e("Places", "Invalid API key.  Check that <meta-data android:name=\"com.google.android.geo.API_KEY\" android:value=\"your API key\"/> is in the <application> element of AndroidManifest.xml. See https://developers.google.com/places/android/start#api-key for more details.");
            return 9002;
        } else if ("keyExpired".equals(a2)) {
            return 9007;
        } else {
            if ("accessNotConfigured".equals(a2)) {
                if (!Log.isLoggable("Places", 6)) {
                    return 9003;
                }
                Log.e("Places", "Places API for Android does not seem to be enabled for your app. See https://developers.google.com/places/android/signup for more details.");
                return 9003;
            } else if ("rateLimitExceeded".equals(a2)) {
                return 9005;
            } else {
                if ("limitExceeded".equals(a2) || "dailyLimitExceeded".equals(a2)) {
                    return 9001;
                }
                if ("ipRefererBlocked".equals(a2)) {
                    return 9008;
                }
                jab b2 = jad.b(volleyError, "Places");
                if (b2 == null || (str = (String) b2.b.get("domain")) == null) {
                    return 13;
                }
                if (((str.hashCode() == 696981785 && str.equals("usageLimits")) ? (char) 0 : 65535) != 0) {
                    return 13;
                }
                return 9001;
            }
        }
    }

    public static aksc a(Context context, PlacesParams placesParams, akhj akhj) {
        ClientContext clientContext = new ClientContext();
        String str = placesParams.b;
        clientContext.e = str;
        clientContext.f = str;
        clientContext.d(azcl.b());
        clientContext.b = jhg.i(context, placesParams.b);
        if (!TextUtils.isEmpty(placesParams.d)) {
            Account account = new Account(placesParams.d, "com.google");
            clientContext.d = account;
            clientContext.c = account;
        }
        return new aksc(context, jhg.a(context, placesParams.b, "com.google.android.geo.API_KEY"), clientContext, placesParams.b, jhg.h(context, placesParams.b), akhj);
    }

    public final Status a(String str, PlacesParams placesParams) {
        iyn iyn = this.e;
        Context context = this.a;
        aucd o = asrp.c.o();
        asuu a2 = aksd.a(context, placesParams);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asrp asrp = (asrp) o.b;
        a2.getClass();
        asrp.b = a2;
        asrp.a |= 1;
        asrq asrq = (asrq) iyn.a(str, ((asrp) o.i()).k(), (Object) asrq.b, this.c, this.d, azcl.c(), 10268);
        Context context2 = this.a;
        if (asrq == null) {
            return ris.h(13);
        }
        asuv asuv = asrq.a;
        if (asuv == null) {
            asuv = asuv.c;
        }
        aksd.a(context2, asuv);
        return ris.h(0);
    }

    public final Object a(aktf aktf, PlacesParams placesParams) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Object a2 = aktf.a();
            if (azbe.c()) {
                this.f.a(aktf.a(2, currentTimeMillis, placesParams, a2));
            }
            return a2;
        } catch (TimeoutException e2) {
            if (azbe.c()) {
                this.f.a(aktf.a(3, currentTimeMillis, placesParams, (Object) null));
            }
            throw e2;
        } catch (VolleyError | eif e3) {
            Throwable th = e3;
            if (azbe.c()) {
                this.f.a(aktf.a(4, currentTimeMillis, placesParams, (Object) null));
            }
            throw th;
        }
    }

    public final List a(PlacesParams placesParams) {
        return aksd.a(this.a, (assa) a((aktf) new aksz(this.e, this.a, this.b, "getAliases", placesParams), placesParams));
    }

    public final List a(LatLng latLng, int i, boolean z, PlacesParams placesParams, PlaceFilter placeFilter) {
        float f2;
        PlaceFilter placeFilter2 = placeFilter;
        asrx asrx = (asrx) a((aktf) new aksu(this.e, this.a, this.b, this.c, this.d, latLng, i, z, "estimatePlacesByLocation", placesParams), placesParams);
        Context context = this.a;
        if (asrx == null || asrx.b.size() == 0) {
            return new ArrayList();
        }
        asuv asuv = asrx.a;
        if (asuv == null) {
            asuv = asuv.c;
        }
        aksd.a(context, asuv);
        ArrayList arrayList = new ArrayList(asrx.b.size());
        aucx aucx = asrx.b;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            asue asue = (asue) aucx.get(i2);
            PlaceLikelihoodEntity placeLikelihoodEntity = null;
            if ((asue.a & 1) != 0) {
                assu assu = asue.b;
                if (assu == null) {
                    assu = assu.q;
                }
                PlaceEntity a2 = aksd.a(assu);
                if (a2 != null) {
                    if ((asue.a & 2) != 0) {
                        f2 = asue.c;
                    } else {
                        f2 = 0.0f;
                    }
                    placeLikelihoodEntity = PlaceLikelihoodEntity.a(a2, f2);
                }
            }
            if (placeLikelihoodEntity != null) {
                arrayList.add(placeLikelihoodEntity);
            }
        }
        if (placeFilter2 == null) {
            return arrayList;
        }
        PlaceFilter placeFilter3 = new PlaceFilter((Collection) placeFilter2.e, placeFilter2.b, (Collection) placeFilter2.g, (Collection) placeFilter2.f);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            PlaceLikelihoodEntity placeLikelihoodEntity2 = (PlaceLikelihoodEntity) arrayList.get(i3);
            if (placeFilter3.a((rhq) placeLikelihoodEntity2.a)) {
                arrayList2.add(placeLikelihoodEntity2);
            }
        }
        return arrayList2;
    }
}
