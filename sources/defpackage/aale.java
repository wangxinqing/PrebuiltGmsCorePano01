package defpackage;

import android.util.TimingLogger;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;

/* renamed from: aale  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aale extends aafb {
    private final osf a;
    private final TimingLogger b;
    private final String c;

    public aale(osf osf, GetDocumentsCall$Request getDocumentsCall$Request, ozc ozc) {
        super(aonk.GET_DOCUMENTS, 1, 1, osf.b, getDocumentsCall$Request, ozc);
        String str;
        this.a = osf;
        GetDocumentsCall$Request getDocumentsCall$Request2 = (GetDocumentsCall$Request) this.n;
        String[] strArr = getDocumentsCall$Request2.c;
        String str2 = getDocumentsCall$Request2.a;
        String str3 = getDocumentsCall$Request2.b;
        QuerySpecification querySpecification = getDocumentsCall$Request2.d;
        if (querySpecification == null) {
            str = "No query spec defined";
        } else {
            try {
                osn.a("Corpus name", str3, 2048);
                for (String a2 : strArr) {
                    osn.a("Uri", a2, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                }
                str = osn.a(querySpecification);
            } catch (IllegalArgumentException e) {
                str = e.getMessage();
            }
        }
        this.c = str;
        GetDocumentsCall$Request getDocumentsCall$Request3 = (GetDocumentsCall$Request) this.n;
        String str4 = getDocumentsCall$Request3.b;
        int length = getDocumentsCall$Request3.c.length;
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 25);
        sb.append("getDocuments ");
        sb.append(str4);
        sb.append(" ");
        sb.append(length);
        this.b = new TimingLogger("Icing", sb.toString());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0288 A[Catch:{ UnsupportedEncodingException -> 0x034c, UnsupportedEncodingException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x028a A[Catch:{ UnsupportedEncodingException -> 0x034c, UnsupportedEncodingException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0298 A[Catch:{ UnsupportedEncodingException -> 0x034c, UnsupportedEncodingException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0398 A[Catch:{ UnsupportedEncodingException -> 0x034c, UnsupportedEncodingException -> 0x01ba }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = r1.c
            if (r0 != 0) goto L_0x03b6
            android.util.TimingLogger r0 = r1.b
            java.lang.String r3 = "wait index init"
            r0.addSplit(r3)
            osf r0 = r1.a
            ozs r0 = r0.a()
            java.lang.Object r3 = r0.a()
            monitor-enter(r3)
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x03b3 }
            java.lang.Object r6 = r1.n     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.search.queries.GetDocumentsCall$Request r6 = (com.google.android.gms.search.queries.GetDocumentsCall$Request) r6     // Catch:{ all -> 0x03b3 }
            java.lang.String r7 = r6.b     // Catch:{ all -> 0x03b3 }
            r8 = 0
            r5[r8] = r7     // Catch:{ all -> 0x03b3 }
            ozc r7 = r1.o     // Catch:{ all -> 0x03b3 }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x03b3 }
            ozr r6 = r0.b(r7, r5, r4, r6)     // Catch:{ all -> 0x03b3 }
            ozc r7 = r1.o     // Catch:{ all -> 0x03b3 }
            java.lang.Object r9 = r1.n     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.search.queries.GetDocumentsCall$Request r9 = (com.google.android.gms.search.queries.GetDocumentsCall$Request) r9     // Catch:{ all -> 0x03b3 }
            java.lang.String r9 = r9.a     // Catch:{ all -> 0x03b3 }
            java.lang.String r5 = defpackage.aalv.a(r6, r7, r5, r9)     // Catch:{ all -> 0x03b3 }
            anax r6 = r6.a     // Catch:{ all -> 0x03b3 }
            android.util.TimingLogger r7 = r1.b     // Catch:{ all -> 0x03b3 }
            java.lang.String r9 = "authentication"
            r7.addSplit(r9)     // Catch:{ all -> 0x03b3 }
            if (r5 != 0) goto L_0x03ad
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x03b3 }
            java.lang.Object r5 = r5.next()     // Catch:{ all -> 0x03b3 }
            pao r5 = (defpackage.pao) r5     // Catch:{ all -> 0x03b3 }
            osz r0 = r0.d(r5)     // Catch:{ all -> 0x03b3 }
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "Failed to find corpus"
            com.google.android.gms.appdatasearch.DocumentResults r0 = defpackage.dtu.a((java.lang.String) r0)     // Catch:{ all -> 0x03b3 }
            monitor-exit(r3)     // Catch:{ all -> 0x03b3 }
            goto L_0x03ba
        L_0x005c:
            ouc r5 = defpackage.ouc.g     // Catch:{ all -> 0x03b3 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x03b3 }
            int r6 = r0.b     // Catch:{ all -> 0x03b3 }
            boolean r7 = r5.c     // Catch:{ all -> 0x03b3 }
            if (r7 != 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            r5.c()     // Catch:{ all -> 0x03b3 }
            r5.c = r8     // Catch:{ all -> 0x03b3 }
        L_0x006e:
            aucj r7 = r5.b     // Catch:{ all -> 0x03b3 }
            ouc r7 = (defpackage.ouc) r7     // Catch:{ all -> 0x03b3 }
            int r9 = r7.a     // Catch:{ all -> 0x03b3 }
            r9 = r9 | r4
            r7.a = r9     // Catch:{ all -> 0x03b3 }
            r7.b = r6     // Catch:{ all -> 0x03b3 }
            java.lang.Object r6 = r1.n     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.search.queries.GetDocumentsCall$Request r6 = (com.google.android.gms.search.queries.GetDocumentsCall$Request) r6     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.appdatasearch.QuerySpecification r6 = r6.d     // Catch:{ all -> 0x03b3 }
            java.util.List r6 = r6.c     // Catch:{ all -> 0x03b3 }
            if (r6 == 0) goto L_0x00df
            java.util.Map r6 = defpackage.ozq.b((defpackage.osz) r0)     // Catch:{ all -> 0x03b3 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x03b3 }
            r7.<init>()     // Catch:{ all -> 0x03b3 }
            java.lang.Object r9 = r1.n     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.search.queries.GetDocumentsCall$Request r9 = (com.google.android.gms.search.queries.GetDocumentsCall$Request) r9     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.appdatasearch.QuerySpecification r9 = r9.d     // Catch:{ all -> 0x03b3 }
            java.util.List r9 = r9.c     // Catch:{ all -> 0x03b3 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x03b3 }
        L_0x0098:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x03b3 }
            if (r10 == 0) goto L_0x00d5
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.appdatasearch.Section r10 = (com.google.android.gms.appdatasearch.Section) r10     // Catch:{ all -> 0x03b3 }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x03b3 }
            java.lang.Object r10 = r6.get(r10)     // Catch:{ all -> 0x03b3 }
            ozm r10 = (defpackage.ozm) r10     // Catch:{ all -> 0x03b3 }
            if (r10 == 0) goto L_0x0098
            ouj r11 = defpackage.ouj.e     // Catch:{ all -> 0x03b3 }
            aucd r11 = r11.o()     // Catch:{ all -> 0x03b3 }
            int r10 = r10.a     // Catch:{ all -> 0x03b3 }
            boolean r12 = r11.c     // Catch:{ all -> 0x03b3 }
            if (r12 != 0) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            r11.c()     // Catch:{ all -> 0x03b3 }
            r11.c = r8     // Catch:{ all -> 0x03b3 }
        L_0x00c0:
            aucj r12 = r11.b     // Catch:{ all -> 0x03b3 }
            ouj r12 = (defpackage.ouj) r12     // Catch:{ all -> 0x03b3 }
            int r13 = r12.a     // Catch:{ all -> 0x03b3 }
            r13 = r13 | r4
            r12.a = r13     // Catch:{ all -> 0x03b3 }
            r12.b = r10     // Catch:{ all -> 0x03b3 }
            aucj r10 = r11.i()     // Catch:{ all -> 0x03b3 }
            ouj r10 = (defpackage.ouj) r10     // Catch:{ all -> 0x03b3 }
            r7.add(r10)     // Catch:{ all -> 0x03b3 }
            goto L_0x0098
        L_0x00d5:
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x03b3 }
            if (r6 == 0) goto L_0x00dc
            goto L_0x00df
        L_0x00dc:
            r5.Q(r7)     // Catch:{ all -> 0x03b3 }
        L_0x00df:
            oul r6 = defpackage.oul.v     // Catch:{ all -> 0x03b3 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x03b3 }
            boolean r7 = r6.c     // Catch:{ all -> 0x03b3 }
            if (r7 != 0) goto L_0x00ea
            goto L_0x00ef
        L_0x00ea:
            r6.c()     // Catch:{ all -> 0x03b3 }
            r6.c = r8     // Catch:{ all -> 0x03b3 }
        L_0x00ef:
            aucj r7 = r6.b     // Catch:{ all -> 0x03b3 }
            oul r7 = (defpackage.oul) r7     // Catch:{ all -> 0x03b3 }
            aucj r5 = r5.i()     // Catch:{ all -> 0x03b3 }
            ouc r5 = (defpackage.ouc) r5     // Catch:{ all -> 0x03b3 }
            r5.getClass()     // Catch:{ all -> 0x03b3 }
            r7.a()     // Catch:{ all -> 0x03b3 }
            aucx r7 = r7.b     // Catch:{ all -> 0x03b3 }
            r7.add(r5)     // Catch:{ all -> 0x03b3 }
            boolean r5 = r6.c     // Catch:{ all -> 0x03b3 }
            if (r5 != 0) goto L_0x0109
            goto L_0x010e
        L_0x0109:
            r6.c()     // Catch:{ all -> 0x03b3 }
            r6.c = r8     // Catch:{ all -> 0x03b3 }
        L_0x010e:
            aucj r5 = r6.b     // Catch:{ all -> 0x03b3 }
            oul r5 = (defpackage.oul) r5     // Catch:{ all -> 0x03b3 }
            int r7 = r5.a     // Catch:{ all -> 0x03b3 }
            r9 = 2
            r7 = r7 | r9
            r5.a = r7     // Catch:{ all -> 0x03b3 }
            r5.f = r4     // Catch:{ all -> 0x03b3 }
            java.lang.Object r5 = r1.n     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.search.queries.GetDocumentsCall$Request r5 = (com.google.android.gms.search.queries.GetDocumentsCall$Request) r5     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.appdatasearch.QuerySpecification r5 = r5.d     // Catch:{ all -> 0x03b3 }
            java.util.List r5 = r5.b     // Catch:{ all -> 0x03b3 }
            if (r5 != 0) goto L_0x0125
            goto L_0x0128
        L_0x0125:
            r6.P(r5)     // Catch:{ all -> 0x03b3 }
        L_0x0128:
            aucj r5 = r6.i()     // Catch:{ all -> 0x03b3 }
            oul r5 = (defpackage.oul) r5     // Catch:{ all -> 0x03b3 }
            android.util.TimingLogger r6 = r1.b     // Catch:{ all -> 0x03b3 }
            java.lang.String r7 = "build corpus spec"
            r6.addSplit(r7)     // Catch:{ all -> 0x03b3 }
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x03b3 }
            osf r10 = r1.a     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.icing.nativeindex.NativeIndex r10 = r10.n     // Catch:{ all -> 0x03b3 }
            java.lang.Object r11 = r1.n     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.search.queries.GetDocumentsCall$Request r11 = (com.google.android.gms.search.queries.GetDocumentsCall$Request) r11     // Catch:{ all -> 0x03b3 }
            java.lang.String[] r11 = r11.c     // Catch:{ all -> 0x03b3 }
            oup r10 = r10.a((java.lang.String[]) r11, (defpackage.oul) r5)     // Catch:{ all -> 0x03b3 }
            long r11 = java.lang.System.nanoTime()     // Catch:{ all -> 0x03b3 }
            long r11 = r11 - r6
            android.util.TimingLogger r6 = r1.b     // Catch:{ all -> 0x03b3 }
            java.lang.String r7 = "execute query"
            r6.addSplit(r7)     // Catch:{ all -> 0x03b3 }
            java.lang.String r6 = "Retrieved: %d Docs: %d Elapsed: %d ms"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x03b3 }
            int r13 = r10.e     // Catch:{ all -> 0x03b3 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x03b3 }
            r7[r8] = r13     // Catch:{ all -> 0x03b3 }
            int r13 = r10.b     // Catch:{ all -> 0x03b3 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x03b3 }
            r7[r4] = r13     // Catch:{ all -> 0x03b3 }
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 / r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x03b3 }
            r7[r9] = r11     // Catch:{ all -> 0x03b3 }
            defpackage.oso.b((java.lang.String) r6, (java.lang.Object[]) r7)     // Catch:{ all -> 0x03b3 }
            java.lang.Object r6 = r1.n     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.search.queries.GetDocumentsCall$Request r6 = (com.google.android.gms.search.queries.GetDocumentsCall$Request) r6     // Catch:{ all -> 0x03b3 }
            java.lang.String[] r7 = r6.c     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.appdatasearch.QuerySpecification r6 = r6.d     // Catch:{ all -> 0x03b3 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x03b3 }
            int r11 = r7.length     // Catch:{ all -> 0x03b3 }
            r9.<init>(r11)     // Catch:{ all -> 0x03b3 }
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0186:
            if (r12 < r11) goto L_0x0189
            goto L_0x01c3
        L_0x0189:
            r15 = r7[r12]     // Catch:{ all -> 0x03b3 }
            int r2 = r10.b     // Catch:{ all -> 0x03b3 }
            if (r13 >= r2) goto L_0x01c3
            auay r2 = r10.g     // Catch:{ all -> 0x03b3 }
            aucs r8 = r10.f     // Catch:{ all -> 0x03b3 }
            int r8 = r8.c(r13)     // Catch:{ all -> 0x03b3 }
            int r8 = r8 + r14
            auay r2 = r2.a((int) r14, (int) r8)     // Catch:{ all -> 0x03b3 }
            java.lang.String r8 = "UTF-8"
            java.lang.String r2 = r2.b((java.lang.String) r8)     // Catch:{ UnsupportedEncodingException -> 0x01ba }
            boolean r2 = r2.equals(r15)     // Catch:{ UnsupportedEncodingException -> 0x01ba }
            if (r2 == 0) goto L_0x01b5
            r9.add(r15)     // Catch:{ UnsupportedEncodingException -> 0x01ba }
            aucs r2 = r10.f     // Catch:{ UnsupportedEncodingException -> 0x01ba }
            int r2 = r2.c(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ba }
            int r14 = r14 + r2
            int r13 = r13 + 1
            goto L_0x01b6
        L_0x01b5:
        L_0x01b6:
            int r12 = r12 + 1
            r8 = 0
            goto L_0x0186
        L_0x01ba:
            r0 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x03b3 }
            java.lang.String r2 = "UTF-8 not supported"
            r0.<init>(r2)     // Catch:{ all -> 0x03b3 }
            throw r0     // Catch:{ all -> 0x03b3 }
        L_0x01c3:
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            int r7 = r9.size()     // Catch:{ all -> 0x03b3 }
            r2.<init>(r7)     // Catch:{ all -> 0x03b3 }
            java.util.Iterator r7 = r9.iterator()     // Catch:{ all -> 0x03b3 }
        L_0x01d0:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x03b3 }
            if (r8 == 0) goto L_0x01e0
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x03b3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x03b3 }
            r2.putBoolean(r8, r4)     // Catch:{ all -> 0x03b3 }
            goto L_0x01d0
        L_0x01e0:
            com.google.android.gms.appdatasearch.DocumentResults r7 = new com.google.android.gms.appdatasearch.DocumentResults     // Catch:{ all -> 0x03b3 }
            aucx r8 = r5.b     // Catch:{ all -> 0x03b3 }
            int r8 = r8.size()     // Catch:{ all -> 0x03b3 }
            if (r8 != r4) goto L_0x01ec
            r8 = 1
            goto L_0x01ed
        L_0x01ec:
            r8 = 0
        L_0x01ed:
            defpackage.amrl.a((boolean) r8)     // Catch:{ all -> 0x03b3 }
            java.util.List r8 = r6.b     // Catch:{ all -> 0x03b3 }
            if (r8 == 0) goto L_0x027e
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x03b3 }
            if (r8 != 0) goto L_0x027e
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r8.<init>()     // Catch:{ all -> 0x03b3 }
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x03b3 }
            java.util.List r12 = r6.b     // Catch:{ all -> 0x03b3 }
            r11.<init>(r12)     // Catch:{ all -> 0x03b3 }
            r12 = 0
        L_0x0207:
            aucx r13 = r5.e     // Catch:{ all -> 0x03b3 }
            int r13 = r13.size()     // Catch:{ all -> 0x03b3 }
            if (r12 >= r13) goto L_0x0277
            aucx r13 = r5.e     // Catch:{ all -> 0x03b3 }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x03b3 }
            boolean r14 = r11.contains(r13)     // Catch:{ all -> 0x03b3 }
            if (r14 == 0) goto L_0x026f
            aucx r14 = r10.d     // Catch:{ all -> 0x03b3 }
            r15 = 0
            java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x03b3 }
            ouo r14 = (defpackage.ouo) r14     // Catch:{ all -> 0x03b3 }
            aucx r14 = r14.b     // Catch:{ all -> 0x03b3 }
            java.lang.Object r14 = r14.get(r12)     // Catch:{ all -> 0x03b3 }
            oun r14 = (defpackage.oun) r14     // Catch:{ all -> 0x03b3 }
            auay r14 = r14.a     // Catch:{ all -> 0x03b3 }
            r15 = 0
        L_0x0231:
            int r4 = r9.size()     // Catch:{ all -> 0x03b3 }
            if (r15 < r4) goto L_0x023a
            r18 = r11
            goto L_0x0271
        L_0x023a:
            byte r4 = r14.a((int) r15)     // Catch:{ all -> 0x03b3 }
            if (r4 == 0) goto L_0x0263
            java.lang.Object r4 = r9.get(r15)     // Catch:{ all -> 0x03b3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x03b3 }
            android.os.Bundle r17 = r8.getBundle(r13)     // Catch:{ all -> 0x03b3 }
            if (r17 != 0) goto L_0x0257
            r18 = r11
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r11.<init>()     // Catch:{ all -> 0x03b3 }
            r8.putBundle(r13, r11)     // Catch:{ all -> 0x03b3 }
            goto L_0x025b
        L_0x0257:
            r18 = r11
            r11 = r17
        L_0x025b:
            r17 = r13
            r13 = 1
            r11.putBoolean(r4, r13)     // Catch:{ all -> 0x03b3 }
            goto L_0x0267
        L_0x0263:
            r18 = r11
            r17 = r13
        L_0x0267:
            int r15 = r15 + 1
            r13 = r17
            r11 = r18
            r4 = 1
            goto L_0x0231
        L_0x026f:
            r18 = r11
        L_0x0271:
            int r12 = r12 + 1
            r11 = r18
            r4 = 1
            goto L_0x0207
        L_0x0277:
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x03b3 }
            if (r4 != 0) goto L_0x027e
            goto L_0x027f
        L_0x027e:
            r8 = 0
        L_0x027f:
            aucx r4 = r5.b     // Catch:{ all -> 0x03b3 }
            int r4 = r4.size()     // Catch:{ all -> 0x03b3 }
            r11 = 1
            if (r4 != r11) goto L_0x028a
            r4 = 1
            goto L_0x028b
        L_0x028a:
            r4 = 0
        L_0x028b:
            defpackage.amrl.a((boolean) r4)     // Catch:{ all -> 0x03b3 }
            java.util.List r4 = r6.c     // Catch:{ all -> 0x03b3 }
            if (r4 == 0) goto L_0x0398
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x03b3 }
            if (r4 != 0) goto L_0x0398
            java.util.List r4 = r6.c     // Catch:{ all -> 0x03b3 }
            int r4 = r4.size()     // Catch:{ all -> 0x03b3 }
            java.util.HashSet r4 = defpackage.angm.a((int) r4)     // Catch:{ all -> 0x03b3 }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            java.util.List r12 = r6.c     // Catch:{ all -> 0x03b3 }
            int r12 = r12.size()     // Catch:{ all -> 0x03b3 }
            r11.<init>(r12)     // Catch:{ all -> 0x03b3 }
            java.util.List r6 = r6.c     // Catch:{ all -> 0x03b3 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x03b3 }
        L_0x02b3:
            boolean r12 = r6.hasNext()     // Catch:{ all -> 0x03b3 }
            if (r12 == 0) goto L_0x02c5
            java.lang.Object r12 = r6.next()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.appdatasearch.Section r12 = (com.google.android.gms.appdatasearch.Section) r12     // Catch:{ all -> 0x03b3 }
            java.lang.String r12 = r12.a     // Catch:{ all -> 0x03b3 }
            r4.add(r12)     // Catch:{ all -> 0x03b3 }
            goto L_0x02b3
        L_0x02c5:
            r15 = 0
        L_0x02c6:
            aucx r6 = r5.b     // Catch:{ all -> 0x03b3 }
            r12 = 0
            java.lang.Object r6 = r6.get(r12)     // Catch:{ all -> 0x03b3 }
            ouc r6 = (defpackage.ouc) r6     // Catch:{ all -> 0x03b3 }
            aucx r6 = r6.c     // Catch:{ all -> 0x03b3 }
            int r6 = r6.size()     // Catch:{ all -> 0x03b3 }
            if (r15 >= r6) goto L_0x0397
            aucx r6 = r5.b     // Catch:{ all -> 0x03b3 }
            r12 = 0
            java.lang.Object r6 = r6.get(r12)     // Catch:{ all -> 0x03b3 }
            ouc r6 = (defpackage.ouc) r6     // Catch:{ all -> 0x03b3 }
            aucx r6 = r6.c     // Catch:{ all -> 0x03b3 }
            java.lang.Object r6 = r6.get(r15)     // Catch:{ all -> 0x03b3 }
            ouj r6 = (defpackage.ouj) r6     // Catch:{ all -> 0x03b3 }
            aucx r12 = r10.d     // Catch:{ all -> 0x03b3 }
            r13 = 0
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x03b3 }
            ouo r12 = (defpackage.ouo) r12     // Catch:{ all -> 0x03b3 }
            aucx r12 = r12.a     // Catch:{ all -> 0x03b3 }
            java.lang.Object r12 = r12.get(r15)     // Catch:{ all -> 0x03b3 }
            oum r12 = (defpackage.oum) r12     // Catch:{ all -> 0x03b3 }
            int r6 = r6.b     // Catch:{ all -> 0x03b3 }
            aucx r14 = r0.j     // Catch:{ all -> 0x03b3 }
            java.lang.Object r6 = r14.get(r6)     // Catch:{ all -> 0x03b3 }
            oqy r6 = (defpackage.oqy) r6     // Catch:{ all -> 0x03b3 }
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x03b3 }
            boolean r14 = r4.contains(r6)     // Catch:{ all -> 0x03b3 }
            if (r14 == 0) goto L_0x037f
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r14.<init>()     // Catch:{ all -> 0x03b3 }
            r16 = r0
            r0 = 0
        L_0x0313:
            r17 = r4
            int r4 = r9.size()     // Catch:{ all -> 0x03b3 }
            if (r13 >= r4) goto L_0x0375
            aucs r4 = r12.a     // Catch:{ all -> 0x03b3 }
            int r4 = r4.c(r13)     // Catch:{ all -> 0x03b3 }
            if (r4 <= 0) goto L_0x0360
            java.lang.Object r18 = r9.get(r13)     // Catch:{ all -> 0x03b3 }
            r19 = r5
            r5 = r18
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x03b3 }
            r18 = r9
            auay r9 = r12.b     // Catch:{ all -> 0x03b3 }
            byte[] r9 = r9.k()     // Catch:{ all -> 0x03b3 }
            r20 = r10
            java.lang.String r10 = "thing_proto"
            boolean r10 = r6.equals(r10)     // Catch:{ all -> 0x03b3 }
            if (r10 != 0) goto L_0x0355
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x034c }
            r21 = r12
            java.lang.String r12 = "UTF-8"
            r10.<init>(r9, r0, r4, r12)     // Catch:{ UnsupportedEncodingException -> 0x034c }
            r14.putString(r5, r10)     // Catch:{ UnsupportedEncodingException -> 0x034c }
            goto L_0x035e
        L_0x034c:
            r0 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b3 }
            java.lang.String r2 = "Encoding utf8 not available"
            r0.<init>(r2)     // Catch:{ all -> 0x03b3 }
            throw r0     // Catch:{ all -> 0x03b3 }
        L_0x0355:
            r21 = r12
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r0, r4)     // Catch:{ all -> 0x03b3 }
            r14.putByteArray(r5, r9)     // Catch:{ all -> 0x03b3 }
        L_0x035e:
            int r0 = r0 + r4
            goto L_0x0368
        L_0x0360:
            r19 = r5
            r18 = r9
            r20 = r10
            r21 = r12
        L_0x0368:
            int r13 = r13 + 1
            r4 = r17
            r9 = r18
            r5 = r19
            r10 = r20
            r12 = r21
            goto L_0x0313
        L_0x0375:
            r19 = r5
            r18 = r9
            r20 = r10
            r11.putBundle(r6, r14)     // Catch:{ all -> 0x03b3 }
            goto L_0x0389
        L_0x037f:
            r16 = r0
            r17 = r4
            r19 = r5
            r18 = r9
            r20 = r10
        L_0x0389:
            int r15 = r15 + 1
            r0 = r16
            r4 = r17
            r9 = r18
            r5 = r19
            r10 = r20
            goto L_0x02c6
        L_0x0397:
            goto L_0x0399
        L_0x0398:
            r11 = 0
        L_0x0399:
            r0 = 0
            r7.<init>(r0, r2, r8, r11)     // Catch:{ all -> 0x03b3 }
            android.util.TimingLogger r0 = r1.b     // Catch:{ all -> 0x03b3 }
            java.lang.String r2 = "build DocumentResults"
            r0.addSplit(r2)     // Catch:{ all -> 0x03b3 }
            android.util.TimingLogger r0 = r1.b     // Catch:{ all -> 0x03b3 }
            r0.dumpToLog()     // Catch:{ all -> 0x03b3 }
            monitor-exit(r3)     // Catch:{ all -> 0x03b3 }
            r0 = r7
            goto L_0x03ba
        L_0x03ad:
            com.google.android.gms.appdatasearch.DocumentResults r0 = defpackage.dtu.a((java.lang.String) r5)     // Catch:{ all -> 0x03b3 }
            monitor-exit(r3)     // Catch:{ all -> 0x03b3 }
            goto L_0x03ba
        L_0x03b3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03b3 }
            throw r0
        L_0x03b6:
            com.google.android.gms.appdatasearch.DocumentResults r0 = defpackage.dtu.a((java.lang.String) r0)
        L_0x03ba:
            com.google.android.gms.search.queries.GetDocumentsCall$Response r2 = new com.google.android.gms.search.queries.GetDocumentsCall$Response
            r2.<init>()
            r2.b = r0
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L_0x03ce
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r4 = 8
            r5 = 0
            r3.<init>(r4, r0, r5)
            goto L_0x03d0
        L_0x03ce:
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.a
        L_0x03d0:
            r2.a = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aale.a():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final String f() {
        GetDocumentsCall$Request getDocumentsCall$Request = (GetDocumentsCall$Request) this.n;
        return String.format("%s, package[%s], corpus[%s]", new Object[]{super.f(), getDocumentsCall$Request.a, getDocumentsCall$Request.b});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        GetDocumentsCall$Response getDocumentsCall$Response = new GetDocumentsCall$Response();
        getDocumentsCall$Response.a = status;
        return getDocumentsCall$Response;
    }
}
