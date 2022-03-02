package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.List;
import java.util.Locale;

/* renamed from: akvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvq extends akwd {
    private final String b;
    private final rla c;

    public akvq(String str, PlacesParams placesParams, rla rla, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "DeletePlaceAlias", placesParams, akuy, akvn, "", akhj);
        boolean z = true;
        if (!"Home".equals(str) && !"Work".equals(str)) {
            z = false;
        }
        iva.b(z);
        iva.a((Object) rla);
        this.b = str;
        this.c = rla;
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
        aofe a = akig.a(10, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a.c(5);
        aucd2.a((aucj) a);
        aucd o = aoee.c.o();
        if ("Home".equals(str)) {
            aocr aocr = aocr.HOME;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoee aoee = (aoee) o.b;
            aoee.b = aocr.d;
            aoee.a |= 1;
        } else if ("Work".equals(str)) {
            aocr aocr2 = aocr.WORK;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoee aoee2 = (aoee) o.b;
            aoee2.b = aocr2.d;
            aoee2.a |= 1;
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aoee aoee3 = (aoee) o.i();
        aofe aofe2 = aofe.s;
        aoee3.getClass();
        aofe.m = aoee3;
        aofe.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
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

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r0 == 1) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083 A[Catch:{ VolleyError | eif | TimeoutException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r18) {
        /*
            r17 = this;
            r1 = r17
            super.a((android.content.Context) r18)
            aksc r0 = r17.f()
            java.lang.String r2 = r1.b     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            com.google.android.gms.location.places.internal.PlacesParams r3 = r1.a     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            android.content.Context r4 = r0.a     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            asrr r5 = defpackage.asrr.d     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            aucd r5 = r5.o()     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            asuu r4 = defpackage.aksd.a((android.content.Context) r4, (com.google.android.gms.location.places.internal.PlacesParams) r3)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            boolean r6 = r5.c     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r7 = 0
            if (r6 != 0) goto L_0x001f
            goto L_0x0024
        L_0x001f:
            r5.c()     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r5.c = r7     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
        L_0x0024:
            aucj r6 = r5.b     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            asrr r6 = (defpackage.asrr) r6     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r4.getClass()     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r6.b = r4     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            int r4 = r6.a     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r8 = 1
            r4 = r4 | r8
            r6.a = r4     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            java.lang.String r4 = "Home"
            boolean r4 = r4.equals(r2)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r6 = 0
            if (r4 != 0) goto L_0x0061
            java.lang.String r4 = "Work"
            boolean r2 = r4.equals(r2)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            if (r2 == 0) goto L_0x005f
            asqy r2 = defpackage.asqy.WORK     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            boolean r4 = r5.c     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            if (r4 != 0) goto L_0x004b
            goto L_0x0050
        L_0x004b:
            r5.c()     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r5.c = r7     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
        L_0x0050:
            aucj r4 = r5.b     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            asrr r4 = (defpackage.asrr) r4     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            int r2 = r2.f     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r4.c = r2     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            int r2 = r4.a     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r2 = r2 | 2
            r4.a = r2     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            goto L_0x007b
        L_0x005f:
            r2 = r6
            goto L_0x0081
        L_0x0061:
            asqy r2 = defpackage.asqy.HOME     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            boolean r4 = r5.c     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            if (r4 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r5.c()     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r5.c = r7     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
        L_0x006d:
            aucj r4 = r5.b     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            asrr r4 = (defpackage.asrr) r4     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            int r2 = r2.f     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r4.c = r2     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            int r2 = r4.a     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r2 = r2 | 2
            r4.a = r2     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
        L_0x007b:
            aucj r2 = r5.i()     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            asrr r2 = (defpackage.asrr) r2     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
        L_0x0081:
            if (r2 == 0) goto L_0x00d1
            akst r4 = new akst     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            iyn r10 = r0.e     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            com.google.android.gms.common.internal.ClientContext r11 = r0.b     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            java.lang.String r12 = "deleteAlias"
            byte[] r13 = r2.k()     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            asru r14 = defpackage.asru.d     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r15 = 3
            r16 = 10267(0x281b, float:1.4387E-41)
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            java.lang.Object r2 = r0.a((defpackage.aktf) r4, (com.google.android.gms.location.places.internal.PlacesParams) r3)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            asru r2 = (defpackage.asru) r2     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            android.content.Context r0 = r0.a     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            if (r2 != 0) goto L_0x00a3
            goto L_0x00c1
        L_0x00a3:
            asuv r3 = r2.b     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            if (r3 == 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            asuv r3 = defpackage.asuv.c     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
        L_0x00aa:
            defpackage.aksd.a((android.content.Context) r0, (defpackage.asuv) r3)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            int r0 = r2.a     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00c1
            int r0 = r2.c     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            int r0 = defpackage.asrt.a(r0)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            if (r0 != 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            if (r0 != r8) goto L_0x00c1
        L_0x00be:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            goto L_0x00c7
        L_0x00c1:
            r0 = 9051(0x235b, float:1.2683E-41)
            com.google.android.gms.common.api.Status r0 = defpackage.ris.h(r0)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
        L_0x00c7:
            com.google.android.gms.location.places.personalized.AliasedPlacesResult r6 = new com.google.android.gms.location.places.personalized.AliasedPlacesResult     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            r6.<init>(r0, r2)     // Catch:{ eif -> 0x00ed, TimeoutException -> 0x00eb, VolleyError -> 0x00e9 }
            goto L_0x00d2
        L_0x00d1:
        L_0x00d2:
            if (r6 == 0) goto L_0x00da
            rla r0 = r1.c
            r0.b(r6)
            return
        L_0x00da:
            java.lang.String r0 = "Places"
            java.lang.String r2 = "PlacesSever.deleteAlias returned null"
            android.util.Log.wtf(r0, r2)
            akwc r0 = new akwc
            r2 = 8
            r0.<init>(r2)
            throw r0
        L_0x00e9:
            r0 = move-exception
            goto L_0x00ee
        L_0x00eb:
            r0 = move-exception
            goto L_0x00ee
        L_0x00ed:
            r0 = move-exception
        L_0x00ee:
            nja r0 = defpackage.akwd.a((java.lang.Exception) r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvq.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.c.b(new AliasedPlacesResult(status, (List) null));
    }
}
