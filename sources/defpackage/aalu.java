package defpackage;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Response;

/* renamed from: aalu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aalu extends aafb {
    private final osf a;
    private final pxp b;
    private final boolean c;

    public aalu(osf osf, QueryCall$Request queryCall$Request, ozc ozc) {
        super(aonk.QUERY, 1, 1, osf.b, queryCall$Request, ozc);
        int i;
        this.a = osf;
        aolo aolo = aolo.QUERY;
        QuerySpecification querySpecification = queryCall$Request.f;
        if (querySpecification != null) {
            i = querySpecification.f;
        } else {
            i = 0;
        }
        pxp pxp = new pxp(aolo, plc.b(i));
        this.b = pxp;
        pxp.a();
        this.c = osf.r.b();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x055f, code lost:
        if (r4 != 3) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x08d9, code lost:
        return r20;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x028e A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x028f A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a7 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a8 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c2 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x032e A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x032f A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0350 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0351 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0388 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04d9 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04da A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04f6 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04f7 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0509 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x050a A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x051d A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x051e A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0541 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0542 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0551 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0552 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x05b2 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x071b A[Catch:{ all -> 0x08f5 }, LOOP:10: B:250:0x0717->B:252:0x071b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0732 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x073b A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0741 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x074a A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0752 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0760 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0766 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0785 A[Catch:{ all -> 0x08f5 }, LOOP:11: B:277:0x0781->B:279:0x0785, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x07ae A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x07b1 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x07f3 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x07f5 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x07fa A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x07ff A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0806 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0809 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x080e A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0812 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x081d A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x081e A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0846 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0847 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0860 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07aa A[EDGE_INSN: B:364:0x07aa->B:280:0x07aa ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0240 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0241 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0260 A[Catch:{ all -> 0x08f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0261 A[Catch:{ all -> 0x08f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.appdatasearch.SearchResults a(defpackage.osf r40, com.google.android.gms.search.queries.QueryCall$Request r41, defpackage.ozc r42, defpackage.pxp r43, boolean r44) {
        /*
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            ozb r5 = r1.m
            int r5 = r5.c()
            java.lang.String r6 = r2.b
            java.lang.String r7 = "com.google.android.googlequicksearchbox"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x004b
            java.lang.String[] r6 = r2.c
            if (r6 == 0) goto L_0x001d
            goto L_0x004b
        L_0x001d:
            if (r3 == 0) goto L_0x004b
            java.lang.String r6 = r3.f
            java.lang.String r7 = "com.google.android.googlequicksearchbox"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x004b
            agvx r6 = defpackage.ozx.af
            java.lang.Object r6 = r6.c()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r5 >= r6) goto L_0x004b
            com.google.android.gms.search.queries.QueryCall$Request r5 = new com.google.android.gms.search.queries.QueryCall$Request
            java.lang.String r8 = r2.a
            r9 = 0
            java.lang.String[] r10 = r2.c
            int r11 = r2.d
            int r12 = r2.e
            com.google.android.gms.appdatasearch.QuerySpecification r13 = r2.f
            android.os.Bundle r14 = r2.g
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r2 = r5
        L_0x004b:
            com.google.android.gms.appdatasearch.QuerySpecification r5 = r2.f
            if (r5 == 0) goto L_0x0054
            java.lang.String r6 = "QuerySpecification: %s"
            defpackage.oso.a((java.lang.String) r6, (java.lang.Object) r5)
        L_0x0054:
            java.lang.String r6 = r2.a
            java.lang.String r7 = r2.b
            java.lang.String[] r8 = r2.c
            int r9 = r2.d
            int r10 = r2.e
            r11 = 2048(0x800, float:2.87E-42)
            r12 = 0
            if (r5 != 0) goto L_0x0067
            java.lang.String r6 = "No query spec defined"
            goto L_0x00d5
        L_0x0067:
            java.lang.String r13 = "Query"
            r14 = 1000(0x3e8, float:1.401E-42)
            defpackage.osn.c(r13, r6, r14)     // Catch:{ IllegalArgumentException -> 0x00cf }
            if (r7 != 0) goto L_0x0092
            if (r8 == 0) goto L_0x0092
            agvx r6 = defpackage.ozx.bD     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.Object r6 = r6.c()     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ IllegalArgumentException -> 0x00cf }
            boolean r6 = r6.booleanValue()     // Catch:{ IllegalArgumentException -> 0x00cf }
            if (r6 == 0) goto L_0x008f
            int r6 = r8.length     // Catch:{ IllegalArgumentException -> 0x00cf }
            r7 = 0
        L_0x0082:
            if (r7 >= r6) goto L_0x0092
            r13 = r8[r7]     // Catch:{ IllegalArgumentException -> 0x00cf }
            boolean r13 = defpackage.oxe.a(r13)     // Catch:{ IllegalArgumentException -> 0x00cf }
            if (r13 == 0) goto L_0x008f
            int r7 = r7 + 1
            goto L_0x0082
        L_0x008f:
            java.lang.String r6 = "Corpora specified but not package name"
            goto L_0x00d5
        L_0x0092:
            if (r8 == 0) goto L_0x00a9
            boolean r6 = r5.g     // Catch:{ IllegalArgumentException -> 0x00cf }
            if (r6 != 0) goto L_0x00a6
            int r6 = r8.length     // Catch:{ IllegalArgumentException -> 0x00cf }
            r7 = 0
        L_0x009a:
            if (r7 >= r6) goto L_0x00a9
            java.lang.String r13 = "Corpus name"
            r14 = r8[r7]     // Catch:{ IllegalArgumentException -> 0x00cf }
            defpackage.osn.a(r13, r14, r11)     // Catch:{ IllegalArgumentException -> 0x00cf }
            int r7 = r7 + 1
            goto L_0x009a
        L_0x00a6:
            java.lang.String r6 = "Cannot restrict to corpora if requesting semantic section names"
            goto L_0x00d5
        L_0x00a9:
            if (r9 >= 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            if (r10 <= 0) goto L_0x00b3
            java.lang.String r6 = defpackage.osn.a((com.google.android.gms.appdatasearch.QuerySpecification) r5)     // Catch:{ IllegalArgumentException -> 0x00cf }
            goto L_0x00d5
        L_0x00b3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00cf }
            r7 = 51
            r6.<init>(r7)     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.String r7 = "Bad start and num results: "
            r6.append(r7)     // Catch:{ IllegalArgumentException -> 0x00cf }
            r6.append(r9)     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.String r7 = ", "
            r6.append(r7)     // Catch:{ IllegalArgumentException -> 0x00cf }
            r6.append(r10)     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.String r6 = r6.toString()     // Catch:{ IllegalArgumentException -> 0x00cf }
            goto L_0x00d5
        L_0x00cf:
            r0 = move-exception
            r6 = r0
            java.lang.String r6 = r6.getMessage()
        L_0x00d5:
            if (r6 != 0) goto L_0x08f9
            r43.b()
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r3.f
            r6[r12] = r7
            java.lang.String r7 = r3.g
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = r2.b
            r9 = 2
            r6[r9] = r7
            int r7 = r2.d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 3
            r6[r10] = r7
            int r7 = r2.e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13 = 4
            r6[r13] = r7
            int r7 = r5.n
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14 = 5
            r6[r14] = r7
            java.lang.String r7 = "Query from package: %s, component: %s, restrict package: %s, start: %d, num: %d maxNumSlices: %d"
            defpackage.oso.d((java.lang.String) r7, (java.lang.Object[]) r6)
            java.lang.String r6 = r2.a
            java.lang.String r7 = "Query: [%s]"
            defpackage.oso.a((java.lang.String) r7, (java.lang.Object) r6)
            com.google.android.gms.icing.nativeindex.NativeIndex r6 = r1.n
            int r6 = r6.e()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.icing.nativeindex.NativeIndex r7 = r1.n
            int r7 = r7.f()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r15 = "Index docs: %d pls: %d"
            defpackage.oso.a((java.lang.String) r15, (java.lang.Object) r6, (java.lang.Object) r7)
            ozs r6 = r40.a()
            r43.c()
            java.lang.Object r7 = r6.a()
            monitor-enter(r7)
            r43.d()     // Catch:{ all -> 0x08f5 }
            java.lang.String[] r15 = r2.c     // Catch:{ all -> 0x08f5 }
            java.lang.String r10 = r2.b     // Catch:{ all -> 0x08f5 }
            ozr r10 = r6.b(r3, r15, r8, r10)     // Catch:{ all -> 0x08f5 }
            java.lang.String[] r15 = r2.c     // Catch:{ all -> 0x08f5 }
            java.lang.String r8 = r2.b     // Catch:{ all -> 0x08f5 }
            java.lang.String r8 = defpackage.aalv.a(r10, r3, r15, r8)     // Catch:{ all -> 0x08f5 }
            anax r10 = r10.a     // Catch:{ all -> 0x08f5 }
            if (r8 != 0) goto L_0x08da
            android.util.SparseArray r8 = new android.util.SparseArray     // Catch:{ all -> 0x08f5 }
            r8.<init>()     // Catch:{ all -> 0x08f5 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x08f5 }
            int r14 = r10.size()     // Catch:{ all -> 0x08f5 }
            r15.<init>(r14)     // Catch:{ all -> 0x08f5 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x08f5 }
        L_0x0160:
            boolean r14 = r10.hasNext()     // Catch:{ all -> 0x08f5 }
            if (r14 == 0) goto L_0x017a
            java.lang.Object r14 = r10.next()     // Catch:{ all -> 0x08f5 }
            pao r14 = (defpackage.pao) r14     // Catch:{ all -> 0x08f5 }
            osz r14 = r6.d(r14)     // Catch:{ all -> 0x08f5 }
            int r13 = r14.b     // Catch:{ all -> 0x08f5 }
            r8.put(r13, r14)     // Catch:{ all -> 0x08f5 }
            r15.add(r14)     // Catch:{ all -> 0x08f5 }
            r13 = 4
            goto L_0x0160
        L_0x017a:
            oul r6 = defpackage.oul.v     // Catch:{ all -> 0x08f5 }
            aucd r6 = r6.o()     // Catch:{ all -> 0x08f5 }
            oud r10 = defpackage.plc.a()     // Catch:{ all -> 0x08f5 }
            boolean r13 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r13 != 0) goto L_0x0189
            goto L_0x018e
        L_0x0189:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x018e:
            aucj r13 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r13 = (defpackage.oul) r13     // Catch:{ all -> 0x08f5 }
            r10.getClass()     // Catch:{ all -> 0x08f5 }
            r13.o = r10     // Catch:{ all -> 0x08f5 }
            int r10 = r13.a     // Catch:{ all -> 0x08f5 }
            r10 = r10 | r11
            r13.a = r10     // Catch:{ all -> 0x08f5 }
            boolean r11 = r3.e     // Catch:{ all -> 0x08f5 }
            r10 = r10 | 256(0x100, float:3.59E-43)
            r13.a = r10     // Catch:{ all -> 0x08f5 }
            r13.l = r11     // Catch:{ all -> 0x08f5 }
            agvx r10 = defpackage.ozx.P     // Catch:{ all -> 0x08f5 }
            java.lang.Object r10 = r10.c()     // Catch:{ all -> 0x08f5 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x08f5 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x01bd
            int[] r10 = r5.j     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x01bd
            java.util.List r10 = defpackage.aoog.b((int[]) r10)     // Catch:{ all -> 0x08f5 }
            r6.O(r10)     // Catch:{ all -> 0x08f5 }
        L_0x01bd:
            boolean r10 = r5.a     // Catch:{ all -> 0x08f5 }
            boolean r11 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r11 != 0) goto L_0x01c4
            goto L_0x01c9
        L_0x01c4:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x01c9:
            aucj r11 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r11 = (defpackage.oul) r11     // Catch:{ all -> 0x08f5 }
            int r13 = r11.a     // Catch:{ all -> 0x08f5 }
            r13 = r13 | r9
            r11.a = r13     // Catch:{ all -> 0x08f5 }
            r11.f = r10     // Catch:{ all -> 0x08f5 }
            boolean r10 = r5.d     // Catch:{ all -> 0x08f5 }
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            r11.a = r13     // Catch:{ all -> 0x08f5 }
            r11.p = r10     // Catch:{ all -> 0x08f5 }
            boolean r14 = r5.i     // Catch:{ all -> 0x08f5 }
            r13 = r13 | 8192(0x2000, float:1.14794E-41)
            r11.a = r13     // Catch:{ all -> 0x08f5 }
            r11.q = r14     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x01e7
            goto L_0x01ee
        L_0x01e7:
            if (r14 == 0) goto L_0x01ee
            java.lang.String r10 = "prefixMatchAllTokens has no effect when prefixMatch is false."
            defpackage.oso.d(r10)     // Catch:{ all -> 0x08f5 }
        L_0x01ee:
            boolean r10 = r3.b     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x01f3
            goto L_0x0210
        L_0x01f3:
            boolean r10 = defpackage.axsd.e()     // Catch:{ all -> 0x08f5 }
            if (r10 != 0) goto L_0x0210
            boolean r10 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r10 != 0) goto L_0x01fe
            goto L_0x0203
        L_0x01fe:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x0203:
            aucj r10 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r10 = (defpackage.oul) r10     // Catch:{ all -> 0x08f5 }
            int r11 = r10.a     // Catch:{ all -> 0x08f5 }
            r11 = r11 | 32
            r10.a = r11     // Catch:{ all -> 0x08f5 }
            r10.i = r12     // Catch:{ all -> 0x08f5 }
            goto L_0x0228
        L_0x0210:
            int r10 = r5.e     // Catch:{ all -> 0x08f5 }
            boolean r11 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r11 != 0) goto L_0x0217
            goto L_0x021c
        L_0x0217:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x021c:
            aucj r11 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r11 = (defpackage.oul) r11     // Catch:{ all -> 0x08f5 }
            int r13 = r11.a     // Catch:{ all -> 0x08f5 }
            r13 = r13 | 32
            r11.a = r13     // Catch:{ all -> 0x08f5 }
            r11.i = r10     // Catch:{ all -> 0x08f5 }
        L_0x0228:
            aucj r10 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r10 = (defpackage.oul) r10     // Catch:{ all -> 0x08f5 }
            int r11 = r10.i     // Catch:{ all -> 0x08f5 }
            int r13 = r10.a     // Catch:{ all -> 0x08f5 }
            r14 = 4
            r13 = r13 | r14
            r10.a = r13     // Catch:{ all -> 0x08f5 }
            r10.g = r11     // Catch:{ all -> 0x08f5 }
            int r10 = r5.f     // Catch:{ all -> 0x08f5 }
            int r10 = defpackage.plc.a((int) r10)     // Catch:{ all -> 0x08f5 }
            boolean r11 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r11 != 0) goto L_0x0241
            goto L_0x0246
        L_0x0241:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x0246:
            aucj r11 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r11 = (defpackage.oul) r11     // Catch:{ all -> 0x08f5 }
            r13 = -1
            int r10 = r10 + r13
            r11.j = r10     // Catch:{ all -> 0x08f5 }
            int r10 = r11.a     // Catch:{ all -> 0x08f5 }
            r10 = r10 | 64
            r11.a = r10     // Catch:{ all -> 0x08f5 }
            int r10 = r5.h     // Catch:{ all -> 0x08f5 }
            int r11 = r5.f     // Catch:{ all -> 0x08f5 }
            int r10 = defpackage.plc.a((int) r10, (int) r11)     // Catch:{ all -> 0x08f5 }
            boolean r11 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r11 != 0) goto L_0x0261
            goto L_0x0266
        L_0x0261:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x0266:
            aucj r11 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r11 = (defpackage.oul) r11     // Catch:{ all -> 0x08f5 }
            int r10 = r10 + r13
            r11.m = r10     // Catch:{ all -> 0x08f5 }
            int r10 = r11.a     // Catch:{ all -> 0x08f5 }
            r10 = r10 | 512(0x200, float:7.175E-43)
            r11.a = r10     // Catch:{ all -> 0x08f5 }
            int r10 = r5.f     // Catch:{ all -> 0x08f5 }
            r11 = 5
            if (r10 != r11) goto L_0x02bc
            com.google.android.gms.appdatasearch.STSortSpec r10 = r5.l     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x02bc
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x02bc
            ovh r10 = defpackage.ovh.b     // Catch:{ all -> 0x08f5 }
            aucd r10 = r10.o()     // Catch:{ all -> 0x08f5 }
            com.google.android.gms.appdatasearch.STSortSpec r11 = r5.l     // Catch:{ all -> 0x08f5 }
            java.lang.String r11 = r11.a     // Catch:{ all -> 0x08f5 }
            boolean r14 = r10.c     // Catch:{ all -> 0x08f5 }
            if (r14 != 0) goto L_0x028f
            goto L_0x0294
        L_0x028f:
            r10.c()     // Catch:{ all -> 0x08f5 }
            r10.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x0294:
            aucj r14 = r10.b     // Catch:{ all -> 0x08f5 }
            ovh r14 = (defpackage.ovh) r14     // Catch:{ all -> 0x08f5 }
            r11.getClass()     // Catch:{ all -> 0x08f5 }
            r14.a = r11     // Catch:{ all -> 0x08f5 }
            aucj r10 = r10.i()     // Catch:{ all -> 0x08f5 }
            ovh r10 = (defpackage.ovh) r10     // Catch:{ all -> 0x08f5 }
            boolean r11 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r11 != 0) goto L_0x02a8
            goto L_0x02ad
        L_0x02a8:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x02ad:
            aucj r11 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r11 = (defpackage.oul) r11     // Catch:{ all -> 0x08f5 }
            r10.getClass()     // Catch:{ all -> 0x08f5 }
            r11.s = r10     // Catch:{ all -> 0x08f5 }
            int r10 = r11.a     // Catch:{ all -> 0x08f5 }
            r10 = r10 | 16384(0x4000, float:2.2959E-41)
            r11.a = r10     // Catch:{ all -> 0x08f5 }
        L_0x02bc:
            boolean r10 = defpackage.pba.j()     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x0328
            aucj r10 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r10 = (defpackage.oul) r10     // Catch:{ all -> 0x08f5 }
            int r10 = r10.j     // Catch:{ all -> 0x08f5 }
            int r10 = defpackage.oug.a(r10)     // Catch:{ all -> 0x08f5 }
            if (r10 != 0) goto L_0x02cf
            goto L_0x0328
        L_0x02cf:
            if (r10 != r9) goto L_0x0328
            boolean r10 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r10 != 0) goto L_0x02d6
            goto L_0x02db
        L_0x02d6:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x02db:
            aucj r10 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r10 = (defpackage.oul) r10     // Catch:{ all -> 0x08f5 }
            r11 = 3
            r10.j = r11     // Catch:{ all -> 0x08f5 }
            int r11 = r10.a     // Catch:{ all -> 0x08f5 }
            r11 = r11 | 64
            r10.a = r11     // Catch:{ all -> 0x08f5 }
            ovh r10 = defpackage.ovh.b     // Catch:{ all -> 0x08f5 }
            aucd r10 = r10.o()     // Catch:{ all -> 0x08f5 }
            agvx r11 = defpackage.ozx.cj     // Catch:{ all -> 0x08f5 }
            java.lang.Object r11 = r11.c()     // Catch:{ all -> 0x08f5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x08f5 }
            boolean r14 = r10.c     // Catch:{ all -> 0x08f5 }
            if (r14 != 0) goto L_0x02fb
            goto L_0x0300
        L_0x02fb:
            r10.c()     // Catch:{ all -> 0x08f5 }
            r10.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x0300:
            aucj r14 = r10.b     // Catch:{ all -> 0x08f5 }
            ovh r14 = (defpackage.ovh) r14     // Catch:{ all -> 0x08f5 }
            r11.getClass()     // Catch:{ all -> 0x08f5 }
            r14.a = r11     // Catch:{ all -> 0x08f5 }
            aucj r10 = r10.i()     // Catch:{ all -> 0x08f5 }
            ovh r10 = (defpackage.ovh) r10     // Catch:{ all -> 0x08f5 }
            boolean r11 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r11 != 0) goto L_0x0314
            goto L_0x0319
        L_0x0314:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x0319:
            aucj r11 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r11 = (defpackage.oul) r11     // Catch:{ all -> 0x08f5 }
            r10.getClass()     // Catch:{ all -> 0x08f5 }
            r11.s = r10     // Catch:{ all -> 0x08f5 }
            int r10 = r11.a     // Catch:{ all -> 0x08f5 }
            r10 = r10 | 16384(0x4000, float:2.2959E-41)
            r11.a = r10     // Catch:{ all -> 0x08f5 }
        L_0x0328:
            int r10 = r5.n     // Catch:{ all -> 0x08f5 }
            boolean r11 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r11 != 0) goto L_0x032f
            goto L_0x0334
        L_0x032f:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x0334:
            aucj r11 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r11 = (defpackage.oul) r11     // Catch:{ all -> 0x08f5 }
            int r14 = r11.a     // Catch:{ all -> 0x08f5 }
            r17 = 65536(0x10000, float:9.18355E-41)
            r14 = r14 | r17
            r11.a = r14     // Catch:{ all -> 0x08f5 }
            r11.u = r10     // Catch:{ all -> 0x08f5 }
            boolean r10 = r5.g     // Catch:{ all -> 0x08f5 }
            r14 = r14 | 128(0x80, float:1.794E-43)
            r11.a = r14     // Catch:{ all -> 0x08f5 }
            r11.k = r10     // Catch:{ all -> 0x08f5 }
            boolean r10 = defpackage.pba.d()     // Catch:{ all -> 0x08f5 }
            if (r10 == 0) goto L_0x0351
            goto L_0x036a
        L_0x0351:
            boolean r10 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r10 != 0) goto L_0x0356
            goto L_0x035b
        L_0x0356:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r6.c = r12     // Catch:{ all -> 0x08f5 }
        L_0x035b:
            aucj r10 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r10 = (defpackage.oul) r10     // Catch:{ all -> 0x08f5 }
            int r11 = r10.a     // Catch:{ all -> 0x08f5 }
            r11 = r11 | r17
            r10.a = r11     // Catch:{ all -> 0x08f5 }
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10.u = r11     // Catch:{ all -> 0x08f5 }
        L_0x036a:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x08f5 }
            r10.<init>()     // Catch:{ all -> 0x08f5 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x08f5 }
            r11.<init>()     // Catch:{ all -> 0x08f5 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x08f5 }
            r14.<init>()     // Catch:{ all -> 0x08f5 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x08f5 }
            r13.<init>()     // Catch:{ all -> 0x08f5 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x08f5 }
        L_0x0382:
            boolean r18 = r15.hasNext()     // Catch:{ all -> 0x08f5 }
            if (r18 == 0) goto L_0x04cf
            java.lang.Object r18 = r15.next()     // Catch:{ all -> 0x08f5 }
            r9 = r18
            osz r9 = (defpackage.osz) r9     // Catch:{ all -> 0x08f5 }
            boolean r12 = r5.g     // Catch:{ all -> 0x08f5 }
            if (r12 == 0) goto L_0x03a2
            java.util.Map r12 = defpackage.ozq.c((defpackage.osz) r9)     // Catch:{ all -> 0x08f5 }
            boolean r19 = r12.isEmpty()     // Catch:{ all -> 0x08f5 }
            if (r19 != 0) goto L_0x039f
            goto L_0x03a6
        L_0x039f:
            r9 = 2
            r12 = 0
            goto L_0x0382
        L_0x03a2:
            java.util.Map r12 = defpackage.ozq.b((defpackage.osz) r9)     // Catch:{ all -> 0x08f5 }
        L_0x03a6:
            ouc r19 = defpackage.ouc.g     // Catch:{ all -> 0x08f5 }
            r20 = r15
            aucd r15 = r19.o()     // Catch:{ all -> 0x08f5 }
            int r3 = r9.b     // Catch:{ all -> 0x08f5 }
            r19 = r8
            boolean r8 = r15.c     // Catch:{ all -> 0x08f5 }
            if (r8 != 0) goto L_0x03b7
            goto L_0x03bd
        L_0x03b7:
            r15.c()     // Catch:{ all -> 0x08f5 }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x08f5 }
        L_0x03bd:
            aucj r8 = r15.b     // Catch:{ all -> 0x08f5 }
            ouc r8 = (defpackage.ouc) r8     // Catch:{ all -> 0x08f5 }
            int r4 = r8.a     // Catch:{ all -> 0x08f5 }
            r16 = 1
            r4 = r4 | 1
            r8.a = r4     // Catch:{ all -> 0x08f5 }
            r8.b = r3     // Catch:{ all -> 0x08f5 }
            aucx r3 = r9.j     // Catch:{ all -> 0x08f5 }
            int r3 = defpackage.pxr.a(r3)     // Catch:{ all -> 0x08f5 }
            java.util.Set r4 = r12.entrySet()     // Catch:{ all -> 0x08f5 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x08f5 }
        L_0x03d9:
            boolean r8 = r4.hasNext()     // Catch:{ all -> 0x08f5 }
            if (r8 == 0) goto L_0x044d
            java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x08f5 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x08f5 }
            java.lang.Object r21 = r8.getValue()     // Catch:{ all -> 0x08f5 }
            r22 = r4
            r4 = r21
            ozm r4 = (defpackage.ozm) r4     // Catch:{ all -> 0x08f5 }
            oui r21 = defpackage.oui.d     // Catch:{ all -> 0x08f5 }
            r23 = r2
            aucd r2 = r21.o()     // Catch:{ all -> 0x08f5 }
            java.lang.Object r8 = r8.getKey()     // Catch:{ all -> 0x08f5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x08f5 }
            boolean r1 = r2.c     // Catch:{ all -> 0x08f5 }
            if (r1 != 0) goto L_0x0402
            goto L_0x0408
        L_0x0402:
            r2.c()     // Catch:{ all -> 0x08f5 }
            r1 = 0
            r2.c = r1     // Catch:{ all -> 0x08f5 }
        L_0x0408:
            aucj r1 = r2.b     // Catch:{ all -> 0x08f5 }
            oui r1 = (defpackage.oui) r1     // Catch:{ all -> 0x08f5 }
            r8.getClass()     // Catch:{ all -> 0x08f5 }
            r21 = r14
            int r14 = r1.a     // Catch:{ all -> 0x08f5 }
            r16 = 1
            r14 = r14 | 1
            r1.a = r14     // Catch:{ all -> 0x08f5 }
            r1.b = r8     // Catch:{ all -> 0x08f5 }
            int r8 = r4.a     // Catch:{ all -> 0x08f5 }
            r14 = r14 | 2
            r1.a = r14     // Catch:{ all -> 0x08f5 }
            r1.c = r8     // Catch:{ all -> 0x08f5 }
            aucj r1 = r2.i()     // Catch:{ all -> 0x08f5 }
            oui r1 = (defpackage.oui) r1     // Catch:{ all -> 0x08f5 }
            r13.add(r1)     // Catch:{ all -> 0x08f5 }
            int r1 = r4.a     // Catch:{ all -> 0x08f5 }
            oqy r2 = r4.b     // Catch:{ all -> 0x08f5 }
            boolean r4 = r5.g     // Catch:{ all -> 0x08f5 }
            ouk r1 = defpackage.pxr.a(r9, r1, r2, r3, r4)     // Catch:{ all -> 0x08f5 }
            if (r1 == 0) goto L_0x0444
            r11.add(r1)     // Catch:{ all -> 0x08f5 }
            r1 = r40
            r14 = r21
            r4 = r22
            r2 = r23
            goto L_0x03d9
        L_0x0444:
            r1 = r40
            r14 = r21
            r4 = r22
            r2 = r23
            goto L_0x03d9
        L_0x044d:
            r23 = r2
            r21 = r14
            java.util.List r1 = r5.c     // Catch:{ all -> 0x08f5 }
            if (r1 == 0) goto L_0x04b4
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x08f5 }
            r1.<init>()     // Catch:{ all -> 0x08f5 }
            java.util.List r2 = r5.c     // Catch:{ all -> 0x08f5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x08f5 }
        L_0x0460:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x08f5 }
            if (r3 == 0) goto L_0x04b1
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x08f5 }
            com.google.android.gms.appdatasearch.Section r3 = (com.google.android.gms.appdatasearch.Section) r3     // Catch:{ all -> 0x08f5 }
            java.lang.String r4 = r3.a     // Catch:{ all -> 0x08f5 }
            java.lang.Object r4 = r12.get(r4)     // Catch:{ all -> 0x08f5 }
            ozm r4 = (defpackage.ozm) r4     // Catch:{ all -> 0x08f5 }
            if (r4 == 0) goto L_0x0460
            ouj r8 = defpackage.ouj.e     // Catch:{ all -> 0x08f5 }
            aucd r8 = r8.o()     // Catch:{ all -> 0x08f5 }
            int r4 = r4.a     // Catch:{ all -> 0x08f5 }
            boolean r9 = r8.c     // Catch:{ all -> 0x08f5 }
            if (r9 != 0) goto L_0x0483
            goto L_0x0489
        L_0x0483:
            r8.c()     // Catch:{ all -> 0x08f5 }
            r9 = 0
            r8.c = r9     // Catch:{ all -> 0x08f5 }
        L_0x0489:
            aucj r9 = r8.b     // Catch:{ all -> 0x08f5 }
            ouj r9 = (defpackage.ouj) r9     // Catch:{ all -> 0x08f5 }
            int r14 = r9.a     // Catch:{ all -> 0x08f5 }
            r16 = 1
            r14 = r14 | 1
            r9.a = r14     // Catch:{ all -> 0x08f5 }
            r9.b = r4     // Catch:{ all -> 0x08f5 }
            boolean r4 = r3.b     // Catch:{ all -> 0x08f5 }
            r14 = r14 | 2
            r9.a = r14     // Catch:{ all -> 0x08f5 }
            r9.c = r4     // Catch:{ all -> 0x08f5 }
            int r3 = r3.c     // Catch:{ all -> 0x08f5 }
            r4 = r14 | 8
            r9.a = r4     // Catch:{ all -> 0x08f5 }
            r9.d = r3     // Catch:{ all -> 0x08f5 }
            aucj r3 = r8.i()     // Catch:{ all -> 0x08f5 }
            ouj r3 = (defpackage.ouj) r3     // Catch:{ all -> 0x08f5 }
            r1.add(r3)     // Catch:{ all -> 0x08f5 }
            goto L_0x0460
        L_0x04b1:
            r15.Q(r1)     // Catch:{ all -> 0x08f5 }
        L_0x04b4:
            aucj r1 = r15.i()     // Catch:{ all -> 0x08f5 }
            ouc r1 = (defpackage.ouc) r1     // Catch:{ all -> 0x08f5 }
            r10.add(r1)     // Catch:{ all -> 0x08f5 }
            r1 = r40
            r3 = r42
            r4 = r43
            r8 = r19
            r15 = r20
            r14 = r21
            r2 = r23
            r9 = 2
            r12 = 0
            goto L_0x0382
        L_0x04cf:
            r23 = r2
            r19 = r8
            r21 = r14
            boolean r1 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r1 != 0) goto L_0x04da
            goto L_0x04e0
        L_0x04da:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r1 = 0
            r6.c = r1     // Catch:{ all -> 0x08f5 }
        L_0x04e0:
            aucj r1 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r1 = (defpackage.oul) r1     // Catch:{ all -> 0x08f5 }
            r1.a()     // Catch:{ all -> 0x08f5 }
            aucx r1 = r1.b     // Catch:{ all -> 0x08f5 }
            defpackage.auab.a((java.lang.Iterable) r10, (java.util.List) r1)     // Catch:{ all -> 0x08f5 }
            r6.N(r11)     // Catch:{ all -> 0x08f5 }
            r6.M(r13)     // Catch:{ all -> 0x08f5 }
            boolean r1 = r6.c     // Catch:{ all -> 0x08f5 }
            if (r1 != 0) goto L_0x04f7
            goto L_0x04fd
        L_0x04f7:
            r6.c()     // Catch:{ all -> 0x08f5 }
            r1 = 0
            r6.c = r1     // Catch:{ all -> 0x08f5 }
        L_0x04fd:
            aucj r1 = r6.b     // Catch:{ all -> 0x08f5 }
            oul r1 = (defpackage.oul) r1     // Catch:{ all -> 0x08f5 }
            aucx r2 = r1.t     // Catch:{ all -> 0x08f5 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x08f5 }
            if (r2 == 0) goto L_0x050a
            goto L_0x0512
        L_0x050a:
            aucx r2 = r1.t     // Catch:{ all -> 0x08f5 }
            aucx r2 = defpackage.aucj.a((defpackage.aucx) r2)     // Catch:{ all -> 0x08f5 }
            r1.t = r2     // Catch:{ all -> 0x08f5 }
        L_0x0512:
            aucx r1 = r1.t     // Catch:{ all -> 0x08f5 }
            r2 = r21
            defpackage.auab.a((java.lang.Iterable) r2, (java.util.List) r1)     // Catch:{ all -> 0x08f5 }
            java.util.List r1 = r5.b     // Catch:{ all -> 0x08f5 }
            if (r1 != 0) goto L_0x051e
            goto L_0x0521
        L_0x051e:
            r6.P(r1)     // Catch:{ all -> 0x08f5 }
        L_0x0521:
            r43.e()     // Catch:{ all -> 0x08f5 }
            r1 = r40
            com.google.android.gms.icing.nativeindex.NativeIndex r2 = r1.n     // Catch:{ all -> 0x08f5 }
            r3 = r23
            java.lang.String r4 = r3.a     // Catch:{ all -> 0x08f5 }
            aucj r8 = r6.i()     // Catch:{ all -> 0x08f5 }
            oul r8 = (defpackage.oul) r8     // Catch:{ all -> 0x08f5 }
            int r9 = r3.d     // Catch:{ all -> 0x08f5 }
            int r10 = r3.e     // Catch:{ all -> 0x08f5 }
            oup r2 = r2.a(r4, r8, r9, r10)     // Catch:{ all -> 0x08f5 }
            r43.f()     // Catch:{ all -> 0x08f5 }
            otv r4 = r2.l     // Catch:{ all -> 0x08f5 }
            if (r4 == 0) goto L_0x0542
            goto L_0x0544
        L_0x0542:
            otv r4 = defpackage.otv.c     // Catch:{ all -> 0x08f5 }
        L_0x0544:
            r8 = r43
            r8.a((defpackage.otv) r4)     // Catch:{ all -> 0x08f5 }
            int r4 = r2.m     // Catch:{ all -> 0x08f5 }
            int r4 = defpackage.aonf.b(r4)     // Catch:{ all -> 0x08f5 }
            if (r4 != 0) goto L_0x0552
            goto L_0x0577
        L_0x0552:
            r9 = 2
            if (r4 == r9) goto L_0x0577
            int r4 = r2.m     // Catch:{ all -> 0x08f5 }
            int r4 = defpackage.aonf.b(r4)     // Catch:{ all -> 0x08f5 }
            if (r4 != 0) goto L_0x055e
            goto L_0x0561
        L_0x055e:
            r9 = 3
            if (r4 == r9) goto L_0x0577
        L_0x0561:
            int r1 = r2.m     // Catch:{ all -> 0x08f5 }
            int r1 = defpackage.aonf.b(r1)     // Catch:{ all -> 0x08f5 }
            if (r1 == 0) goto L_0x056b
            r9 = r1
            goto L_0x056c
        L_0x056b:
            r9 = 2
        L_0x056c:
            com.google.android.gms.appdatasearch.SearchResults r1 = new com.google.android.gms.appdatasearch.SearchResults     // Catch:{ all -> 0x08f5 }
            java.lang.String r2 = defpackage.dtu.a((int) r9)     // Catch:{ all -> 0x08f5 }
            r1.<init>(r2)     // Catch:{ all -> 0x08f5 }
            monitor-exit(r7)     // Catch:{ all -> 0x08f5 }
            return r1
        L_0x0577:
            aucj r4 = r6.i()     // Catch:{ all -> 0x08f5 }
            oul r4 = (defpackage.oul) r4     // Catch:{ all -> 0x08f5 }
            boolean r6 = r5.g     // Catch:{ all -> 0x08f5 }
            aucx r9 = r4.b     // Catch:{ all -> 0x08f5 }
            int r9 = r9.size()     // Catch:{ all -> 0x08f5 }
            android.os.Bundle[] r10 = new android.os.Bundle[r9]     // Catch:{ all -> 0x08f5 }
            android.os.Bundle[] r11 = new android.os.Bundle[r9]     // Catch:{ all -> 0x08f5 }
            android.os.Bundle[] r12 = new android.os.Bundle[r9]     // Catch:{ all -> 0x08f5 }
            android.os.Bundle[] r13 = new android.os.Bundle[r9]     // Catch:{ all -> 0x08f5 }
            android.util.SparseIntArray r14 = new android.util.SparseIntArray     // Catch:{ all -> 0x08f5 }
            r14.<init>(r9)     // Catch:{ all -> 0x08f5 }
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ all -> 0x08f5 }
            int r20 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x08f5 }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x08f5 }
            r1.<init>()     // Catch:{ all -> 0x08f5 }
            r38 = r5
            android.os.UserHandle[] r5 = new android.os.UserHandle[r9]     // Catch:{ all -> 0x08f5 }
            r39 = r3
            android.os.UserHandle r3 = defpackage.dtu.a()     // Catch:{ all -> 0x08f5 }
            r8 = 0
            java.util.Arrays.fill(r5, r8, r9, r3)     // Catch:{ all -> 0x08f5 }
            java.lang.String r3 = "USER_HANDLE_ARRAYS_KEY"
            r1.putParcelableArray(r3, r5)     // Catch:{ all -> 0x08f5 }
            r3 = 0
            r5 = 0
        L_0x05b0:
            if (r3 >= r9) goto L_0x0707
            aucx r8 = r4.b     // Catch:{ all -> 0x08f5 }
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x08f5 }
            ouc r8 = (defpackage.ouc) r8     // Catch:{ all -> 0x08f5 }
            r20 = r9
            int r9 = r8.b     // Catch:{ all -> 0x08f5 }
            r14.put(r9, r3)     // Catch:{ all -> 0x08f5 }
            int r9 = r8.b     // Catch:{ all -> 0x08f5 }
            r31 = r1
            r1 = r19
            java.lang.Object r9 = r1.get(r9)     // Catch:{ all -> 0x08f5 }
            osz r9 = (defpackage.osz) r9     // Catch:{ all -> 0x08f5 }
            r19 = r1
            java.lang.String r1 = r9.e     // Catch:{ all -> 0x08f5 }
            r21 = r5
            java.lang.String r5 = r9.c     // Catch:{ all -> 0x08f5 }
            java.lang.String r22 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x08f5 }
            int r22 = r22.length()     // Catch:{ all -> 0x08f5 }
            java.lang.String r23 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x08f5 }
            int r23 = r23.length()     // Catch:{ all -> 0x08f5 }
            r24 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x08f5 }
            r16 = 1
            int r22 = r22 + 1
            r25 = r4
            int r4 = r22 + r23
            r14.<init>(r4)     // Catch:{ all -> 0x08f5 }
            r14.append(r1)     // Catch:{ all -> 0x08f5 }
            java.lang.String r1 = "-"
            r14.append(r1)     // Catch:{ all -> 0x08f5 }
            r14.append(r5)     // Catch:{ all -> 0x08f5 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x08f5 }
            r15[r3] = r1     // Catch:{ all -> 0x08f5 }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x08f5 }
            r1.<init>()     // Catch:{ all -> 0x08f5 }
            r11[r3] = r1     // Catch:{ all -> 0x08f5 }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x08f5 }
            r1.<init>()     // Catch:{ all -> 0x08f5 }
            r12[r3] = r1     // Catch:{ all -> 0x08f5 }
            aucx r1 = r2.d     // Catch:{ all -> 0x08f5 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x08f5 }
            ouo r1 = (defpackage.ouo) r1     // Catch:{ all -> 0x08f5 }
            r5 = r21
            r4 = 0
        L_0x061e:
            aucx r14 = r8.c     // Catch:{ all -> 0x08f5 }
            int r14 = r14.size()     // Catch:{ all -> 0x08f5 }
            if (r4 >= r14) goto L_0x06a5
            aucx r14 = r8.c     // Catch:{ all -> 0x08f5 }
            java.lang.Object r14 = r14.get(r4)     // Catch:{ all -> 0x08f5 }
            ouj r14 = (defpackage.ouj) r14     // Catch:{ all -> 0x08f5 }
            r21 = r5
            aucx r5 = r1.a     // Catch:{ all -> 0x08f5 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x08f5 }
            oum r5 = (defpackage.oum) r5     // Catch:{ all -> 0x08f5 }
            if (r6 == 0) goto L_0x0651
            r22 = r6
            java.lang.String r6 = r9.q     // Catch:{ all -> 0x08f5 }
            int r14 = r14.b     // Catch:{ all -> 0x08f5 }
            r23 = r8
            aucx r8 = r9.j     // Catch:{ all -> 0x08f5 }
            java.lang.Object r8 = r8.get(r14)     // Catch:{ all -> 0x08f5 }
            oqy r8 = (defpackage.oqy) r8     // Catch:{ all -> 0x08f5 }
            java.lang.String r8 = r8.m     // Catch:{ all -> 0x08f5 }
            java.lang.String r6 = com.google.android.gms.appdatasearch.Section.a(r6, r8)     // Catch:{ all -> 0x08f5 }
            goto L_0x0661
        L_0x0651:
            r22 = r6
            r23 = r8
            int r6 = r14.b     // Catch:{ all -> 0x08f5 }
            aucx r8 = r9.j     // Catch:{ all -> 0x08f5 }
            java.lang.Object r6 = r8.get(r6)     // Catch:{ all -> 0x08f5 }
            oqy r6 = (defpackage.oqy) r6     // Catch:{ all -> 0x08f5 }
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x08f5 }
        L_0x0661:
            aucs r8 = r5.a     // Catch:{ all -> 0x08f5 }
            int r8 = r8.size()     // Catch:{ all -> 0x08f5 }
            if (r8 != 0) goto L_0x066a
            goto L_0x0675
        L_0x066a:
            r8 = r11[r3]     // Catch:{ all -> 0x08f5 }
            aucs r14 = r5.a     // Catch:{ all -> 0x08f5 }
            int[] r14 = defpackage.aoog.a((java.util.Collection) r14)     // Catch:{ all -> 0x08f5 }
            r8.putIntArray(r6, r14)     // Catch:{ all -> 0x08f5 }
        L_0x0675:
            r8 = r12[r3]     // Catch:{ all -> 0x08f5 }
            auay r14 = r5.b     // Catch:{ all -> 0x08f5 }
            byte[] r14 = r14.k()     // Catch:{ all -> 0x08f5 }
            r8.putByteArray(r6, r14)     // Catch:{ all -> 0x08f5 }
            byte[] r5 = defpackage.dtu.a((defpackage.oum) r5)     // Catch:{ all -> 0x08f5 }
            if (r5 != 0) goto L_0x0689
            r5 = r21
            goto L_0x069d
        L_0x0689:
            r8 = r13[r3]     // Catch:{ all -> 0x08f5 }
            if (r8 != 0) goto L_0x0697
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x08f5 }
            r8.<init>()     // Catch:{ all -> 0x08f5 }
            r13[r3] = r8     // Catch:{ all -> 0x08f5 }
            r21 = 1
            goto L_0x0698
        L_0x0697:
        L_0x0698:
            r8.putByteArray(r6, r5)     // Catch:{ all -> 0x08f5 }
            r5 = r21
        L_0x069d:
            int r4 = r4 + 1
            r6 = r22
            r8 = r23
            goto L_0x061e
        L_0x06a5:
            r21 = r5
            r22 = r6
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x08f5 }
            r4.<init>()     // Catch:{ all -> 0x08f5 }
            r10[r3] = r4     // Catch:{ all -> 0x08f5 }
            r4 = 0
        L_0x06b1:
            r5 = r25
            aucx r6 = r5.e     // Catch:{ all -> 0x08f5 }
            int r6 = r6.size()     // Catch:{ all -> 0x08f5 }
            if (r4 >= r6) goto L_0x06f8
            aucx r6 = r5.e     // Catch:{ all -> 0x08f5 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x08f5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x08f5 }
            aucx r8 = r1.b     // Catch:{ all -> 0x08f5 }
            java.lang.Object r8 = r8.get(r4)     // Catch:{ all -> 0x08f5 }
            oun r8 = (defpackage.oun) r8     // Catch:{ all -> 0x08f5 }
            auay r9 = r8.a     // Catch:{ all -> 0x08f5 }
            int r9 = r9.a()     // Catch:{ all -> 0x08f5 }
            boolean[] r14 = new boolean[r9]     // Catch:{ all -> 0x08f5 }
            r23 = r1
            r1 = 0
        L_0x06d6:
            if (r1 >= r9) goto L_0x06ec
            r25 = r9
            auay r9 = r8.a     // Catch:{ all -> 0x08f5 }
            byte r9 = r9.a((int) r1)     // Catch:{ all -> 0x08f5 }
            if (r9 == 0) goto L_0x06e4
            r9 = 1
            goto L_0x06e5
        L_0x06e4:
            r9 = 0
        L_0x06e5:
            r14[r1] = r9     // Catch:{ all -> 0x08f5 }
            int r1 = r1 + 1
            r9 = r25
            goto L_0x06d6
        L_0x06ec:
            r1 = r10[r3]     // Catch:{ all -> 0x08f5 }
            r1.putBooleanArray(r6, r14)     // Catch:{ all -> 0x08f5 }
            int r4 = r4 + 1
            r25 = r5
            r1 = r23
            goto L_0x06b1
        L_0x06f8:
            int r3 = r3 + 1
            r4 = r5
            r9 = r20
            r5 = r21
            r6 = r22
            r14 = r24
            r1 = r31
            goto L_0x05b0
        L_0x0707:
            r31 = r1
            r21 = r5
            r24 = r14
            r5 = r4
            aucs r1 = r2.c     // Catch:{ all -> 0x08f5 }
            int r1 = r1.size()     // Catch:{ all -> 0x08f5 }
            int[] r1 = new int[r1]     // Catch:{ all -> 0x08f5 }
            r3 = 0
        L_0x0717:
            int r4 = r2.b     // Catch:{ all -> 0x08f5 }
            if (r3 >= r4) goto L_0x072e
            aucs r4 = r2.c     // Catch:{ all -> 0x08f5 }
            int r4 = r4.c(r3)     // Catch:{ all -> 0x08f5 }
            r6 = r24
            int r4 = r6.get(r4)     // Catch:{ all -> 0x08f5 }
            r1[r3] = r4     // Catch:{ all -> 0x08f5 }
            int r3 = r3 + 1
            r24 = r6
            goto L_0x0717
        L_0x072e:
            boolean r3 = r5.f     // Catch:{ all -> 0x08f5 }
            if (r3 == 0) goto L_0x073b
            aucs r3 = r2.f     // Catch:{ all -> 0x08f5 }
            int[] r3 = defpackage.aoog.a((java.util.Collection) r3)     // Catch:{ all -> 0x08f5 }
            r24 = r3
            goto L_0x073d
        L_0x073b:
            r24 = 0
        L_0x073d:
            boolean r3 = r5.f     // Catch:{ all -> 0x08f5 }
            if (r3 == 0) goto L_0x074a
            auay r3 = r2.g     // Catch:{ all -> 0x08f5 }
            byte[] r3 = r3.k()     // Catch:{ all -> 0x08f5 }
            r25 = r3
            goto L_0x074c
        L_0x074a:
            r25 = 0
        L_0x074c:
            int r3 = r2.a     // Catch:{ all -> 0x08f5 }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x0760
            ouq r3 = r2.h     // Catch:{ all -> 0x08f5 }
            if (r3 == 0) goto L_0x0757
            goto L_0x0759
        L_0x0757:
            ouq r3 = defpackage.ouq.a     // Catch:{ all -> 0x08f5 }
        L_0x0759:
            byte[] r3 = r3.k()     // Catch:{ all -> 0x08f5 }
            r29 = r3
            goto L_0x0762
        L_0x0760:
            r29 = 0
        L_0x0762:
            int r3 = r2.b     // Catch:{ all -> 0x08f5 }
            if (r3 <= 0) goto L_0x0772
            aucn r3 = r2.i     // Catch:{ all -> 0x08f5 }
            int r3 = r3.size()     // Catch:{ all -> 0x08f5 }
            if (r3 == 0) goto L_0x076f
            goto L_0x0772
        L_0x076f:
            r30 = 0
            goto L_0x077a
        L_0x0772:
            aucn r3 = r2.i     // Catch:{ all -> 0x08f5 }
            double[] r3 = defpackage.aooc.a((java.util.Collection) r3)     // Catch:{ all -> 0x08f5 }
            r30 = r3
        L_0x077a:
            int r3 = r2.b     // Catch:{ all -> 0x08f5 }
            long[] r5 = new long[r3]     // Catch:{ all -> 0x08f5 }
            long[] r3 = new long[r3]     // Catch:{ all -> 0x08f5 }
            r6 = 0
        L_0x0781:
            int r8 = r2.b     // Catch:{ all -> 0x08f5 }
            if (r6 >= r8) goto L_0x07aa
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x08f5 }
            aucs r9 = r2.j     // Catch:{ all -> 0x08f5 }
            int r9 = r9.c(r6)     // Catch:{ all -> 0x08f5 }
            r19 = r5
            long r4 = (long) r9     // Catch:{ all -> 0x08f5 }
            long r4 = r8.toMillis(r4)     // Catch:{ all -> 0x08f5 }
            r19[r6] = r4     // Catch:{ all -> 0x08f5 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x08f5 }
            aucs r5 = r2.k     // Catch:{ all -> 0x08f5 }
            int r5 = r5.c(r6)     // Catch:{ all -> 0x08f5 }
            long r8 = (long) r5     // Catch:{ all -> 0x08f5 }
            long r4 = r4.toMillis(r8)     // Catch:{ all -> 0x08f5 }
            r3[r6] = r4     // Catch:{ all -> 0x08f5 }
            int r6 = r6 + 1
            r5 = r19
            goto L_0x0781
        L_0x07aa:
            r19 = r5
            if (r21 != 0) goto L_0x07b1
            r35 = 0
            goto L_0x07b3
        L_0x07b1:
            r35 = r13
        L_0x07b3:
            com.google.android.gms.appdatasearch.SearchResults r4 = new com.google.android.gms.appdatasearch.SearchResults     // Catch:{ all -> 0x08f5 }
            int r5 = r2.e     // Catch:{ all -> 0x08f5 }
            aucs r6 = r2.o     // Catch:{ all -> 0x08f5 }
            int[] r36 = defpackage.aoog.a((java.util.Collection) r6)     // Catch:{ all -> 0x08f5 }
            auay r6 = r2.p     // Catch:{ all -> 0x08f5 }
            byte[] r37 = r6.k()     // Catch:{ all -> 0x08f5 }
            r20 = r4
            r21 = r8
            r22 = r1
            r23 = r15
            r26 = r10
            r27 = r11
            r28 = r12
            r32 = r5
            r33 = r19
            r34 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x08f5 }
            java.lang.String[] r1 = r4.i     // Catch:{ all -> 0x08f5 }
            r3 = r43
            r3.a((java.lang.String[]) r1)     // Catch:{ all -> 0x08f5 }
            r5 = r39
            int r1 = r5.e     // Catch:{ all -> 0x08f5 }
            r3.b = r1     // Catch:{ all -> 0x08f5 }
            int r1 = r2.b     // Catch:{ all -> 0x08f5 }
            r3.c = r1     // Catch:{ all -> 0x08f5 }
            int r1 = r2.e     // Catch:{ all -> 0x08f5 }
            r3.d = r1     // Catch:{ all -> 0x08f5 }
            java.lang.String[] r1 = r5.c     // Catch:{ all -> 0x08f5 }
            if (r1 == 0) goto L_0x07f5
            int r13 = r1.length     // Catch:{ all -> 0x08f5 }
            goto L_0x07f6
        L_0x07f5:
            r13 = -1
        L_0x07f6:
            r3.e = r13     // Catch:{ all -> 0x08f5 }
            if (r38 == 0) goto L_0x07ff
            r1 = r38
            boolean r6 = r1.d     // Catch:{ all -> 0x08f5 }
            goto L_0x0802
        L_0x07ff:
            r1 = r38
            r6 = 1
        L_0x0802:
            r3.f = r6     // Catch:{ all -> 0x08f5 }
            if (r1 == 0) goto L_0x0809
            boolean r6 = r1.i     // Catch:{ all -> 0x08f5 }
            goto L_0x080a
        L_0x0809:
            r6 = 1
        L_0x080a:
            r3.g = r6     // Catch:{ all -> 0x08f5 }
            if (r1 == 0) goto L_0x0812
            java.lang.String r1 = r1.m     // Catch:{ all -> 0x08f5 }
            r14 = r1
            goto L_0x0813
        L_0x0812:
            r14 = 0
        L_0x0813:
            r3.h = r14     // Catch:{ all -> 0x08f5 }
            int r1 = r2.m     // Catch:{ all -> 0x08f5 }
            int r1 = defpackage.aonf.b(r1)     // Catch:{ all -> 0x08f5 }
            if (r1 == 0) goto L_0x081e
            goto L_0x081f
        L_0x081e:
            r1 = 2
        L_0x081f:
            r3.i = r1     // Catch:{ all -> 0x08f5 }
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x08f5 }
            int r6 = r2.b     // Catch:{ all -> 0x08f5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x08f5 }
            r8 = 0
            r1[r8] = r6     // Catch:{ all -> 0x08f5 }
            int r6 = r2.e     // Catch:{ all -> 0x08f5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x08f5 }
            r8 = 1
            r1[r8] = r6     // Catch:{ all -> 0x08f5 }
            java.lang.String r2 = r2.n     // Catch:{ all -> 0x08f5 }
            r6 = 2
            r1[r6] = r2     // Catch:{ all -> 0x08f5 }
            java.lang.String r2 = "Response numResults: %d, numScored %d, error message: '%s'"
            defpackage.oso.b((java.lang.String) r2, (java.lang.Object[]) r1)     // Catch:{ all -> 0x08f5 }
            boolean r1 = a((com.google.android.gms.search.queries.QueryCall$Request) r5)     // Catch:{ all -> 0x08f5 }
            if (r1 != 0) goto L_0x0847
            goto L_0x0856
        L_0x0847:
            if (r44 == 0) goto L_0x0856
            java.lang.String r1 = r5.a     // Catch:{ all -> 0x08f5 }
            r2 = r42
            java.lang.String r6 = r2.f     // Catch:{ all -> 0x08f5 }
            java.lang.String r2 = r2.g     // Catch:{ all -> 0x08f5 }
            android.os.Bundle r8 = r5.g     // Catch:{ all -> 0x08f5 }
            r3.a(r1, r6, r2, r8)     // Catch:{ all -> 0x08f5 }
        L_0x0856:
            r1 = r40
            pxo r2 = r1.y     // Catch:{ all -> 0x08f5 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x08f5 }
            if (r2 == 0) goto L_0x08d8
            pxo r1 = r1.y     // Catch:{ all -> 0x08f5 }
            otz r2 = defpackage.otz.d     // Catch:{ all -> 0x08f5 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x08f5 }
            byte[] r3 = defpackage.pxo.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r5)     // Catch:{ all -> 0x08f5 }
            auay r3 = defpackage.auay.a((byte[]) r3)     // Catch:{ all -> 0x08f5 }
            boolean r5 = r2.c     // Catch:{ all -> 0x08f5 }
            if (r5 != 0) goto L_0x0875
            goto L_0x087b
        L_0x0875:
            r2.c()     // Catch:{ all -> 0x08f5 }
            r5 = 0
            r2.c = r5     // Catch:{ all -> 0x08f5 }
        L_0x087b:
            aucj r5 = r2.b     // Catch:{ all -> 0x08f5 }
            otz r5 = (defpackage.otz) r5     // Catch:{ all -> 0x08f5 }
            r3.getClass()     // Catch:{ all -> 0x08f5 }
            int r6 = r5.a     // Catch:{ all -> 0x08f5 }
            r8 = 1
            r6 = r6 | r8
            r5.a = r6     // Catch:{ all -> 0x08f5 }
            r5.b = r3     // Catch:{ all -> 0x08f5 }
            byte[] r3 = defpackage.pxo.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r4)     // Catch:{ all -> 0x08f5 }
            auay r3 = defpackage.auay.a((byte[]) r3)     // Catch:{ all -> 0x08f5 }
            boolean r5 = r2.c     // Catch:{ all -> 0x08f5 }
            if (r5 != 0) goto L_0x0897
            goto L_0x089d
        L_0x0897:
            r2.c()     // Catch:{ all -> 0x08f5 }
            r5 = 0
            r2.c = r5     // Catch:{ all -> 0x08f5 }
        L_0x089d:
            aucj r5 = r2.b     // Catch:{ all -> 0x08f5 }
            otz r5 = (defpackage.otz) r5     // Catch:{ all -> 0x08f5 }
            r3.getClass()     // Catch:{ all -> 0x08f5 }
            int r6 = r5.a     // Catch:{ all -> 0x08f5 }
            r8 = 2
            r6 = r6 | r8
            r5.a = r6     // Catch:{ all -> 0x08f5 }
            r5.c = r3     // Catch:{ all -> 0x08f5 }
            oub r3 = defpackage.oub.c     // Catch:{ all -> 0x08f5 }
            aucd r3 = r3.o()     // Catch:{ all -> 0x08f5 }
            aucj r2 = r2.i()     // Catch:{ all -> 0x08f5 }
            otz r2 = (defpackage.otz) r2     // Catch:{ all -> 0x08f5 }
            boolean r5 = r3.c     // Catch:{ all -> 0x08f5 }
            if (r5 != 0) goto L_0x08bd
            goto L_0x08c3
        L_0x08bd:
            r3.c()     // Catch:{ all -> 0x08f5 }
            r5 = 0
            r3.c = r5     // Catch:{ all -> 0x08f5 }
        L_0x08c3:
            aucj r5 = r3.b     // Catch:{ all -> 0x08f5 }
            oub r5 = (defpackage.oub) r5     // Catch:{ all -> 0x08f5 }
            r2.getClass()     // Catch:{ all -> 0x08f5 }
            r5.b = r2     // Catch:{ all -> 0x08f5 }
            r2 = 2
            r5.a = r2     // Catch:{ all -> 0x08f5 }
            aucj r2 = r3.i()     // Catch:{ all -> 0x08f5 }
            oub r2 = (defpackage.oub) r2     // Catch:{ all -> 0x08f5 }
            r1.a((defpackage.oub) r2)     // Catch:{ all -> 0x08f5 }
        L_0x08d8:
            monitor-exit(r7)     // Catch:{ all -> 0x08f5 }
            return r4
        L_0x08da:
            java.lang.String r1 = "Validating corpus keys failed with message: "
            int r2 = r8.length()     // Catch:{ all -> 0x08f5 }
            if (r2 != 0) goto L_0x08e8
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x08f5 }
            r2.<init>(r1)     // Catch:{ all -> 0x08f5 }
            goto L_0x08ec
        L_0x08e8:
            java.lang.String r2 = r1.concat(r8)     // Catch:{ all -> 0x08f5 }
        L_0x08ec:
            defpackage.oso.a(r2)     // Catch:{ all -> 0x08f5 }
            com.google.android.gms.appdatasearch.SearchResults r1 = defpackage.dtu.b(r8)     // Catch:{ all -> 0x08f5 }
            monitor-exit(r7)     // Catch:{ all -> 0x08f5 }
            return r1
        L_0x08f5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r7)     // Catch:{ all -> 0x08f5 }
            throw r1
        L_0x08f9:
            com.google.android.gms.appdatasearch.SearchResults r1 = defpackage.dtu.b(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aalu.a(osf, com.google.android.gms.search.queries.QueryCall$Request, ozc, pxp, boolean):com.google.android.gms.appdatasearch.SearchResults");
    }

    /* access modifiers changed from: protected */
    public final String f() {
        String str;
        String[] strArr = ((QueryCall$Request) this.n).c;
        if (strArr != null) {
            str = TextUtils.join(",", strArr);
        } else {
            str = "";
        }
        return String.format("%s, query[%s], corpora[%s]", new Object[]{super.f(), ((QueryCall$Request) this.n).a, str});
    }

    private static boolean a(QueryCall$Request queryCall$Request) {
        return queryCall$Request.g != null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        psc psc;
        QuerySpecification querySpecification = ((QueryCall$Request) this.n).f;
        if (!(!axrm.b() || (psc = this.k) == null || querySpecification == null)) {
            psc.a(querySpecification.k);
        }
        QueryCall$Response queryCall$Response = new QueryCall$Response();
        SearchResults a2 = a(this.a, (QueryCall$Request) this.n, this.o, this.b, this.c);
        queryCall$Response.a = a2.a() ? new Status(8, a2.a, (PendingIntent) null) : Status.a;
        queryCall$Response.b = a2;
        queryCall$Response.c = ((QueryCall$Request) this.n).g;
        return queryCall$Response;
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        QueryCall$Response queryCall$Response = new QueryCall$Response();
        queryCall$Response.a = status;
        return queryCall$Response;
    }

    /* access modifiers changed from: protected */
    public final void a(Exception exc) {
        osf osf = this.a;
        QueryCall$Request queryCall$Request = (QueryCall$Request) this.n;
        ozc ozc = this.o;
        pxp pxp = this.b;
        if (this.c) {
            boolean a2 = a(queryCall$Request);
            pxp.a(exc);
            boolean z = false;
            if (a2 && exc != null) {
                z = true;
            }
            if (!a2 || z) {
                aojk a3 = pxp.a(queryCall$Request.a, ozc.f, ozc.g);
                if (((Boolean) ozx.m.c()).booleanValue()) {
                    osf.c.d(new aalt(aonk.LOG_QUERY_STATS, ozc.f, psd.b(osf.b), osf, a3));
                    return;
                }
                osf.r.a(a3);
            }
        }
    }
}
