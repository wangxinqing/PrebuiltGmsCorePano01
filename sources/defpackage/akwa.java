package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.UserPlace;
import com.google.android.gms.location.places.personalized.UserPlacesResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: akwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwa extends akwd {
    private final rld b;

    public akwa(PlacesParams placesParams, rld rld, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "GetUserPlaces", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) rld);
        this.b = rld;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 3;
    }

    public final aoei c() {
        PlacesParams placesParams = this.a;
        List<Integer> asList = Arrays.asList(new Integer[]{1, 2});
        aoei c = akig.c(1, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aofe a = akig.a(14, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a.c(5);
        aucd2.a((aucj) a);
        aoer aoer = (aoer) aoes.b.o();
        for (Integer intValue : asList) {
            int intValue2 = intValue.intValue();
            if (intValue2 == 1) {
                aoer.a(aofw.INFERRED_HOME);
            } else if (intValue2 == 2) {
                aoer.a(aofw.INFERRED_WORK);
            }
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aoes aoes = (aoes) aoer.i();
        aofe aofe2 = aofe.s;
        aoes.getClass();
        aofe.q = aoes;
        aofe.a |= 131072;
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
        List list;
        super.a(context);
        aksc f = f();
        aktg g = g();
        try {
            if (azda.a.a().e()) {
                aszv aszv = (aszv) g.a(new aktx(g.c, g.d, "GMS_CORE_PLACES"), this.a);
                if (aszv == null || aszv.a.size() == 0) {
                    list = amzy.h();
                } else {
                    ArrayList arrayList = new ArrayList(aszv.a.size());
                    HashMap hashMap = new HashMap();
                    for (atac atac : aszv.a) {
                        int i = atac.a;
                        if (!((i & 1) == 0 || (i & 2) == 0)) {
                            atab a = atab.a(atac.b);
                            if (a == null) {
                                a = atab.UNKNOWN_TYPE;
                            }
                            int i2 = a != atab.INFERRED_HOME ? a == atab.INFERRED_WORK ? 2 : -1 : 1;
                            if (i2 >= 0) {
                                if (!hashMap.containsKey(atac.c)) {
                                    hashMap.put(atac.c, new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(i2)})));
                                } else {
                                    ((List) hashMap.get(atac.c)).add(Integer.valueOf(i2));
                                }
                            }
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        arrayList.add(UserPlace.a(str, (List) hashMap.get(str)));
                    }
                    list = amzy.a((Collection) arrayList);
                }
            } else {
                PlacesParams placesParams = this.a;
                assa assa = (assa) f.a((aktf) new akta(f.e, f.a, f.b, "getAliases", placesParams), placesParams);
                Context context2 = f.a;
                if (assa != null) {
                    if (assa.b.size() != 0) {
                        asuv asuv = assa.a;
                        if (asuv == null) {
                            asuv = asuv.c;
                        }
                        aksd.a(context2, asuv);
                        list = new ArrayList(assa.b.size());
                        HashMap hashMap2 = new HashMap();
                        for (asqw asqw : assa.b) {
                            int i3 = asqw.a;
                            if (!((i3 & 1) == 0 || (i3 & 2) == 0)) {
                                asqy a2 = asqy.a(asqw.b);
                                if (a2 == null) {
                                    a2 = asqy.HOME;
                                }
                                int i4 = a2 != asqy.INFERRED_HOME ? a2 == asqy.INFERRED_WORK ? 2 : -1 : 1;
                                if (i4 >= 0) {
                                    if (!hashMap2.containsKey(asqw.c)) {
                                        hashMap2.put(asqw.c, new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(i4)})));
                                    } else {
                                        ((List) hashMap2.get(asqw.c)).add(Integer.valueOf(i4));
                                    }
                                }
                            }
                        }
                        for (String str2 : hashMap2.keySet()) {
                            list.add(UserPlace.a(str2, (List) hashMap2.get(str2)));
                        }
                    }
                }
                list = new ArrayList();
            }
            this.b.a(new UserPlacesResult(ris.h(0), list));
        } catch (babk | VolleyError | eif | TimeoutException e) {
            throw akwd.a(e);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.a(new UserPlacesResult(status, Collections.emptyList()));
    }
}
