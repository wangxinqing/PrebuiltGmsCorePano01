package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.service.GeoDataChimeraService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: akvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvv extends akwd {
    private final List b;
    private final rka c;
    private final GeoDataChimeraService d;

    public akvv(List list, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, GeoDataChimeraService geoDataChimeraService, akhj akhj) {
        super(65, "GetPlaceById", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) list);
        iva.a((Object) rka);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iva.c((String) it.next());
        }
        this.b = list;
        this.c = rka;
        this.d = geoDataChimeraService;
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
        return akig.a(this.b.size(), 4, this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba A[LOOP:2: B:28:0x00b8->B:29:0x00ba, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r13) {
        /*
            r12 = this;
            super.a((android.content.Context) r13)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r0 = r12.b
            int r0 = r0.size()
            r5.<init>(r0)
            java.util.List r0 = r12.b
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.places.service.GeoDataChimeraService r2 = r12.d
            akhq r2 = r2.b()
            long r3 = java.lang.System.currentTimeMillis()
            com.google.android.gms.location.places.internal.PlaceEntity r2 = r2.a((java.lang.String) r1, (long) r3)
            if (r2 != 0) goto L_0x0039
            r5.add(r1)
            goto L_0x0019
        L_0x0039:
            java.lang.String r1 = r2.a
            r13.put(r1, r2)
            goto L_0x0019
        L_0x003f:
            boolean r0 = r5.isEmpty()
            r8 = 0
            if (r0 != 0) goto L_0x00d2
            aksc r9 = r12.f()
            com.google.android.gms.location.places.internal.PlacesParams r10 = r12.a     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            aksy r11 = new aksy     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            iyn r1 = r9.e     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            android.content.Context r2 = r9.a     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            java.lang.String r3 = r9.c     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            java.lang.String r4 = r9.d     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            java.lang.String r6 = "getPlaceById"
            r0 = r11
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            java.lang.Object r0 = r9.a((defpackage.aktf) r11, (com.google.android.gms.location.places.internal.PlacesParams) r10)     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            assy r0 = (defpackage.assy) r0     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            android.content.Context r1 = r9.a     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            if (r0 != 0) goto L_0x0068
            goto L_0x00a1
        L_0x0068:
            aucx r2 = r0.b     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            int r2 = r2.size()     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            if (r2 == 0) goto L_0x00a1
            asuv r2 = r0.a     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            if (r2 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            asuv r2 = defpackage.asuv.c     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
        L_0x0077:
            defpackage.aksd.a((android.content.Context) r1, (defpackage.asuv) r2)     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            aucx r2 = r0.b     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            int r2 = r2.size()     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            r1.<init>(r2)     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            aucx r0 = r0.b     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
        L_0x008b:
            boolean r2 = r0.hasNext()     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            if (r2 == 0) goto L_0x00a6
            java.lang.Object r2 = r0.next()     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            assu r2 = (defpackage.assu) r2     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            com.google.android.gms.location.places.internal.PlaceEntity r2 = defpackage.aksd.a((defpackage.assu) r2)     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            if (r2 == 0) goto L_0x008b
            r1.add(r2)     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            goto L_0x008b
        L_0x00a1:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
            r1.<init>()     // Catch:{ eif -> 0x00cc, TimeoutException -> 0x00ca, VolleyError -> 0x00c8 }
        L_0x00a6:
            com.google.android.places.service.GeoDataChimeraService r0 = r12.d
            akhq r0 = r0.b()
            long r2 = java.lang.System.currentTimeMillis()
            r0.a((java.util.Collection) r1, (long) r2)
            int r0 = r1.size()
            r2 = 0
        L_0x00b8:
            if (r2 >= r0) goto L_0x00d2
            java.lang.Object r3 = r1.get(r2)
            com.google.android.gms.location.places.internal.PlaceEntity r3 = (com.google.android.gms.location.places.internal.PlaceEntity) r3
            java.lang.String r4 = r3.a
            r13.put(r4, r3)
            int r2 = r2 + 1
            goto L_0x00b8
        L_0x00c8:
            r13 = move-exception
            goto L_0x00cd
        L_0x00ca:
            r13 = move-exception
            goto L_0x00cd
        L_0x00cc:
            r13 = move-exception
        L_0x00cd:
            nja r13 = defpackage.akwd.a((java.lang.Exception) r13)
            throw r13
        L_0x00d2:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r12.b
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List r1 = r12.b
            java.util.Iterator r1 = r1.iterator()
        L_0x00e3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r13.get(r2)
            com.google.android.gms.location.places.internal.PlaceEntity r2 = (com.google.android.gms.location.places.internal.PlaceEntity) r2
            if (r2 == 0) goto L_0x00e3
            r0.add(r2)
            goto L_0x00e3
        L_0x00fb:
            rka r13 = r12.c
            defpackage.alfs.a((int) r8, (java.util.List) r0, (defpackage.rka) r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvv.a(android.content.Context):void");
    }

    public final void a(Status status) {
        alfs.a(status.i, Collections.emptyList(), this.c);
    }
}
