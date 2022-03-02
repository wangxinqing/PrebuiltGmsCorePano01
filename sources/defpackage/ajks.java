package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import java.io.IOException;
import java.util.Random;

/* renamed from: ajks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajks {
    public final Context a;
    public final ajmm b;
    public final ajld c;
    public final ajmo d;
    public final ajii e;
    public final ajim f;
    public final ajik g;
    public final rom h;
    public final ajmn i;
    public final Random j;
    public final ajhf k;

    public ajks(Context context, ajmm ajmm, ajmo ajmo, ajld ajld, ajii ajii, ajik ajik, ajim ajim, rom rom, ajmn ajmn, ajhf ajhf, Random random) {
        this.a = context;
        this.b = ajmm;
        this.i = ajmn;
        this.c = ajld;
        this.d = ajmo;
        this.e = ajii;
        this.g = ajik;
        this.f = ajim;
        this.h = rom;
        this.k = ajhf;
        this.j = random;
    }

    public static final void a(Account account, Exception exc) {
        String a2 = rmp.a(account);
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 43 + String.valueOf(valueOf).length());
        sb.append("Batch Location Update failed for account ");
        sb.append(a2);
        sb.append(": ");
        sb.append(valueOf);
        ajix.a("GCoreUlr", sb.toString());
    }

    public static final boolean a(IOException iOException) {
        NetworkResponse networkResponse;
        Throwable cause = iOException.getCause();
        if (cause == null || !(cause instanceof VolleyError) || (networkResponse = ((VolleyError) cause).networkResponse) == null || networkResponse.statusCode != 400) {
            return false;
        }
        ajix.c("GCoreUlr", "Request failed with HTTP 400, will not re-upload");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:181:0x048a, code lost:
        if (r11 != false) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0520, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x052a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x052b, code lost:
        r6 = r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0520 A[ExcHandler: babk | eif (e java.lang.Throwable), Splitter:B:163:0x0452] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x054d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.location.reporting.state.update.AccountConfig r18, boolean r19, int r20, long r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            long r3 = defpackage.aztb.F()
            int r4 = (int) r3
            ajik r3 = r1.g
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            defpackage.iva.a((boolean) r3)
            ajik r3 = r1.g
            android.accounts.Account r7 = r0.a
            java.lang.Object r8 = r3.c
            monitor-enter(r8)
            ajip r14 = new ajip     // Catch:{ all -> 0x0552 }
            r14.<init>()     // Catch:{ all -> 0x0552 }
            com.google.android.gms.leveldb.LevelDb r9 = r3.d     // Catch:{ all -> 0x0552 }
            if (r9 == 0) goto L_0x00a9
            r3.a((android.accounts.Account) r7)     // Catch:{ all -> 0x0552 }
            com.google.android.gms.leveldb.LevelDb r9 = r3.d     // Catch:{ all -> 0x0552 }
            com.google.android.gms.leveldb.LevelDb$Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0552 }
            r10 = r21
            byte[] r10 = defpackage.ajir.a(r7, r10)     // Catch:{ all -> 0x0552 }
            r9.seek(r10)     // Catch:{ all -> 0x00a4 }
            r10 = 0
        L_0x003a:
            boolean r11 = defpackage.ajik.a((com.google.android.gms.leveldb.LevelDb.Iterator) r9, (android.accounts.Account) r7)     // Catch:{ all -> 0x00a4 }
            if (r11 == 0) goto L_0x0076
            java.util.ArrayList r11 = r14.a     // Catch:{ all -> 0x00a4 }
            int r11 = r11.size()     // Catch:{ all -> 0x00a4 }
            java.util.ArrayList r12 = r14.b     // Catch:{ all -> 0x00a4 }
            int r12 = r12.size()     // Catch:{ all -> 0x00a4 }
            int r11 = r11 + r12
            java.util.ArrayList r12 = r14.c     // Catch:{ all -> 0x00a4 }
            int r12 = r12.size()     // Catch:{ all -> 0x00a4 }
            int r11 = r11 + r12
            if (r11 >= r4) goto L_0x0076
            byte[] r11 = r9.value()     // Catch:{ all -> 0x00a4 }
            byte[] r11 = r3.a((byte[]) r11)     // Catch:{ all -> 0x00a4 }
            ajjr r11 = defpackage.ajik.b(r11)     // Catch:{ all -> 0x00a4 }
            if (r11 == 0) goto L_0x0072
            byte[] r12 = r9.key()     // Catch:{ all -> 0x00a4 }
            r14.a(r12, r11)     // Catch:{ all -> 0x00a4 }
            int r11 = r11.a     // Catch:{ all -> 0x00a4 }
            r11 = r11 & r5
            if (r11 != 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r10 = 1
        L_0x0072:
            r9.next()     // Catch:{ all -> 0x00a4 }
            goto L_0x003a
        L_0x0076:
            boolean r4 = defpackage.ajik.a((com.google.android.gms.leveldb.LevelDb.Iterator) r9, (android.accounts.Account) r7)     // Catch:{ all -> 0x00a4 }
            if (r4 != 0) goto L_0x007d
            goto L_0x009f
        L_0x007d:
            if (r10 != 0) goto L_0x009f
            byte[] r4 = r9.value()     // Catch:{ all -> 0x00a4 }
            byte[] r4 = r3.a((byte[]) r4)     // Catch:{ all -> 0x00a4 }
            ajjr r4 = defpackage.ajik.b(r4)     // Catch:{ all -> 0x00a4 }
            if (r4 != 0) goto L_0x008e
            goto L_0x009b
        L_0x008e:
            int r11 = r4.a     // Catch:{ all -> 0x00a4 }
            r11 = r11 & r5
            if (r11 == 0) goto L_0x009b
            byte[] r10 = r9.key()     // Catch:{ all -> 0x00a4 }
            r14.a(r10, r4)     // Catch:{ all -> 0x00a4 }
            r10 = 1
        L_0x009b:
            r9.next()     // Catch:{ all -> 0x00a4 }
            goto L_0x0076
        L_0x009f:
            r9.close()     // Catch:{ all -> 0x0552 }
            monitor-exit(r8)     // Catch:{ all -> 0x0552 }
            goto L_0x00aa
        L_0x00a4:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0552 }
            throw r0     // Catch:{ all -> 0x0552 }
        L_0x00a9:
            monitor-exit(r8)     // Catch:{ all -> 0x0552 }
        L_0x00aa:
            java.util.ArrayList r3 = r14.a
            boolean r3 = r3.isEmpty()
            r4 = 4
            r7 = 2
            if (r3 == 0) goto L_0x00e0
            android.accounts.Account r0 = r0.a
            java.lang.String r0 = defpackage.rmp.a((android.accounts.Account) r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 58
            r5.<init>(r3)
            java.lang.String r3 = "Skipping batch upload #"
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = " with no locations for: "
            r5.append(r3)
            r5.append(r0)
            r5.toString()
            if (r2 != 0) goto L_0x00df
            return r4
        L_0x00df:
            return r7
        L_0x00e0:
            r3 = 8
            if (r2 != 0) goto L_0x02cb
            rom r9 = r1.h
            com.google.android.gms.location.LocationAvailability r9 = r9.d()
            if (r9 == 0) goto L_0x02c9
            long r10 = java.lang.System.currentTimeMillis()
            atcn r12 = defpackage.atcn.e
            aucd r12 = r12.o()
            int r13 = r9.b
            int r13 = defpackage.ajny.a(r13)
            int r9 = r9.a
            int r9 = defpackage.ajny.a(r9)
            boolean r15 = r12.c
            if (r15 == 0) goto L_0x010b
            r12.c()
            r12.c = r6
        L_0x010b:
            aucj r15 = r12.b
            atcn r15 = (defpackage.atcn) r15
            int r8 = r13 + -1
            if (r13 == 0) goto L_0x02c7
            r15.c = r8
            int r8 = r15.a
            r8 = r8 | r7
            r15.a = r8
            int r13 = r9 + -1
            if (r9 == 0) goto L_0x02c5
            r15.b = r13
            r8 = r8 | r5
            r15.a = r8
            r8 = r8 | r4
            r15.a = r8
            r15.d = r6
            aucj r8 = r12.i()
            atcn r8 = (defpackage.atcn) r8
            atco r9 = defpackage.atco.r
            aucd r9 = r9.o()
            if (r8 == 0) goto L_0x014f
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x013b
            goto L_0x0140
        L_0x013b:
            r9.c()
            r9.c = r6
        L_0x0140:
            aucj r12 = r9.b
            atco r12 = (defpackage.atco) r12
            r8.getClass()
            r12.f = r8
            int r8 = r12.a
            r8 = r8 | 16
            r12.a = r8
        L_0x014f:
            boolean r8 = r9.c
            if (r8 != 0) goto L_0x0154
            goto L_0x0159
        L_0x0154:
            r9.c()
            r9.c = r6
        L_0x0159:
            aucj r8 = r9.b
            atco r8 = (defpackage.atco) r8
            int r12 = r8.a
            r12 = r12 | r5
            r8.a = r12
            r8.b = r10
            aucj r8 = r9.i()
            atco r8 = (defpackage.atco) r8
            java.util.ArrayList r9 = r14.c
            r9.add(r8)
            ajmn r8 = r1.i
            atda r8 = r8.l()
            if (r8 == 0) goto L_0x028a
            atda r9 = defpackage.atda.l
            aucd r9 = r9.o()
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0182
            goto L_0x0187
        L_0x0182:
            r9.c()
            r9.c = r6
        L_0x0187:
            aucj r10 = r9.b
            atda r10 = (defpackage.atda) r10
            int r11 = r10.a
            r11 = r11 | 512(0x200, float:7.175E-43)
            r10.a = r11
            r10.k = r6
            long r12 = r8.c
            r11 = r11 | r7
            r10.a = r11
            r10.c = r12
            long r12 = r8.b
            r11 = r11 | r5
            r10.a = r11
            r10.b = r12
            long r12 = r8.f
            r11 = r11 | 16
            r10.a = r11
            r10.f = r12
            int r10 = r8.a
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x01b0
            goto L_0x01cf
        L_0x01b0:
            atbv r10 = r8.i
            if (r10 != 0) goto L_0x01b6
            atbv r10 = defpackage.atbv.g
        L_0x01b6:
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x01bb
            goto L_0x01c0
        L_0x01bb:
            r9.c()
            r9.c = r6
        L_0x01c0:
            aucj r11 = r9.b
            atda r11 = (defpackage.atda) r11
            r10.getClass()
            r11.i = r10
            int r10 = r11.a
            r10 = r10 | 128(0x80, float:1.794E-43)
            r11.a = r10
        L_0x01cf:
            int r10 = r8.a
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01f7
            int r10 = r8.g
            int r10 = defpackage.atcx.a(r10)
            if (r10 == 0) goto L_0x01de
            goto L_0x01df
        L_0x01de:
            r10 = 1
        L_0x01df:
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x01e4
            goto L_0x01e9
        L_0x01e4:
            r9.c()
            r9.c = r6
        L_0x01e9:
            aucj r11 = r9.b
            atda r11 = (defpackage.atda) r11
            int r10 = r10 + -1
            r11.g = r10
            int r10 = r11.a
            r10 = r10 | 32
            r11.a = r10
        L_0x01f7:
            int r10 = r8.a
            r10 = r10 & 64
            if (r10 == 0) goto L_0x021f
            int r10 = r8.h
            int r10 = defpackage.atcz.a(r10)
            if (r10 == 0) goto L_0x0206
            goto L_0x0207
        L_0x0206:
            r10 = 1
        L_0x0207:
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x020c
            goto L_0x0211
        L_0x020c:
            r9.c()
            r9.c = r6
        L_0x0211:
            aucj r11 = r9.b
            atda r11 = (defpackage.atda) r11
            int r10 = r10 + -1
            r11.h = r10
            int r10 = r11.a
            r10 = r10 | 64
            r11.a = r10
        L_0x021f:
            int r10 = r8.a
            r10 = r10 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0236
            java.lang.String r10 = r8.j
            aucj r11 = r9.b
            atda r11 = (defpackage.atda) r11
            r10.getClass()
            int r12 = r11.a
            r12 = r12 | 256(0x100, float:3.59E-43)
            r11.a = r12
            r11.j = r10
        L_0x0236:
            int r10 = r8.a
            r10 = r10 & r4
            if (r10 == 0) goto L_0x025c
            int r10 = r8.d
            int r10 = defpackage.atcx.a(r10)
            if (r10 == 0) goto L_0x0244
            goto L_0x0245
        L_0x0244:
            r10 = 1
        L_0x0245:
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x024a
            goto L_0x024f
        L_0x024a:
            r9.c()
            r9.c = r6
        L_0x024f:
            aucj r11 = r9.b
            atda r11 = (defpackage.atda) r11
            int r10 = r10 + -1
            r11.d = r10
            int r10 = r11.a
            r10 = r10 | r4
            r11.a = r10
        L_0x025c:
            int r10 = r8.a
            r10 = r10 & r3
            if (r10 != 0) goto L_0x0262
            goto L_0x0283
        L_0x0262:
            int r8 = r8.e
            int r8 = defpackage.atcz.a(r8)
            if (r8 == 0) goto L_0x026b
            goto L_0x026c
        L_0x026b:
            r8 = 1
        L_0x026c:
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0271
            goto L_0x0276
        L_0x0271:
            r9.c()
            r9.c = r6
        L_0x0276:
            aucj r10 = r9.b
            atda r10 = (defpackage.atda) r10
            int r8 = r8 + -1
            r10.e = r8
            int r8 = r10.a
            r8 = r8 | r3
            r10.a = r8
        L_0x0283:
            aucj r8 = r9.i()
            atda r8 = (defpackage.atda) r8
            goto L_0x028b
        L_0x028a:
            r8 = 0
        L_0x028b:
            if (r8 == 0) goto L_0x02c3
            java.util.ArrayList r9 = r14.c
            defpackage.iva.a((java.lang.Object) r8)
            atco r10 = defpackage.atco.r
            aucd r10 = r10.o()
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x029d
            goto L_0x02a2
        L_0x029d:
            r10.c()
            r10.c = r6
        L_0x02a2:
            aucj r11 = r10.b
            atco r11 = (defpackage.atco) r11
            r8.getClass()
            r11.c = r8
            int r12 = r11.a
            r12 = r12 | r7
            r11.a = r12
            long r3 = r8.b
            r8 = r12 | 1
            r11.a = r8
            r11.b = r3
            aucj r3 = r10.i()
            atco r3 = (defpackage.atco) r3
            r9.add(r3)
            r3 = 0
            goto L_0x02cc
        L_0x02c3:
            r3 = 0
            goto L_0x02cc
        L_0x02c5:
            r3 = 0
            throw r3
        L_0x02c7:
            r3 = 0
            throw r3
        L_0x02c9:
            r3 = 0
            goto L_0x02cc
        L_0x02cb:
            r3 = 0
        L_0x02cc:
            if (r19 == 0) goto L_0x0382
            ajhf r4 = r1.k
            boolean r8 = r4.a()
            if (r8 == 0) goto L_0x0376
            ajhc r8 = r4.b()
            if (r8 != 0) goto L_0x02e2
            r4.c()
            r4 = r3
            goto L_0x0377
        L_0x02e2:
            long r9 = java.lang.System.currentTimeMillis()
            ataz r4 = defpackage.ataz.e
            aucd r4 = r4.o()
            java.util.TimeZone r11 = java.util.TimeZone.getDefault()
            java.lang.String r11 = r11.getID()
            if (r11 != 0) goto L_0x02f7
            goto L_0x030f
        L_0x02f7:
            boolean r12 = r4.c
            if (r12 != 0) goto L_0x02fc
            goto L_0x0301
        L_0x02fc:
            r4.c()
            r4.c = r6
        L_0x0301:
            aucj r12 = r4.b
            ataz r12 = (defpackage.ataz) r12
            r11.getClass()
            int r13 = r12.a
            r13 = r13 | r7
            r12.a = r13
            r12.c = r11
        L_0x030f:
            int r11 = r8.a
            boolean r12 = r4.c
            if (r12 != 0) goto L_0x0316
            goto L_0x031b
        L_0x0316:
            r4.c()
            r4.c = r6
        L_0x031b:
            aucj r12 = r4.b
            ataz r12 = (defpackage.ataz) r12
            int r13 = r12.a
            r13 = r13 | r5
            r12.a = r13
            r12.b = r11
            byte[] r8 = r8.d
            auay r8 = defpackage.auay.a((byte[]) r8)
            boolean r11 = r4.c
            if (r11 != 0) goto L_0x0331
            goto L_0x0336
        L_0x0331:
            r4.c()
            r4.c = r6
        L_0x0336:
            aucj r11 = r4.b
            ataz r11 = (defpackage.ataz) r11
            r8.getClass()
            int r12 = r11.a
            r13 = 4
            r12 = r12 | r13
            r11.a = r12
            r11.d = r8
            atco r8 = defpackage.atco.r
            aucd r8 = r8.o()
            aucj r4 = r4.i()
            ataz r4 = (defpackage.ataz) r4
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x0356
            goto L_0x035b
        L_0x0356:
            r8.c()
            r8.c = r6
        L_0x035b:
            aucj r11 = r8.b
            atco r11 = (defpackage.atco) r11
            r4.getClass()
            r11.j = r4
            int r4 = r11.a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r11.a = r4
            r4 = r4 | r5
            r11.a = r4
            r11.b = r9
            aucj r4 = r8.i()
            atco r4 = (defpackage.atco) r4
            goto L_0x0377
        L_0x0376:
            r4 = r3
        L_0x0377:
            if (r4 == 0) goto L_0x0380
            java.util.ArrayList r8 = r14.c
            r8.add(r4)
            r4 = 1
            goto L_0x0383
        L_0x0380:
            r4 = 0
            goto L_0x0383
        L_0x0382:
            r4 = 0
        L_0x0383:
            java.util.Locale r8 = java.util.Locale.US
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r6] = r14
            android.accounts.Account r10 = r0.a
            java.lang.String r10 = defpackage.rmp.a((android.accounts.Account) r10)
            r9[r5] = r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r9[r7] = r2
            r2 = 3
            ajmo r7 = r1.d
            java.util.List r7 = r7.c()
            r9[r2] = r7
            java.lang.String r2 = "LocationReporter sending %s for account %s request #%d; requests: %s"
            java.lang.String r2 = java.lang.String.format(r8, r2, r9)
            java.lang.String r7 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r7, (java.lang.String) r2)
            java.util.ArrayList r2 = r14.a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 11
            r8.<init>(r7)
            java.lang.String r7 = "Locations: "
            r8.append(r7)
            r8.append(r2)
            r8.toString()
            java.util.ArrayList r2 = r14.b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 12
            r8.<init>(r7)
            java.lang.String r7 = "Activities: "
            r8.append(r7)
            r8.append(r2)
            r8.toString()
            java.util.ArrayList r2 = r14.c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r16 = 10
            int r7 = r7 + 10
            r8.<init>(r7)
            java.lang.String r7 = "Metadata: "
            r8.append(r7)
            r8.append(r2)
            r8.toString()
            java.util.ArrayList r2 = r14.d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 12
            r8.<init>(r7)
            java.lang.String r7 = "SensorData: "
            r8.append(r7)
            r8.append(r2)
            r8.toString()
            java.util.ArrayList r2 = r14.e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 10
            r8.<init>(r7)
            java.lang.String r7 = "UserData: "
            r8.append(r7)
            r8.append(r2)
            r8.toString()
            android.accounts.Account r2 = r0.a
            long r7 = r0.i
            ajld r15 = r1.c     // Catch:{ IOException -> 0x052a, eif -> 0x0522, babk -> 0x0520 }
            ajmm r0 = r15.a     // Catch:{ IOException -> 0x052a, eif -> 0x0522, babk -> 0x0520 }
            int r11 = r0.b((android.accounts.Account) r2)     // Catch:{ IOException -> 0x052a, eif -> 0x0522, babk -> 0x0520 }
            java.lang.String r0 = r15.a((android.accounts.Account) r2)     // Catch:{ IOException -> 0x052a, eif -> 0x0522, babk -> 0x0520 }
            boolean r9 = defpackage.aztb.t()     // Catch:{ IOException -> 0x052a, eif -> 0x0522, babk -> 0x0520 }
            if (r9 == 0) goto L_0x046a
            hpe r9 = defpackage.ajjb.a()     // Catch:{ IOException -> 0x052a, eif -> 0x0522, babk -> 0x0520 }
            r13 = r9
            goto L_0x046b
        L_0x046a:
            r13 = r3
        L_0x046b:
            ajkj r9 = r15.c     // Catch:{ eif -> 0x04ff, Exception -> 0x04f6, all -> 0x04f1 }
            r10 = r2
            r12 = r0
            r3 = r13
            r13 = r14
            r6 = r14
            r5 = r15
            r14 = r7
            ajkh r9 = r9.a(r10, r11, r12, r13, r14)     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
            boolean r10 = defpackage.ajld.a((defpackage.ajkh) r9, (long) r7)     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
            if (r10 != 0) goto L_0x0486
            boolean r11 = defpackage.ajld.b(r9)     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
            if (r11 != 0) goto L_0x0486
            r11 = 0
            goto L_0x0487
        L_0x0486:
            r11 = 1
        L_0x0487:
            if (r9 != 0) goto L_0x048a
            goto L_0x048c
        L_0x048a:
            if (r11 == 0) goto L_0x0498
        L_0x048c:
            r5.a((android.accounts.Account) r2, (java.lang.String) r0)     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
            ajmm r0 = r5.a     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
            r0.a((android.accounts.Account) r2, (long) r12)     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
        L_0x0498:
            if (r11 == 0) goto L_0x049d
            r5.a((defpackage.ajkh) r9)     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
        L_0x049d:
            r11 = 1
            r5.a((android.accounts.Account) r2, (boolean) r11)     // Catch:{ eif -> 0x04ef, Exception -> 0x04ed }
            if (r10 != 0) goto L_0x04a5
            goto L_0x04a6
        L_0x04a5:
            r9 = 0
        L_0x04a6:
            if (r9 == 0) goto L_0x04ab
            java.lang.String r0 = "UlrProfUploadSettings"
            goto L_0x04ad
        L_0x04ab:
            java.lang.String r0 = "UlrProfUploadSuccess"
        L_0x04ad:
            if (r3 == 0) goto L_0x04ba
            hpg r0 = defpackage.ajjb.b(r0)     // Catch:{ IOException -> 0x04b7, eif -> 0x0522, babk -> 0x0520 }
            r3.a(r0)     // Catch:{ IOException -> 0x04b7, eif -> 0x0522, babk -> 0x0520 }
            goto L_0x04ba
        L_0x04b7:
            r0 = move-exception
            goto L_0x052c
        L_0x04ba:
            if (r9 != 0) goto L_0x04e4
            java.lang.String r0 = defpackage.rmp.a((android.accounts.Account) r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Batch Location Update succeeded for account "
            int r3 = r0.length()
            if (r3 != 0) goto L_0x04d2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x04d6
        L_0x04d2:
            java.lang.String r0 = r2.concat(r0)
        L_0x04d6:
            java.lang.String r2 = "GCoreUlr"
            defpackage.ajix.a((java.lang.String) r2, (java.lang.String) r0)
            ajik r0 = r1.g
            r0.a((defpackage.ajip) r6)
            r3 = 1
            r7 = 0
            goto L_0x0542
        L_0x04e4:
            r1.a(r2, r9, r7)
            r3 = 6
            r7 = 0
            goto L_0x0542
        L_0x04eb:
            r0 = move-exception
            goto L_0x04f4
        L_0x04ed:
            r0 = move-exception
            goto L_0x04f9
        L_0x04ef:
            r0 = move-exception
            goto L_0x0503
        L_0x04f1:
            r0 = move-exception
            r3 = r13
            r6 = r14
        L_0x04f4:
            r7 = 0
            goto L_0x050d
        L_0x04f6:
            r0 = move-exception
            r3 = r13
            r6 = r14
        L_0x04f9:
            java.lang.String r8 = "UlrProfUploadException"
            throw r0     // Catch:{ all -> 0x04fc }
        L_0x04fc:
            r0 = move-exception
            r7 = 0
            goto L_0x050e
        L_0x04ff:
            r0 = move-exception
            r3 = r13
            r6 = r14
            r5 = r15
        L_0x0503:
            r7 = 0
            r5.a((android.accounts.Account) r2, (boolean) r7)     // Catch:{ all -> 0x050c }
            java.lang.String r8 = "UlrProfUploadException"
            throw r0     // Catch:{ all -> 0x050a }
        L_0x050a:
            r0 = move-exception
            goto L_0x050e
        L_0x050c:
            r0 = move-exception
        L_0x050d:
            r8 = 0
        L_0x050e:
            if (r3 == 0) goto L_0x0519
            if (r8 == 0) goto L_0x0519
            hpg r5 = defpackage.ajjb.b(r8)     // Catch:{ IOException -> 0x051e, eif -> 0x051c, babk -> 0x051a }
            r3.a(r5)     // Catch:{ IOException -> 0x051e, eif -> 0x051c, babk -> 0x051a }
        L_0x0519:
            throw r0     // Catch:{ IOException -> 0x051e, eif -> 0x051c, babk -> 0x051a }
        L_0x051a:
            r0 = move-exception
            goto L_0x0524
        L_0x051c:
            r0 = move-exception
            goto L_0x0524
        L_0x051e:
            r0 = move-exception
            goto L_0x052d
        L_0x0520:
            r0 = move-exception
            goto L_0x0523
        L_0x0522:
            r0 = move-exception
        L_0x0523:
            r7 = 0
        L_0x0524:
            a(r2, r0)
            r3 = 8
            goto L_0x0542
        L_0x052a:
            r0 = move-exception
            r6 = r14
        L_0x052c:
            r7 = 0
        L_0x052d:
            a(r2, r0)
            boolean r2 = a(r0)
            if (r2 == 0) goto L_0x0541
            ajik r2 = r1.g
            r2.a((defpackage.ajip) r6)
            defpackage.ajjf.a(r0)
            r3 = 10
            goto L_0x0542
        L_0x0541:
            r3 = 7
        L_0x0542:
            if (r19 == 0) goto L_0x0551
            if (r4 == 0) goto L_0x0551
            ajhf r0 = r1.k
            r2 = 1
            if (r3 != r2) goto L_0x054d
            r5 = 1
            goto L_0x054e
        L_0x054d:
            r5 = 0
        L_0x054e:
            r0.a(r5)
        L_0x0551:
            return r3
        L_0x0552:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0552 }
            goto L_0x0556
        L_0x0555:
            throw r0
        L_0x0556:
            goto L_0x0555
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajks.a(com.google.android.location.reporting.state.update.AccountConfig, boolean, int, long):int");
    }

    public final void a(Account account, ajkh ajkh, long j2) {
        String valueOf = String.valueOf(ajkh);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
        sb.append("Server reports setting change occurred after ");
        sb.append(j2);
        sb.append(", requesting sync: ");
        sb.append(valueOf);
        ajix.a("GCoreUlr", sb.toString());
        ReportingSyncChimeraService.a(account, "LocationReporter", this.a);
    }
}
