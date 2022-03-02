package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.places.service.GeoDataChimeraService;
import java.util.Collections;
import java.util.Locale;

/* renamed from: akvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvr extends akwd {
    private final String b;
    private final LatLngBounds c;
    private final int d;
    private final AutocompleteFilter e;
    private final rka f;
    private final GeoDataChimeraService g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akvr(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, GeoDataChimeraService geoDataChimeraService, akhj akhj) {
        super(65, "GetAutoPredictions", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) str);
        iva.a((Object) autocompleteFilter);
        iva.a((Object) rka);
        this.b = str;
        this.c = latLngBounds;
        this.d = i;
        this.e = autocompleteFilter;
        this.f = rka;
        this.g = geoDataChimeraService;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 2;
    }

    public final aoei c() {
        String str = this.b;
        AutocompleteFilter autocompleteFilter = this.e;
        PlacesParams placesParams = this.a;
        aoei c2 = akig.c(1, placesParams);
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aofe a = akig.a(6, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a.c(5);
        aucd2.a((aucj) a);
        aucd o = aody.d.o();
        if (((double) akig.a.nextFloat()) < azbe.a.a().b() && str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aody aody = (aody) o.b;
            str.getClass();
            aody.a = 1 | aody.a;
            aody.b = str;
        }
        if (autocompleteFilter != null) {
            aodq aodq = (aodq) aodr.d.o();
            String b2 = akic.b(autocompleteFilter.e);
            if (b2 != null) {
                aodq.a(b2);
            }
            aodr aodr = (aodr) aodq.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aody aody2 = (aody) o.b;
            aodr.getClass();
            aody2.c = aodr;
            aody2.a |= 4;
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aody aody3 = (aody) o.i();
        aofe aofe2 = aofe.s;
        aody3.getClass();
        aofe.i = aody3;
        aofe.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9 A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fa A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101 A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107 A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013e A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0141 A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0146 A[Catch:{ VolleyError | eif | TimeoutException -> 0x016f }, LOOP:0: B:20:0x0091->B:69:0x0146, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0154 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r19) {
        /*
            r18 = this;
            r1 = r18
            super.a((android.content.Context) r19)
            akih r0 = new akih
            com.google.android.gms.maps.model.LatLngBounds r3 = r1.c
            int r4 = r1.d
            com.google.android.gms.location.places.internal.PlacesParams r2 = r1.a
            java.lang.String r5 = r2.c
            java.lang.String r6 = r1.b
            com.google.android.gms.location.places.AutocompleteFilter r7 = r1.e
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            com.google.android.gms.location.places.internal.PlacesParams r2 = r1.a
            java.lang.String r2 = r2.d
            r3 = 0
            if (r2 != 0) goto L_0x0029
            com.google.android.places.service.GeoDataChimeraService r2 = r1.g
            iso r2 = r2.a
            java.lang.Object r2 = r2.a(r0)
            java.util.List r2 = (java.util.List) r2
            goto L_0x002a
        L_0x0029:
            r2 = r3
        L_0x002a:
            java.lang.String r4 = r1.b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0036
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0036:
            if (r2 == 0) goto L_0x003a
            goto L_0x0168
        L_0x003a:
            aksc r2 = r18.f()
            java.lang.String r11 = r1.b     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            com.google.android.gms.maps.model.LatLngBounds r12 = r1.c     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r13 = r1.d     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            com.google.android.gms.location.places.AutocompleteFilter r14 = r1.e     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            com.google.android.gms.location.places.internal.PlacesParams r15 = r1.a     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            aksv r10 = new aksv     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            iyn r6 = r2.e     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            android.content.Context r7 = r2.a     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            com.google.android.gms.common.internal.ClientContext r8 = r2.b     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.lang.String r9 = r2.c     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.lang.String r5 = r2.d     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.lang.String r16 = "getAutocompletePredictions"
            r17 = r5
            r5 = r10
            r4 = r10
            r10 = r17
            r17 = r15
            r15 = r16
            r16 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r5 = r17
            java.lang.Object r4 = r2.a((defpackage.aktf) r4, (com.google.android.gms.location.places.internal.PlacesParams) r5)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            asre r4 = (defpackage.asre) r4     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            android.content.Context r2 = r2.a     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r4 != 0) goto L_0x0073
            goto L_0x0156
        L_0x0073:
            aucx r5 = r4.b     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r5 = r5.size()     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r5 == 0) goto L_0x0156
            asuv r5 = r4.a     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r5 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            asuv r5 = defpackage.asuv.c     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
        L_0x0082:
            defpackage.aksd.a((android.content.Context) r2, (defpackage.asuv) r5)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            aucx r5 = r4.b     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r5 = r5.size()     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r2.<init>(r5)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r5 = 0
        L_0x0091:
            aucx r6 = r4.b     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r6 = r6.size()     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r5 >= r6) goto L_0x0155
            aucx r6 = r4.b     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            asrc r6 = (defpackage.asrc) r6     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r6 != 0) goto L_0x00a4
            goto L_0x00d8
        L_0x00a4:
            aucx r7 = r6.d     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r7 = r7.size()     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r7 == 0) goto L_0x00d8
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            aucx r8 = r6.d     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r8 = r8.size()     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r7.<init>(r8)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r8 = 0
        L_0x00b8:
            aucx r9 = r6.d     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r9 = r9.size()     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r8 >= r9) goto L_0x00d6
            aucx r9 = r6.d     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r9 = defpackage.akic.a((java.lang.String) r9)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r7.add(r9)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r8 = r8 + 1
            goto L_0x00b8
        L_0x00d6:
            r9 = r7
            goto L_0x00de
        L_0x00d8:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r7.<init>()     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r9 = r7
        L_0x00de:
            int r7 = r6.a     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r7 = r7 & 8
            r8 = 1
            if (r7 == 0) goto L_0x00ee
            int r7 = r6.g     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r7 = defpackage.asrb.a(r7)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r7 == 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r7 = 1
        L_0x00ef:
            aucx r10 = r6.e     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.util.List r12 = defpackage.aksd.a((java.util.List) r10)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            asvf r10 = r6.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r10 == 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            asvf r10 = defpackage.asvf.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
        L_0x00fc:
            int r10 = r10.a     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r8 = r8 & r10
            if (r8 != 0) goto L_0x0107
            r13 = r3
            r14 = r13
            r15 = r14
            r16 = r15
            goto L_0x0138
        L_0x0107:
            asvf r8 = r6.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r8 == 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            asvf r8 = defpackage.asvf.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
        L_0x010e:
            java.lang.String r8 = r8.b     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            asvf r10 = r6.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r10 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            asvf r10 = defpackage.asvf.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
        L_0x0117:
            java.lang.String r10 = r10.c     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            asvf r11 = r6.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r11 == 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            asvf r11 = defpackage.asvf.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
        L_0x0120:
            aucx r11 = r11.d     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.util.List r11 = defpackage.aksd.a((java.util.List) r11)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            asvf r13 = r6.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            if (r13 == 0) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            asvf r13 = defpackage.asvf.f     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
        L_0x012d:
            aucx r13 = r13.e     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            java.util.List r13 = defpackage.aksd.a((java.util.List) r13)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r15 = r10
            r14 = r11
            r16 = r13
            r13 = r8
        L_0x0138:
            int r8 = r6.a     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0141
            java.lang.String r8 = r6.c     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            goto L_0x0142
        L_0x0141:
            r8 = r3
        L_0x0142:
            int r10 = r7 + -1
            if (r7 == 0) goto L_0x0153
            java.lang.String r11 = r6.b     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            com.google.android.gms.location.places.internal.AutocompletePredictionEntity r6 = com.google.android.gms.location.places.internal.AutocompletePredictionEntity.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r2.add(r6)     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            int r5 = r5 + 1
            goto L_0x0091
        L_0x0153:
            throw r3     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
        L_0x0155:
            goto L_0x015b
        L_0x0156:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
            r2.<init>()     // Catch:{ eif -> 0x0173, TimeoutException -> 0x0171, VolleyError -> 0x016f }
        L_0x015b:
            com.google.android.gms.location.places.internal.PlacesParams r3 = r1.a
            java.lang.String r3 = r3.d
            if (r3 != 0) goto L_0x0168
            com.google.android.places.service.GeoDataChimeraService r3 = r1.g
            iso r3 = r3.a
            r3.a(r0, r2)
        L_0x0168:
            rka r0 = r1.f
            r3 = 0
            defpackage.alfs.b(r3, r2, r0)
            return
        L_0x016f:
            r0 = move-exception
            goto L_0x0174
        L_0x0171:
            r0 = move-exception
            goto L_0x0174
        L_0x0173:
            r0 = move-exception
        L_0x0174:
            nja r0 = defpackage.akwd.a((java.lang.Exception) r0)
            goto L_0x017a
        L_0x0179:
            throw r0
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvr.a(android.content.Context):void");
    }

    public final void a(Status status) {
        alfs.b(status.i, Collections.emptyList(), this.f);
    }
}
