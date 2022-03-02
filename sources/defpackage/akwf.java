package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.List;
import java.util.Locale;

/* renamed from: akwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwf extends akwd {
    private final String b;
    private final String c;
    private final String d;
    private final rla e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akwf(String str, String str2, String str3, PlacesParams placesParams, rla rla, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "SetPlaceAlias", placesParams, akuy, akvn, "", akhj);
        String str4 = str;
        String str5 = str3;
        boolean z = true;
        if (!"Home".equals(str) && !"Work".equals(str)) {
            z = false;
        }
        iva.b(z);
        iva.a((Object) rla);
        if (TextUtils.isEmpty(str2)) {
            iva.a(str3, (Object) "Either address or placeId must be given.");
        }
        this.b = str4;
        this.c = str2;
        this.d = str5;
        this.e = rla;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 3;
    }

    public final aoei c() {
        String str = this.b;
        PlacesParams placesParams = this.a;
        aoei c2 = akig.c(1, placesParams);
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aofe a = akig.a(8, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a.c(5);
        aucd2.a((aucj) a);
        aucd o = aofk.c.o();
        if ("Home".equals(str)) {
            aocr aocr = aocr.HOME;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofk aofk = (aofk) o.b;
            aofk.b = aocr.d;
            aofk.a |= 1;
        } else if ("Work".equals(str)) {
            aocr aocr2 = aocr.WORK;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofk aofk2 = (aofk) o.b;
            aofk2.b = aocr2.d;
            aofk2.a |= 1;
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aofk aofk3 = (aofk) o.i();
        aofe aofe2 = aofe.s;
        aofk3.getClass();
        aofe.k = aofk3;
        aofe.a |= 1024;
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

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0 A[Catch:{ VolleyError | eif | TimeoutException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = "Home"
            super.a((android.content.Context) r22)
            aksc r2 = r21.f()
            java.lang.String r3 = r1.b     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            java.lang.String r4 = r1.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            java.lang.String r5 = r1.d     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            com.google.android.gms.location.places.internal.PlacesParams r6 = r1.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            android.content.Context r7 = r2.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asvj r8 = defpackage.asvj.f     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            aucd r8 = r8.o()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asuu r7 = defpackage.aksd.a((android.content.Context) r7, (com.google.android.gms.location.places.internal.PlacesParams) r6)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            boolean r9 = r8.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r10 = 0
            if (r9 != 0) goto L_0x0025
            goto L_0x002a
        L_0x0025:
            r8.c()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r8.c = r10     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x002a:
            aucj r9 = r8.b     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asvj r9 = (defpackage.asvj) r9     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r7.getClass()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r9.b = r7     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            int r7 = r9.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r11 = 1
            r7 = r7 | r11
            r9.a = r7     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r4 == 0) goto L_0x0045
            r4.getClass()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r7 = r7 | 4
            r9.a = r7     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r9.d = r4     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            r4 = 8
            if (r5 == 0) goto L_0x0052
            r5.getClass()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r7 = r7 | r4
            r9.a = r7     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r9.e = r5     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x0052:
            boolean r5 = r0.equals(r3)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            java.lang.String r7 = "Work"
            r9 = 2
            r12 = 0
            if (r5 != 0) goto L_0x007f
            boolean r3 = r7.equals(r3)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r3 == 0) goto L_0x007d
            asqy r3 = defpackage.asqy.WORK     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            boolean r5 = r8.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r5 != 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            r8.c()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r8.c = r10     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x006f:
            aucj r5 = r8.b     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asvj r5 = (defpackage.asvj) r5     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            int r3 = r3.f     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r5.c = r3     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            int r3 = r5.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r3 = r3 | r9
            r5.a = r3     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            goto L_0x0098
        L_0x007d:
            r3 = r12
            goto L_0x009e
        L_0x007f:
            asqy r3 = defpackage.asqy.HOME     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            boolean r5 = r8.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r5 != 0) goto L_0x0086
            goto L_0x008b
        L_0x0086:
            r8.c()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r8.c = r10     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x008b:
            aucj r5 = r8.b     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asvj r5 = (defpackage.asvj) r5     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            int r3 = r3.f     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r5.c = r3     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            int r3 = r5.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r3 = r3 | r9
            r5.a = r3     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x0098:
            aucj r3 = r8.i()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asvj r3 = (defpackage.asvj) r3     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x009e:
            if (r3 == 0) goto L_0x012d
            akst r5 = new akst     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            iyn r14 = r2.e     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            com.google.android.gms.common.internal.ClientContext r15 = r2.b     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            java.lang.String r16 = "writeAlias"
            byte[] r17 = r3.k()     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asvk r18 = defpackage.asvk.d     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r19 = 13
            r20 = 10245(0x2805, float:1.4356E-41)
            r13 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            java.lang.Object r3 = r2.a((defpackage.aktf) r5, (com.google.android.gms.location.places.internal.PlacesParams) r6)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asvk r3 = (defpackage.asvk) r3     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            android.content.Context r2 = r2.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asuv r5 = r3.b     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r5 != 0) goto L_0x00c4
            asuv r5 = defpackage.asuv.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x00c4:
            defpackage.aksd.a((android.content.Context) r2, (defpackage.asuv) r5)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r3 == 0) goto L_0x012d
            int r2 = r3.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r2 = r2 & r9
            if (r2 == 0) goto L_0x012d
            asqw r2 = r3.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r2 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            asqw r2 = defpackage.asqw.e     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x00d5:
            int r2 = r2.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r2 = r2 & r11
            if (r2 == 0) goto L_0x012c
            asqw r2 = r3.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r2 == 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            asqw r2 = defpackage.asqw.e     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x00e1:
            int r2 = r2.a     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r2 = r2 & r9
            if (r2 == 0) goto L_0x012c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            r2.<init>(r9)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asqw r5 = r3.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r5 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            asqw r5 = defpackage.asqw.e     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x00f2:
            int r5 = r5.b     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asqy r5 = defpackage.asqy.a(r5)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r5 == 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            asqy r5 = defpackage.asqy.HOME     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x00fd:
            asqy r6 = defpackage.asqy.HOME     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r5 != r6) goto L_0x0105
            r2.add(r0)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            goto L_0x011e
        L_0x0105:
            asqw r0 = r3.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r0 == 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            asqw r0 = defpackage.asqw.e     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x010c:
            int r0 = r0.b     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            asqy r0 = defpackage.asqy.a(r0)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r0 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            asqy r0 = defpackage.asqy.HOME     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x0117:
            asqy r5 = defpackage.asqy.WORK     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r0 != r5) goto L_0x011e
            r2.add(r7)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x011e:
            asqw r0 = r3.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            if (r0 == 0) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            asqw r0 = defpackage.asqw.e     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
        L_0x0125:
            java.lang.String r0 = r0.c     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            com.google.android.gms.location.places.personalized.AliasedPlace r12 = com.google.android.gms.location.places.personalized.AliasedPlace.a(r0, r2)     // Catch:{ eif -> 0x0159, TimeoutException -> 0x0157, VolleyError -> 0x0155 }
            goto L_0x012e
        L_0x012c:
            goto L_0x012e
        L_0x012d:
        L_0x012e:
            if (r12 == 0) goto L_0x0147
            rla r0 = r1.e
            com.google.android.gms.location.places.personalized.AliasedPlacesResult r2 = new com.google.android.gms.location.places.personalized.AliasedPlacesResult
            com.google.android.gms.common.api.Status r3 = defpackage.ris.h(r10)
            com.google.android.gms.location.places.personalized.AliasedPlace[] r4 = new com.google.android.gms.location.places.personalized.AliasedPlace[r11]
            r4[r10] = r12
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.<init>(r3, r4)
            r0.a(r2)
            return
        L_0x0147:
            java.lang.String r0 = "Places"
            java.lang.String r2 = "PlacesServer.getAliases returned null"
            android.util.Log.wtf(r0, r2)
            akwc r0 = new akwc
            r0.<init>(r4)
            throw r0
        L_0x0155:
            r0 = move-exception
            goto L_0x015a
        L_0x0157:
            r0 = move-exception
            goto L_0x015a
        L_0x0159:
            r0 = move-exception
        L_0x015a:
            nja r0 = defpackage.akwd.a((java.lang.Exception) r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwf.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.e.a(new AliasedPlacesResult(status, (List) null));
    }
}
