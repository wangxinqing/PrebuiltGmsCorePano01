package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: aksd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksd {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if ((r0 & 2) == 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.akri a(defpackage.asuf r8) {
        /*
            if (r8 == 0) goto L_0x000e
            int r0 = r8.a
            r1 = r0 & 1
            if (r1 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            r0 = r0 & 2
            if (r0 == 0) goto L_0x000e
            goto L_0x001e
        L_0x000e:
            r0 = 6
            java.lang.String r1 = "Places"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.String r0 = "PlaceLocation does not have placeId or location"
            defpackage.alfy.a(r1, r0)
        L_0x001e:
            float r0 = r8.d
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0027
            r7 = r0
            goto L_0x002b
        L_0x0027:
            r0 = 1117782016(0x42a00000, float:80.0)
            r7 = 1117782016(0x42a00000, float:80.0)
        L_0x002b:
            akri r0 = new akri
            java.lang.String r2 = r8.b
            avoq r1 = r8.c
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            avoq r1 = defpackage.avoq.c
        L_0x0036:
            double r3 = r1.a
            avoq r8 = r8.c
            if (r8 != 0) goto L_0x003e
            avoq r8 = defpackage.avoq.c
        L_0x003e:
            double r5 = r8.b
            r1 = r0
            r1.<init>(r2, r3, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aksd.a(asuf):akri");
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlaceOpeningHoursEntity.BusinessHoursInterval businessHoursInterval = (PlaceOpeningHoursEntity.BusinessHoursInterval) it.next();
            aucd o = asum.d.o();
            int i = businessHoursInterval.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            asum asum = (asum) o.b;
            int i2 = asum.a | 1;
            asum.a = i2;
            asum.b = i;
            int i3 = businessHoursInterval.b;
            asum.a = i2 | 2;
            asum.c = i3;
            arrayList.add((asum) o.i());
        }
        return arrayList;
    }

    public static asrd a(Context context, String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams) {
        aucd o = asrd.h.o();
        asuu a = a(context, placesParams);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asrd asrd = (asrd) o.b;
        a.getClass();
        asrd.b = a;
        int i2 = asrd.a | 1;
        asrd.a = i2;
        str.getClass();
        asrd.a = i2 | 8;
        asrd.e = str;
        if (placesParams.g == 3) {
            int b = (int) azcc.b();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asrd asrd2 = (asrd) o.b;
            asrd2.a |= 16;
            asrd2.f = b;
        }
        if (latLngBounds != null) {
            assd a2 = a(latLngBounds);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asrd asrd3 = (asrd) o.b;
            a2.getClass();
            asrd3.d = a2;
            asrd3.a |= 4;
        }
        if (i == 2) {
            asrd asrd4 = (asrd) o.b;
            asrd4.a |= 32;
            asrd4.g = true;
        }
        if (autocompleteFilter != null) {
            aucd o2 = asqz.e.o();
            boolean z = !autocompleteFilter.b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asqz asqz = (asqz) o2.b;
            asqz.a |= 1;
            asqz.b = z;
            String b2 = akic.b(autocompleteFilter.e);
            if (b2 != null) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                asqz asqz2 = (asqz) o2.b;
                b2.getClass();
                if (!asqz2.c.a()) {
                    asqz2.c = aucj.a(asqz2.c);
                }
                asqz2.c.add(b2);
            }
            String str2 = autocompleteFilter.d;
            if (str2 != null && str2.length() > 0) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                asqz asqz3 = (asqz) o2.b;
                str2.getClass();
                asqz3.a |= 2;
                asqz3.d = str2;
            }
            asqz asqz4 = (asqz) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asrd asrd5 = (asrd) o.b;
            asqz4.getClass();
            asrd5.c = asqz4;
            asrd5.a = 2 | asrd5.a;
        }
        return (asrd) o.i();
    }

    public static asrh a(Context context, LatLngBounds latLngBounds, int i, List list, PlacesParams placesParams) {
        aucd o = asrh.f.o();
        asuu a = a(context, placesParams);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asrh asrh = (asrh) o.b;
        a.getClass();
        asrh.b = a;
        asrh.a |= 1;
        if (!asrh.c.a()) {
            asrh.c = aucj.a(asrh.c);
        }
        auab.a((Iterable) list, (List) asrh.c);
        assd a2 = a(latLngBounds);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asrh asrh2 = (asrh) o.b;
        a2.getClass();
        asrh2.d = a2;
        int i2 = asrh2.a | 2;
        asrh2.a = i2;
        asrh2.a = i2 | 4;
        asrh2.e = i;
        return (asrh) o.i();
    }

    public static asrl a(Context context, List list, int i, PlacesParams placesParams) {
        aucd o = asrl.e.o();
        asuu a = a(context, placesParams);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asrl asrl = (asrl) o.b;
        a.getClass();
        asrl.b = a;
        asrl.a |= 1;
        if (!asrl.c.a()) {
            asrl.c = aucj.a(asrl.c);
        }
        auab.a((Iterable) list, (List) asrl.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asrl asrl2 = (asrl) o.b;
        asrl2.a |= 2;
        asrl2.d = i;
        return (asrl) o.i();
    }

    public static asrw a(Context context, LatLng latLng, int i, boolean z, PlacesParams placesParams) {
        aucd o = asrw.f.o();
        asuu a = a(context, placesParams);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asrw asrw = (asrw) o.b;
        a.getClass();
        asrw.b = a;
        asrw.a |= 1;
        avoq a2 = a(latLng);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asrw asrw2 = (asrw) o.b;
        a2.getClass();
        asrw2.c = a2;
        int i2 = asrw2.a | 2;
        asrw2.a = i2;
        asrw2.a = i2 | 4;
        asrw2.d = i;
        if (z && a(context) != null) {
            List a3 = a(context);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asrw asrw3 = (asrw) o.b;
            if (!asrw3.e.a()) {
                asrw3.e = aucj.a(asrw3.e);
            }
            auab.a((Iterable) a3, (List) asrw3.e);
        }
        return (asrw) o.i();
    }

    public static assd a(LatLngBounds latLngBounds) {
        aucd o = assd.d.o();
        avoq a = a(latLngBounds.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        assd assd = (assd) o.b;
        a.getClass();
        assd.c = a;
        assd.a |= 2;
        avoq a2 = a(latLngBounds.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        assd assd2 = (assd) o.b;
        a2.getClass();
        assd2.b = a2;
        assd2.a |= 1;
        return (assd) o.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.asuu a(android.content.Context r8, com.google.android.gms.location.places.internal.PlacesParams r9) {
        /*
            asuu r0 = defpackage.asuu.g
            aucd r0 = r0.o()
            java.lang.String r1 = r9.c
            boolean r2 = r0.c
            r3 = 0
            if (r2 != 0) goto L_0x000e
            goto L_0x0013
        L_0x000e:
            r0.c()
            r0.c = r3
        L_0x0013:
            aucj r2 = r0.b
            asuu r2 = (defpackage.asuu) r2
            r1.getClass()
            int r4 = r2.a
            r5 = 4
            r4 = r4 | r5
            r2.a = r4
            r2.d = r1
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "android/"
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0036
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x003a
        L_0x0036:
            java.lang.String r1 = r2.concat(r1)
        L_0x003a:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            r0.c()
            r0.c = r3
        L_0x0044:
            aucj r2 = r0.b
            asuu r2 = (defpackage.asuu) r2
            r1.getClass()
            int r4 = r2.a
            r6 = 1
            r4 = r4 | r6
            r2.a = r4
            r2.b = r1
            asut r1 = defpackage.asut.c
            aucd r1 = r1.o()
            int r9 = r9.g
            r2 = 3
            r4 = 2
            if (r9 == 0) goto L_0x008b
            if (r9 == r6) goto L_0x0089
            if (r9 == r4) goto L_0x0087
            if (r9 == r2) goto L_0x0086
            r2 = 6
            java.lang.String r5 = "Places"
            boolean r2 = android.util.Log.isLoggable(r5, r2)
            if (r2 == 0) goto L_0x008b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r7 = 34
            r2.<init>(r7)
            java.lang.String r7 = "Unknown request source "
            r2.append(r7)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            defpackage.alfy.a(r5, r9)
            r5 = 1
            goto L_0x008c
        L_0x0086:
            goto L_0x008c
        L_0x0087:
            r5 = 3
            goto L_0x008c
        L_0x0089:
            r5 = 2
            goto L_0x008c
        L_0x008b:
            r5 = 1
        L_0x008c:
            boolean r9 = r1.c
            if (r9 != 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            r1.c()
            r1.c = r3
        L_0x0096:
            aucj r9 = r1.b
            asut r9 = (defpackage.asut) r9
            int r5 = r5 + -1
            r9.b = r5
            int r2 = r9.a
            r2 = r2 | r6
            r9.a = r2
            aucj r9 = r1.i()
            asut r9 = (defpackage.asut) r9
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            r0.c()
            r0.c = r3
        L_0x00b3:
            aucj r1 = r0.b
            asuu r1 = (defpackage.asuu) r1
            r9.getClass()
            r1.e = r9
            int r9 = r1.a
            r9 = r9 | 8
            r1.a = r9
            com.google.android.chimera.config.ModuleManager r9 = com.google.android.chimera.config.ModuleManager.get(r8)
            com.google.android.chimera.config.ModuleManager$ModuleInfo r9 = r9.getCurrentModule()
            int r9 = r9.moduleVersion
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x00d1
            goto L_0x00d6
        L_0x00d1:
            r0.c()
            r0.c = r3
        L_0x00d6:
            aucj r1 = r0.b
            asuu r1 = (defpackage.asuu) r1
            int r2 = r1.a
            r2 = r2 | 32
            r1.a = r2
            r1.f = r9
            android.content.Context r8 = r8.getApplicationContext()
            akif r8 = defpackage.akif.a((android.content.Context) r8)
            java.lang.String r8 = r8.a()
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x010c
            boolean r9 = r0.c
            if (r9 != 0) goto L_0x00f9
            goto L_0x00fe
        L_0x00f9:
            r0.c()
            r0.c = r3
        L_0x00fe:
            aucj r9 = r0.b
            asuu r9 = (defpackage.asuu) r9
            r8.getClass()
            int r1 = r9.a
            r1 = r1 | r4
            r9.a = r1
            r9.c = r8
        L_0x010c:
            aucj r8 = r0.i()
            asuu r8 = (defpackage.asuu) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aksd.a(android.content.Context, com.google.android.gms.location.places.internal.PlacesParams):asuu");
    }

    public static avoq a(LatLng latLng) {
        aucd o = avoq.c.o();
        double d = latLng.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avoq avoq = (avoq) o.b;
        avoq.a = d;
        avoq.b = latLng.b;
        return (avoq) o.i();
    }

    public static PlaceEntity a(assu assu) {
        LatLngBounds latLngBounds;
        Uri uri;
        boolean z;
        float f;
        int i;
        float f2;
        int i2;
        Locale locale;
        char c;
        asug asug;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6;
        assu assu2 = assu;
        PlaceOpeningHoursEntity placeOpeningHoursEntity = null;
        if (assu2 != null) {
            int i7 = assu2.a;
            if ((i7 & 1) == 0) {
                if (Log.isLoggable("Places", 6)) {
                    alfy.a("Places", "received place lacks id");
                }
                return null;
            } else if ((i7 & 32) != 0) {
                assw assw = assu2.i;
                if (assw == null) {
                    assw = assw.d;
                }
                int i8 = 1;
                if ((assw.a & 1) == 0) {
                    if (Log.isLoggable("Places", 6)) {
                        alfy.a("Places", "received place lacks latlng");
                    }
                    return null;
                }
                String str = assu2.b;
                int size = assu2.c.size();
                List arrayList = new ArrayList(size);
                int i9 = 0;
                if (size != 0) {
                    aucx aucx = assu2.c;
                    int size2 = aucx.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        arrayList.add(Integer.valueOf(akic.a((String) aucx.get(i10))));
                    }
                } else {
                    if (Log.isLoggable("Places", 5)) {
                        alfy.c("Places", "place is missing type. Defaulting to 'other'");
                    }
                    arrayList = Collections.singletonList(0);
                }
                assw assw2 = assu2.i;
                if (assw2 == null) {
                    assw2 = assw.d;
                }
                avoq avoq = assw2.b;
                if (avoq == null) {
                    avoq = avoq.c;
                }
                LatLng a = a(avoq);
                if ((assw2.a & 2) != 0) {
                    assd assd = assw2.c;
                    if (assd == null) {
                        assd = assd.d;
                    }
                    avoq avoq2 = assd.b;
                    if (avoq2 == null) {
                        avoq2 = avoq.c;
                    }
                    LatLng a2 = a(avoq2);
                    avoq avoq3 = assd.c;
                    if (avoq3 == null) {
                        avoq3 = avoq.c;
                    }
                    latLngBounds = new LatLngBounds(a2, a(avoq3));
                } else {
                    latLngBounds = null;
                }
                if ((assu2.a & 64) != 0) {
                    uri = Uri.parse(assu2.j);
                } else {
                    uri = null;
                }
                int i11 = assu2.a;
                if ((i11 & 128) == 0 || !assu2.k) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    f = assu2.l;
                } else {
                    f = -1.0f;
                }
                if ((i11 & 512) != 0) {
                    i = assu2.m;
                } else {
                    i = -1;
                }
                if ((i11 & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
                    asug asug2 = assu2.o;
                    if (asug2 != null) {
                        asug = asug2;
                    } else {
                        asug = asug.c;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    aucx aucx2 = asug.a;
                    int size3 = aucx2.size();
                    while (i9 < size3) {
                        float f4 = f;
                        int i12 = i;
                        asum asum = (asum) aucx2.get(i9);
                        int i13 = asum.a;
                        if (!((i13 & 1) == 0 || (i13 & 2) == 0)) {
                            arrayList2.add(PlaceOpeningHoursEntity.BusinessHoursInterval.a(asum.b, asum.c));
                        }
                        i9++;
                        i = i12;
                        f = f4;
                        i8 = 1;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    aucx aucx3 = asug.b;
                    int size4 = aucx3.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        asul asul = (asul) aucx3.get(i14);
                        aucx aucx4 = aucx3;
                        if ((asul.a & i8) == 0) {
                            i4 = size4;
                            f3 = f;
                            i3 = i;
                        } else {
                            asuk asuk = asul.b;
                            if (asuk == null) {
                                asuk = asuk.d;
                            }
                            int i15 = asuk.a;
                            if ((i15 & 1) == 0 || (i15 & 2) == 0) {
                                i4 = size4;
                            } else {
                                asuj asuj = asuk.b;
                                if (asuj == null) {
                                    asuj = asuj.e;
                                }
                                asuj asuj2 = asuk.c;
                                if (asuj2 == null) {
                                    asuj2 = asuj.e;
                                }
                                i4 = size4;
                                int i16 = asuj.a;
                                if (!((i16 & 1) == 0 || (i16 & 2) == 0 || (i16 & 4) == 0)) {
                                    int i17 = asuj2.a;
                                    if (!((i17 & 1) == 0 || (i17 & 2) == 0 || (i17 & 4) == 0)) {
                                        ArrayList arrayList4 = new ArrayList();
                                        aucx aucx5 = asul.c;
                                        i3 = i;
                                        int size5 = aucx5.size();
                                        f3 = f;
                                        int i18 = 0;
                                        while (i18 < size5) {
                                            aucx aucx6 = aucx5;
                                            asum asum2 = (asum) aucx5.get(i18);
                                            int i19 = size5;
                                            int i20 = asum2.a;
                                            if (!((i20 & 1) == 0 || (i20 & 2) == 0)) {
                                                arrayList4.add(PlaceOpeningHoursEntity.BusinessHoursInterval.a(asum2.b, asum2.c));
                                            }
                                            i18++;
                                            size5 = i19;
                                            aucx5 = aucx6;
                                        }
                                        int i21 = asuj.d;
                                        int a3 = asui.a(asuj.c);
                                        if (a3 != 0) {
                                            i5 = a3;
                                        } else {
                                            i5 = 1;
                                        }
                                        int i22 = asuj.b;
                                        int i23 = asuj2.d;
                                        int a4 = asui.a(asuj2.c);
                                        if (a4 != 0) {
                                            i6 = a4;
                                        } else {
                                            i6 = 1;
                                        }
                                        arrayList3.add(PlaceOpeningHoursEntity.ExceptionalHours.a(i21, i5, i22, i23, i6, asuj2.b, arrayList4));
                                    }
                                }
                            }
                            f3 = f;
                            i3 = i;
                        }
                        i14++;
                        aucx3 = aucx4;
                        size4 = i4;
                        i = i3;
                        f = f3;
                        i8 = 1;
                    }
                    f2 = f;
                    i2 = i;
                    placeOpeningHoursEntity = PlaceOpeningHoursEntity.a(arrayList2, arrayList3);
                } else {
                    f2 = f;
                    i2 = i;
                }
                String str2 = assu2.e;
                String str3 = assu2.f;
                String str4 = assu2.g;
                aucx aucx7 = assu2.h;
                String str5 = assu2.n;
                String str6 = assu2.p;
                rkj rkj = new rkj();
                rkj.a = str;
                rkj.k = arrayList;
                rkj.b = str2;
                rkj.l = str3;
                rkj.m = str4;
                rkj.n = aucx7;
                rkj.c = a;
                rkj.e = latLngBounds;
                rkj.g = uri;
                rkj.h = z;
                rkj.i = f2;
                rkj.j = i2;
                rkj.f = str5;
                rkj.o = placeOpeningHoursEntity;
                rkj.q = str6;
                PlaceEntity a5 = rkj.a();
                if ((assu2.a & 2) == 0 || TextUtils.isEmpty(assu2.d)) {
                    a5.r = Locale.getDefault();
                } else {
                    String[] split = assu2.d.split("[-_]");
                    if (split.length < 2) {
                        c = 0;
                    } else if (split[1].length() != 2) {
                        c = 0;
                    } else {
                        locale = new Locale(split[0], split[1]);
                        a5.r = locale;
                    }
                    locale = split[c].length() > 0 ? new Locale(split[c]) : Locale.getDefault();
                    a5.r = locale;
                }
                return a5;
            } else {
                if (Log.isLoggable("Places", 6)) {
                    alfy.a("Places", "received place lacks geometry");
                }
                return null;
            }
        } else {
            if (Log.isLoggable("Places", 6)) {
                alfy.a("Places", "received null place");
            }
            return null;
        }
    }

    public static LatLng a(avoq avoq) {
        double d = 0.0d;
        double d2 = avoq != null ? avoq.a : 0.0d;
        if (avoq != null) {
            d = avoq.b;
        }
        return new LatLng(d2, d);
    }

    private static List a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (jni.b(context).a("android.permission.ACCESS_WIFI_STATE") == 0) {
            long d = azcf.d();
            if (d > 0) {
                long j = d * 1000000;
                int e = (int) azcf.e();
                if (e > 0) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager.isWifiEnabled()) {
                        ArrayList arrayList = new ArrayList(e);
                        long j2 = 1000;
                        long currentTimeMillis = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) * 1000;
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (scanResults != null) {
                            int i2 = 0;
                            for (ScanResult next : scanResults) {
                                if (!agxx.b(next.SSID)) {
                                    long j3 = next.timestamp;
                                    if ((SystemClock.elapsedRealtime() * j2) - j3 <= j) {
                                        aucd o = asrv.h.o();
                                        String str = next.SSID;
                                        if (o.c) {
                                            o.c();
                                            o.c = false;
                                        }
                                        asrv asrv = (asrv) o.b;
                                        str.getClass();
                                        asrv.a |= 1;
                                        asrv.b = str;
                                        String str2 = next.BSSID;
                                        if (o.c) {
                                            o.c();
                                            o.c = false;
                                        }
                                        asrv asrv2 = (asrv) o.b;
                                        str2.getClass();
                                        asrv2.a |= 2;
                                        asrv2.c = str2;
                                        String str3 = next.capabilities;
                                        if (o.c) {
                                            o.c();
                                            o.c = false;
                                        }
                                        asrv asrv3 = (asrv) o.b;
                                        str3.getClass();
                                        asrv3.a |= 4;
                                        asrv3.d = str3;
                                        int i3 = next.frequency;
                                        if (o.c) {
                                            o.c();
                                            o.c = false;
                                        }
                                        asrv asrv4 = (asrv) o.b;
                                        asrv4.a |= 16;
                                        asrv4.f = i3;
                                        int i4 = next.level;
                                        if (o.c) {
                                            o.c();
                                            o.c = false;
                                        }
                                        asrv asrv5 = (asrv) o.b;
                                        int i5 = asrv5.a | 8;
                                        asrv5.a = i5;
                                        asrv5.e = i4;
                                        asrv5.a = i5 | 32;
                                        asrv5.g = j3 + currentTimeMillis;
                                        arrayList.add((asrv) o.i());
                                        i2++;
                                        if (i2 >= e) {
                                            break;
                                        }
                                        j2 = 1000;
                                    }
                                }
                                j2 = 1000;
                            }
                            return arrayList;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static List a(Context context, assa assa) {
        if (assa == null || assa.b.size() == 0) {
            return new ArrayList();
        }
        asuv asuv = assa.a;
        if (asuv == null) {
            asuv = asuv.c;
        }
        a(context, asuv);
        ArrayList arrayList = new ArrayList(assa.b.size());
        aucx aucx = assa.b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            asqw asqw = (asqw) aucx.get(i);
            int i2 = asqw.a;
            if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                asqy a = asqy.a(asqw.b);
                if (a == null) {
                    a = asqy.HOME;
                }
                String str = null;
                if (a == asqy.HOME) {
                    str = "Home";
                } else if (a == asqy.WORK) {
                    str = "Work";
                } else if (a == asqy.NICKNAME && (asqw.a & 4) != 0) {
                    str = asqw.d;
                }
                arrayList.add(AliasedPlace.a(asqw.c, Arrays.asList(new String[]{str})));
            }
        }
        return arrayList;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            asvg asvg = (asvg) list.get(i);
            int i2 = asvg.a;
            if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                arrayList.add(new AutocompletePredictionEntity.SubstringEntity(asvg.b, asvg.c));
            }
        }
        return arrayList;
    }

    public static void a(Context context, asuv asuv) {
        String str = (asuv.a & 1) != 0 ? asuv.b : "";
        if (!TextUtils.isEmpty(str)) {
            akif.a(context.getApplicationContext()).a(str);
        }
    }
}
