package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* renamed from: aals  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aals extends aafb {
    public final osf a;
    private final pxp b;
    private final boolean c;
    private final boolean d;

    public aals(osf osf, QuerySuggestCall$Request querySuggestCall$Request, ozc ozc) {
        super(aonk.QUERY_SUGGEST, 1, 1, osf.b, querySuggestCall$Request, ozc);
        this.a = osf;
        pxp pxp = new pxp(aolo.SUGGEST, plc.b(-1));
        this.b = pxp;
        pxp.a();
        this.c = osf.r.b();
        this.d = querySuggestCall$Request.f != null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r12 = this;
            com.google.android.gms.search.queries.QuerySuggestCall$Response r0 = new com.google.android.gms.search.queries.QuerySuggestCall$Response
            r0.<init>()
            java.lang.Object r1 = r12.n
            com.google.android.gms.search.queries.QuerySuggestCall$Request r1 = (com.google.android.gms.search.queries.QuerySuggestCall$Request) r1
            java.lang.String r2 = r1.a
            java.lang.String r3 = r1.b
            java.lang.String[] r4 = r1.c
            int r1 = r1.d
            r5 = 0
            r6 = 0
            java.lang.String r7 = "Query"
            r8 = 1000(0x3e8, float:1.401E-42)
            defpackage.osn.c(r7, r2, r8)     // Catch:{ IllegalArgumentException -> 0x0050 }
            if (r3 != 0) goto L_0x0021
            if (r4 == 0) goto L_0x0021
            java.lang.String r1 = "Corpora specified but not package name"
            goto L_0x0055
        L_0x0021:
            if (r4 == 0) goto L_0x0033
            int r2 = r4.length     // Catch:{ IllegalArgumentException -> 0x0050 }
            r3 = 0
        L_0x0025:
            if (r3 >= r2) goto L_0x0033
            java.lang.String r7 = "Corpus name"
            r8 = r4[r3]     // Catch:{ IllegalArgumentException -> 0x0050 }
            r9 = 2048(0x800, float:2.87E-42)
            defpackage.osn.a(r7, r8, r9)     // Catch:{ IllegalArgumentException -> 0x0050 }
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0033:
            if (r1 > 0) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            r2 = 100
            if (r1 > r2) goto L_0x003c
            r1 = r5
            goto L_0x0055
        L_0x003c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0050 }
            r3 = 32
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0050 }
            java.lang.String r3 = "Bad num suggestions: "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x0050 }
            r2.append(r1)     // Catch:{ IllegalArgumentException -> 0x0050 }
            java.lang.String r1 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0050 }
            goto L_0x0055
        L_0x0050:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
        L_0x0055:
            if (r1 != 0) goto L_0x01f5
            pxp r1 = r12.b
            r1.b()
            osf r1 = r12.a
            ozs r1 = r1.a()
            pxp r2 = r12.b
            r2.c()
            java.lang.Object r2 = r1.a()
            monitor-enter(r2)
            pxp r3 = r12.b     // Catch:{ all -> 0x01f2 }
            r3.d()     // Catch:{ all -> 0x01f2 }
            ozc r3 = r12.o     // Catch:{ all -> 0x01f2 }
            java.lang.Object r4 = r12.n     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.search.queries.QuerySuggestCall$Request r4 = (com.google.android.gms.search.queries.QuerySuggestCall$Request) r4     // Catch:{ all -> 0x01f2 }
            java.lang.String[] r7 = r4.c     // Catch:{ all -> 0x01f2 }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x01f2 }
            r8 = 1
            java.util.Set r3 = r1.a(r3, r7, r8, r4)     // Catch:{ all -> 0x01f2 }
            int r4 = r3.size()     // Catch:{ all -> 0x01f2 }
            int[] r4 = new int[r4]     // Catch:{ all -> 0x01f2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01f2 }
            r7 = 0
        L_0x008b:
            boolean r9 = r3.hasNext()     // Catch:{ all -> 0x01f2 }
            if (r9 != 0) goto L_0x01df
            pxp r1 = r12.b     // Catch:{ all -> 0x01f2 }
            r1.e()     // Catch:{ all -> 0x01f2 }
            osf r1 = r12.a     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.icing.nativeindex.NativeIndex r1 = r1.n     // Catch:{ all -> 0x01f2 }
            java.lang.Object r3 = r12.n     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.search.queries.QuerySuggestCall$Request r3 = (com.google.android.gms.search.queries.QuerySuggestCall$Request) r3     // Catch:{ all -> 0x01f2 }
            java.lang.String r7 = r3.a     // Catch:{ all -> 0x01f2 }
            int r3 = r3.d     // Catch:{ all -> 0x01f2 }
            long r9 = r1.b     // Catch:{ all -> 0x01f2 }
            byte[] r1 = com.google.android.gms.icing.nativeindex.NativeIndex.a((java.lang.String) r7)     // Catch:{ all -> 0x01f2 }
            byte[] r1 = com.google.android.gms.icing.nativeindex.NativeIndex.nativeSuggest(r9, r1, r4, r3)     // Catch:{ all -> 0x01f2 }
            if (r1 == 0) goto L_0x00c0
            ouv r3 = defpackage.ouv.c     // Catch:{ auda -> 0x00b7 }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r1)     // Catch:{ auda -> 0x00b7 }
            ouv r1 = (defpackage.ouv) r1     // Catch:{ auda -> 0x00b7 }
            goto L_0x00c2
        L_0x00b7:
            r1 = move-exception
            java.lang.String r3 = "Failed parsing suggestions"
            defpackage.oso.a((java.lang.Throwable) r1, (java.lang.String) r3)     // Catch:{ all -> 0x01f2 }
            ouv r1 = defpackage.ouv.c     // Catch:{ all -> 0x01f2 }
            goto L_0x00c2
        L_0x00c0:
            ouv r1 = defpackage.ouv.c     // Catch:{ all -> 0x01f2 }
        L_0x00c2:
            pxp r3 = r12.b     // Catch:{ all -> 0x01f2 }
            r3.f()     // Catch:{ all -> 0x01f2 }
            pxp r3 = r12.b     // Catch:{ all -> 0x01f2 }
            otv r4 = r1.b     // Catch:{ all -> 0x01f2 }
            if (r4 == 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            otv r4 = defpackage.otv.c     // Catch:{ all -> 0x01f2 }
        L_0x00d0:
            r3.a((defpackage.otv) r4)     // Catch:{ all -> 0x01f2 }
            aucx r3 = r1.a     // Catch:{ all -> 0x01f2 }
            int r3 = r3.size()     // Catch:{ all -> 0x01f2 }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x01f2 }
            aucx r7 = r1.a     // Catch:{ all -> 0x01f2 }
            int r7 = r7.size()     // Catch:{ all -> 0x01f2 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x01f2 }
            r9 = 0
        L_0x00e4:
            aucx r10 = r1.a     // Catch:{ all -> 0x01f2 }
            int r10 = r10.size()     // Catch:{ all -> 0x01f2 }
            if (r9 < r10) goto L_0x01bb
            com.google.android.gms.appdatasearch.SuggestionResults r1 = new com.google.android.gms.appdatasearch.SuggestionResults     // Catch:{ all -> 0x01f2 }
            r1.<init>(r5, r4, r7)     // Catch:{ all -> 0x01f2 }
            java.lang.Object r4 = r12.n     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.search.queries.QuerySuggestCall$Request r4 = (com.google.android.gms.search.queries.QuerySuggestCall$Request) r4     // Catch:{ all -> 0x01f2 }
            pxp r7 = r12.b     // Catch:{ all -> 0x01f2 }
            int r9 = r4.d     // Catch:{ all -> 0x01f2 }
            r7.b = r9     // Catch:{ all -> 0x01f2 }
            r7.c = r3     // Catch:{ all -> 0x01f2 }
            r7.d = r6     // Catch:{ all -> 0x01f2 }
            java.lang.String[] r3 = r4.c     // Catch:{ all -> 0x01f2 }
            if (r3 == 0) goto L_0x0105
            int r3 = r3.length     // Catch:{ all -> 0x01f2 }
            goto L_0x0106
        L_0x0105:
            r3 = -1
        L_0x0106:
            r7.e = r3     // Catch:{ all -> 0x01f2 }
            r7.f = r6     // Catch:{ all -> 0x01f2 }
            r7.g = r6     // Catch:{ all -> 0x01f2 }
            r7.h = r5     // Catch:{ all -> 0x01f2 }
            r3 = 3
            r7.i = r3     // Catch:{ all -> 0x01f2 }
            boolean r5 = r12.d     // Catch:{ all -> 0x01f2 }
            if (r5 == 0) goto L_0x0126
            boolean r5 = r12.c     // Catch:{ all -> 0x01f2 }
            if (r5 == 0) goto L_0x0126
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x01f2 }
            ozc r9 = r12.o     // Catch:{ all -> 0x01f2 }
            java.lang.String r10 = r9.f     // Catch:{ all -> 0x01f2 }
            java.lang.String r9 = r9.g     // Catch:{ all -> 0x01f2 }
            android.os.Bundle r4 = r4.f     // Catch:{ all -> 0x01f2 }
            r7.a(r5, r10, r9, r4)     // Catch:{ all -> 0x01f2 }
        L_0x0126:
            osf r4 = r12.a     // Catch:{ all -> 0x01f2 }
            pxo r4 = r4.y     // Catch:{ all -> 0x01f2 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x01f2 }
            if (r4 != 0) goto L_0x0132
            goto L_0x01ab
        L_0x0132:
            osf r4 = r12.a     // Catch:{ all -> 0x01f2 }
            pxo r4 = r4.y     // Catch:{ all -> 0x01f2 }
            java.lang.Object r5 = r12.n     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.search.queries.QuerySuggestCall$Request r5 = (com.google.android.gms.search.queries.QuerySuggestCall$Request) r5     // Catch:{ all -> 0x01f2 }
            oua r7 = defpackage.oua.d     // Catch:{ all -> 0x01f2 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x01f2 }
            byte[] r5 = defpackage.pxo.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r5)     // Catch:{ all -> 0x01f2 }
            auay r5 = defpackage.auay.a((byte[]) r5)     // Catch:{ all -> 0x01f2 }
            boolean r9 = r7.c     // Catch:{ all -> 0x01f2 }
            if (r9 != 0) goto L_0x014d
            goto L_0x0152
        L_0x014d:
            r7.c()     // Catch:{ all -> 0x01f2 }
            r7.c = r6     // Catch:{ all -> 0x01f2 }
        L_0x0152:
            aucj r9 = r7.b     // Catch:{ all -> 0x01f2 }
            oua r9 = (defpackage.oua) r9     // Catch:{ all -> 0x01f2 }
            r5.getClass()     // Catch:{ all -> 0x01f2 }
            int r10 = r9.a     // Catch:{ all -> 0x01f2 }
            r8 = r8 | r10
            r9.a = r8     // Catch:{ all -> 0x01f2 }
            r9.b = r5     // Catch:{ all -> 0x01f2 }
            byte[] r5 = defpackage.pxo.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r1)     // Catch:{ all -> 0x01f2 }
            auay r5 = defpackage.auay.a((byte[]) r5)     // Catch:{ all -> 0x01f2 }
            boolean r8 = r7.c     // Catch:{ all -> 0x01f2 }
            if (r8 != 0) goto L_0x016d
            goto L_0x0172
        L_0x016d:
            r7.c()     // Catch:{ all -> 0x01f2 }
            r7.c = r6     // Catch:{ all -> 0x01f2 }
        L_0x0172:
            aucj r8 = r7.b     // Catch:{ all -> 0x01f2 }
            oua r8 = (defpackage.oua) r8     // Catch:{ all -> 0x01f2 }
            r5.getClass()     // Catch:{ all -> 0x01f2 }
            int r9 = r8.a     // Catch:{ all -> 0x01f2 }
            r9 = r9 | 2
            r8.a = r9     // Catch:{ all -> 0x01f2 }
            r8.c = r5     // Catch:{ all -> 0x01f2 }
            oub r5 = defpackage.oub.c     // Catch:{ all -> 0x01f2 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x01f2 }
            aucj r7 = r7.i()     // Catch:{ all -> 0x01f2 }
            oua r7 = (defpackage.oua) r7     // Catch:{ all -> 0x01f2 }
            boolean r8 = r5.c     // Catch:{ all -> 0x01f2 }
            if (r8 != 0) goto L_0x0192
            goto L_0x0197
        L_0x0192:
            r5.c()     // Catch:{ all -> 0x01f2 }
            r5.c = r6     // Catch:{ all -> 0x01f2 }
        L_0x0197:
            aucj r6 = r5.b     // Catch:{ all -> 0x01f2 }
            oub r6 = (defpackage.oub) r6     // Catch:{ all -> 0x01f2 }
            r7.getClass()     // Catch:{ all -> 0x01f2 }
            r6.b = r7     // Catch:{ all -> 0x01f2 }
            r6.a = r3     // Catch:{ all -> 0x01f2 }
            aucj r3 = r5.i()     // Catch:{ all -> 0x01f2 }
            oub r3 = (defpackage.oub) r3     // Catch:{ all -> 0x01f2 }
            r4.a((defpackage.oub) r3)     // Catch:{ all -> 0x01f2 }
        L_0x01ab:
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x01f2 }
            r0.a = r3     // Catch:{ all -> 0x01f2 }
            r0.b = r1     // Catch:{ all -> 0x01f2 }
            java.lang.Object r1 = r12.n     // Catch:{ all -> 0x01f2 }
            com.google.android.gms.search.queries.QuerySuggestCall$Request r1 = (com.google.android.gms.search.queries.QuerySuggestCall$Request) r1     // Catch:{ all -> 0x01f2 }
            android.os.Bundle r1 = r1.f     // Catch:{ all -> 0x01f2 }
            r0.c = r1     // Catch:{ all -> 0x01f2 }
            monitor-exit(r2)     // Catch:{ all -> 0x01f2 }
            goto L_0x0205
        L_0x01bb:
            aucx r10 = r1.a     // Catch:{ all -> 0x01f2 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ all -> 0x01f2 }
            ouu r10 = (defpackage.ouu) r10     // Catch:{ all -> 0x01f2 }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x01f2 }
            r4[r9] = r10     // Catch:{ all -> 0x01f2 }
            aucx r10 = r1.a     // Catch:{ all -> 0x01f2 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ all -> 0x01f2 }
            ouu r10 = (defpackage.ouu) r10     // Catch:{ all -> 0x01f2 }
            java.lang.String r10 = r10.b     // Catch:{ all -> 0x01f2 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x01f2 }
            if (r11 != 0) goto L_0x01d8
            goto L_0x01d9
        L_0x01d8:
            r10 = r5
        L_0x01d9:
            r7[r9] = r10     // Catch:{ all -> 0x01f2 }
            int r9 = r9 + 1
            goto L_0x00e4
        L_0x01df:
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x01f2 }
            pao r9 = (defpackage.pao) r9     // Catch:{ all -> 0x01f2 }
            int r10 = r7 + 1
            osz r9 = r1.d(r9)     // Catch:{ all -> 0x01f2 }
            int r9 = r9.b     // Catch:{ all -> 0x01f2 }
            r4[r7] = r9     // Catch:{ all -> 0x01f2 }
            r7 = r10
            goto L_0x008b
        L_0x01f2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01f2 }
            throw r0
        L_0x01f5:
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r3 = 8
            r2.<init>(r3, r1, r5)
            r0.a = r2
            com.google.android.gms.appdatasearch.SuggestionResults r2 = new com.google.android.gms.appdatasearch.SuggestionResults
            r2.<init>(r1, r5, r5)
            r0.b = r2
        L_0x0205:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aals.a():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return String.format("%s, query[%s]", new Object[]{super.f(), ((QuerySuggestCall$Request) this.n).a});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        QuerySuggestCall$Response querySuggestCall$Response = new QuerySuggestCall$Response();
        querySuggestCall$Response.a = status;
        return querySuggestCall$Response;
    }

    /* access modifiers changed from: protected */
    public final void a(Exception exc) {
        if (this.c) {
            this.b.a(exc);
            boolean z = this.d;
            boolean z2 = false;
            if (z && exc != null) {
                z2 = true;
            }
            if (!z || z2) {
                pxp pxp = this.b;
                String str = ((QuerySuggestCall$Request) this.n).a;
                ozc ozc = this.o;
                aojk a2 = pxp.a(str, ozc.f, ozc.g);
                if (((Boolean) ozx.m.c()).booleanValue()) {
                    this.a.c.d(new aalr(this, aonk.LOG_QUERY_STATS, this.j, psd.b(this.a.b), a2));
                    return;
                }
                this.a.r.a(a2);
            }
        }
    }
}
