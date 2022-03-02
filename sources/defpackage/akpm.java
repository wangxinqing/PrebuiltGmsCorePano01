package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: akpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akpm {
    public final String a;
    public final List b;
    public final LatLngBounds c;
    public final long d;
    public boolean e = false;
    final /* synthetic */ akpt f;

    public akpm(akpt akpt, String str, List list, LatLngBounds latLngBounds, long j) {
        this.f = akpt;
        this.a = str;
        this.b = list;
        this.c = latLngBounds;
        this.d = j;
    }

    public final void a() {
        this.e = true;
    }

    public final void b() {
        boolean z;
        List list;
        if (this.f.h) {
            ArrayList arrayList = new ArrayList(this.b.size());
            HashSet<String> hashSet = new HashSet<>();
            for (akpd akpd : this.b) {
                List a2 = akrw.a(akpd.b.c);
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) a2.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        hashSet.add(str);
                    } else {
                        arrayList.add(akpd);
                        if (Log.isLoggable("Places", 5)) {
                            String valueOf = String.valueOf(akpd);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
                            sb.append("Places won't be fetched for subscription which has an empty client name: ");
                            sb.append(valueOf);
                            Log.w("Places", sb.toString());
                        }
                    }
                }
            }
            this.f.a.removeAll(arrayList);
            this.b.removeAll(arrayList);
            if (!hashSet.isEmpty()) {
                PlacesParams placesParams = new PlacesParams("com.google.android.gms", Locale.getDefault(), this.a);
                akpl akpl = new akpl(this);
                akpy akpy = this.f.j;
                String str2 = placesParams.d;
                LatLngBounds latLngBounds = this.c;
                int[] iArr = alft.a;
                int l = (int) azbk.a.a().l();
                LatLng latLng = latLngBounds.b;
                double d2 = latLng.a;
                double b2 = aell.b(d2, latLng.b, d2, latLngBounds.a.b);
                double d3 = latLngBounds.b.a;
                LatLng latLng2 = latLngBounds.a;
                double d4 = latLng2.b;
                PlacesParams placesParams2 = placesParams;
                int ceil = (int) Math.ceil(Math.max(b2, aell.b(d3, d4, latLng2.a, d4)));
                if (ceil <= alft.a[0]) {
                    z = ceil >= alft.a[alft.a.length + -1];
                } else {
                    z = false;
                }
                iva.b(z);
                int length = alft.a.length - 1;
                int i2 = 0;
                while (i2 <= length) {
                    PlacesParams placesParams3 = placesParams2;
                    int i3 = (i2 + length) / 2;
                    int i4 = alft.a[i3];
                    if (i4 + i4 >= ceil) {
                        i2 = i3 + 1;
                    } else {
                        length = i3 - 1;
                    }
                    placesParams2 = placesParams3;
                }
                LatLng a3 = latLngBounds.a();
                long a4 = aema.a(aema.a(a3.a, a3.b), length);
                long[] jArr = new long[8];
                aema.a(a4, length, jArr);
                if (length <= l) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.offer(Long.valueOf(a4));
                    for (int i5 = 0; i5 < 8; i5++) {
                        long j = jArr[i5];
                        if (j == 0) {
                            break;
                        }
                        arrayDeque.offer(Long.valueOf(j));
                    }
                    while (!arrayDeque.isEmpty() && length < l) {
                        int size2 = arrayDeque.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            long longValue = ((Long) arrayDeque.poll()).longValue();
                            for (int i7 = 0; i7 < 4; i7++) {
                                long b3 = aema.b(longValue, i7);
                                if (b3 == 0) {
                                    break;
                                }
                                arrayDeque.offer(Long.valueOf(b3));
                            }
                        }
                        length++;
                    }
                    list = alft.a(latLngBounds, l, arrayDeque);
                } else {
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(Long.valueOf(aema.a(a4, l)));
                    for (int i8 = 0; i8 < 8; i8++) {
                        long j2 = jArr[i8];
                        if (j2 != 0) {
                            hashSet2.add(Long.valueOf(aema.a(j2, l)));
                        }
                    }
                    list = alft.a(latLngBounds, l, hashSet2);
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : hashSet) {
                    int size3 = list.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        arrayList2.add(akqm.a(str2, str3, Long.valueOf(((Long) list.get(i9)).longValue())));
                    }
                }
                PlacesParams placesParams4 = placesParams2;
                akpy.a.a((Collection) arrayList2, new akpw(akpy, placesParams4, akpl));
                if (azbe.b()) {
                    aoei c2 = akig.c(1, placesParams4);
                    aucd aucd = (aucd) c2.c(5);
                    aucd.a((aucj) c2);
                    aofe a5 = akig.a(15, placesParams4.c, Locale.getDefault().toString());
                    aucd aucd2 = (aucd) a5.c(5);
                    aucd2.a((aucj) a5);
                    aucd o = aofh.b.o();
                    for (String str4 : hashSet) {
                        aoct a6 = akig.a(akig.b(str4), akig.a(str4));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aofh aofh = (aofh) o.b;
                        a6.getClass();
                        if (!aofh.a.a()) {
                            aofh.a = aucj.a(aofh.a);
                        }
                        aofh.a.add(a6);
                    }
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    aofe aofe = (aofe) aucd2.b;
                    aofh aofh2 = (aofh) o.i();
                    aofe aofe2 = aofe.s;
                    aofh2.getClass();
                    aofe.r = aofh2;
                    aofe.a |= 262144;
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
                    this.f.g.a(akig.a((aoei) aucd.i()));
                    return;
                }
                return;
            }
        }
    }
}
