package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: qjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjv implements qjt {
    static final qjw a = new qjw();
    static final byte[] b = "LastUpdate".getBytes(qfb.b);
    static final byte[] c = "IntentFilterFetchInfo:".getBytes(qfb.b);
    private static final qfn d = new qfn("DomainFilterImpl");
    private static final byte[] f = "pkgMetadata:".getBytes(qfb.b);
    private final qew A;
    private final qew B;
    private final qew C;
    private final Object e = new Object();
    private final Context g;
    private final qiz h;
    private final qei i;
    private final qlc j;
    private final qgy k;
    private final qlg l;
    private final SharedPreferences m;
    private final qex n;
    private final qfa o;
    private final ArrayList p;
    private final Random q;
    private final qew r;
    private final qew s;
    private final qew t;
    private final qew u;
    private final qew v;
    private final qew w;
    private final qew x;
    private final qew y;
    private final qew z;

    public qjv(Context context, qiz qiz, qfa qfa, qei qei, qgy qgy, qlc qlc, qlg qlg, SharedPreferences sharedPreferences, qex qex, Random random) {
        this.g = context;
        this.h = qiz;
        this.i = qei;
        this.o = qfa;
        this.k = qgy;
        this.j = qlc;
        this.l = qlg;
        this.m = sharedPreferences;
        this.n = qex;
        this.p = new ArrayList();
        this.q = random;
        this.r = qex.b("DomainFilter.VerifyIncrementalChangesNoPackageAdded");
        this.s = qex.b("DomainFilter.VerifyIncrementalChangesPackageNotFound");
        this.t = qex.b("DomainFilter.VerifyIncrementalChangesIOExceptionReadingPackage");
        this.u = qex.b("DomainFilter.VerifyIncrementalChangesExceptionParsingEntry");
        this.v = qex.b("DomainFilter.VerifyIncrementalChangesPackageEntryNotEqual");
        this.w = qex.b("DomainFilter.VerifyIncrementalChangesSuccess");
        this.x = qex.b("DomainFilter.VerifyFullChangesNoPackageAdded");
        this.y = qex.b("DomainFilter.VerifyFullChangesPackageNotFound");
        this.z = qex.b("DomainFilter.VerifyFullChangesIOExceptionReadingPackage");
        this.A = qex.b("DomainFilter.VerifyFullChangesExceptionParsingEntry");
        this.B = qex.b("DomainFilter.VerifyFullChangesPackageEntryNotEqual");
        this.C = qex.b("DomainFilter.VerifyFullChangesSuccess");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d9, code lost:
        if (r2 > 0) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fd, code lost:
        if (r1 > 0) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0264, code lost:
        if (r0 != 7) goto L_0x0266;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0537  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(defpackage.qjf r26, defpackage.avwm r27) {
        /*
            r25 = this;
            r8 = r25
            r0 = r26
            qex r1 = r8.n
            qev r9 = r1.a()
            qlc r1 = r8.j
            android.accounts.Account r10 = r1.c()
            r11 = 3
            if (r10 != 0) goto L_0x0019
            java.lang.String r0 = "DomainFilter.NoAccount"
            r9.a(r0)
            return r11
        L_0x0019:
            qlg r1 = r8.l
            int r1 = r1.a()
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "DomainFilter.OptedOut"
            r9.a(r0)
            return r11
        L_0x0027:
            r12 = 0
            byte[] r1 = new byte[r12]
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = r0.b
            java.lang.String r3 = r10.name
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003e
            auay r0 = r0.c
            byte[] r1 = r0.k()
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            qjm r0 = r25.g()
            java.util.Set r0 = a((defpackage.qjm) r0)
            qju r2 = new qju
            qei r3 = r8.i
            r4 = r27
            aorr r1 = r3.a((byte[]) r1, (android.accounts.Account) r10, (defpackage.avwm) r4, (java.util.Collection) r0)
            r2.<init>(r1)
            r13 = 1
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r3 = r10.name
            r1[r12] = r3
            aorr r1 = r2.a     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x04b3 }
            r14 = r1
            araw r14 = (defpackage.araw) r14     // Catch:{ Exception -> 0x04b3 }
            qfn r1 = d     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x04b3 }
            int r3 = r14.U     // Catch:{ Exception -> 0x04b3 }
            r4 = -1
            if (r3 == r4) goto L_0x006e
            goto L_0x007a
        L_0x006e:
            aueh r3 = defpackage.aueh.a     // Catch:{ Exception -> 0x04b3 }
            aueq r3 = r3.a((java.lang.Object) r14)     // Catch:{ Exception -> 0x04b3 }
            int r3 = r3.b(r14)     // Catch:{ Exception -> 0x04b3 }
            r14.U = r3     // Catch:{ Exception -> 0x04b3 }
        L_0x007a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x04b3 }
            r2[r12] = r3     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r3 = "Domain filter response size: %s"
            r1.a(r3, r2)     // Catch:{ Exception -> 0x04b3 }
            qfa r1 = r8.o     // Catch:{ Exception -> 0x04b3 }
            auay r2 = r14.a     // Catch:{ Exception -> 0x04b3 }
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ Exception -> 0x04b3 }
            qez r3 = r1.a()     // Catch:{ Exception -> 0x04b3 }
            avwk r4 = r3.a     // Catch:{ Exception -> 0x04b3 }
            r5 = 5
            java.lang.Object r6 = r4.c(r5)     // Catch:{ Exception -> 0x04b3 }
            aucd r6 = (defpackage.aucd) r6     // Catch:{ Exception -> 0x04b3 }
            r6.a((defpackage.aucj) r4)     // Catch:{ Exception -> 0x04b3 }
            boolean r4 = r6.c     // Catch:{ Exception -> 0x04b3 }
            if (r4 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            r6.c()     // Catch:{ Exception -> 0x04b3 }
            r6.c = r12     // Catch:{ Exception -> 0x04b3 }
        L_0x00a7:
            aucj r4 = r6.b     // Catch:{ Exception -> 0x04b3 }
            avwk r4 = (defpackage.avwk) r4     // Catch:{ Exception -> 0x04b3 }
            avwk r7 = defpackage.avwk.b     // Catch:{ Exception -> 0x04b3 }
            r2.getClass()     // Catch:{ Exception -> 0x04b3 }
            r4.a = r2     // Catch:{ Exception -> 0x04b3 }
            aucj r2 = r6.i()     // Catch:{ Exception -> 0x04b3 }
            avwk r2 = (defpackage.avwk) r2     // Catch:{ Exception -> 0x04b3 }
            r3.a = r2     // Catch:{ Exception -> 0x04b3 }
            android.content.Context r1 = r1.a     // Catch:{ Exception -> 0x04b3 }
            defpackage.qfa.a(r1, r3)     // Catch:{ Exception -> 0x04b3 }
            android.content.SharedPreferences r1 = r8.m     // Catch:{ Exception -> 0x04b3 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x04b3 }
            r1.clear()     // Catch:{ Exception -> 0x04b3 }
            audr r2 = r14.d     // Catch:{ Exception -> 0x04b3 }
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)     // Catch:{ Exception -> 0x04b3 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ Exception -> 0x04b3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x04b3 }
        L_0x00d6:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x04b3 }
            if (r3 == 0) goto L_0x00f2
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x04b3 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x04b3 }
            r1.putString(r4, r3)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x00d6
        L_0x00f2:
            r1.apply()     // Catch:{ Exception -> 0x04b3 }
            int r1 = r14.e     // Catch:{ Exception -> 0x04b3 }
            int r1 = defpackage.arav.a(r1)     // Catch:{ Exception -> 0x04b3 }
            if (r1 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r1 = 1
        L_0x00ff:
            int r1 = r1 + -2
            if (r1 == r13) goto L_0x047e
            r2 = 4
            if (r1 == r2) goto L_0x038f
            if (r1 == r5) goto L_0x010a
            goto L_0x0213
        L_0x010a:
            boolean r1 = defpackage.axup.b()     // Catch:{ Exception -> 0x04b3 }
            if (r1 == 0) goto L_0x011d
            qfn r1 = d     // Catch:{ Exception -> 0x04b3 }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r3 = r10.name     // Catch:{ Exception -> 0x04b3 }
            r2[r12] = r3     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r3 = "Comparing full and incremental filter for %s"
            r1.a(r3, r2)     // Catch:{ Exception -> 0x04b3 }
        L_0x011d:
            aucx r1 = r14.b     // Catch:{ Exception -> 0x04b3 }
            aucx r2 = r14.f     // Catch:{ Exception -> 0x04b3 }
            aucx r3 = r14.g     // Catch:{ Exception -> 0x04b3 }
            audr r4 = r14.c     // Catch:{ Exception -> 0x04b3 }
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)     // Catch:{ Exception -> 0x04b3 }
            audr r6 = r14.h     // Catch:{ Exception -> 0x04b3 }
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)     // Catch:{ Exception -> 0x04b3 }
            aucx r7 = r14.i     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r15 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r15.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r11.<init>()     // Catch:{ Exception -> 0x04b3 }
            qgy r5 = r8.k     // Catch:{ Exception -> 0x04b3 }
            qgw r5 = r5.c()     // Catch:{ Exception -> 0x04b3 }
            r5.c()     // Catch:{ all -> 0x0381 }
        L_0x0144:
            boolean r16 = r5.e()     // Catch:{ all -> 0x0381 }
            if (r16 == 0) goto L_0x0196
            byte[] r16 = r5.a()     // Catch:{ all -> 0x0381 }
            boolean r16 = a((byte[]) r16)     // Catch:{ all -> 0x0381 }
            if (r16 != 0) goto L_0x0163
            byte[] r16 = r5.a()     // Catch:{ all -> 0x0381 }
            boolean r16 = b((byte[]) r16)     // Catch:{ all -> 0x0381 }
            if (r16 == 0) goto L_0x015f
            goto L_0x0163
        L_0x015f:
            r5.d()     // Catch:{ all -> 0x0381 }
            goto L_0x0144
        L_0x0163:
            byte[] r16 = r5.a()     // Catch:{ all -> 0x0381 }
            boolean r16 = b((byte[]) r16)     // Catch:{ all -> 0x0381 }
            if (r16 == 0) goto L_0x0185
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0381 }
            byte[] r13 = r5.a()     // Catch:{ all -> 0x0381 }
            r12.<init>(r13)     // Catch:{ all -> 0x0381 }
            r13 = 12
            java.lang.String r12 = r12.substring(r13)     // Catch:{ all -> 0x0381 }
            r11.add(r12)     // Catch:{ all -> 0x0381 }
            r5.d()     // Catch:{ all -> 0x0381 }
            r12 = 0
            r13 = 1
            goto L_0x0144
        L_0x0185:
            byte[] r12 = r5.a()     // Catch:{ all -> 0x0381 }
            auay r12 = defpackage.auay.a((byte[]) r12)     // Catch:{ all -> 0x0381 }
            r15.add(r12)     // Catch:{ all -> 0x0381 }
            r5.d()     // Catch:{ all -> 0x0381 }
            r12 = 0
            r13 = 1
            goto L_0x0144
        L_0x0196:
            if (r5 != 0) goto L_0x0199
            goto L_0x019c
        L_0x0199:
            r5.close()     // Catch:{ Exception -> 0x04b3 }
        L_0x019c:
            r15.removeAll(r3)     // Catch:{ Exception -> 0x04b3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x04b3 }
        L_0x01a3:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x04b3 }
            if (r3 != 0) goto L_0x0373
            r11.removeAll(r7)     // Catch:{ Exception -> 0x04b3 }
            java.util.Set r2 = r6.keySet()     // Catch:{ Exception -> 0x04b3 }
            r11.addAll(r2)     // Catch:{ Exception -> 0x04b3 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x04b3 }
            r2.<init>()     // Catch:{ Exception -> 0x04b3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x04b3 }
        L_0x01bc:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x04b3 }
            if (r3 != 0) goto L_0x0365
            java.util.Set r1 = r4.keySet()     // Catch:{ Exception -> 0x04b3 }
            java.util.Set r3 = defpackage.iko.b(r2, r15)     // Catch:{ Exception -> 0x04b3 }
            int r3 = r3.size()     // Catch:{ Exception -> 0x04b3 }
            java.util.Set r2 = defpackage.iko.b(r15, r2)     // Catch:{ Exception -> 0x04b3 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x04b3 }
            if (r3 <= 0) goto L_0x01d9
            goto L_0x01db
        L_0x01d9:
            if (r2 <= 0) goto L_0x01ea
        L_0x01db:
            java.lang.String r4 = "DomainFilter.IncrementalDomainMissing"
            a((defpackage.qev) r9, (java.lang.String) r4, (int) r3)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r3 = "DomainFilter.IncrementalExtraDomainExists"
            a((defpackage.qev) r9, (java.lang.String) r3, (int) r2)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "DomainFilter.IncrementalDomainsMismatchesFound"
            r9.a(r2)     // Catch:{ Exception -> 0x04b3 }
        L_0x01ea:
            java.util.Set r2 = defpackage.iko.b(r1, r11)     // Catch:{ Exception -> 0x04b3 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x04b3 }
            java.util.Set r1 = defpackage.iko.b(r11, r1)     // Catch:{ Exception -> 0x04b3 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x04b3 }
            if (r2 <= 0) goto L_0x01fd
            goto L_0x01ff
        L_0x01fd:
            if (r1 <= 0) goto L_0x020e
        L_0x01ff:
            java.lang.String r3 = "DomainFilter.IncrementalPackageMissing"
            a((defpackage.qev) r9, (java.lang.String) r3, (int) r2)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "DomainFilter.IncrementalExtraPackageExists"
            a((defpackage.qev) r9, (java.lang.String) r2, (int) r1)     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r1 = "DomainFilter.IncrementalPackagesMismatchesFound"
            r9.a(r1)     // Catch:{ Exception -> 0x04b3 }
        L_0x020e:
            java.lang.String r1 = "DomainFilter.IncrementalWithFullChanges"
            r9.a(r1)     // Catch:{ Exception -> 0x04b3 }
        L_0x0213:
            boolean r1 = defpackage.axup.b()     // Catch:{ Exception -> 0x04b3 }
            if (r1 == 0) goto L_0x0228
            qfn r1 = d     // Catch:{ Exception -> 0x04b3 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = r10.name     // Catch:{ Exception -> 0x04b3 }
            r4 = 0
            r3[r4] = r2     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "Saving filter for %s"
            r1.a(r2, r3)     // Catch:{ Exception -> 0x04b3 }
        L_0x0228:
            aucx r1 = r14.b     // Catch:{ Exception -> 0x04b3 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x04b3 }
            if (r2 == 0) goto L_0x023b
            auay r0 = r14.a     // Catch:{ Exception -> 0x04b3 }
            byte[] r0 = r0.k()     // Catch:{ Exception -> 0x04b3 }
            r8.a((android.accounts.Account) r10, (defpackage.qev) r9, (byte[]) r0)     // Catch:{ Exception -> 0x04b3 }
            r1 = 0
            goto L_0x025a
        L_0x023b:
            auay r2 = r14.a     // Catch:{ Exception -> 0x04b3 }
            byte[] r2 = r2.k()     // Catch:{ Exception -> 0x04b3 }
            qjf r2 = a((android.accounts.Account) r10, (byte[]) r2)     // Catch:{ Exception -> 0x04b3 }
            audr r3 = r14.c     // Catch:{ Exception -> 0x04b3 }
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)     // Catch:{ Exception -> 0x04b3 }
            java.util.Set r4 = a((java.util.Map) r3)     // Catch:{ Exception -> 0x04b3 }
            r8.a(r2, r1, r4, r3)     // Catch:{ Exception -> 0x04b3 }
            r3 = 5
            r8.a((java.util.Collection) r0, (int) r3)     // Catch:{ Exception -> 0x04b3 }
            r25.f()     // Catch:{ Exception -> 0x04b3 }
            r1 = 1
        L_0x025a:
            int r0 = r14.e     // Catch:{ Exception -> 0x0360 }
            int r0 = defpackage.arav.a(r0)     // Catch:{ Exception -> 0x0360 }
            r2 = 7
            if (r0 != 0) goto L_0x0264
            goto L_0x0266
        L_0x0264:
            if (r0 == r2) goto L_0x026b
        L_0x0266:
            java.lang.String r0 = "DomainFilter.FullChanges"
            r9.a(r0)     // Catch:{ Exception -> 0x0360 }
        L_0x026b:
            int r0 = r14.e     // Catch:{ Exception -> 0x0360 }
            int r0 = defpackage.arav.a(r0)     // Catch:{ Exception -> 0x0360 }
            if (r0 != 0) goto L_0x0275
            goto L_0x0312
        L_0x0275:
            if (r0 != r2) goto L_0x0312
            aucx r0 = r14.b     // Catch:{ IOException -> 0x0305 }
            aucx r2 = r14.f     // Catch:{ IOException -> 0x0305 }
            aucx r3 = r14.g     // Catch:{ IOException -> 0x0305 }
            aucs r4 = r14.j     // Catch:{ IOException -> 0x0305 }
            aucs r5 = r14.k     // Catch:{ IOException -> 0x0305 }
            aucs r6 = r14.l     // Catch:{ IOException -> 0x0305 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IOException -> 0x0305 }
            r7.<init>()     // Catch:{ IOException -> 0x0305 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0305 }
        L_0x028c:
            boolean r11 = r0.hasNext()     // Catch:{ IOException -> 0x0305 }
            if (r11 == 0) goto L_0x02a2
            java.lang.Object r11 = r0.next()     // Catch:{ IOException -> 0x0305 }
            aran r11 = (defpackage.aran) r11     // Catch:{ IOException -> 0x0305 }
            auay r11 = r11.a     // Catch:{ IOException -> 0x0305 }
            java.lang.String r11 = r11.l()     // Catch:{ IOException -> 0x0305 }
            r7.add(r11)     // Catch:{ IOException -> 0x0305 }
            goto L_0x028c
        L_0x02a2:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x0305 }
            r0.<init>()     // Catch:{ IOException -> 0x0305 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0305 }
        L_0x02ab:
            boolean r11 = r2.hasNext()     // Catch:{ IOException -> 0x0305 }
            if (r11 == 0) goto L_0x02c1
            java.lang.Object r11 = r2.next()     // Catch:{ IOException -> 0x0305 }
            aran r11 = (defpackage.aran) r11     // Catch:{ IOException -> 0x0305 }
            auay r11 = r11.a     // Catch:{ IOException -> 0x0305 }
            java.lang.String r11 = r11.l()     // Catch:{ IOException -> 0x0305 }
            r0.add(r11)     // Catch:{ IOException -> 0x0305 }
            goto L_0x02ab
        L_0x02c1:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0305 }
            r2.<init>()     // Catch:{ IOException -> 0x0305 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0305 }
        L_0x02ca:
            boolean r11 = r3.hasNext()     // Catch:{ IOException -> 0x0305 }
            if (r11 == 0) goto L_0x02de
            java.lang.Object r11 = r3.next()     // Catch:{ IOException -> 0x0305 }
            auay r11 = (defpackage.auay) r11     // Catch:{ IOException -> 0x0305 }
            java.lang.String r11 = r11.l()     // Catch:{ IOException -> 0x0305 }
            r2.add(r11)     // Catch:{ IOException -> 0x0305 }
            goto L_0x02ca
        L_0x02de:
            java.util.ArrayList r3 = r8.p     // Catch:{ IOException -> 0x0305 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0305 }
        L_0x02e4:
            boolean r11 = r3.hasNext()     // Catch:{ IOException -> 0x0305 }
            if (r11 == 0) goto L_0x0302
            java.lang.Object r11 = r3.next()     // Catch:{ IOException -> 0x0305 }
            r17 = r11
            qka r17 = (defpackage.qka) r17     // Catch:{ IOException -> 0x0305 }
            r18 = r7
            r19 = r0
            r20 = r2
            r21 = r4
            r22 = r5
            r23 = r6
            r17.a(r18, r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x0305 }
            goto L_0x02e4
        L_0x0302:
            r2 = 0
            goto L_0x043e
        L_0x0305:
            r0 = move-exception
            android.content.Context r2 = r8.g     // Catch:{ Exception -> 0x035b }
            java.lang.String r3 = "Error in sending all and incremental data to plugins"
            qfn r4 = d     // Catch:{ Exception -> 0x035b }
            defpackage.qfp.a(r2, r3, r0, r4)     // Catch:{ Exception -> 0x035b }
            r2 = 1
            goto L_0x043e
        L_0x0312:
            aucx r0 = r14.b     // Catch:{ IOException -> 0x034e }
            aucs r2 = r14.j     // Catch:{ IOException -> 0x034e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x034e }
            r3.<init>()     // Catch:{ IOException -> 0x034e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x034e }
        L_0x031f:
            boolean r4 = r0.hasNext()     // Catch:{ IOException -> 0x034e }
            if (r4 == 0) goto L_0x0335
            java.lang.Object r4 = r0.next()     // Catch:{ IOException -> 0x034e }
            aran r4 = (defpackage.aran) r4     // Catch:{ IOException -> 0x034e }
            auay r4 = r4.a     // Catch:{ IOException -> 0x034e }
            java.lang.String r4 = r4.l()     // Catch:{ IOException -> 0x034e }
            r3.add(r4)     // Catch:{ IOException -> 0x034e }
            goto L_0x031f
        L_0x0335:
            java.util.ArrayList r0 = r8.p     // Catch:{ IOException -> 0x034e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x034e }
        L_0x033b:
            boolean r4 = r0.hasNext()     // Catch:{ IOException -> 0x034e }
            if (r4 == 0) goto L_0x034b
            java.lang.Object r4 = r0.next()     // Catch:{ IOException -> 0x034e }
            qka r4 = (defpackage.qka) r4     // Catch:{ IOException -> 0x034e }
            r4.a(r3, r2)     // Catch:{ IOException -> 0x034e }
            goto L_0x033b
        L_0x034b:
            r2 = 0
            goto L_0x043e
        L_0x034e:
            r0 = move-exception
            android.content.Context r2 = r8.g     // Catch:{ Exception -> 0x035b }
            java.lang.String r3 = "Error in sending all data to plugins"
            qfn r4 = d     // Catch:{ Exception -> 0x035b }
            defpackage.qfp.a(r2, r3, r0, r4)     // Catch:{ Exception -> 0x035b }
            r2 = 1
            goto L_0x043e
        L_0x035b:
            r0 = move-exception
            r2 = r1
            r1 = 1
            goto L_0x04b6
        L_0x0360:
            r0 = move-exception
            r2 = r1
            r1 = 0
            goto L_0x04b6
        L_0x0365:
            r3 = 5
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x04b3 }
            aran r5 = (defpackage.aran) r5     // Catch:{ Exception -> 0x04b3 }
            auay r5 = r5.a     // Catch:{ Exception -> 0x04b3 }
            r2.add(r5)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x01bc
        L_0x0373:
            r3 = 5
            java.lang.Object r5 = r2.next()     // Catch:{ Exception -> 0x04b3 }
            aran r5 = (defpackage.aran) r5     // Catch:{ Exception -> 0x04b3 }
            auay r5 = r5.a     // Catch:{ Exception -> 0x04b3 }
            r15.add(r5)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x01a3
        L_0x0381:
            r0 = move-exception
            r1 = r0
            if (r5 == 0) goto L_0x038e
            r5.close()     // Catch:{ all -> 0x0389 }
            goto L_0x038e
        L_0x0389:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ Exception -> 0x04b3 }
        L_0x038e:
            throw r1     // Catch:{ Exception -> 0x04b3 }
        L_0x038f:
            boolean r0 = defpackage.axup.b()     // Catch:{ Exception -> 0x04b3 }
            if (r0 == 0) goto L_0x03a4
            qfn r0 = d     // Catch:{ Exception -> 0x04b3 }
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r1 = r10.name     // Catch:{ Exception -> 0x04b3 }
            r3 = 0
            r2[r3] = r1     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r1 = "Saving incremental filter for %s"
            r0.a(r1, r2)     // Catch:{ Exception -> 0x04b3 }
        L_0x03a4:
            auay r0 = r14.a     // Catch:{ Exception -> 0x04b3 }
            byte[] r0 = r0.k()     // Catch:{ Exception -> 0x04b3 }
            qjf r0 = a((android.accounts.Account) r10, (byte[]) r0)     // Catch:{ Exception -> 0x04b3 }
            amri r2 = defpackage.amri.b(r0)     // Catch:{ Exception -> 0x04b3 }
            aucx r3 = r14.f     // Catch:{ Exception -> 0x04b3 }
            aucx r4 = r14.g     // Catch:{ Exception -> 0x04b3 }
            audr r0 = r14.h     // Catch:{ Exception -> 0x04b3 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ Exception -> 0x04b3 }
            java.util.Set r5 = a((java.util.Map) r0)     // Catch:{ Exception -> 0x04b3 }
            audr r0 = r14.h     // Catch:{ Exception -> 0x04b3 }
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ Exception -> 0x04b3 }
            aucx r7 = r14.i     // Catch:{ Exception -> 0x04b3 }
            r1 = r25
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x04b3 }
            r25.f()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "DomainFilter.IncrementalChanges"
            r9.a(r0)     // Catch:{ Exception -> 0x047a }
            aucx r0 = r14.f     // Catch:{ IOException -> 0x0432 }
            aucx r1 = r14.g     // Catch:{ IOException -> 0x0432 }
            aucs r2 = r14.k     // Catch:{ IOException -> 0x0432 }
            aucs r3 = r14.l     // Catch:{ IOException -> 0x0432 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0432 }
            r4.<init>()     // Catch:{ IOException -> 0x0432 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0432 }
        L_0x03e6:
            boolean r5 = r0.hasNext()     // Catch:{ IOException -> 0x0432 }
            if (r5 == 0) goto L_0x03fc
            java.lang.Object r5 = r0.next()     // Catch:{ IOException -> 0x0432 }
            aran r5 = (defpackage.aran) r5     // Catch:{ IOException -> 0x0432 }
            auay r5 = r5.a     // Catch:{ IOException -> 0x0432 }
            java.lang.String r5 = r5.l()     // Catch:{ IOException -> 0x0432 }
            r4.add(r5)     // Catch:{ IOException -> 0x0432 }
            goto L_0x03e6
        L_0x03fc:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x0432 }
            r0.<init>()     // Catch:{ IOException -> 0x0432 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0432 }
        L_0x0405:
            boolean r5 = r1.hasNext()     // Catch:{ IOException -> 0x0432 }
            if (r5 == 0) goto L_0x0419
            java.lang.Object r5 = r1.next()     // Catch:{ IOException -> 0x0432 }
            auay r5 = (defpackage.auay) r5     // Catch:{ IOException -> 0x0432 }
            java.lang.String r5 = r5.l()     // Catch:{ IOException -> 0x0432 }
            r0.add(r5)     // Catch:{ IOException -> 0x0432 }
            goto L_0x0405
        L_0x0419:
            java.util.ArrayList r1 = r8.p     // Catch:{ IOException -> 0x0432 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0432 }
        L_0x041f:
            boolean r5 = r1.hasNext()     // Catch:{ IOException -> 0x0432 }
            if (r5 == 0) goto L_0x042f
            java.lang.Object r5 = r1.next()     // Catch:{ IOException -> 0x0432 }
            qka r5 = (defpackage.qka) r5     // Catch:{ IOException -> 0x0432 }
            r5.a(r4, r0, r2, r3)     // Catch:{ IOException -> 0x0432 }
            goto L_0x041f
        L_0x042f:
            r1 = 1
            r2 = 0
            goto L_0x043e
        L_0x0432:
            r0 = move-exception
            android.content.Context r1 = r8.g     // Catch:{ Exception -> 0x047a }
            java.lang.String r2 = "Error in sending incremental data to plugins"
            qfn r3 = d     // Catch:{ Exception -> 0x047a }
            defpackage.qfp.a(r1, r2, r0, r3)     // Catch:{ Exception -> 0x047a }
            r1 = 1
            r2 = 1
        L_0x043e:
            axup r0 = defpackage.axup.a     // Catch:{ Exception -> 0x0473 }
            axuq r0 = r0.a()     // Catch:{ Exception -> 0x0473 }
            boolean r0 = r0.a()     // Catch:{ Exception -> 0x0473 }
            if (r0 == 0) goto L_0x046f
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ Exception -> 0x0473 }
            r0.<init>()     // Catch:{ Exception -> 0x0473 }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0473 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0473 }
            r8.a((java.io.PrintWriter) r3)     // Catch:{ Exception -> 0x0473 }
            r3.flush()     // Catch:{ Exception -> 0x0473 }
            qfn r3 = d     // Catch:{ Exception -> 0x0473 }
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0473 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0473 }
            r4 = 0
            r5[r4] = r0     // Catch:{ Exception -> 0x0473 }
            java.lang.String r0 = "Domain filter Dump after sync: %s"
            r3.a(r0, r5)     // Catch:{ Exception -> 0x0473 }
            r5 = 1
            r12 = 0
            goto L_0x052e
        L_0x046f:
            r5 = 1
            r12 = 0
            goto L_0x052e
        L_0x0473:
            r0 = move-exception
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x04b6
        L_0x047a:
            r0 = move-exception
            r1 = 0
            r2 = 1
            goto L_0x04b6
        L_0x047e:
            qfn r0 = d     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r1 = "No changes in domain filter"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x04b3 }
            r0.a(r1, r3)     // Catch:{ Exception -> 0x04b3 }
            auay r0 = r14.a     // Catch:{ Exception -> 0x04b3 }
            byte[] r0 = r0.k()     // Catch:{ Exception -> 0x04b3 }
            qjf r0 = a((android.accounts.Account) r10, (byte[]) r0)     // Catch:{ Exception -> 0x04b3 }
            qgy r1 = r8.k     // Catch:{ IOException -> 0x049e }
            byte[] r2 = b     // Catch:{ IOException -> 0x049e }
            byte[] r0 = r0.k()     // Catch:{ IOException -> 0x049e }
            r1.a(r2, r0)     // Catch:{ IOException -> 0x049e }
            goto L_0x04a8
        L_0x049e:
            r0 = move-exception
            android.content.Context r1 = r8.g     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r2 = "Error while updating last update information"
            qfn r3 = d     // Catch:{ Exception -> 0x04b3 }
            defpackage.qfp.a(r1, r2, r0, r3)     // Catch:{ Exception -> 0x04b3 }
        L_0x04a8:
            r25.f()     // Catch:{ Exception -> 0x04b3 }
            java.lang.String r0 = "DomainFilter.NoChanges"
            r9.a(r0)     // Catch:{ Exception -> 0x04b3 }
            r11 = 1
            goto L_0x054e
        L_0x04b3:
            r0 = move-exception
            r1 = 0
            r2 = 0
        L_0x04b6:
            babk r3 = a((java.lang.Throwable) r0)
            if (r3 == 0) goto L_0x04c1
            babj r3 = r3.a
            babg r3 = r3.r
            goto L_0x04c2
        L_0x04c1:
            r3 = 0
        L_0x04c2:
            babg r4 = defpackage.babg.PERMISSION_DENIED
            if (r3 != r4) goto L_0x04d4
            r3 = 0
            byte[] r0 = new byte[r3]
            r8.a((android.accounts.Account) r10, (defpackage.qev) r9, (byte[]) r0)
            r5 = 1
            r12 = 0
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x052e
        L_0x04d4:
            if (r3 == 0) goto L_0x04f1
            java.lang.String r3 = r3.name()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "DomainFilter.BackendError."
            int r5 = r3.length()
            if (r5 != 0) goto L_0x04ec
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x04f3
        L_0x04ec:
            java.lang.String r3 = r4.concat(r3)
            goto L_0x04f3
        L_0x04f1:
            java.lang.String r3 = "DomainFilter.Unknown"
        L_0x04f3:
            r9.a(r3)
            java.lang.String r3 = "Error while reading domain filter from WHAPI"
            axuy r4 = defpackage.axuy.a
            axuz r4 = r4.a()
            double r4 = r4.J()
            java.util.Random r6 = r8.q
            double r6 = r6.nextDouble()
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x051b
            android.content.Context r4 = r8.g
            qfn r5 = d
            defpackage.qfp.a(r4, r3, r0, r5)
            r5 = 1
            r12 = 1
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x052e
        L_0x051b:
            qfn r4 = d
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r3
            java.lang.String r3 = "%s"
            r4.a(r0, r3, r6)
            r12 = 1
            r24 = r2
            r2 = r1
            r1 = r24
        L_0x052e:
            java.lang.String r0 = "DomainFilter.NonRetriableError"
            if (r2 == 0) goto L_0x0537
            r9.a(r0)
            r11 = 3
            goto L_0x054e
        L_0x0537:
            if (r1 == 0) goto L_0x0540
            java.lang.String r0 = "DomainFilter.Success"
            r9.a(r0)
            r11 = 1
            goto L_0x054e
        L_0x0540:
            if (r12 == 0) goto L_0x0549
            java.lang.String r0 = "DomainFilter.RetriableError"
            r9.a(r0)
            r11 = 2
            goto L_0x054e
        L_0x0549:
            r9.a(r0)
            r11 = 3
        L_0x054e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjv.a(qjf, avwm):int");
    }

    private final void b(qjm qjm) {
        try {
            this.k.a(c, qjm.k());
        } catch (IOException e2) {
            qfp.a(this.g, "Error while updating IntentFilter Fetch information", e2, d);
        }
    }

    private final qjw c(String str) {
        qfp.a(this.g, str, new Throwable(str), d);
        return a;
    }

    private final boolean h() {
        if (this.k.a()) {
            return true;
        }
        d.a(new Throwable("Domain filter data store is not initialized."));
        return false;
    }

    public final long d() {
        qjf e2 = e();
        if (e2 != null) {
            return e2.a;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final qjf e() {
        byte[] bArr;
        if (h()) {
            try {
                bArr = this.k.a(b);
            } catch (IOException e2) {
                qfp.a(this.g, "Error reading the last update from levelDb", e2, d);
                bArr = null;
            }
            if (bArr != null) {
                try {
                    return (qjf) aucj.a((aucj) qjf.d, bArr, aubs.b());
                } catch (auda e3) {
                    qfp.a(this.g, "Error parsing last update info", e3, d);
                    return null;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        synchronized (this.e) {
            qjm g2 = g();
            aucd aucd = (aucd) g2.c(5);
            aucd.a((aucj) g2);
            Set a2 = a(g2);
            for (Integer intValue : Collections.unmodifiableMap(g2.a).keySet()) {
                Integer valueOf = Integer.valueOf(intValue.intValue());
                if (!a2.contains(valueOf)) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    qjm qjm = qjm.c;
                    ((qjm) aucd.b).a().remove(valueOf);
                }
            }
            b((qjm) aucd.i());
        }
    }

    /* access modifiers changed from: package-private */
    public final qjm g() {
        byte[] bArr;
        if (!h()) {
            return qjm.c;
        }
        try {
            bArr = this.k.a(c);
        } catch (IOException e2) {
            qfp.a(this.g, "Error reading the Intent filter fetch info from levelDb", e2, d);
            bArr = null;
        }
        if (bArr == null) {
            return qjm.c;
        }
        try {
            return (qjm) aucj.a((aucj) qjm.c, bArr, aubs.b());
        } catch (auda e3) {
            qfp.a(this.g, "Error parsing Intent filter fetch info.", e3, d);
            return qjm.c;
        }
    }

    public final int c() {
        int i2 = 0;
        if (!h()) {
            return 0;
        }
        qgw c2 = this.k.c();
        try {
            c2.c();
            while (c2.e()) {
                if (a(c2.a())) {
                    i2++;
                }
                c2.d();
            }
            if (c2 != null) {
                c2.close();
            }
            return i2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private static boolean b(byte[] bArr) {
        if (bArr.length <= f.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int b(defpackage.avwm r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.h()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x005f
            qjf r0 = r8.e()     // Catch:{ all -> 0x0061 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004c
            long r3 = defpackage.axuy.b()     // Catch:{ all -> 0x0061 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0028
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0061 }
            long r5 = r0.a     // Catch:{ all -> 0x0061 }
            long r3 = r3 - r5
            long r5 = defpackage.axuy.b()     // Catch:{ all -> 0x0061 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x004c
        L_0x0028:
            qlg r3 = r8.l     // Catch:{ all -> 0x0061 }
            int r3 = r3.a()     // Catch:{ all -> 0x0061 }
            if (r3 != r2) goto L_0x004a
            qlc r3 = r8.j     // Catch:{ all -> 0x0061 }
            android.accounts.Account r3 = r3.a()     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x004a
            qlc r3 = r8.j     // Catch:{ all -> 0x0061 }
            android.accounts.Account r3 = r3.a()     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.name     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x0061 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x004c
            r3 = 0
            goto L_0x004d
        L_0x004a:
            r3 = 0
            goto L_0x004d
        L_0x004c:
            r3 = 1
        L_0x004d:
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0061 }
            r2[r1] = r4     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x005d
            int r9 = r8.a((defpackage.qjf) r0, (defpackage.avwm) r9)     // Catch:{ all -> 0x0061 }
        L_0x005b:
            monitor-exit(r8)
            return r9
        L_0x005d:
            r9 = 4
            goto L_0x005b
        L_0x005f:
            r9 = 3
            goto L_0x005b
        L_0x0061:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0065
        L_0x0064:
            throw r9
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjv.b(avwm):int");
    }

    public final synchronized void b() {
        if (axup.b()) {
            d.a("Wiping all Domain filter data", new Object[0]);
        }
        synchronized (this.e) {
            this.k.d();
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((qka) arrayList.get(i2)).a(amzy.h(), amzy.h());
        }
    }

    public final byte[] b(String str) {
        String valueOf = String.valueOf(str);
        return this.k.a((valueOf.length() == 0 ? new String("pkgMetadata:") : "pkgMetadata:".concat(valueOf)).getBytes(qfb.b));
    }

    private static babk a(Throwable th) {
        while (th != null) {
            if (th instanceof babk) {
                return (babk) th;
            }
            th = th.getCause();
        }
        return null;
    }

    private static Set a(Map map) {
        int a2;
        ob obVar = new ob();
        for (Map.Entry entry : map.entrySet()) {
            auay auay = (auay) entry.getValue();
            aubs b2 = aubs.b();
            arbc arbc = arbc.b;
            try {
                aubc h2 = auay.h();
                aucj aucj = (aucj) arbc.c(4);
                aueq a3 = aueh.a.a((Object) aucj);
                a3.a(aucj, aubd.a(h2), b2);
                a3.d(aucj);
                h2.a(0);
                aucj.b(aucj);
                arbc arbc2 = (arbc) aucj;
                int a4 = arbb.a(arbc2.a);
                if ((a4 == 0 || a4 != 2) && ((a2 = arbb.a(arbc2.a)) == 0 || a2 != 3)) {
                    obVar.add((String) entry.getKey());
                }
            } catch (IOException e2) {
                if (!(e2.getCause() instanceof auda)) {
                    throw new auda(e2.getMessage());
                }
                throw ((auda) e2.getCause());
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof auda) {
                    throw ((auda) e3.getCause());
                }
                throw e3;
            } catch (auda e4) {
                throw e4;
            } catch (auda e5) {
                throw e5;
            }
        }
        return obVar;
    }

    static final Set a(qjm qjm) {
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.SECONDS.toMillis(axvw.a.a().e());
        HashSet a2 = angm.a(qjm.a.size());
        for (Map.Entry entry : Collections.unmodifiableMap(qjm.a).entrySet()) {
            if (currentTimeMillis - ((qjd) entry.getValue()).b < millis) {
                a2.add((Integer) entry.getKey());
            }
        }
        return a2;
    }

    static qje a(aran aran, Set set) {
        int i2;
        String str;
        int i3;
        boolean z2;
        auay auay;
        auay auay2;
        auay auay3;
        auay auay4;
        aran aran2 = aran;
        aucd o2 = qje.d.o();
        aucx aucx = aran2.b;
        ArrayList arrayList = new ArrayList(aucx.size());
        int i4 = 0;
        while (i4 < aucx.size()) {
            arao arao = (arao) aucx.get(i4);
            aucd o3 = qjh.e.o();
            int i5 = arao.a;
            if (i5 != 0) {
                i3 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? 0 : 5 : 4 : 3 : 2 : 1;
            } else {
                i3 = 6;
            }
            int i6 = i3 - 1;
            if (i3 != 0) {
                if (i6 == 0) {
                    if (i5 == 1) {
                        z2 = ((Boolean) arao.b).booleanValue();
                    } else {
                        z2 = false;
                    }
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    qjh qjh = (qjh) o3.b;
                    qjh.a = 1;
                    qjh.b = Boolean.valueOf(z2);
                } else if (i6 == 1) {
                    if (i5 == 2) {
                        auay = (auay) arao.b;
                    } else {
                        auay = auay.b;
                    }
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    qjh qjh2 = (qjh) o3.b;
                    auay.getClass();
                    qjh2.a = 2;
                    qjh2.b = auay;
                } else if (i6 == 2) {
                    if (i5 == 3) {
                        auay2 = (auay) arao.b;
                    } else {
                        auay2 = auay.b;
                    }
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    qjh qjh3 = (qjh) o3.b;
                    auay2.getClass();
                    qjh3.a = 3;
                    qjh3.b = auay2;
                } else if (i6 == 3) {
                    if (i5 == 4) {
                        auay3 = (auay) arao.b;
                    } else {
                        auay3 = auay.b;
                    }
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    qjh qjh4 = (qjh) o3.b;
                    auay3.getClass();
                    qjh4.a = 4;
                    qjh4.b = auay3;
                } else if (i6 == 4) {
                    if (i5 == 5) {
                        auay4 = (auay) arao.b;
                    } else {
                        auay4 = auay.b;
                    }
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    qjh qjh5 = (qjh) o3.b;
                    auay4.getClass();
                    qjh5.a = 5;
                    qjh5.b = auay4;
                }
                int i7 = arao.c;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                qjh qjh6 = (qjh) o3.b;
                qjh6.c = i7;
                aucs aucs = arao.d;
                if (!qjh6.d.a()) {
                    qjh6.d = aucj.a(qjh6.d);
                }
                auab.a((Iterable) aucs, (List) qjh6.d);
                arrayList.add((qjh) o3.i());
                i4++;
            } else {
                throw null;
            }
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        qje qje = (qje) o2.b;
        qje.a();
        auab.a((Iterable) arrayList, (List) qje.a);
        aucx aucx2 = aran2.c;
        ArrayList arrayList2 = new ArrayList(aucx2.size());
        for (int i8 = 0; i8 < aucx2.size(); i8++) {
            arbf arbf = (arbf) aucx2.get(i8);
            aucd o4 = qjn.f.o();
            String str2 = arbf.a;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            qjn qjn = (qjn) o4.b;
            str2.getClass();
            qjn.a = str2;
            String str3 = arbf.b;
            str3.getClass();
            qjn.b = str3;
            qjn.c = arbf.c;
            qjn.d = arbf.d;
            boolean contains = set.contains(arbf.a);
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            ((qjn) o4.b).e = contains;
            arrayList2.add((qjn) o4.i());
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        qje qje2 = (qje) o2.b;
        qje2.b();
        auab.a((Iterable) arrayList2, (List) qje2.b);
        aucx aucx3 = aran2.d;
        ArrayList arrayList3 = new ArrayList(aucx3.size());
        int i9 = 0;
        while (i9 < aucx3.size()) {
            arba arba = (arba) aucx3.get(i9);
            aucd o5 = qjk.c.o();
            int i10 = arba.a;
            int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? 0 : 2 : 1 : 3;
            int i12 = i11 - 1;
            if (i11 != 0) {
                if (i12 == 0) {
                    if (i10 == 1) {
                        i2 = avwn.b(((Integer) arba.b).intValue());
                        if (i2 == 0) {
                            i2 = 1;
                        }
                    } else {
                        i2 = 2;
                    }
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    qjk qjk = (qjk) o5.b;
                    qjk.b = Integer.valueOf(avwn.a(i2));
                    qjk.a = 1;
                } else if (i12 == 1) {
                    if (i10 == 2) {
                        str = (String) arba.b;
                    } else {
                        str = "";
                    }
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    qjk qjk2 = (qjk) o5.b;
                    str.getClass();
                    qjk2.a = 2;
                    qjk2.b = str;
                }
                arrayList3.add((qjk) o5.i());
                i9++;
            } else {
                throw null;
            }
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        qje qje3 = (qje) o2.b;
        if (!qje3.c.a()) {
            qje3.c = aucj.a(qje3.c);
        }
        auab.a((Iterable) arrayList3, (List) qje3.c);
        return (qje) o2.i();
    }

    private static final qjf a(Account account, byte[] bArr) {
        aucd o2 = qjf.d.o();
        long currentTimeMillis = System.currentTimeMillis();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((qjf) o2.b).a = currentTimeMillis;
        String str = account.name;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        str.getClass();
        ((qjf) o2.b).b = str;
        auay a2 = auay.a(bArr);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a2.getClass();
        ((qjf) o2.b).c = a2;
        return (qjf) o2.i();
    }

    private static qjw a(qje qje, int i2) {
        if (i2 >= qje.b.size()) {
            return a;
        }
        qjn qjn = (qjn) qje.b.get(i2);
        if (!qjn.e) {
            return new qjw(0, qjn.a, qjn.c, qjn.d, qjn.b, false);
        }
        return new qjw(2, qjn.a, qjn.c, qjn.d, qjn.b, false);
    }

    private final void a(Account account, qev qev, byte[] bArr) {
        d.a("Account = %s is ineligible from using Instant apps", account.name);
        a(a(account, bArr), amzy.h(), anfv.a, anfu.b);
        b(qjm.c);
        qev.a("DomainFilter.IneligibleError");
    }

    private static void a(Map map, WriteBatch writeBatch) {
        for (Map.Entry entry : map.entrySet()) {
            String valueOf = String.valueOf((String) entry.getKey());
            writeBatch.put((valueOf.length() == 0 ? new String("pkgMetadata:") : "pkgMetadata:".concat(valueOf)).getBytes(qfb.b), ((auay) entry.getValue()).k());
        }
    }

    private static final void a(qev qev, String str, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            qev.a(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        defpackage.apev.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0101, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:21:0x0056, B:57:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f6 A[SYNTHETIC, Splitter:B:57:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.qjf r17, java.util.List r18, java.util.Set r19, java.util.Map r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            boolean r2 = r16.h()
            if (r2 == 0) goto L_0x013c
            r2 = 1
            r3 = 0
            com.google.android.gms.leveldb.WriteBatch r4 = com.google.android.gms.leveldb.WriteBatch.create()     // Catch:{ IOException -> 0x0113 }
            qgy r5 = r1.k     // Catch:{ all -> 0x0103 }
            qgw r5 = r5.c()     // Catch:{ all -> 0x0103 }
            r5.c()     // Catch:{ all -> 0x00f0 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x001d:
            int r11 = r18.size()     // Catch:{ all -> 0x00ed }
            if (r7 < r11) goto L_0x005e
            boolean r11 = r5.e()     // Catch:{ all -> 0x00ed }
            if (r11 != 0) goto L_0x005e
            r11 = r20
            a((java.util.Map) r11, (com.google.android.gms.leveldb.WriteBatch) r4)     // Catch:{ all -> 0x00ed }
            byte[] r6 = b     // Catch:{ all -> 0x00ed }
            byte[] r7 = r17.k()     // Catch:{ all -> 0x00ed }
            r4.put(r6, r7)     // Catch:{ all -> 0x00ed }
            qgy r6 = r1.k     // Catch:{ all -> 0x00ed }
            r6.a((com.google.android.gms.leveldb.WriteBatch) r4)     // Catch:{ all -> 0x00ed }
            axvb r6 = defpackage.axvb.a     // Catch:{ all -> 0x00ed }
            axvc r6 = r6.a()     // Catch:{ all -> 0x00ed }
            boolean r6 = r6.g()     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x0054
            if (r8 != 0) goto L_0x0050
            qew r0 = r1.x     // Catch:{ all -> 0x00ed }
            r0.a()     // Catch:{ all -> 0x00ed }
            goto L_0x0054
        L_0x0050:
            r1.a((boolean) r2, (defpackage.aran) r8, (java.util.Set) r0)     // Catch:{ all -> 0x00ed }
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            r5.close()     // Catch:{ all -> 0x0100 }
        L_0x0059:
            r4.close()     // Catch:{ IOException -> 0x0111 }
            goto L_0x011f
        L_0x005e:
            r11 = r20
            boolean r12 = r5.e()     // Catch:{ all -> 0x00ed }
            if (r12 == 0) goto L_0x0086
            byte[] r12 = r5.a()     // Catch:{ all -> 0x00ed }
            boolean r12 = a((byte[]) r12)     // Catch:{ all -> 0x00ed }
            if (r12 != 0) goto L_0x0086
            byte[] r12 = r5.a()     // Catch:{ all -> 0x00ed }
            boolean r12 = b((byte[]) r12)     // Catch:{ all -> 0x00ed }
            if (r12 != 0) goto L_0x007b
            goto L_0x0082
        L_0x007b:
            byte[] r12 = r5.a()     // Catch:{ all -> 0x00ed }
            r4.delete(r12)     // Catch:{ all -> 0x00ed }
        L_0x0082:
            r5.d()     // Catch:{ all -> 0x00ed }
            goto L_0x001d
        L_0x0086:
            int r12 = r18.size()     // Catch:{ all -> 0x00ed }
            if (r7 >= r12) goto L_0x00ad
            r12 = r18
            java.lang.Object r13 = r12.get(r7)     // Catch:{ all -> 0x00ed }
            aran r13 = (defpackage.aran) r13     // Catch:{ all -> 0x00ed }
            auay r14 = r13.a     // Catch:{ all -> 0x00ed }
            byte[] r14 = r14.k()     // Catch:{ all -> 0x00ed }
            boolean r15 = r5.e()     // Catch:{ all -> 0x00ed }
            if (r15 != 0) goto L_0x00a2
            r6 = 1
            goto L_0x00b2
        L_0x00a2:
            java.util.Comparator r15 = defpackage.aooo.b     // Catch:{ all -> 0x00ed }
            byte[] r6 = r5.a()     // Catch:{ all -> 0x00ed }
            int r6 = r15.compare(r6, r14)     // Catch:{ all -> 0x00ed }
            goto L_0x00b2
        L_0x00ad:
            r12 = r18
            r6 = -1
            r13 = 0
            r14 = 0
        L_0x00b2:
            if (r6 >= 0) goto L_0x00c1
            byte[] r6 = r5.a()     // Catch:{ all -> 0x00ed }
            r4.delete(r6)     // Catch:{ all -> 0x00ed }
            int r10 = r10 + 1
            r5.d()     // Catch:{ all -> 0x00ed }
            goto L_0x00eb
        L_0x00c1:
            if (r6 == 0) goto L_0x00d6
            qje r6 = a((defpackage.aran) r13, (java.util.Set) r0)     // Catch:{ all -> 0x00ed }
            byte[] r6 = r6.k()     // Catch:{ all -> 0x00ed }
            r4.put(r14, r6)     // Catch:{ all -> 0x00ed }
            int r9 = r9 + 1
            int r7 = r7 + 1
            if (r8 != 0) goto L_0x00eb
            r8 = r13
            goto L_0x00eb
        L_0x00d6:
            qje r6 = a((defpackage.aran) r13, (java.util.Set) r0)     // Catch:{ all -> 0x00ed }
            byte[] r6 = r6.k()     // Catch:{ all -> 0x00ed }
            r4.put(r14, r6)     // Catch:{ all -> 0x00ed }
            int r9 = r9 + 1
            int r7 = r7 + 1
            r5.d()     // Catch:{ all -> 0x00ed }
            if (r8 != 0) goto L_0x00eb
            r8 = r13
        L_0x00eb:
            goto L_0x001d
        L_0x00ed:
            r0 = move-exception
            r6 = r0
            goto L_0x00f4
        L_0x00f0:
            r0 = move-exception
            r6 = r0
            r9 = 0
            r10 = 0
        L_0x00f4:
            if (r5 == 0) goto L_0x00ff
            r5.close()     // Catch:{ all -> 0x00fa }
            goto L_0x00ff
        L_0x00fa:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r6, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0100 }
        L_0x00ff:
            throw r6     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r0 = move-exception
            r5 = r0
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            r5 = r0
            r9 = 0
            r10 = 0
        L_0x0107:
            r4.close()     // Catch:{ all -> 0x010b }
            goto L_0x0110
        L_0x010b:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r4)     // Catch:{ IOException -> 0x0111 }
        L_0x0110:
            throw r5     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            goto L_0x0116
        L_0x0113:
            r0 = move-exception
            r9 = 0
            r10 = 0
        L_0x0116:
            android.content.Context r4 = r1.g
            qfn r5 = d
            java.lang.String r6 = "Error while updating domain filter"
            defpackage.qfp.a(r4, r6, r0, r5)
        L_0x011f:
            boolean r0 = defpackage.axup.b()
            if (r0 == 0) goto L_0x013b
            qfn r0 = d
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4[r3] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4[r2] = r3
            java.lang.String r2 = "updateDataStore: Domains added: %d, Domains removed: %d"
            r0.a(r2, r4)
        L_0x013b:
            return
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjv.a(qjf, java.util.List, java.util.Set, java.util.Map):void");
    }

    private final void a(boolean z2, aran aran, Set set) {
        qew qew;
        qew qew2;
        qew qew3;
        qew qew4;
        qew qew5;
        try {
            byte[] a2 = this.k.a(aran.a.k());
            if (a2 != null) {
                if (a2.length != 0) {
                    try {
                        aubs b2 = aubs.b();
                        if (a(aran, set).equals((qje) aucj.a((aucj) qje.d, a2, b2))) {
                            d.a("Verified entry after DomainFilter sync", new Object[0]);
                            if (!z2) {
                                qew5 = this.w;
                            } else {
                                qew5 = this.C;
                            }
                            qew5.a();
                            return;
                        }
                        d.c("Successful DomainFilterEntry written != to entry read", new Object[0]);
                        if (!z2) {
                            qew4 = this.v;
                        } else {
                            qew4 = this.B;
                        }
                        qew4.a();
                        return;
                    } catch (auda e2) {
                        d.c("Successful DomainFilterEntry write is unparseable", new Object[0]);
                        if (!z2) {
                            qew3 = this.u;
                        } else {
                            qew3 = this.A;
                        }
                        qew3.a();
                        return;
                    }
                }
            }
            d.c("Successful DomainFilter write unable to be read (no bytes)", new Object[0]);
            if (!z2) {
                qew2 = this.s;
            } else {
                qew2 = this.y;
            }
            qew2.a();
        } catch (IOException e3) {
            d.c("Successful DomainFilter write unable to be read (IOException)", new Object[0]);
            if (z2) {
                qew = this.z;
            } else {
                qew = this.t;
            }
            qew.a();
        }
    }

    private static boolean a(byte[] bArr) {
        if (Arrays.equals(b, bArr) || Arrays.equals(c, bArr) || b(bArr)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r2 = r14.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = g();
        r10 = new java.util.HashSet();
        r1 = java.util.Collections.unmodifiableMap(r1.a).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r1.hasNext() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r3 = (java.util.Map.Entry) r1.next();
        r4 = defpackage.qjc.b(((defpackage.qjd) r3.getValue()).a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (r4 == 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r4 != 3) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        r10.add((java.lang.Integer) r3.getKey());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        a((java.util.Collection) r10, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        if (r10.isEmpty() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r8.a("DomainFilter.GetIntentFilterEmptyInput");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        r1 = r14.i.a(r0, (java.util.Collection) r10);
        new java.lang.Object[1][0] = r0.name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0 = (defpackage.araz) r1.get();
        r8.a("DomainFilter.GetIntentFilterRpcSuccess");
        r1 = d;
        r2 = new java.lang.Object[1];
        r3 = r0.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        if (r3 != -1) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r3 = defpackage.aueh.a.a((java.lang.Object) r0).b(r0);
        r0.U = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e8, code lost:
        r2[0] = java.lang.Integer.valueOf(r3);
        r1.a("Intent filter response size: %s", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        a(defpackage.ampu.a, r0.a, defpackage.amzy.h(), a(java.util.Collections.unmodifiableMap(r0.b)), java.util.Collections.unmodifiableMap(r0.b), defpackage.amzy.h());
        a((java.util.Collection) r10, 5);
        r0 = r0.a;
        r1 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0126, code lost:
        if (r0.hasNext() == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0128, code lost:
        r1.add(((defpackage.aran) r0.next()).a.l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0138, code lost:
        r0 = r14.p.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0142, code lost:
        if (r0.hasNext() == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0144, code lost:
        ((defpackage.qka) r0.next()).b(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        r8.a("DomainFilter.GetIntentFilterResponseHandlingSuccess");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r8.a("DomainFilter.GetIntentFilterHandlingFailure");
        defpackage.qfp.a(r14.g, "Error in handling Intent filter response", r0, d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0164, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0165, code lost:
        r8.a("DomainFilter.GetIntentFilterFailure");
        defpackage.qfp.a(r14.g, "Error in retrieving Intent filter response", r0, d);
        a((java.util.Collection) r10, 3);
        r0 = a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x017a, code lost:
        if (r0 != null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017c, code lost:
        r0 = r0.a.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0181, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0184, code lost:
        if (r0 != defpackage.babg.PERMISSION_DENIED) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0186, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0188, code lost:
        return 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
            r14 = this;
            qex r0 = r14.n
            qev r8 = r0.a()
            qlc r0 = r14.j
            android.accounts.Account r0 = r0.c()
            java.lang.Object r1 = r14.e
            monitor-enter(r1)
            qjm r2 = r14.g()     // Catch:{ all -> 0x018c }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x018c }
            long r5 = r2.b     // Catch:{ all -> 0x018c }
            long r5 = r3 - r5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x018c }
            axvw r9 = defpackage.axvw.a     // Catch:{ all -> 0x018c }
            axvx r9 = r9.a()     // Catch:{ all -> 0x018c }
            long r9 = r9.b()     // Catch:{ all -> 0x018c }
            long r9 = r7.toMillis(r9)     // Catch:{ all -> 0x018c }
            r7 = 4
            r11 = 0
            r12 = 1
            int r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0044
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x018c }
            long r5 = r2.b     // Catch:{ all -> 0x018c }
            long r3 = r3 - r5
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x018c }
            r0[r11] = r2     // Catch:{ all -> 0x018c }
            monitor-exit(r1)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "DomainFilter.GetIntentFilterThrottled"
            r8.a(r0)
            return r7
        L_0x0044:
            r9 = 5
            java.lang.Object r5 = r2.c(r9)     // Catch:{ all -> 0x018c }
            aucd r5 = (defpackage.aucd) r5     // Catch:{ all -> 0x018c }
            r5.a((defpackage.aucj) r2)     // Catch:{ all -> 0x018c }
            boolean r2 = r5.c     // Catch:{ all -> 0x018c }
            if (r2 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r5.c()     // Catch:{ all -> 0x018c }
            r5.c = r11     // Catch:{ all -> 0x018c }
        L_0x0058:
            aucj r2 = r5.b     // Catch:{ all -> 0x018c }
            qjm r2 = (defpackage.qjm) r2     // Catch:{ all -> 0x018c }
            qjm r6 = defpackage.qjm.c     // Catch:{ all -> 0x018c }
            r2.b = r3     // Catch:{ all -> 0x018c }
            aucj r2 = r5.i()     // Catch:{ all -> 0x018c }
            qjm r2 = (defpackage.qjm) r2     // Catch:{ all -> 0x018c }
            r14.b((defpackage.qjm) r2)     // Catch:{ all -> 0x018c }
            monitor-exit(r1)     // Catch:{ all -> 0x018c }
            java.lang.Object r2 = r14.e
            monitor-enter(r2)
            qjm r1 = r14.g()     // Catch:{ all -> 0x0189 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x0189 }
            r10.<init>()     // Catch:{ all -> 0x0189 }
            audr r1 = r1.a     // Catch:{ all -> 0x0189 }
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)     // Catch:{ all -> 0x0189 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0189 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0189 }
        L_0x0084:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0189 }
            r13 = 3
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0189 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0189 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x0189 }
            qjd r4 = (defpackage.qjd) r4     // Catch:{ all -> 0x0189 }
            int r4 = r4.a     // Catch:{ all -> 0x0189 }
            int r4 = defpackage.qjc.b(r4)     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x0084
            if (r4 != r13) goto L_0x0084
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x0189 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0189 }
            r10.add(r3)     // Catch:{ all -> 0x0189 }
            goto L_0x0084
        L_0x00ab:
            r14.a((java.util.Collection) r10, (int) r7)     // Catch:{ all -> 0x0189 }
            monitor-exit(r2)     // Catch:{ all -> 0x0189 }
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = "DomainFilter.GetIntentFilterEmptyInput"
            r8.a(r0)
            return r12
        L_0x00bc:
            qei r1 = r14.i
            aorr r1 = r1.a((android.accounts.Account) r0, (java.util.Collection) r10)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.String r0 = r0.name
            r2[r11] = r0
            java.lang.Object r0 = r1.get()     // Catch:{ Exception -> 0x0164 }
            araz r0 = (defpackage.araz) r0     // Catch:{ Exception -> 0x0164 }
            java.lang.String r1 = "DomainFilter.GetIntentFilterRpcSuccess"
            r8.a(r1)     // Catch:{ Exception -> 0x0164 }
            qfn r1 = d     // Catch:{ Exception -> 0x0164 }
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0164 }
            int r3 = r0.U     // Catch:{ Exception -> 0x0164 }
            r4 = -1
            if (r3 != r4) goto L_0x00e8
            aueh r3 = defpackage.aueh.a     // Catch:{ Exception -> 0x0164 }
            aueq r3 = r3.a((java.lang.Object) r0)     // Catch:{ Exception -> 0x0164 }
            int r3 = r3.b(r0)     // Catch:{ Exception -> 0x0164 }
            r0.U = r3     // Catch:{ Exception -> 0x0164 }
        L_0x00e8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0164 }
            r2[r11] = r3     // Catch:{ Exception -> 0x0164 }
            java.lang.String r3 = "Intent filter response size: %s"
            r1.a(r3, r2)     // Catch:{ Exception -> 0x0164 }
            ampu r2 = defpackage.ampu.a     // Catch:{ Exception -> 0x0154 }
            aucx r3 = r0.a     // Catch:{ Exception -> 0x0154 }
            amzy r4 = defpackage.amzy.h()     // Catch:{ Exception -> 0x0154 }
            audr r1 = r0.b     // Catch:{ Exception -> 0x0154 }
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)     // Catch:{ Exception -> 0x0154 }
            java.util.Set r5 = a((java.util.Map) r1)     // Catch:{ Exception -> 0x0154 }
            audr r1 = r0.b     // Catch:{ Exception -> 0x0154 }
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r1)     // Catch:{ Exception -> 0x0154 }
            amzy r7 = defpackage.amzy.h()     // Catch:{ Exception -> 0x0154 }
            r1 = r14
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0154 }
            r14.a((java.util.Collection) r10, (int) r9)     // Catch:{ Exception -> 0x0154 }
            aucx r0 = r0.a     // Catch:{ Exception -> 0x0154 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0154 }
            r1.<init>()     // Catch:{ Exception -> 0x0154 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0154 }
        L_0x0122:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0154 }
            if (r2 == 0) goto L_0x0138
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0154 }
            aran r2 = (defpackage.aran) r2     // Catch:{ Exception -> 0x0154 }
            auay r2 = r2.a     // Catch:{ Exception -> 0x0154 }
            java.lang.String r2 = r2.l()     // Catch:{ Exception -> 0x0154 }
            r1.add(r2)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0122
        L_0x0138:
            java.util.ArrayList r0 = r14.p     // Catch:{ Exception -> 0x0154 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0154 }
        L_0x013e:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0154 }
            if (r2 == 0) goto L_0x014e
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0154 }
            qka r2 = (defpackage.qka) r2     // Catch:{ Exception -> 0x0154 }
            r2.b(r1, r10)     // Catch:{ Exception -> 0x0154 }
            goto L_0x013e
        L_0x014e:
            java.lang.String r0 = "DomainFilter.GetIntentFilterResponseHandlingSuccess"
            r8.a(r0)     // Catch:{ Exception -> 0x0154 }
            goto L_0x0163
        L_0x0154:
            r0 = move-exception
            java.lang.String r1 = "DomainFilter.GetIntentFilterHandlingFailure"
            r8.a(r1)     // Catch:{ Exception -> 0x0164 }
            android.content.Context r1 = r14.g     // Catch:{ Exception -> 0x0164 }
            java.lang.String r2 = "Error in handling Intent filter response"
            qfn r3 = d     // Catch:{ Exception -> 0x0164 }
            defpackage.qfp.a(r1, r2, r0, r3)     // Catch:{ Exception -> 0x0164 }
        L_0x0163:
            return r12
        L_0x0164:
            r0 = move-exception
            java.lang.String r1 = "DomainFilter.GetIntentFilterFailure"
            r8.a(r1)
            android.content.Context r1 = r14.g
            qfn r2 = d
            java.lang.String r3 = "Error in retrieving Intent filter response"
            defpackage.qfp.a(r1, r3, r0, r2)
            r14.a((java.util.Collection) r10, (int) r13)
            babk r0 = a((java.lang.Throwable) r0)
            if (r0 == 0) goto L_0x0181
            babj r0 = r0.a
            babg r0 = r0.r
            goto L_0x0182
        L_0x0181:
            r0 = 0
        L_0x0182:
            babg r1 = defpackage.babg.PERMISSION_DENIED
            if (r0 == r1) goto L_0x0188
            r0 = 2
            return r0
        L_0x0188:
            return r13
        L_0x0189:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0189 }
            throw r0
        L_0x018c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x018c }
            goto L_0x0190
        L_0x018f:
            throw r0
        L_0x0190:
            goto L_0x018f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjv.a():int");
    }

    public final synchronized int a(avwm avwm) {
        return h() ? a(e(), avwm) : 3;
    }

    public final qje a(String str) {
        if (!h()) {
            return null;
        }
        try {
            byte[] a2 = this.k.a(str.getBytes(qfb.b));
            if (a2 != null) {
                try {
                    return (qje) aucj.a((aucj) qje.d, a2, aubs.b());
                } catch (auda e2) {
                    qfp.a(this.g, String.format("Couldn't parse result for %s", new Object[]{str}), e2, d);
                    return null;
                }
            } else {
                new Object[1][0] = str;
                return null;
            }
        } catch (IOException e3) {
            qfp.a(this.g, "Couldn't read from level DB", e3, d);
            return null;
        }
    }

    public final qjw a(String str, boolean z2) {
        qjw qjw;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        String str4;
        String str5;
        auay auay;
        auay auay2;
        auay auay3;
        auay auay4;
        if (!h()) {
            return c("Datastore not initialized");
        }
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(str);
            return c(valueOf.length() == 0 ? new String("Invalid URL: ") : "Invalid URL: ".concat(valueOf));
        }
        int i5 = 0;
        int i6 = 1;
        if (axup.a.a().b()) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            a(printWriter);
            printWriter.flush();
            d.a("Domain filter Dump before match url: %s", stringWriter.toString());
        }
        Uri parse = Uri.parse(str);
        if (parse == null || TextUtils.isEmpty(parse.getHost())) {
            String valueOf2 = String.valueOf(str);
            return c(valueOf2.length() == 0 ? new String("Invalid URI: ") : "Invalid URI: ".concat(valueOf2));
        }
        List a2 = qjz.a(parse.getHost());
        new Object[1][0] = a2;
        qjw qjw2 = a;
        int size = a2.size();
        int i7 = 0;
        while (i7 < size) {
            qje a3 = a((String) a2.get(i7));
            if (a3 != null) {
                if (a3.b.size() == 0) {
                    String valueOf3 = String.valueOf(a3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 32);
                    sb.append("Domain match without split IDs: ");
                    sb.append(valueOf3);
                    return c(sb.toString());
                }
                int i8 = 2;
                if (!z2) {
                    qjw = a(a3, i5);
                    i2 = 2;
                } else {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= a3.a.size()) {
                            i2 = 2;
                            i3 = -1;
                            break;
                        }
                        qjh qjh = (qjh) a3.a.get(i9);
                        if (qjh.a == i6 && ((Boolean) qjh.b).booleanValue()) {
                            i4 = i9;
                            i2 = 2;
                            break;
                        }
                        String host = parse.getHost();
                        if (qjg.a(qjh.a) == 3) {
                            if (qjh.a == i8) {
                                auay4 = (auay) qjh.b;
                            } else {
                                auay4 = auay.b;
                            }
                            str2 = auay4.b(qfb.b);
                        } else {
                            str2 = null;
                        }
                        if (qjg.a(qjh.a) == 4) {
                            if (qjh.a == 3) {
                                auay3 = (auay) qjh.b;
                            } else {
                                auay3 = auay.b;
                            }
                            str3 = auay3.b(qfb.b);
                        } else {
                            str3 = null;
                        }
                        if (qjg.a(qjh.a) == 5) {
                            if (qjh.a == 4) {
                                auay2 = (auay) qjh.b;
                            } else {
                                auay2 = auay.b;
                            }
                            str4 = auay2.b(qfb.b);
                        } else {
                            str4 = null;
                        }
                        if (qjg.a(qjh.a) == 6) {
                            if (qjh.a == 5) {
                                auay = (auay) qjh.b;
                            } else {
                                auay = auay.b;
                            }
                            str5 = auay.b(qfb.b);
                        } else {
                            str5 = null;
                        }
                        String str6 = str4;
                        i4 = i9;
                        String str7 = str5;
                        i2 = 2;
                        if (qlt.a(host, 0, str2, str3, str6, str7, parse)) {
                            break;
                        }
                        i9 = i4 + 1;
                        i6 = 1;
                        i8 = 2;
                    }
                    i3 = ((qjh) a3.a.get(i4)).c;
                    qjw = i3 >= 0 ? a(a3, i3) : a;
                }
                int i10 = qjw.a;
                if (i10 == 0) {
                    return qjw;
                }
                if (i10 == i2) {
                    qjw2 = qjw;
                }
            }
            i7++;
            i5 = 0;
            i6 = 1;
        }
        return qjw2;
    }

    /* access modifiers changed from: package-private */
    public final void a(amri amri, List list, List list2, Set set, Map map, List list3) {
        WriteBatch create;
        if (h()) {
            try {
                create = WriteBatch.create();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    create.delete(((auay) it.next()).k());
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    aran aran = (aran) it2.next();
                    create.put(aran.a.k(), a(aran, set).k());
                }
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    String valueOf = String.valueOf((String) it3.next());
                    create.delete((valueOf.length() == 0 ? new String("pkgMetadata:") : "pkgMetadata:".concat(valueOf)).getBytes(qfb.b));
                }
                a(map, create);
                if (amri.a()) {
                    create.put(b, ((qjf) amri.b()).k());
                }
                this.k.a(create);
                if (axvb.a.a().h()) {
                    if (!list.isEmpty()) {
                        a(false, (aran) list.get(0), set);
                    } else {
                        this.r.a();
                    }
                }
                create.close();
            } catch (IOException e2) {
                qfp.a(this.g, "Error while incrementally updating domain filter", e2, d);
            } catch (Throwable th) {
                apev.a(th, th);
            }
            if (axup.b()) {
                d.a("updateDataStore: Domains added: %d, Domains removed: %d", Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
                return;
            }
            return;
        }
        return;
        throw th;
    }

    public final void a(PrintWriter printWriter) {
        qgw c2;
        Throwable th;
        String str;
        String str2;
        String str3;
        PrintWriter printWriter2 = printWriter;
        if (!h()) {
            printWriter2.printf("DomainFilter: DataStore not initialized!", new Object[0]);
            return;
        }
        try {
            c2 = this.k.c();
            qjf e2 = e();
            Object[] objArr = new Object[1];
            objArr[0] = Long.valueOf(e2 != null ? e2.a : 0);
            printWriter2.printf("DomainFilter: LastUpdateTime %d: \n", objArr);
            qjm g2 = g();
            if (g2 != null) {
                if (!Collections.unmodifiableMap(g2.a).isEmpty()) {
                    printWriter2.printf("Recently Used Domain Digests:\n", new Object[0]);
                    for (Map.Entry entry : Collections.unmodifiableMap(g2.a).entrySet()) {
                        String valueOf = String.valueOf(entry.getKey());
                        int b2 = qjc.b(((qjd) entry.getValue()).a);
                        if (b2 == 0) {
                            b2 = 1;
                        }
                        String valueOf2 = String.valueOf(Integer.toString(qjc.a(b2)));
                        long j2 = ((qjd) entry.getValue()).b;
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(valueOf2).length());
                        sb.append(valueOf);
                        sb.append(" (");
                        sb.append(valueOf2);
                        sb.append("):\t");
                        sb.append(j2);
                        printWriter2.printf(sb.toString(), new Object[0]);
                    }
                    long j3 = g2.b;
                    StringBuilder sb2 = new StringBuilder(58);
                    sb2.append("Last intent filter fetched timestamp: ");
                    sb2.append(j3);
                    printWriter2.printf(sb2.toString(), new Object[0]);
                }
            }
            printWriter2.printf("\nPlugins:\n", new Object[0]);
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                qka qka = (qka) it.next();
                printWriter2.printf("\t%s:\n", new Object[]{qka.getClass().getSimpleName()});
                qka.a(printWriter2);
            }
            c2.c();
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            ob obVar = new ob();
            long d2 = axup.a.a().d();
            while (c2.e()) {
                if (((long) treeMap.size()) >= d2) {
                    break;
                }
                byte[] a2 = c2.a();
                String str4 = new String(a2);
                if (a(a2)) {
                    for (qjn qjn : ((qje) aucj.a((aucj) qje.d, c2.b(), aubs.b())).b) {
                        if (!obVar.contains(qjn.a) && this.h.i(qjn.a)) {
                            obVar.add(qjn.a);
                        }
                        List list = (List) treeMap.get(qjn.a);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        if (!qjn.b.isEmpty()) {
                            String str5 = qjn.b;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 3);
                            sb3.append(" [");
                            sb3.append(str5);
                            sb3.append("]");
                            str3 = sb3.toString();
                        } else {
                            str3 = "";
                        }
                        String valueOf3 = String.valueOf(str3);
                        list.add(new Pair(valueOf3.length() == 0 ? new String(str4) : str4.concat(valueOf3), Boolean.valueOf(qjn.e)));
                        treeMap.put(qjn.a, list);
                    }
                }
                c2.d();
            }
            printWriter.println();
            if (c2.e()) {
                printWriter2.printf("Domains truncated. Only printing out first %d packages.\n", new Object[]{Long.valueOf(d2)});
            }
            printWriter2.printf("Printing %d entries in [package: domains...]:\n", new Object[]{Integer.valueOf(treeMap.size())});
            for (Map.Entry entry2 : treeMap.entrySet()) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = entry2.getKey();
                if (!obVar.contains(entry2.getKey())) {
                    str = "";
                } else {
                    str = " (SNOOZED)";
                }
                objArr2[1] = str;
                printWriter2.printf("%s%s: ", objArr2);
                for (Pair pair : (List) entry2.getValue()) {
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = pair.first;
                    if (!((Boolean) pair.second).booleanValue()) {
                        str2 = "";
                    } else {
                        str2 = " (HELD BACK)";
                    }
                    objArr3[1] = str2;
                    printWriter2.printf("%s%s; ", objArr3);
                }
                printWriter.println();
            }
            if (c2 != null) {
                c2.close();
                return;
            }
            return;
        } catch (Exception e3) {
            qfp.a(this.g, "Failed to dump debug info", e3, d);
            return;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void a(Collection collection, int i2) {
        synchronized (this.e) {
            qjm g2 = g();
            aucd aucd = (aucd) g2.c(5);
            aucd.a((aucj) g2);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                audr audr = g2.a;
                Integer valueOf = Integer.valueOf(intValue);
                if (audr.containsKey(valueOf)) {
                    audr audr2 = g2.a;
                    if (audr2.containsKey(valueOf)) {
                        qjd qjd = (qjd) audr2.get(valueOf);
                        aucd aucd2 = (aucd) qjd.c(5);
                        aucd2.a((aucj) qjd);
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        qjd qjd2 = qjd.c;
                        ((qjd) aucd2.b).a = qjc.a(i2);
                        aucd.b(intValue, (qjd) aucd2.i());
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            }
            b((qjm) aucd.i());
        }
    }

    public final void a(Collection collection, Collection collection2) {
        synchronized (this.e) {
            qjm g2 = g();
            aucd aucd = (aucd) g2.c(5);
            aucd.a((aucj) g2);
            long currentTimeMillis = System.currentTimeMillis();
            aucd o2 = qjd.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((qjd) o2.b).a = qjc.a(3);
            qjd qjd = (qjd) o2.i();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                qjd a2 = aucd.a(intValue, qjd);
                aucd aucd2 = (aucd) a2.c(5);
                aucd2.a((aucj) a2);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                ((qjd) aucd2.b).b = currentTimeMillis;
                aucd.b(intValue, (qjd) aucd2.i());
            }
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (Collections.unmodifiableMap(((qjm) aucd.b).a).containsKey(Integer.valueOf(intValue2))) {
                    qjd a3 = aucd.a(intValue2, qjd);
                    aucd aucd3 = (aucd) a3.c(5);
                    aucd3.a((aucj) a3);
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    ((qjd) aucd3.b).b = currentTimeMillis;
                    aucd.b(intValue2, (qjd) aucd3.i());
                }
            }
            b((qjm) aucd.i());
        }
    }

    public final void a(qka qka) {
        this.p.add(qka);
        ((qkb) qka).g = this;
    }
}
