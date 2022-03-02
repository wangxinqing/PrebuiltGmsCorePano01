package defpackage;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: akwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwi implements akwg {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private final akhj b;
    private final PlaceFilter c;
    private final rka d;

    public akwi(akhj akhj, PlaceFilter placeFilter, rka rka) {
        this.b = akhj;
        this.c = placeFilter;
        this.d = rka;
    }

    private final void a(Context context, PlacesParams placesParams, PlaceFilter placeFilter, rka rka, int i, long j) {
        akse akse;
        akse akse2;
        Throwable th;
        akse akse3;
        amzy amzy;
        PlaceFilter placeFilter2;
        ArrayList arrayList;
        ArrayList arrayList2;
        PlaceFilter placeFilter3;
        Iterator it;
        PlaceLikelihoodEntity placeLikelihoodEntity;
        ataj ataj;
        PlaceEntity placeEntity;
        float f;
        LatLngBounds latLngBounds;
        Uri uri;
        boolean z;
        float f2;
        int i2;
        float f3;
        int i3;
        PlaceOpeningHoursEntity placeOpeningHoursEntity;
        Locale locale;
        PlaceFilter placeFilter4;
        int i4;
        int i5;
        int i6;
        int i7;
        float f4;
        Context context2 = context;
        PlacesParams placesParams2 = placesParams;
        if (azbe.b()) {
            this.b.a(akig.a(akig.a(placeFilter, placesParams2)));
        } else {
            PlaceFilter placeFilter5 = placeFilter;
        }
        akse akse4 = new akse(rka, i);
        alfw a2 = alfx.a(context2, placesParams2.b, ren.c(context), a);
        if (a2.b != 0) {
            akse = akse4;
        } else {
            Location location = a2.a;
            if (location != null) {
                LatLng latLng = new LatLng(location.getLatitude(), a2.a.getLongitude());
                try {
                    if (!azda.a.a().d()) {
                        try {
                            amzy = aksc.a(context2, placesParams2, this.b).a(latLng, i, true, placesParams, this.c);
                            akse3 = akse4;
                        } catch (babk | VolleyError | eif | SecurityException | TimeoutException e) {
                            th = e;
                            akse2 = akse4;
                            a(placeFilter, j, placesParams, false);
                            akse2.a(th);
                            return;
                        }
                    } else {
                        aktg a3 = aktg.a(context2, placesParams2, this.b);
                        akse3 = akse4;
                        aktu aktu = r8;
                        PlaceFilter placeFilter6 = this.c;
                        try {
                            aktu aktu2 = new aktu(a3.b, a3.c, a3.a, a3.d, latLng, i, placesParams);
                            aszs aszs = (aszs) a3.a(aktu, placesParams2);
                            if (aszs != null) {
                                try {
                                    if (aszs.a.size() != 0) {
                                        ArrayList arrayList3 = new ArrayList(aszs.a.size());
                                        Iterator it2 = aszs.a.iterator();
                                        while (it2.hasNext()) {
                                            ataj ataj2 = (ataj) it2.next();
                                            if ((ataj2.a & 1) != 0) {
                                                atad atad = ataj2.b;
                                                if (atad == null) {
                                                    atad = atad.q;
                                                }
                                                if (atad != null) {
                                                    int i8 = atad.a;
                                                    if ((i8 & 1) == 0) {
                                                        if (Log.isLoggable("Places", 6)) {
                                                            alfy.a("Places", "received place lacks id");
                                                        }
                                                        it = it2;
                                                        arrayList2 = arrayList;
                                                        placeFilter3 = placeFilter2;
                                                        ataj = ataj2;
                                                        placeEntity = null;
                                                    } else if ((i8 & 32) == 0) {
                                                        if (Log.isLoggable("Places", 6)) {
                                                            alfy.a("Places", "received place lacks geometry");
                                                        }
                                                        it = it2;
                                                        arrayList2 = arrayList;
                                                        placeFilter3 = placeFilter2;
                                                        ataj = ataj2;
                                                        placeEntity = null;
                                                    } else {
                                                        atae atae = atad.i;
                                                        if (atae == null) {
                                                            atae = atae.d;
                                                        }
                                                        if ((atae.a & 1) == 0) {
                                                            if (Log.isLoggable("Places", 6)) {
                                                                alfy.a("Places", "received place lacks latlng");
                                                            }
                                                            it = it2;
                                                            arrayList2 = arrayList;
                                                            placeFilter3 = placeFilter2;
                                                            ataj = ataj2;
                                                            placeEntity = null;
                                                        } else {
                                                            String str = atad.b;
                                                            int size = atad.c.size();
                                                            List arrayList4 = new ArrayList(size);
                                                            if (size == 0) {
                                                                if (Log.isLoggable("Places", 5)) {
                                                                    alfy.c("Places", "place is missing type. Defaulting to 'other'");
                                                                }
                                                                arrayList4 = amzy.a((Object) 0);
                                                            } else {
                                                                for (String a4 : atad.c) {
                                                                    arrayList4.add(Integer.valueOf(akic.a(a4)));
                                                                }
                                                            }
                                                            atae atae2 = atad.i;
                                                            if (atae2 == null) {
                                                                atae2 = atae.d;
                                                            }
                                                            avoq avoq = atae2.b;
                                                            if (avoq == null) {
                                                                avoq = avoq.c;
                                                            }
                                                            LatLng a5 = akth.a(avoq);
                                                            if ((atae2.a & 2) != 0) {
                                                                aszw aszw = atae2.c;
                                                                if (aszw == null) {
                                                                    aszw = aszw.d;
                                                                }
                                                                avoq avoq2 = aszw.b;
                                                                if (avoq2 == null) {
                                                                    avoq2 = avoq.c;
                                                                }
                                                                LatLng a6 = akth.a(avoq2);
                                                                avoq avoq3 = aszw.c;
                                                                if (avoq3 == null) {
                                                                    avoq3 = avoq.c;
                                                                }
                                                                latLngBounds = new LatLngBounds(a6, akth.a(avoq3));
                                                            } else {
                                                                latLngBounds = null;
                                                            }
                                                            if ((atad.a & 64) != 0) {
                                                                uri = Uri.parse(atad.j);
                                                            } else {
                                                                uri = null;
                                                            }
                                                            int i9 = atad.a;
                                                            it = it2;
                                                            if ((i9 & 128) == 0 || !atad.k) {
                                                                z = false;
                                                            } else {
                                                                z = true;
                                                            }
                                                            if ((i9 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                                                f2 = atad.l;
                                                            } else {
                                                                f2 = -1.0f;
                                                            }
                                                            if ((i9 & 512) != 0) {
                                                                i2 = atad.m;
                                                            } else {
                                                                i2 = -1;
                                                            }
                                                            if ((i9 & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
                                                                atal atal = atad.o;
                                                                if (atal == null) {
                                                                    atal = atal.c;
                                                                }
                                                                ArrayList arrayList5 = new ArrayList();
                                                                for (atar atar : atal.a) {
                                                                    ArrayList arrayList6 = arrayList;
                                                                    PlaceFilter placeFilter7 = placeFilter2;
                                                                    float f5 = f2;
                                                                    int i10 = i2;
                                                                    ataj ataj3 = ataj2;
                                                                    int i11 = atar.a;
                                                                    if ((i11 & 1) == 0 || (i11 & 2) == 0) {
                                                                        placeFilter2 = placeFilter7;
                                                                        arrayList = arrayList6;
                                                                        ataj2 = ataj3;
                                                                        i7 = i10;
                                                                        f4 = f5;
                                                                    } else {
                                                                        arrayList5.add(PlaceOpeningHoursEntity.BusinessHoursInterval.a(atar.b, atar.c));
                                                                        placeFilter2 = placeFilter7;
                                                                        arrayList = arrayList6;
                                                                        ataj2 = ataj3;
                                                                        i7 = i10;
                                                                        f4 = f5;
                                                                    }
                                                                }
                                                                ArrayList arrayList7 = new ArrayList();
                                                                Iterator it3 = atal.b.iterator();
                                                                while (it3.hasNext()) {
                                                                    Iterator it4 = it3;
                                                                    ataq ataq = (ataq) it3.next();
                                                                    PlaceFilter placeFilter8 = placeFilter2;
                                                                    if ((ataq.a & 1) != 0) {
                                                                        atap atap = ataq.b;
                                                                        if (atap == null) {
                                                                            atap = atap.d;
                                                                        }
                                                                        ArrayList arrayList8 = arrayList;
                                                                        int i12 = atap.a;
                                                                        if ((i12 & 1) == 0 || (i12 & 2) == 0) {
                                                                            float f6 = f2;
                                                                            int i13 = i2;
                                                                            ataj ataj4 = ataj2;
                                                                            placeFilter4 = placeFilter8;
                                                                            it3 = it4;
                                                                            arrayList = arrayList8;
                                                                        } else {
                                                                            atao atao = atap.b;
                                                                            if (atao == null) {
                                                                                atao = atao.e;
                                                                            }
                                                                            atao atao2 = atap.c;
                                                                            if (atao2 == null) {
                                                                                atao2 = atao.e;
                                                                            }
                                                                            ataj ataj5 = ataj2;
                                                                            int i14 = atao.a;
                                                                            if (!((i14 & 1) == 0 || (i14 & 2) == 0 || (i14 & 4) == 0)) {
                                                                                int i15 = atao2.a;
                                                                                if (!((i15 & 1) == 0 || (i15 & 2) == 0 || (i15 & 4) == 0)) {
                                                                                    ArrayList arrayList9 = new ArrayList();
                                                                                    Iterator it5 = ataq.c.iterator();
                                                                                    while (it5.hasNext()) {
                                                                                        Iterator it6 = it5;
                                                                                        atar atar2 = (atar) it5.next();
                                                                                        int i16 = i2;
                                                                                        int i17 = atar2.a;
                                                                                        if ((i17 & 1) == 0 || (i17 & 2) == 0) {
                                                                                            it5 = it6;
                                                                                            i6 = i16;
                                                                                        } else {
                                                                                            arrayList9.add(PlaceOpeningHoursEntity.BusinessHoursInterval.a(atar2.b, atar2.c));
                                                                                            it5 = it6;
                                                                                            i6 = i16;
                                                                                        }
                                                                                    }
                                                                                    int i18 = i2;
                                                                                    int i19 = atao.d;
                                                                                    int a7 = atan.a(atao.c);
                                                                                    if (a7 != 0) {
                                                                                        i4 = a7;
                                                                                    } else {
                                                                                        i4 = 1;
                                                                                    }
                                                                                    int i20 = atao.b;
                                                                                    int i21 = atao2.d;
                                                                                    float f7 = f2;
                                                                                    int a8 = atan.a(atao2.c);
                                                                                    if (a8 != 0) {
                                                                                        i5 = a8;
                                                                                    } else {
                                                                                        i5 = 1;
                                                                                    }
                                                                                    arrayList7.add(PlaceOpeningHoursEntity.ExceptionalHours.a(i19, i4, i20, i21, i5, atao2.b, arrayList9));
                                                                                    placeFilter4 = placeFilter8;
                                                                                    it3 = it4;
                                                                                    arrayList = arrayList8;
                                                                                    ataj2 = ataj5;
                                                                                    i2 = i18;
                                                                                    f2 = f7;
                                                                                }
                                                                            }
                                                                            float f8 = f2;
                                                                            int i22 = i2;
                                                                            placeFilter4 = placeFilter8;
                                                                            it3 = it4;
                                                                            arrayList = arrayList8;
                                                                            ataj2 = ataj5;
                                                                        }
                                                                    } else {
                                                                        ArrayList arrayList10 = arrayList;
                                                                        float f9 = f2;
                                                                        int i23 = i2;
                                                                        ataj ataj6 = ataj2;
                                                                        placeFilter4 = placeFilter8;
                                                                        it3 = it4;
                                                                    }
                                                                }
                                                                arrayList2 = arrayList;
                                                                placeFilter3 = placeFilter2;
                                                                f3 = f2;
                                                                i3 = i2;
                                                                ataj = ataj2;
                                                                placeOpeningHoursEntity = PlaceOpeningHoursEntity.a(arrayList5, arrayList7);
                                                            } else {
                                                                arrayList2 = arrayList;
                                                                placeFilter3 = placeFilter2;
                                                                f3 = f2;
                                                                i3 = i2;
                                                                ataj = ataj2;
                                                                placeOpeningHoursEntity = null;
                                                            }
                                                            String str2 = atad.e;
                                                            String str3 = atad.f;
                                                            String str4 = atad.g;
                                                            aucx aucx = atad.h;
                                                            String str5 = atad.n;
                                                            String str6 = atad.p;
                                                            rkj rkj = new rkj();
                                                            rkj.a = str;
                                                            rkj.k = arrayList4;
                                                            rkj.b = str2;
                                                            rkj.l = str3;
                                                            rkj.m = str4;
                                                            rkj.n = aucx;
                                                            rkj.c = a5;
                                                            rkj.e = latLngBounds;
                                                            rkj.g = uri;
                                                            rkj.h = z;
                                                            rkj.i = f3;
                                                            rkj.j = i3;
                                                            rkj.f = str5;
                                                            rkj.o = placeOpeningHoursEntity;
                                                            rkj.q = str6;
                                                            placeEntity = rkj.a();
                                                            if ((atad.a & 2) == 0 || atad.d.isEmpty()) {
                                                                placeEntity.r = Locale.getDefault();
                                                            } else {
                                                                List c2 = amsk.b("[-_]").c(atad.d);
                                                                if (c2.size() >= 2 && ((String) c2.get(1)).length() == 2) {
                                                                    locale = new Locale((String) c2.get(0), (String) c2.get(1));
                                                                } else if (((String) c2.get(0)).length() > 0) {
                                                                    locale = new Locale((String) c2.get(0));
                                                                } else {
                                                                    locale = Locale.getDefault();
                                                                }
                                                                placeEntity.r = locale;
                                                            }
                                                        }
                                                    }
                                                } else if (Log.isLoggable("Places", 6)) {
                                                    alfy.a("Places", "received null place");
                                                    it = it2;
                                                    arrayList2 = arrayList;
                                                    placeFilter3 = placeFilter2;
                                                    ataj = ataj2;
                                                    placeEntity = null;
                                                } else {
                                                    it = it2;
                                                    arrayList2 = arrayList;
                                                    placeFilter3 = placeFilter2;
                                                    ataj = ataj2;
                                                    placeEntity = null;
                                                }
                                                if (placeEntity != null) {
                                                    ataj ataj7 = ataj;
                                                    if ((ataj7.a & 2) != 0) {
                                                        f = ataj7.c;
                                                    } else {
                                                        f = 0.0f;
                                                    }
                                                    placeLikelihoodEntity = PlaceLikelihoodEntity.a(placeEntity, f);
                                                } else {
                                                    placeLikelihoodEntity = null;
                                                }
                                            } else {
                                                it = it2;
                                                arrayList2 = arrayList;
                                                placeFilter3 = placeFilter2;
                                                placeLikelihoodEntity = null;
                                            }
                                            if (placeLikelihoodEntity != null) {
                                                ArrayList arrayList11 = arrayList2;
                                                arrayList11.add(placeLikelihoodEntity);
                                                PlacesParams placesParams3 = placesParams;
                                                PlaceFilter placeFilter9 = placeFilter;
                                                arrayList3 = arrayList11;
                                                it2 = it;
                                                placeFilter6 = placeFilter3;
                                                Context context3 = context;
                                            } else {
                                                PlacesParams placesParams4 = placesParams;
                                                PlaceFilter placeFilter10 = placeFilter;
                                                arrayList3 = arrayList2;
                                                it2 = it;
                                                placeFilter6 = placeFilter3;
                                                Context context4 = context;
                                            }
                                        }
                                        ArrayList<PlaceLikelihoodEntity> arrayList12 = arrayList;
                                        PlaceFilter placeFilter11 = placeFilter2;
                                        if (placeFilter11 != null) {
                                            PlaceFilter placeFilter12 = placeFilter11;
                                            PlaceFilter placeFilter13 = new PlaceFilter((Collection) placeFilter12.e, placeFilter12.b, (Collection) placeFilter12.g, (Collection) placeFilter12.f);
                                            ArrayList arrayList13 = new ArrayList(arrayList12.size());
                                            for (PlaceLikelihoodEntity placeLikelihoodEntity2 : arrayList12) {
                                                if (placeFilter13.a((rhq) placeLikelihoodEntity2.a)) {
                                                    arrayList13.add(placeLikelihoodEntity2);
                                                }
                                            }
                                            amzy = amzy.a((Collection) arrayList13);
                                        } else {
                                            amzy = amzy.a((Collection) arrayList12);
                                        }
                                    }
                                } catch (babk | VolleyError | eif | SecurityException | TimeoutException e2) {
                                    th = e2;
                                    akse2 = akse3;
                                    a(placeFilter, j, placesParams, false);
                                    akse2.a(th);
                                    return;
                                }
                            }
                            amzy = amzy.h();
                        } catch (babk | VolleyError | eif | SecurityException | TimeoutException e3) {
                            e = e3;
                            akse2 = akse3;
                            th = e;
                            a(placeFilter, j, placesParams, false);
                            akse2.a(th);
                            return;
                        }
                    }
                    if (alfx.a(context, placesParams.b)) {
                        akse2 = akse3;
                        try {
                            a(placeFilter, j, placesParams, true);
                            akse2.a((List) amzy);
                            return;
                        } catch (SecurityException e4) {
                            e = e4;
                            th = e;
                            a(placeFilter, j, placesParams, false);
                            akse2.a(th);
                            return;
                        } catch (VolleyError e5) {
                            e = e5;
                            th = e;
                            a(placeFilter, j, placesParams, false);
                            akse2.a(th);
                            return;
                        } catch (eif e6) {
                            e = e6;
                            th = e;
                            a(placeFilter, j, placesParams, false);
                            akse2.a(th);
                            return;
                        } catch (TimeoutException e7) {
                            e = e7;
                            th = e;
                            a(placeFilter, j, placesParams, false);
                            akse2.a(th);
                            return;
                        } catch (babk e8) {
                            e = e8;
                            th = e;
                            a(placeFilter, j, placesParams, false);
                            akse2.a(th);
                            return;
                        }
                    } else {
                        akse akse5 = akse3;
                        throw new SecurityException();
                    }
                } catch (babk | VolleyError | eif | SecurityException | TimeoutException e9) {
                    e = e9;
                    akse2 = akse4;
                    th = e;
                    a(placeFilter, j, placesParams, false);
                    akse2.a(th);
                    return;
                }
            } else {
                akse = akse4;
            }
        }
        a(placeFilter, j, placesParams, false);
        akse.a((Throwable) new IllegalStateException("Unable to determine current location."));
    }

    public final int a() {
        return 1;
    }

    public final aoei a(PlacesParams placesParams) {
        return null;
    }

    public final int b() {
        return 2;
    }

    public final String c() {
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    public final boolean d() {
        return false;
    }

    private final void a(PlaceFilter placeFilter, long j, PlacesParams placesParams, boolean z) {
        if (azbe.b()) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - j);
            aoei c2 = akig.c(6, placesParams);
            aucd aucd = (aucd) c2.c(5);
            aucd.a((aucj) c2);
            aucd o = aoeq.e.o();
            aodr a2 = akig.a((Collection) placeFilter.e, placeFilter.b);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoeq aoeq = (aoeq) o.b;
            a2.getClass();
            aoeq.b = a2;
            int i = aoeq.a | 1;
            aoeq.a = i;
            aoeq.c = 1;
            int i2 = i | 2;
            aoeq.a = i2;
            aoeq.a = i2 | 4;
            aoeq.d = currentTimeMillis;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoei aoei = (aoei) aucd.b;
            aoeq aoeq2 = (aoeq) o.i();
            aoei aoei2 = aoei.w;
            aoeq2.getClass();
            aoei.m = aoeq2;
            aoei.a |= 1024;
            aoei aoei3 = (aoei) aucd.i();
            aucd aucd2 = (aucd) aoei3.c(5);
            aucd2.a((aucj) aoei3);
            if (!z) {
                aoeq aoeq3 = ((aoei) aucd2.b).m;
                if (aoeq3 == null) {
                    aoeq3 = aoeq.e;
                }
                aucd aucd3 = (aucd) aoeq3.c(5);
                aucd3.a((aucj) aoeq3);
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                aoeq aoeq4 = (aoeq) aucd3.b;
                aoeq4.c = 0;
                aoeq4.a |= 2;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                aoei aoei4 = (aoei) aucd2.b;
                aoeq aoeq5 = (aoeq) aucd3.i();
                aoeq5.getClass();
                aoei4.m = aoeq5;
                aoei4.a |= 1024;
            }
            this.b.a(akig.a((aoei) aucd2.i()));
        }
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        long currentTimeMillis = System.currentTimeMillis();
        a(context, placesParams, this.c, this.d, (int) azcf.a.a().b(), currentTimeMillis);
    }

    public final void a(Status status) {
        alfs.a(status.i, Collections.emptyList(), 106, this.d);
    }
}
