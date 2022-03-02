package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

/* renamed from: akwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwe extends akwd {
    private final LatLngBounds b;
    private final int c;
    private final String d;
    private final PlaceFilter e;
    private final rka f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akwe(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "SearchPlaces", placesParams, akuy, akvn, "", akhj);
        int i2 = i;
        iva.a((Object) latLngBounds);
        iva.b(i2 > 0);
        iva.a((Object) rka);
        this.b = latLngBounds;
        this.c = i2;
        this.d = str;
        this.e = placeFilter;
        this.f = rka;
    }

    private final boolean h() {
        int i = this.a.f;
        return i == -1 || i / 100000 < 73;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 1;
    }

    public final aoei c() {
        String str = this.d;
        PlaceFilter placeFilter = this.e;
        PlacesParams placesParams = this.a;
        aoei c2 = akig.c(1, placesParams);
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aofe a = akig.a(2, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a.c(5);
        aucd2.a((aucj) a);
        aucd o = aofj.d.o();
        if (((double) akig.a.nextFloat()) < azbe.a.a().o() && str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofj aofj = (aofj) o.b;
            str.getClass();
            aofj.a |= 8;
            aofj.b = str;
        }
        aodr a2 = akig.a((Collection) placeFilter.e, placeFilter.b);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aofe aofe2 = aofe.s;
        a2.getClass();
        aofe.e = a2;
        aofe.a |= 8;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofj aofj2 = (aofj) o.b;
        aofj2.c = 2;
        aofj2.a |= 16;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe3 = (aofe) aucd2.b;
        aofj aofj3 = (aofj) o.i();
        aofj3.getClass();
        aofe3.f = aofj3;
        aofe3.a |= 16;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofe aofe4 = (aofe) aucd2.i();
        aoei aoei2 = aoei.w;
        aofe4.getClass();
        aoei.i = aofe4;
        aoei.a |= 64;
        return (aoei) aucd.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r15) {
        /*
            r14 = this;
            super.a((android.content.Context) r15)
            aksc r15 = r14.f()
            com.google.android.gms.maps.model.LatLngBounds r5 = r14.b     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            int r6 = r14.c     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            java.lang.String r7 = r14.d     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            com.google.android.gms.location.places.PlaceFilter r0 = r14.e     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            com.google.android.gms.location.places.internal.PlacesParams r12 = r14.a     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            akte r13 = new akte     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            iyn r1 = r15.e     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            android.content.Context r2 = r15.a     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            java.lang.String r3 = r15.c     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            java.lang.String r4 = r15.d     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            java.util.Set r8 = r0.e     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            boolean r9 = r0.b     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            java.lang.String r10 = "search"
            r0 = r13
            r11 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            java.lang.Object r0 = r15.a((defpackage.aktf) r13, (com.google.android.gms.location.places.internal.PlacesParams) r12)     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            asuz r0 = (defpackage.asuz) r0     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            android.content.Context r15 = r15.a     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            r1 = 0
            if (r0 != 0) goto L_0x0032
            goto L_0x006b
        L_0x0032:
            aucx r2 = r0.b     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            int r2 = r2.size()     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            if (r2 == 0) goto L_0x006b
            asuv r2 = r0.a     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            if (r2 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            asuv r2 = defpackage.asuv.c     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
        L_0x0041:
            defpackage.aksd.a((android.content.Context) r15, (defpackage.asuv) r2)     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            aucx r2 = r0.b     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            int r2 = r2.size()     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            r15.<init>(r2)     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            r2 = 0
        L_0x0050:
            aucx r3 = r0.b     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            int r3 = r3.size()     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            if (r2 >= r3) goto L_0x006a
            aucx r3 = r0.b     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            assu r3 = (defpackage.assu) r3     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            com.google.android.gms.location.places.internal.PlaceEntity r3 = defpackage.aksd.a((defpackage.assu) r3)     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            r15.add(r3)     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            int r2 = r2 + 1
            goto L_0x0050
        L_0x006a:
            goto L_0x0070
        L_0x006b:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
            r15.<init>()     // Catch:{ eif -> 0x00aa, TimeoutException -> 0x00a8, VolleyError -> 0x00a6 }
        L_0x0070:
            boolean r0 = r14.h()
            if (r0 == 0) goto L_0x00a0
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r15.size()
            r0.<init>(r2)
            int r2 = r15.size()
            r3 = 0
        L_0x0084:
            if (r3 >= r2) goto L_0x0098
            java.lang.Object r4 = r15.get(r3)
            com.google.android.gms.location.places.internal.PlaceEntity r4 = (com.google.android.gms.location.places.internal.PlaceEntity) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            com.google.android.gms.location.places.internal.PlaceLikelihoodEntity r4 = com.google.android.gms.location.places.internal.PlaceLikelihoodEntity.a(r4, r5)
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x0084
        L_0x0098:
            r15 = 100
            rka r2 = r14.f
            defpackage.alfs.a(r1, r0, r15, r2)
            return
        L_0x00a0:
            rka r0 = r14.f
            defpackage.alfs.a((int) r1, (java.util.List) r15, (defpackage.rka) r0)
            return
        L_0x00a6:
            r15 = move-exception
            goto L_0x00ab
        L_0x00a8:
            r15 = move-exception
            goto L_0x00ab
        L_0x00aa:
            r15 = move-exception
        L_0x00ab:
            nja r15 = defpackage.akwd.a((java.lang.Exception) r15)
            goto L_0x00b1
        L_0x00b0:
            throw r15
        L_0x00b1:
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwe.a(android.content.Context):void");
    }

    public final void a(Status status) {
        if (h()) {
            alfs.a(status.i, Collections.emptyList(), 100, this.f);
        } else {
            alfs.a(status.i, Collections.emptyList(), this.f);
        }
    }
}
