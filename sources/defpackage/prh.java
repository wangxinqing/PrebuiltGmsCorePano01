package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.service.LightweightIndexChimeraService;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: prh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prh extends dut implements niz {
    private static int l;
    final pxs a;
    final oyq b;
    final pxf c;
    final oyt d;
    final oxx e;
    final pwz f;
    final pwv g;
    final aagp h;
    final hya i;
    final pas j;
    final aplf k;
    private final LightweightIndexChimeraService m;
    private final Executor n;
    private final nix o;
    private final String p;
    private final int q;

    public prh(LightweightIndexChimeraService lightweightIndexChimeraService, Executor executor, nix nix, String str, int i2, pxs pxs, oyq oyq, pxf pxf, oyt oyt, oxx oxx, pwz pwz, pwv pwv, hya hya, pas pas, aplf aplf) {
        this.m = lightweightIndexChimeraService;
        this.n = executor;
        this.o = nix;
        this.p = str;
        this.q = i2;
        this.a = pxs;
        this.b = oyq;
        this.c = pxf;
        this.d = oyt;
        this.e = oxx;
        this.f = pwz;
        this.g = pwv;
        this.h = aafi.b(lightweightIndexChimeraService);
        this.i = hya;
        this.j = pas;
        this.k = aplf;
        if (l == 0) {
            int i3 = 0;
            try {
                PackageInfo packageInfo = this.m.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 64);
                if (this.i.a(packageInfo) && packageInfo.applicationInfo != null) {
                    i3 = packageInfo.applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
            l = i3;
        }
    }

    private final String a(aolv aolv) {
        aolv aolv2 = aolv.CONTENT_UPDATE;
        int ordinal = aolv.ordinal();
        if (ordinal == 3) {
            String str = this.p;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("START[");
            sb.append(str);
            sb.append("]");
            return sb.toString();
        } else if (ordinal != 4) {
            return "UNKNOWN";
        } else {
            String str2 = this.p;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 5);
            sb2.append("END[");
            sb2.append(str2);
            sb2.append("]");
            return sb2.toString();
        }
    }

    private final void a(aolv aolv, aolx aolx, int i2) {
        if (this.j.a(this.j.a())) {
            this.b.a(this.p, this.q, aolv, aolx, i2, (Set) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r2 = r4;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r2 = r4;
        r6 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8 A[SYNTHETIC, Splitter:B:45:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7 A[SYNTHETIC, Splitter:B:53:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d7 A[SYNTHETIC, Splitter:B:60:0x00d7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.dux r11, com.google.android.gms.appdatasearch.UsageInfo[] r12, java.lang.String r13) {
        /*
            r10 = this;
            if (r12 == 0) goto L_0x0106
            com.google.android.gms.icing.service.LightweightIndexChimeraService r0 = r10.m
            java.lang.String r1 = r10.p
            defpackage.pwp.a((android.content.Context) r0, (java.lang.String) r1, (com.google.android.gms.appdatasearch.UsageInfo[]) r12, (java.lang.String) r13)
            com.google.android.gms.icing.service.LightweightIndexChimeraService r13 = r10.m
            java.lang.String r0 = r10.p
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = defpackage.hxz.a()
            if (r3 != 0) goto L_0x00e7
            agvx r3 = defpackage.ozx.aR
            java.lang.Object r3 = r3.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0027
            goto L_0x00e7
        L_0x0027:
            java.util.List r1 = defpackage.pxq.a(r13, r1)
            java.lang.String r2 = "Not reporting usage and writing to app history debug file instead."
            defpackage.oso.d(r2)
            java.util.List r0 = defpackage.pwp.a((android.content.Context) r13, (java.lang.String) r0, (java.util.List) r1, (com.google.android.gms.appdatasearch.UsageInfo[]) r12)
            java.lang.Object r1 = defpackage.pwp.a
            monitor-enter(r1)
            java.io.File r2 = r13.getFilesDir()     // Catch:{ all -> 0x00e4 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00e4 }
            java.lang.String r4 = "icing_app_history_debug"
            r3.<init>(r2, r4)     // Catch:{ all -> 0x00e4 }
            boolean r2 = r3.exists()     // Catch:{ all -> 0x00e4 }
            if (r2 == 0) goto L_0x00dd
            r2 = 0
            r3 = 0
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ad, all -> 0x00ab }
            java.lang.String r5 = "icing_app_history_debug"
            r6 = 32768(0x8000, float:4.5918E-41)
            java.io.FileOutputStream r13 = r13.openFileOutput(r5, r6)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ad, all -> 0x00ab }
            r4.<init>(r13)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00ad, all -> 0x00ab }
            r13 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r13]     // Catch:{ FileNotFoundException -> 0x00a7, IOException -> 0x00a3, all -> 0x00a0 }
            aubk r5 = defpackage.aubk.a((byte[]) r2)     // Catch:{ FileNotFoundException -> 0x00a7, IOException -> 0x00a3, all -> 0x00a0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ FileNotFoundException -> 0x00a7, IOException -> 0x00a3, all -> 0x00a0 }
            r6 = 0
        L_0x0065:
            boolean r7 = r0.hasNext()     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            if (r7 == 0) goto L_0x008b
            java.lang.Object r7 = r0.next()     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            pqm r7 = (defpackage.pqm) r7     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            int r8 = r7.U     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            r9 = -1
            if (r8 != r9) goto L_0x0082
            aueh r8 = defpackage.aueh.a     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            aueq r8 = r8.a((java.lang.Object) r7)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            int r8 = r8.b(r7)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            r7.U = r8     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
        L_0x0082:
            r5.d((int) r8)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            r7.a((defpackage.aubk) r5)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            int r6 = r6 + 1
            goto L_0x0065
        L_0x008b:
            int r0 = r5.a()     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            int r13 = r13 - r0
            r4.write(r2, r3, r13)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x009a, all -> 0x00a0 }
            r4.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x00ca
        L_0x0098:
            r13 = move-exception
        L_0x0099:
            goto L_0x00ca
        L_0x009a:
            r13 = move-exception
            r2 = r4
            goto L_0x00af
        L_0x009d:
            r13 = move-exception
            r2 = r4
            goto L_0x00be
        L_0x00a0:
            r11 = move-exception
            r2 = r4
            goto L_0x00d5
        L_0x00a3:
            r13 = move-exception
            r2 = r4
            r6 = 0
            goto L_0x00af
        L_0x00a7:
            r13 = move-exception
            r2 = r4
            r6 = 0
            goto L_0x00be
        L_0x00ab:
            r11 = move-exception
            goto L_0x00d5
        L_0x00ad:
            r13 = move-exception
            r6 = 0
        L_0x00af:
            java.lang.String r0 = "Failed to write to app history debug file."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d4 }
            defpackage.oso.a((java.lang.Throwable) r13, (java.lang.String) r0, (java.lang.Object[]) r3)     // Catch:{ all -> 0x00d4 }
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x00ca
        L_0x00bc:
            r13 = move-exception
            r6 = 0
        L_0x00be:
            java.lang.String r0 = "Unable to create app history debug file."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d4 }
            defpackage.oso.a((java.lang.Throwable) r13, (java.lang.String) r0, (java.lang.Object[]) r3)     // Catch:{ all -> 0x00d4 }
            if (r2 == 0) goto L_0x0099
            r2.close()     // Catch:{ IOException -> 0x0098 }
        L_0x00ca:
            java.lang.String r13 = "Dumped %d app history events to debug file."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e4 }
            defpackage.oso.a((java.lang.String) r13, (java.lang.Object) r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x00e2
        L_0x00d4:
            r11 = move-exception
        L_0x00d5:
            if (r2 == 0) goto L_0x00dc
            r2.close()     // Catch:{ IOException -> 0x00db }
            goto L_0x00dc
        L_0x00db:
            r12 = move-exception
        L_0x00dc:
            throw r11     // Catch:{ all -> 0x00e4 }
        L_0x00dd:
            java.lang.String r13 = "App history debug file doesn't exist."
            defpackage.oso.a(r13)     // Catch:{ all -> 0x00e4 }
        L_0x00e2:
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            goto L_0x00ec
        L_0x00e4:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r11
        L_0x00e7:
            java.lang.String r13 = "App history debug disabled."
            defpackage.oso.d(r13)
        L_0x00ec:
            nix r13 = r10.o
            com.google.android.gms.icing.service.LightweightIndexChimeraService r0 = r10.m
            prk r9 = new prk
            aagp r3 = r10.h
            pas r4 = r10.j
            pxs r5 = r10.a
            oyq r6 = r10.b
            java.lang.String r8 = r10.p
            r1 = r9
            r2 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.a(r0, r9)
            return
        L_0x0106:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "null usageInfo"
            r11.<init>(r12)
            goto L_0x010f
        L_0x010e:
            throw r11
        L_0x010f:
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prh.a(dux, com.google.android.gms.appdatasearch.UsageInfo[], java.lang.String):void");
    }

    private final void a(UsageInfo[] usageInfoArr) {
        baza a2;
        int i2;
        boolean b2 = this.i.b(this.p);
        boolean booleanValue = ((Boolean) ozx.D.c()).booleanValue();
        boolean a3 = this.j.a(this.j.a());
        if (!b2 && booleanValue && !a3) {
            oso.a("Ignoring usage report: missing consent.");
            booleanValue = false;
        }
        if (b2 || booleanValue) {
            for (UsageInfo usageInfo : usageInfoArr) {
                if (usageInfo != null && ((i2 = usageInfo.c) == 4 || i2 == 0 || i2 == 5)) {
                    this.f.a(usageInfo, b2);
                }
            }
        }
        this.g.b();
        if (!this.g.a()) {
            for (UsageInfo usageInfo2 : usageInfoArr) {
                String str = null;
                if (!(usageInfo2 == null || usageInfo2.e == null || (a2 = dtv.a("completionToken", usageInfo2)) == null)) {
                    bazd bazd = a2.c;
                    if (bazd == null) {
                        bazd = bazd.g;
                    }
                    str = bazd.c;
                }
                pwv pwv = this.g;
                if (!(str == null || pwv.b.get(str) == null)) {
                    LightweightIndexChimeraService lightweightIndexChimeraService = this.m;
                    if (hya.a((Context) lightweightIndexChimeraService).b("com.google.android.googlequicksearchbox")) {
                        lightweightIndexChimeraService.sendBroadcast(new Intent("com.google.android.gms.appindex.action.APPINDEX_CONTEXT_UPDATED").putExtra("com.google.android.gms.appindex.extra.COMPLETION_TOKEN", str).setPackage("com.google.android.googlequicksearchbox"));
                    }
                    pwv pwv2 = this.g;
                    if (str != null) {
                        pwv2.b.remove(str);
                    }
                }
            }
        }
    }

    private final boolean a() {
        return Binder.getCallingUid() == l && "com.google.android.googlequicksearchbox".equals(this.p);
    }

    public final void a(GetRecentContextCall$Request getRecentContextCall$Request, dux dux) {
        if (a() || jhg.b()) {
            this.o.a(this.m, new pra(getRecentContextCall$Request, dux, this.f));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void a(dux dux) {
        if (jhg.b()) {
            this.o.a(this.m, new prf(dux, this.a));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void a(dux dux, String str) {
        if (a()) {
            try {
                pwv pwv = this.g;
                String str2 = this.p;
                long currentTimeMillis = System.currentTimeMillis();
                if (str != null) {
                    if (str2 != null) {
                        pwv.b();
                        pwv.b.put(str, new pwu(currentTimeMillis));
                    }
                }
                dux.a(Status.a);
            } catch (RemoteException e2) {
                oso.c((Throwable) e2, "Client died during registerCompletionFilter", new Object[0]);
            }
        } else {
            throw new SecurityException("Access denied");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x018e A[SYNTHETIC, Splitter:B:107:0x018e] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0195 A[Catch:{ all -> 0x01fe, all -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x019c A[Catch:{ all -> 0x01fe, all -> 0x0213 }, LOOP:1: B:73:0x010e->B:111:0x019c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01e7 A[Catch:{ all -> 0x01fe, all -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015c A[SYNTHETIC, Splitter:B:91:0x015c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dux r20, com.google.android.gms.appdatasearch.UsageInfo[] r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 0
            hya r0 = r1.i     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = r1.p     // Catch:{ all -> 0x01fe }
            boolean r5 = r0.b((java.lang.String) r5)     // Catch:{ all -> 0x01fe }
            axsj r0 = defpackage.axsj.a     // Catch:{ all -> 0x01fe }
            axsk r0 = r0.a()     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.a()     // Catch:{ all -> 0x01fe }
            r6 = 1
            if (r0 != 0) goto L_0x001d
            goto L_0x0078
        L_0x001d:
            if (r5 != 0) goto L_0x0078
            oyq r0 = r1.b     // Catch:{ all -> 0x01fe }
            java.lang.String r3 = r1.p     // Catch:{ all -> 0x01fe }
            long r7 = defpackage.axrp.c()     // Catch:{ all -> 0x01fe }
            boolean r5 = r0.a((long) r7)     // Catch:{ all -> 0x01fe }
            if (r5 == 0) goto L_0x0077
            aoji r5 = defpackage.aoji.R     // Catch:{ all -> 0x01fe }
            aucd r5 = r5.o()     // Catch:{ all -> 0x01fe }
            aojb r9 = defpackage.aojb.d     // Catch:{ all -> 0x01fe }
            aucd r9 = r9.o()     // Catch:{ all -> 0x01fe }
            boolean r10 = r9.c     // Catch:{ all -> 0x01fe }
            if (r10 != 0) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r9.c()     // Catch:{ all -> 0x01fe }
            r9.c = r4     // Catch:{ all -> 0x01fe }
        L_0x0043:
            aucj r10 = r9.b     // Catch:{ all -> 0x01fe }
            aojb r10 = (defpackage.aojb) r10     // Catch:{ all -> 0x01fe }
            r3.getClass()     // Catch:{ all -> 0x01fe }
            int r11 = r10.a     // Catch:{ all -> 0x01fe }
            r6 = r6 | r11
            r10.a = r6     // Catch:{ all -> 0x01fe }
            r10.b = r3     // Catch:{ all -> 0x01fe }
            boolean r3 = r5.c     // Catch:{ all -> 0x01fe }
            if (r3 != 0) goto L_0x0056
            goto L_0x005b
        L_0x0056:
            r5.c()     // Catch:{ all -> 0x01fe }
            r5.c = r4     // Catch:{ all -> 0x01fe }
        L_0x005b:
            aucj r3 = r5.b     // Catch:{ all -> 0x01fe }
            aoji r3 = (defpackage.aoji) r3     // Catch:{ all -> 0x01fe }
            aucj r6 = r9.i()     // Catch:{ all -> 0x01fe }
            aojb r6 = (defpackage.aojb) r6     // Catch:{ all -> 0x01fe }
            r6.getClass()     // Catch:{ all -> 0x01fe }
            r3.x = r6     // Catch:{ all -> 0x01fe }
            int r6 = r3.a     // Catch:{ all -> 0x01fe }
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            r6 = r6 | r9
            r3.a = r6     // Catch:{ all -> 0x01fe }
            r3 = 6017(0x1781, float:8.432E-42)
            r0.a((int) r3, (defpackage.aucd) r5, (long) r7)     // Catch:{ all -> 0x01fe }
            return
        L_0x0077:
            return
        L_0x0078:
            com.google.android.gms.icing.service.LightweightIndexChimeraService r7 = r1.m     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = r1.p     // Catch:{ all -> 0x01fe }
            r9 = 0
        L_0x007d:
            int r0 = r3.length     // Catch:{ all -> 0x01fe }
            java.lang.String r10 = "AppIndexApi"
            if (r9 < r0) goto L_0x0089
            r1.a((com.google.android.gms.appdatasearch.UsageInfo[]) r3)     // Catch:{ all -> 0x01fe }
            r1.a((defpackage.dux) r2, (com.google.android.gms.appdatasearch.UsageInfo[]) r3, (java.lang.String) r10)     // Catch:{ all -> 0x01fe }
            return
        L_0x0089:
            r0 = r3[r9]     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x0091
            r18 = r5
            goto L_0x01f4
        L_0x0091:
            int r11 = r0.c     // Catch:{ all -> 0x01fe }
            r12 = 3
            if (r11 != r12) goto L_0x00a1
            r11 = 2
            r0.h = r11     // Catch:{ all -> 0x01fe }
            if (r5 == 0) goto L_0x009f
            r11 = 4
            r0.c = r11     // Catch:{ all -> 0x01fe }
            goto L_0x00a1
        L_0x009f:
            r0.c = r4     // Catch:{ all -> 0x01fe }
        L_0x00a1:
            int r11 = r0.h     // Catch:{ all -> 0x01fe }
            if (r11 != 0) goto L_0x00a7
            r0.h = r6     // Catch:{ all -> 0x01fe }
        L_0x00a7:
            if (r0 == 0) goto L_0x01e1
            com.google.android.gms.appdatasearch.DocumentId r12 = r0.a     // Catch:{ all -> 0x01fe }
            if (r12 == 0) goto L_0x01dc
            java.lang.String r13 = r12.a     // Catch:{ all -> 0x01fe }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01fe }
            if (r14 != 0) goto L_0x00d3
            java.lang.String r14 = r12.b     // Catch:{ all -> 0x01fe }
            if (r14 != 0) goto L_0x00bc
            java.lang.String r12 = "Null corpus name specified"
            goto L_0x00d5
        L_0x00bc:
            if (r5 == 0) goto L_0x00bf
            goto L_0x00c8
        L_0x00bf:
            boolean r13 = r13.equals(r8)     // Catch:{ all -> 0x01fe }
            if (r13 != 0) goto L_0x00c8
            java.lang.String r12 = "Invalid package name provided in the app URL"
            goto L_0x00d5
        L_0x00c8:
            java.lang.String r13 = "Uri"
            java.lang.String r12 = r12.c     // Catch:{ all -> 0x01fe }
            r14 = 256(0x100, float:3.59E-43)
            java.lang.String r12 = defpackage.osn.d(r13, r12, r14)     // Catch:{ all -> 0x01fe }
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r12 = "No package name specified"
        L_0x00d5:
            if (r12 != 0) goto L_0x01d9
            long r12 = r0.b     // Catch:{ all -> 0x01fe }
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x01d4
            int r12 = r0.c     // Catch:{ all -> 0x01fe }
            if (r12 >= 0) goto L_0x00e7
            r18 = r5
            goto L_0x01c0
        L_0x00e7:
            r13 = 5
            if (r12 > r13) goto L_0x01be
            com.google.android.gms.appdatasearch.DocumentContents r0 = r0.e     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x01ba
            android.accounts.Account r12 = r0.d     // Catch:{ all -> 0x01fe }
            if (r12 != 0) goto L_0x00f3
            goto L_0x00ff
        L_0x00f3:
            boolean r12 = defpackage.jgu.a((android.content.Context) r7, (android.accounts.Account) r12)     // Catch:{ all -> 0x01fe }
            if (r12 != 0) goto L_0x00ff
            java.lang.String r12 = "Invalid account specified"
            r18 = r5
            goto L_0x01e5
        L_0x00ff:
            com.google.android.gms.appdatasearch.DocumentSection[] r12 = r0.a     // Catch:{ all -> 0x01fe }
            int r13 = r12.length     // Catch:{ all -> 0x01fe }
            r14 = 16
            if (r13 <= r14) goto L_0x010c
            java.lang.String r12 = "Too many sections"
            r18 = r5
            goto L_0x01e5
        L_0x010c:
            r14 = 0
            r15 = 0
        L_0x010e:
            if (r14 >= r13) goto L_0x01ad
            r6 = r12[r14]     // Catch:{ all -> 0x01fe }
            java.lang.String r17 = r6.a()     // Catch:{ all -> 0x01fe }
            if (r17 != 0) goto L_0x01a8
            osm r17 = defpackage.osn.b     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = "name"
            com.google.android.gms.appdatasearch.RegisterSectionInfo r11 = r6.d     // Catch:{ all -> 0x01fe }
            java.lang.String r11 = r11.h     // Catch:{ all -> 0x01fe }
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x01fe }
            if (r4 != 0) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            osm r17 = defpackage.osn.a     // Catch:{ all -> 0x01fe }
        L_0x0129:
            int r4 = r6.e     // Catch:{ all -> 0x01fe }
            int r11 = com.google.android.gms.appdatasearch.DocumentSection.a     // Catch:{ all -> 0x01fe }
            if (r4 == r11) goto L_0x014d
            int r4 = r6.e     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = defpackage.dtb.a((int) r4)     // Catch:{ all -> 0x01fe }
            boolean r11 = r0.c     // Catch:{ all -> 0x01fe }
            if (r11 == 0) goto L_0x0147
            java.lang.String r11 = "text1"
            boolean r4 = r4.equals(r11)     // Catch:{ all -> 0x01fe }
            if (r4 == 0) goto L_0x014d
            osm r17 = defpackage.osn.a     // Catch:{ all -> 0x01fe }
            r4 = r17
            r15 = 1
            goto L_0x0150
        L_0x0147:
            java.lang.String r12 = "Has global search fields but global search not enabled"
            r18 = r5
            goto L_0x01e5
        L_0x014d:
            r4 = r17
        L_0x0150:
            java.lang.String r11 = ".private:action"
            com.google.android.gms.appdatasearch.RegisterSectionInfo r1 = r6.d     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = r1.a     // Catch:{ all -> 0x01fe }
            boolean r1 = r11.equals(r1)     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x0186
            byte[] r1 = r6.f     // Catch:{ auda -> 0x017f }
            aubs r11 = defpackage.aubs.c()     // Catch:{ auda -> 0x017f }
            r18 = r5
            bazc r5 = defpackage.bazc.d     // Catch:{ auda -> 0x017d }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r1, (defpackage.aubs) r11)     // Catch:{ auda -> 0x017d }
            bazc r1 = (defpackage.bazc) r1     // Catch:{ auda -> 0x017d }
            aucx r1 = r1.c     // Catch:{ auda -> 0x017d }
            int r1 = r1.size()     // Catch:{ auda -> 0x017d }
            r5 = 30
            if (r1 <= r5) goto L_0x0188
            java.lang.String r12 = "Too many action properties declared (max: 30)"
            android.util.Log.w(r10, r12)     // Catch:{ auda -> 0x017d }
            goto L_0x01e5
        L_0x017d:
            r0 = move-exception
            goto L_0x0182
        L_0x017f:
            r0 = move-exception
            r18 = r5
        L_0x0182:
            java.lang.String r12 = "Malformed action provided"
            goto L_0x01e5
        L_0x0186:
            r18 = r5
        L_0x0188:
            java.lang.String r1 = r6.c     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = "Contents"
            if (r1 != 0) goto L_0x0195
            byte[] r1 = r6.f     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = r4.a((java.lang.String) r5, (byte[]) r1)     // Catch:{ all -> 0x01fe }
            goto L_0x019a
        L_0x0195:
            java.lang.String r1 = r4.a((java.lang.String) r5, (java.lang.String) r1)     // Catch:{ all -> 0x01fe }
        L_0x019a:
            if (r1 != 0) goto L_0x01a6
            int r14 = r14 + 1
            r1 = r19
            r5 = r18
            r4 = 0
            r6 = 1
            goto L_0x010e
        L_0x01a6:
            r12 = r1
            goto L_0x01e5
        L_0x01a8:
            r18 = r5
            r12 = r17
            goto L_0x01e5
        L_0x01ad:
            r18 = r5
            boolean r0 = r0.c     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x01b5
        L_0x01b3:
            r12 = 0
            goto L_0x01e5
        L_0x01b5:
            if (r15 != 0) goto L_0x01b3
            java.lang.String r12 = "Global search enabled but no title or no data"
            goto L_0x01e5
        L_0x01ba:
            r18 = r5
            r12 = 0
            goto L_0x01e5
        L_0x01be:
            r18 = r5
        L_0x01c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r1 = 27
            r0.<init>(r1)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "Bad usage type: "
            r0.append(r1)     // Catch:{ all -> 0x01fe }
            r0.append(r12)     // Catch:{ all -> 0x01fe }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x01fe }
            goto L_0x01e5
        L_0x01d4:
            r18 = r5
            java.lang.String r12 = "Negative timestamp specified"
            goto L_0x01e5
        L_0x01d9:
            r18 = r5
            goto L_0x01e5
        L_0x01dc:
            r18 = r5
            java.lang.String r12 = "No document ID"
            goto L_0x01e5
        L_0x01e1:
            r18 = r5
            java.lang.String r12 = "No usageInfo"
        L_0x01e5:
            if (r12 == 0) goto L_0x01f4
            java.lang.String r0 = "Received an invalid action."
            android.util.Log.w(r10, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "Ignoring usage report, got bad usage info: %s, clientPackageName: %s"
            defpackage.oso.e(r0, r12, r8)     // Catch:{ all -> 0x01fe }
            r1 = 0
            r3[r9] = r1     // Catch:{ all -> 0x01fe }
        L_0x01f4:
            int r9 = r9 + 1
            r1 = r19
            r5 = r18
            r4 = 0
            r6 = 1
            goto L_0x007d
        L_0x01fe:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Error reporting usage."
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.Object[]) r1)
            boolean r1 = defpackage.hxz.a()
            if (r1 == 0) goto L_0x021a
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c     // Catch:{ all -> 0x0213 }
            r2.a((com.google.android.gms.common.api.Status) r0)     // Catch:{ all -> 0x0213 }
            return
        L_0x0213:
            r0 = move-exception
            java.lang.String r0 = "Client died while providing callback."
            defpackage.oso.e(r0)
            return
        L_0x021a:
            goto L_0x021c
        L_0x021b:
            throw r0
        L_0x021c:
            goto L_0x021b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prh.a(dux, com.google.android.gms.appdatasearch.UsageInfo[]):void");
    }

    public final void a(dux dux, ActionImpl[] actionImplArr) {
        String str;
        aolv aolv;
        String str2;
        String str3;
        dux dux2 = dux;
        ActionImpl[] actionImplArr2 = actionImplArr;
        aolx aolx = aolx.NO_ERROR;
        String str4 = this.p;
        pxf pxf = this.c;
        if (actionImplArr2 == null) {
            throw new oxa("Actions cannot be null.", aolx.INVALID_ARGUMENT_NULL);
        } else if (actionImplArr2.length == 1) {
            ActionImpl actionImpl = actionImplArr2[0];
            if (actionImpl != null) {
                int i2 = actionImpl.e.a;
                if (i2 == 1) {
                    aolv = aolv.ACTION_START;
                } else if (i2 == 2) {
                    aolv = aolv.ACTION_END;
                } else {
                    throw new oxa("EventStatus in Metadata is not supported.", actionImpl, aolx.INVALID_ACTION_EVENT_STATUS);
                }
                String str5 = actionImpl.c;
                if (str5 != null) {
                    try {
                        oyn.a(str5);
                    } catch (IllegalArgumentException e2) {
                        IllegalArgumentException illegalArgumentException = e2;
                        throw new oxa(aolv, illegalArgumentException.getMessage(), actionImpl, aolx.INVALID_ARGUMENT_URI, illegalArgumentException);
                    } catch (IllegalArgumentException e3) {
                        IllegalArgumentException illegalArgumentException2 = e3;
                        throw new oxa(aolv, illegalArgumentException2.getMessage(), actionImpl, aolx.INVALID_INDEXABLE_INVALID_WEB_URL, illegalArgumentException2);
                    } catch (pxe e4) {
                        throw new oxa(aolv, e4.getMessage(), actionImpl, aolx.NO_PERMISSION);
                    } catch (oxa e5) {
                        oxa oxa = e5;
                        aolx aolx2 = oxa.a;
                        String message = oxa.getMessage();
                        try {
                            ActionImpl actionImpl2 = oxa.c;
                            if (actionImpl2 != null) {
                                String valueOf = String.valueOf(actionImpl2);
                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 24 + String.valueOf(valueOf).length());
                                sb.append(message);
                                sb.append(" The invalid action is: ");
                                sb.append(valueOf);
                                str = sb.toString();
                            } else {
                                str = message;
                            }
                            try {
                                oso.c((Throwable) oxa, "%s failed", a(oxa.b));
                                apmu.a(String.format("Invalid Action detected: %s", new Object[]{str}));
                                this.e.a(this.p, oxa.b, aolx2, oxa.getMessage(), (Thing) null, oxa.c);
                            } catch (Exception e6) {
                                e = e6;
                                message = str;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            this.d.a("reportUserActions catch", e, axrp.f());
                            str = message;
                            a(dux, actionImplArr, aolx2, oxa.b, str);
                            return;
                        }
                        a(dux, actionImplArr, aolx2, oxa.b, str);
                        return;
                    }
                }
                if (!axrj.c()) {
                    String[] stringArray = actionImpl.g.getStringArray("url");
                    if (stringArray != null && stringArray.length > 0 && !stringArray[0].isEmpty()) {
                        if (!stringArray[0].equals(str5)) {
                            throw new oxa(aolv, "Action and Object URLs must match.", actionImpl, aolx.INVALD_ACTION_URL_MISMATCH);
                        }
                    }
                }
                String str6 = actionImpl.d;
                if (str6 != null) {
                    oyn.b(str6);
                }
                if (((Boolean) ozx.E.c()).booleanValue()) {
                    str2 = pxf.a(str5);
                    if (str2 != null) {
                        pxf.a(str4, str2);
                    }
                } else {
                    str2 = null;
                }
                oxb oxb = new oxb(aolv, str2);
                String str7 = this.p;
                if (!((Boolean) ozx.ar.c()).booleanValue() || ozx.b(str7)) {
                    a(dux, actionImplArr, aolx.NOT_ALLOWED, oxb.a, (String) null);
                    return;
                }
                ActionImpl actionImpl3 = actionImplArr2[0];
                if (axrj.c()) {
                    String str8 = this.p;
                    oyq oyq = this.b;
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme("appindex").authority(str8).path("action").appendQueryParameter("type", actionImpl3.a).appendQueryParameter("object", actionImpl3.c);
                    if (appendQueryParameter.toString().length() > 256) {
                        oso.d("ActionUrl is too long and need to be hashed, callerPackageName : %s, actionType : %s.", str8, actionImpl3.a);
                        oyq.a("actions_rewrite_uri_too_long");
                        appendQueryParameter.clearQuery().appendQueryParameter("type", Long.toHexString(anln.f().a(actionImpl3.a, amqn.c).d())).appendQueryParameter("object", Long.toHexString(anln.f().a(actionImpl3.c, amqn.c).d()));
                    }
                    actionImpl3.g.putStringArray("url", new String[]{appendQueryParameter.toString()});
                }
                ArrayList arrayList = new ArrayList();
                long currentTimeMillis = System.currentTimeMillis();
                oso.a("Report Action");
                oso.a(actionImpl3.toString());
                String str9 = oxb.b;
                if (str9 == null) {
                    arrayList.add(oym.a(actionImpl3, currentTimeMillis, this.p));
                } else {
                    arrayList.add(oym.b(actionImpl3, currentTimeMillis, str9));
                    if ("internal.3p:Message".equals(oxb.b)) {
                        arrayList.add(oym.b(actionImpl3, currentTimeMillis, "sms"));
                    }
                }
                UsageInfo[] usageInfoArr = (UsageInfo[]) arrayList.toArray(new UsageInfo[0]);
                a(usageInfoArr);
                if (axrj.e()) {
                    oso.d("Redirecting reportUserActions() to AppIndexService in main");
                    if (oxb.b != null) {
                        str3 = "com.google.android.gms";
                    } else {
                        str3 = this.p;
                    }
                    ((apmj) this.k).a(new MutateRequest(7, (Thing[]) null, (String[]) null, (String[]) null, actionImplArr2[0], this.p, str3)).a(this.n, (acvp) new prg(this, dux2, actionImplArr2, oxb));
                    a(oxb.a, aolx.TEMPORARY_REDIRECT, 1);
                    return;
                }
                String a2 = a(oxb.a);
                try {
                    this.e.a(this.p, actionImpl3);
                    a(dux2, usageInfoArr, "FirebaseUserActions");
                } catch (Throwable th) {
                    oso.c(th, "Error performing: %s", a2);
                    aolx aolx3 = aolx.INTERNAL_ERROR;
                    this.d.a("reportUserActions INTERNAL_ERROR", th, axrp.f());
                    if (hxz.a()) {
                        try {
                            dux2.a(new Status(oxz.a(aolx3)));
                        } catch (RemoteException e8) {
                            oso.c((Throwable) e8, "Client died while providing callback for: %s", a2);
                        }
                        aolx = aolx3;
                    } else {
                        throw th;
                    }
                }
                a(oxb.a, aolx, actionImplArr2.length);
                return;
            }
            throw new oxa("Action cannot be null.", aolx.INVALID_ARGUMENT_NULL);
        } else {
            throw new oxa("Providing more than one action in one start/end call is not allowed.", aolx.INVALID_ARGUMENT_TOO_MANY);
        }
    }

    public final void a(dux dux, ActionImpl[] actionImplArr, aolx aolx, aolv aolv, String str) {
        int i2 = 0;
        try {
            dux.a(new Status(oxz.a(aolx), str));
        } catch (RemoteException e2) {
            oso.c((Throwable) e2, "Client died while providing callback for: %s", a(aolv));
        }
        if (actionImplArr != null) {
            i2 = actionImplArr.length;
        }
        a(aolv, aolx, i2);
    }
}
