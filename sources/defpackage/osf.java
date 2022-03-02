package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.chimera.Service;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import org.chromium.net.UrlRequest;

/* renamed from: osf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class osf implements orf {
    public static long a;
    public opz A;
    public final ors B = new ors(this);
    public final orv C = new orv(this);
    public final Context b;
    public final ppp c;
    public final String d;
    public final pqf e;
    public final Semaphore f = new Semaphore(1);
    public prp g;
    public osq h;
    public ovk i;
    ozi j;
    public pxs k;
    pxw l;
    public ozb m;
    public NativeIndex n;
    public paj o;
    opu p;
    public owf q;
    public final oyq r;
    public final oyp s;
    public final pas t;
    public final agtt u;
    public final agpk v;
    public final boolean w;
    public final List x = new ArrayList();
    public pxo y = null;
    public String z;

    public osf(Context context, ppp ppp, String str) {
        int i2;
        this.b = context;
        this.c = ppp;
        oyq oyq = new oyq(context);
        this.r = oyq;
        this.s = new oyp(oyq.a);
        this.t = new pat(context);
        this.d = str;
        this.u = new agtt(new osi(), new aekp(), aoqm.a, amta.a((amsv) new osg(context)), new agop(context));
        this.v = new agpk(new osj(), amta.a((amsv) new osh(context)), new agop(context), new aekp(), aoqm.a);
        this.w = true;
        org org2 = new org(this);
        synchronized (ppp.a) {
            ppp.c.add(org2);
            synchronized (ppp.a) {
                ppp.a();
                i2 = ppp.d;
            }
            if (i2 > 0) {
                ppp.b.add(org2);
            }
        }
        this.e = new pqe(context);
    }

    private final osz a(pao pao, ozv ozv) {
        this.c.b(2);
        ozq b2 = b();
        b2.a(pao, ozv, new orz(this));
        osz d2 = b2.d(pao);
        if (ozq.a(d2)) {
            this.o.a(pao);
            owf owf = this.q;
            if (owf != null) {
                owf.b();
            }
        }
        return d2;
    }

    public static oto b(boolean z2) {
        if (!z2) {
            return oto.f;
        }
        aucd o2 = oto.f.o();
        int seconds = (int) TimeUnit.DAYS.toSeconds(14);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        oto oto = (oto) o2.b;
        int i2 = oto.a | 1;
        oto.a = i2;
        oto.b = seconds;
        int i3 = i2 | 2;
        oto.a = i3;
        oto.c = 1;
        int i4 = i3 | 4;
        oto.a = i4;
        oto.d = 20;
        oto.a = i4 | 8;
        oto.e = 20;
        return (oto) o2.i();
    }

    private final void e(String str) {
        ove h2;
        e();
        oso.c("doRemovePackageData %s", (Object) str);
        oyz d2 = this.m.d(str);
        if (d2 != null) {
            if (a(d2) && (h2 = this.n.h()) != null && ovk.a(h2)) {
                a(3);
            }
            a(str);
            return;
        }
        oso.d("doRemovePackageData %s: not a known client", (Object) str);
    }

    public final ozs a() {
        return this.j.b;
    }

    public final void c(String str) {
        this.c.b(2);
        new ozu(this.m, this.B, this.g.h()).a(str);
    }

    public final boolean d() {
        if (this.c.a(2)) {
            return c();
        }
        this.f.acquireUninterruptibly();
        try {
            return c();
        } finally {
            this.f.release();
        }
    }

    public final void f() {
        e();
        ppp ppp = this.c;
        ork ork = new ork(this, aonk.COMMIT_INDEX);
        ppp.d(ork);
        ork.h();
    }

    public final pqa g() {
        e();
        ppp ppp = this.c;
        orn orn = new orn(this, aonk.COMPACT_INDEX);
        ppp.d(orn);
        return orn;
    }

    public final pqa h() {
        ppp ppp = this.c;
        orp orp = new orp(this, aonk.INDEX_MAINTENANCE);
        ppp.d(orp);
        return orp;
    }

    public final otu i() {
        opz b2;
        opz b3;
        opz b4;
        aucd o2 = otu.k.o();
        String language = Locale.getDefault().getLanguage();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        otu otu = (otu) o2.b;
        language.getClass();
        otu.a |= 2;
        otu.b = language;
        opz opz = this.A;
        if (opz != null) {
            o2.a(opz);
        }
        int intValue = ((Integer) ozx.Y.c()).intValue();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        otu otu2 = (otu) o2.b;
        otu2.a |= 4;
        otu2.d = intValue;
        if (((Boolean) ozx.Z.c()).booleanValue() && (b4 = this.h.b("saft-segmenter-model")) != null) {
            o2.a(b4);
        }
        if (pba.n() && (b3 = this.h.b("nicknames")) != null) {
            o2.a(b3);
        }
        if (((Boolean) ozx.aa.c()).booleanValue() && (b2 = this.h.b("address_data")) != null) {
            o2.a(b2);
        }
        aucd o3 = ott.f.o();
        boolean booleanValue = ((Boolean) pba.h.c()).booleanValue();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ott ott = (ott) o3.b;
        ott.a |= 1;
        ott.b = booleanValue;
        boolean i2 = pba.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ott ott2 = (ott) o3.b;
        ott2.a |= 2;
        ott2.c = i2;
        boolean booleanValue2 = ((Boolean) pba.d.c()).booleanValue();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ott ott3 = (ott) o3.b;
        ott3.a |= 8;
        ott3.d = booleanValue2;
        boolean l2 = axsj.a.a().l();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ott ott4 = (ott) o3.b;
        ott4.a |= 16;
        ott4.e = l2;
        ott ott5 = (ott) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        otu otu3 = (otu) o2.b;
        ott5.getClass();
        otu3.e = ott5;
        otu3.a |= 8;
        String absolutePath = this.b.getFilesDir().getAbsolutePath();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        otu otu4 = (otu) o2.b;
        absolutePath.getClass();
        otu4.a |= 16;
        otu4.f = absolutePath;
        String packageName = this.b.getPackageName();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        otu otu5 = (otu) o2.b;
        packageName.getClass();
        otu5.a |= 32;
        otu5.g = packageName;
        byte[] bArr = (byte[]) ozx.bE.c();
        if (bArr != null && bArr.length > 0) {
            try {
                oqe oqe = (oqe) aucj.a((aucj) oqe.d, bArr, aubs.c());
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                otu otu6 = (otu) o2.b;
                oqe.getClass();
                otu6.h = oqe;
                otu6.a |= 64;
            } catch (auda e2) {
                oso.b("Failed to parse pushed acl");
            }
        } else {
            oqe a2 = pxf.a();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            otu otu7 = (otu) o2.b;
            a2.getClass();
            otu7.h = a2;
            otu7.a |= 64;
        }
        long longValue = ((Long) ozx.cp.c()).longValue();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        otu otu8 = (otu) o2.b;
        otu8.a |= 128;
        otu8.i = longValue;
        int a3 = oso.a();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        otu otu9 = (otu) o2.b;
        otu9.a |= 512;
        otu9.j = a3;
        return (otu) o2.i();
    }

    public final void j() {
        this.c.b(2);
        NativeIndex nativeIndex = this.n;
        if (nativeIndex != null) {
            nativeIndex.b();
            this.n = null;
        }
        this.g = null;
        this.y = null;
        this.i = null;
        this.j = null;
        this.m = null;
        this.l = null;
        pxs pxs = this.k;
        if (pxs != null) {
            pxs.b();
            this.k = null;
        }
        this.o = null;
        opu opu = this.p;
        if (opu != null) {
            qub qub = opu.g;
            amkr a2 = amlv.a("AccountManager.removeOnAccountsUpdatedListener");
            try {
                qub.a.removeOnAccountsUpdatedListener(opu);
                if (a2 != null) {
                    a2.close();
                }
                this.p = null;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        owf owf = this.q;
        if (owf != null) {
            owf.b.a("com.google.android.gms.icing.service.IcingGcmTaskService", "drain-request-queue");
            try {
                owf.a.close();
            } catch (IOException e2) {
                oso.a((Throwable) e2, "Failed to close request queue");
            }
            this.q = null;
            return;
        }
        return;
        throw th;
    }

    public final void k() {
        this.c.b(2);
        if (!this.n.a(ozy.a())) {
            oso.c("Failed to rebuild index.");
        }
        this.r.a("index_rebuilt");
    }

    public final void l() {
        this.c.b(2);
        NativeIndex.nativeFlush(this.n.b);
        ozq b2 = b();
        synchronized (b2.a()) {
            paq paq = b2.b;
            Collection<ota> values = b2.f.values();
            SharedPreferences.Editor edit = ((par) paq).a.edit();
            for (ota ota : values) {
                String valueOf = String.valueOf(((par) paq).a(new pao(ota)));
                edit.putString(valueOf.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf), plc.a((audx) ota));
            }
            if (!edit.commit()) {
                b2.e.a("metadata_union_writeMetadataBatch_err");
            } else if (((par) paq).b.b() && !((par) paq).b.a()) {
                oso.b("Failed to delete stale scratch file.");
            }
            b2.g = false;
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02e4 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e6 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fd A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ff A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x030e A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0310 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x031d A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x031e A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0336 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0337 A[ADDED_TO_REGION, Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x034b A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0351 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0355 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0356 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x036c A[SYNTHETIC, Splitter:B:143:0x036c] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0381 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0392 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0394 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0458 A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x045c A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021b A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021d A[Catch:{ auda -> 0x0379 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r25 = this;
            r1 = r25
            oyq r0 = r1.r
            r2 = 6003(0x1773, float:8.412E-42)
            r0.b(r2)
            java.lang.String r0 = "Performing maintenance."
            defpackage.oso.c(r0)
            ppp r0 = r1.c
            r2 = 2
            r0.b((int) r2)
            ozs r6 = r25.a()
            java.lang.Object r10 = r6.a()
            monitor-enter(r10)
            prp r0 = r1.g     // Catch:{ all -> 0x0695 }
            java.lang.Object r11 = r0.g     // Catch:{ all -> 0x0695 }
            monitor-enter(r11)     // Catch:{ all -> 0x0695 }
            prp r0 = r1.g     // Catch:{ all -> 0x0692 }
            java.lang.Object r3 = r0.g     // Catch:{ all -> 0x0692 }
            monitor-enter(r3)     // Catch:{ all -> 0x0692 }
            android.content.SharedPreferences r0 = r0.b     // Catch:{ all -> 0x068f }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x068f }
            java.lang.String r4 = "last-maintenance"
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x068f }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r7)     // Catch:{ all -> 0x068f }
            r0.commit()     // Catch:{ all -> 0x068f }
            monitor-exit(r3)     // Catch:{ all -> 0x068f }
            pas r0 = r1.t     // Catch:{ all -> 0x0692 }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x0692 }
            ppp r0 = r1.c     // Catch:{ all -> 0x0692 }
            r0.b((int) r2)     // Catch:{ all -> 0x0692 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0692 }
            r13 = 8
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0052
            goto L_0x014a
        L_0x0052:
            pqy r0 = defpackage.pqy.c     // Catch:{ all -> 0x0692 }
            aucd r4 = r0.o()     // Catch:{ all -> 0x0692 }
            int[] r5 = new int[r2]     // Catch:{ all -> 0x0692 }
            r5[r8] = r13     // Catch:{ all -> 0x0692 }
            r7 = 7
            r5[r9] = r7     // Catch:{ all -> 0x0692 }
            r15 = 0
        L_0x0060:
            if (r15 >= r2) goto L_0x0141
            pqf r0 = r1.e     // Catch:{ all -> 0x0692 }
            r14 = r5[r15]     // Catch:{ all -> 0x0692 }
            if (r3 != 0) goto L_0x006a
            r0 = 0
            goto L_0x00ce
        L_0x006a:
            if (r14 == r7) goto L_0x009c
            if (r14 != r13) goto L_0x0083
            android.util.Pair[] r14 = new android.util.Pair[r9]     // Catch:{ all -> 0x0692 }
            java.lang.String r7 = "client"
            java.lang.String r13 = "web_app"
            android.util.Pair r7 = android.util.Pair.create(r7, r13)     // Catch:{ all -> 0x0692 }
            r14[r8] = r7     // Catch:{ all -> 0x0692 }
            pqe r0 = (defpackage.pqe) r0     // Catch:{ all -> 0x0692 }
            java.lang.String r7 = "lookup"
            java.lang.String r0 = r0.a(r3, r7, r14)     // Catch:{ all -> 0x0692 }
            goto L_0x00b0
        L_0x0083:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0692 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0692 }
            r3 = 26
            r2.<init>(r3)     // Catch:{ all -> 0x0692 }
            java.lang.String r3 = "Bad setting id "
            r2.append(r3)     // Catch:{ all -> 0x0692 }
            r2.append(r14)     // Catch:{ all -> 0x0692 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0692 }
            r0.<init>(r2)     // Catch:{ all -> 0x0692 }
            throw r0     // Catch:{ all -> 0x0692 }
        L_0x009c:
            android.util.Pair[] r7 = new android.util.Pair[r9]     // Catch:{ all -> 0x0692 }
            java.lang.String r13 = "client"
            java.lang.String r14 = "device"
            android.util.Pair r13 = android.util.Pair.create(r13, r14)     // Catch:{ all -> 0x0692 }
            r7[r8] = r13     // Catch:{ all -> 0x0692 }
            pqe r0 = (defpackage.pqe) r0     // Catch:{ all -> 0x0692 }
            java.lang.String r13 = "lookup"
            java.lang.String r0 = r0.a(r3, r13, r7)     // Catch:{ all -> 0x0692 }
        L_0x00b0:
            if (r0 == 0) goto L_0x00cd
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ca }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x00ca }
            java.lang.String r0 = "history_recording_enabled"
            boolean r0 = r7.has(r0)     // Catch:{ JSONException -> 0x00ca }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "history_recording_enabled"
            boolean r0 = r7.getBoolean(r0)     // Catch:{ JSONException -> 0x00ca }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ JSONException -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            r0 = 0
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            if (r0 != 0) goto L_0x00d1
            goto L_0x013a
        L_0x00d1:
            atzl r7 = defpackage.atzl.e     // Catch:{ all -> 0x0692 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x0692 }
            r13 = r5[r15]     // Catch:{ all -> 0x0692 }
            boolean r14 = r7.c     // Catch:{ all -> 0x0692 }
            if (r14 != 0) goto L_0x00de
            goto L_0x00e3
        L_0x00de:
            r7.c()     // Catch:{ all -> 0x0692 }
            r7.c = r8     // Catch:{ all -> 0x0692 }
        L_0x00e3:
            aucj r14 = r7.b     // Catch:{ all -> 0x0692 }
            atzl r14 = (defpackage.atzl) r14     // Catch:{ all -> 0x0692 }
            int r12 = r14.a     // Catch:{ all -> 0x0692 }
            r12 = r12 | r9
            r14.a = r12     // Catch:{ all -> 0x0692 }
            r14.b = r13     // Catch:{ all -> 0x0692 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0692 }
            if (r0 != 0) goto L_0x00f6
            r0 = 4
            goto L_0x00f7
        L_0x00f6:
            r0 = 3
        L_0x00f7:
            boolean r12 = r7.c     // Catch:{ all -> 0x0692 }
            if (r12 != 0) goto L_0x00fc
            goto L_0x0101
        L_0x00fc:
            r7.c()     // Catch:{ all -> 0x0692 }
            r7.c = r8     // Catch:{ all -> 0x0692 }
        L_0x0101:
            aucj r12 = r7.b     // Catch:{ all -> 0x0692 }
            atzl r12 = (defpackage.atzl) r12     // Catch:{ all -> 0x0692 }
            int r0 = r0 + -1
            r12.c = r0     // Catch:{ all -> 0x0692 }
            int r0 = r12.a     // Catch:{ all -> 0x0692 }
            r0 = r0 | r2
            r12.a = r0     // Catch:{ all -> 0x0692 }
            boolean r0 = r4.c     // Catch:{ all -> 0x0692 }
            if (r0 != 0) goto L_0x0113
            goto L_0x0118
        L_0x0113:
            r4.c()     // Catch:{ all -> 0x0692 }
            r4.c = r8     // Catch:{ all -> 0x0692 }
        L_0x0118:
            aucj r0 = r4.b     // Catch:{ all -> 0x0692 }
            pqy r0 = (defpackage.pqy) r0     // Catch:{ all -> 0x0692 }
            aucj r7 = r7.i()     // Catch:{ all -> 0x0692 }
            atzl r7 = (defpackage.atzl) r7     // Catch:{ all -> 0x0692 }
            r7.getClass()     // Catch:{ all -> 0x0692 }
            aucx r12 = r0.b     // Catch:{ all -> 0x0692 }
            boolean r12 = r12.a()     // Catch:{ all -> 0x0692 }
            if (r12 != 0) goto L_0x0135
            aucx r12 = r0.b     // Catch:{ all -> 0x0692 }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ all -> 0x0692 }
            r0.b = r12     // Catch:{ all -> 0x0692 }
        L_0x0135:
            aucx r0 = r0.b     // Catch:{ all -> 0x0692 }
            r0.add(r7)     // Catch:{ all -> 0x0692 }
        L_0x013a:
            int r15 = r15 + 1
            r7 = 7
            r13 = 8
            goto L_0x0060
        L_0x0141:
            aucj r0 = r4.i()     // Catch:{ all -> 0x0692 }
            pqy r0 = (defpackage.pqy) r0     // Catch:{ all -> 0x0692 }
            r1.a((java.lang.String) r3, (defpackage.pqy) r0)     // Catch:{ all -> 0x0692 }
        L_0x014a:
            ppp r0 = r1.c     // Catch:{ all -> 0x0692 }
            r0.b((int) r2)     // Catch:{ all -> 0x0692 }
            ozu r0 = new ozu     // Catch:{ all -> 0x0692 }
            ozb r4 = r1.m     // Catch:{ all -> 0x0692 }
            ors r5 = r1.B     // Catch:{ all -> 0x0692 }
            prp r7 = r1.g     // Catch:{ all -> 0x0692 }
            java.util.Set r7 = r7.h()     // Catch:{ all -> 0x0692 }
            r0.<init>((defpackage.ozb) r4, (defpackage.ors) r5, (java.util.Set) r7)     // Catch:{ all -> 0x0692 }
            ozb r4 = r0.a     // Catch:{ all -> 0x0692 }
            oza r4 = r4.a     // Catch:{ all -> 0x0692 }
            android.content.pm.PackageManager r4 = r4.c     // Catch:{ all -> 0x0692 }
            r5 = 128(0x80, float:1.794E-43)
            java.util.List r4 = r4.getInstalledPackages(r5)     // Catch:{ all -> 0x0692 }
            int r5 = r4.size()     // Catch:{ all -> 0x0692 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0692 }
            r12 = 45
            r7.<init>(r12)     // Catch:{ all -> 0x0692 }
            java.lang.String r12 = "updateResources: found "
            r7.append(r12)     // Catch:{ all -> 0x0692 }
            r7.append(r5)     // Catch:{ all -> 0x0692 }
            java.lang.String r5 = " total apps"
            r7.append(r5)     // Catch:{ all -> 0x0692 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0692 }
            defpackage.oso.d(r5)     // Catch:{ all -> 0x0692 }
            ozb r5 = r0.a     // Catch:{ all -> 0x0692 }
            java.util.Set r5 = r5.b()     // Catch:{ all -> 0x0692 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0692 }
        L_0x0193:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0692 }
            if (r7 == 0) goto L_0x01b6
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x0692 }
            android.content.pm.PackageInfo r7 = (android.content.pm.PackageInfo) r7     // Catch:{ all -> 0x0692 }
            android.content.pm.ApplicationInfo r12 = r7.applicationInfo     // Catch:{ all -> 0x0692 }
            boolean r12 = r12.enabled     // Catch:{ all -> 0x0692 }
            if (r12 == 0) goto L_0x01ae
            java.lang.String r12 = r7.packageName     // Catch:{ all -> 0x0692 }
            r5.remove(r12)     // Catch:{ all -> 0x0692 }
            r0.a((android.content.pm.PackageInfo) r7, (boolean) r8)     // Catch:{ all -> 0x0692 }
            goto L_0x0193
        L_0x01ae:
            java.lang.String r12 = "Package %s is disabled"
            java.lang.String r7 = r7.packageName     // Catch:{ all -> 0x0692 }
            defpackage.oso.d((java.lang.String) r12, (java.lang.Object) r7)     // Catch:{ all -> 0x0692 }
            goto L_0x0193
        L_0x01b6:
            java.lang.String r4 = "Apps that are now uninstalled (%d): %s"
            int r7 = r5.size()     // Catch:{ all -> 0x0692 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0692 }
            defpackage.oso.d(r4, r7, r5)     // Catch:{ all -> 0x0692 }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x0692 }
        L_0x01c7:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0692 }
            if (r5 != 0) goto L_0x0679
            pas r0 = r1.t     // Catch:{ all -> 0x0692 }
            boolean r0 = r0.a(r3)     // Catch:{ all -> 0x0692 }
            prp r3 = r1.g     // Catch:{ all -> 0x0692 }
            boolean r3 = r3.e()     // Catch:{ all -> 0x0692 }
            if (r3 == 0) goto L_0x01dc
            goto L_0x01de
        L_0x01dc:
            if (r0 == 0) goto L_0x01f8
        L_0x01de:
            ppp r0 = r1.c     // Catch:{ all -> 0x0692 }
            aamd r12 = new aamd     // Catch:{ all -> 0x0692 }
            android.content.Context r4 = r1.b     // Catch:{ all -> 0x0692 }
            prp r5 = r1.g     // Catch:{ all -> 0x0692 }
            ozb r7 = r1.m     // Catch:{ all -> 0x0692 }
            pas r13 = r1.t     // Catch:{ all -> 0x0692 }
            pqf r14 = r1.e     // Catch:{ all -> 0x0692 }
            r3 = r12
            r15 = 0
            r8 = r13
            r13 = 1
            r9 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0692 }
            r0.d(r12)     // Catch:{ all -> 0x0692 }
            goto L_0x01fa
        L_0x01f8:
            r13 = 1
            r15 = 0
        L_0x01fa:
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.n     // Catch:{ all -> 0x0692 }
            anth r0 = r0.d()     // Catch:{ all -> 0x0692 }
            long r3 = r0.a     // Catch:{ all -> 0x0692 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            agvx r0 = defpackage.ozx.f     // Catch:{ all -> 0x0692 }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x0692 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0692 }
            long r5 = r0.longValue()     // Catch:{ all -> 0x0692 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0692 }
            long r3 = r3 + r5
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x021d
            r9 = 1
            goto L_0x021e
        L_0x021d:
            r9 = 0
        L_0x021e:
            ovk r0 = r1.i     // Catch:{ all -> 0x0692 }
            com.google.android.gms.icing.nativeindex.NativeIndex r3 = r1.n     // Catch:{ all -> 0x0692 }
            double r3 = r3.g()     // Catch:{ all -> 0x0692 }
            long r5 = r0.c()     // Catch:{ all -> 0x0692 }
            long r7 = r0.d()     // Catch:{ all -> 0x0692 }
            r19 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0242
            long r13 = r7 - r5
            double r13 = (double) r13
            r21 = r3
            double r2 = (double) r7
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r2)
            double r13 = r13 / r2
            goto L_0x0246
        L_0x0242:
            r21 = r3
            r13 = r19
        L_0x0246:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x025f
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x025f
            double r2 = (double) r5
            double r23 = r23 - r21
            java.lang.Double.isNaN(r2)
            double r2 = r2 / r23
            long r2 = (long) r2
            goto L_0x0260
        L_0x025f:
        L_0x0260:
            r23 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x026f
            int r0 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x026f
            r0 = 0
            goto L_0x0270
        L_0x026f:
            r0 = 1
        L_0x0270:
            long r2 = java.lang.Math.min(r7, r2)     // Catch:{ all -> 0x0692 }
            double r2 = (double) r2
            r23 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r23
            long r2 = (long) r2
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0692 }
            java.lang.Long r23 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0692 }
            r4[r15] = r23     // Catch:{ all -> 0x0692 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0692 }
            r8 = 1
            r4[r8] = r7     // Catch:{ all -> 0x0692 }
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r13 = r13 * r7
            java.lang.Double r13 = java.lang.Double.valueOf(r13)     // Catch:{ all -> 0x0692 }
            r14 = 2
            r4[r14] = r13     // Catch:{ all -> 0x0692 }
            double r7 = r7 * r21
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x0692 }
            r8 = 3
            r4[r8] = r7     // Catch:{ all -> 0x0692 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0692 }
            r8 = 4
            r4[r8] = r7     // Catch:{ all -> 0x0692 }
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0692 }
            r8 = 5
            r4[r8] = r7     // Catch:{ all -> 0x0692 }
            java.lang.String r7 = "Performing maintenance usage %s budget %s free %.3f%% index free %.3f%% purge? %s target %s"
            defpackage.oso.d((java.lang.String) r7, (java.lang.Object[]) r4)     // Catch:{ all -> 0x0692 }
            if (r0 == 0) goto L_0x02cc
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x02cc
            double r4 = (double) r5
            double r2 = (double) r2
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r2)
            double r2 = r4 - r2
            java.lang.Double.isNaN(r4)
            double r2 = r2 / r4
            goto L_0x02ce
        L_0x02cc:
            r2 = r19
        L_0x02ce:
            agvx r0 = defpackage.ozx.Z     // Catch:{ all -> 0x0692 }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x0692 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0692 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0692 }
            if (r0 == 0) goto L_0x02e6
            java.lang.String r0 = "saft-segmenter-model"
            boolean r0 = r1.d(r0)     // Catch:{ all -> 0x0692 }
            if (r0 == 0) goto L_0x02e6
            r0 = 1
            goto L_0x02e7
        L_0x02e6:
            r0 = 0
        L_0x02e7:
            agvx r4 = defpackage.ozx.aa     // Catch:{ all -> 0x0692 }
            java.lang.Object r4 = r4.c()     // Catch:{ all -> 0x0692 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0692 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0692 }
            if (r4 == 0) goto L_0x02ff
            java.lang.String r4 = "address_data"
            boolean r4 = r1.d(r4)     // Catch:{ all -> 0x0692 }
            if (r4 == 0) goto L_0x02ff
            r4 = 1
            goto L_0x0300
        L_0x02ff:
            r4 = 0
        L_0x0300:
            boolean r5 = defpackage.pba.n()     // Catch:{ all -> 0x0692 }
            if (r5 == 0) goto L_0x0310
            java.lang.String r5 = "nicknames"
            boolean r5 = r1.d(r5)     // Catch:{ all -> 0x0692 }
            if (r5 == 0) goto L_0x0310
            r5 = 1
            goto L_0x0311
        L_0x0310:
            r5 = 0
        L_0x0311:
            otu r6 = r25.i()     // Catch:{ all -> 0x0692 }
            anli r7 = defpackage.anln.b()     // Catch:{ all -> 0x0692 }
            oqe r13 = r6.h     // Catch:{ all -> 0x0692 }
            if (r13 == 0) goto L_0x031e
            goto L_0x0320
        L_0x031e:
            oqe r13 = defpackage.oqe.d     // Catch:{ all -> 0x0692 }
        L_0x0320:
            byte[] r13 = r13.k()     // Catch:{ all -> 0x0692 }
            anlh r7 = r7.a((byte[]) r13)     // Catch:{ all -> 0x0692 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0692 }
            java.lang.String r13 = r1.z     // Catch:{ all -> 0x0692 }
            boolean r13 = r13.equals(r7)     // Catch:{ all -> 0x0692 }
            r12 = 1
            r13 = r13 ^ r12
            if (r0 == 0) goto L_0x0337
            goto L_0x0343
        L_0x0337:
            if (r4 != 0) goto L_0x0343
            if (r5 != 0) goto L_0x0343
            if (r13 != 0) goto L_0x0343
            java.lang.String r0 = "Not attempting to update native config as no configuration changed."
            defpackage.oso.a(r0)     // Catch:{ all -> 0x0692 }
            goto L_0x0359
        L_0x0343:
            com.google.android.gms.icing.nativeindex.NativeIndex r4 = r1.n     // Catch:{ all -> 0x0692 }
            boolean r4 = r4.a((defpackage.otu) r6)     // Catch:{ all -> 0x0692 }
            if (r4 != 0) goto L_0x0351
            java.lang.String r4 = "Failed to update native config."
            defpackage.oso.c(r4)     // Catch:{ all -> 0x0692 }
            goto L_0x0353
        L_0x0351:
            r1.z = r7     // Catch:{ all -> 0x0692 }
        L_0x0353:
            if (r0 != 0) goto L_0x0356
            goto L_0x0359
        L_0x0356:
            r25.k()     // Catch:{ all -> 0x0692 }
        L_0x0359:
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.n     // Catch:{ all -> 0x0692 }
            long r4 = r0.b     // Catch:{ all -> 0x0692 }
            com.google.android.gms.icing.nativeindex.NativeIndex.nativeOnMaintenance(r4, r9)     // Catch:{ all -> 0x0692 }
            ovk r4 = r1.i     // Catch:{ all -> 0x0692 }
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.n     // Catch:{ all -> 0x0692 }
            long r5 = r0.b     // Catch:{ all -> 0x0692 }
            byte[] r0 = com.google.android.gms.icing.nativeindex.NativeIndex.nativeGetStorageState(r5)     // Catch:{ all -> 0x0692 }
            if (r0 == 0) goto L_0x0381
            aubs r5 = defpackage.aubs.c()     // Catch:{ auda -> 0x0379 }
            aojl r6 = defpackage.aojl.g     // Catch:{ auda -> 0x0379 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r0, (defpackage.aubs) r5)     // Catch:{ auda -> 0x0379 }
            aojl r0 = (defpackage.aojl) r0     // Catch:{ auda -> 0x0379 }
            goto L_0x0382
        L_0x0379:
            r0 = move-exception
            java.lang.String r5 = "Failed parsing storage state"
            defpackage.oso.a((java.lang.Throwable) r0, (java.lang.String) r5)     // Catch:{ all -> 0x0692 }
            r0 = 0
            goto L_0x0382
        L_0x0381:
            r0 = 0
        L_0x0382:
            oyq r5 = r1.r     // Catch:{ all -> 0x0692 }
            com.google.android.gms.icing.nativeindex.NativeIndex r6 = r1.n     // Catch:{ all -> 0x0692 }
            double r6 = r6.g()     // Catch:{ all -> 0x0692 }
            boolean r13 = r5.a()     // Catch:{ all -> 0x0692 }
            r14 = 524288(0x80000, float:7.34684E-40)
            if (r13 != 0) goto L_0x0394
            goto L_0x0454
        L_0x0394:
            if (r0 == 0) goto L_0x03a0
            java.lang.Object r13 = r0.c(r8)     // Catch:{ all -> 0x0692 }
            aucd r13 = (defpackage.aucd) r13     // Catch:{ all -> 0x0692 }
            r13.a((defpackage.aucj) r0)     // Catch:{ all -> 0x0692 }
            goto L_0x03a6
        L_0x03a0:
            aojl r0 = defpackage.aojl.g     // Catch:{ all -> 0x0692 }
            aucd r13 = r0.o()     // Catch:{ all -> 0x0692 }
        L_0x03a6:
            int r0 = r4.a((double) r6)     // Catch:{ all -> 0x0692 }
            boolean r6 = r13.c     // Catch:{ all -> 0x0692 }
            if (r6 != 0) goto L_0x03af
            goto L_0x03b4
        L_0x03af:
            r13.c()     // Catch:{ all -> 0x0692 }
            r13.c = r15     // Catch:{ all -> 0x0692 }
        L_0x03b4:
            aucj r6 = r13.b     // Catch:{ all -> 0x0692 }
            aojl r6 = (defpackage.aojl) r6     // Catch:{ all -> 0x0692 }
            int r0 = defpackage.aolr.a(r0)     // Catch:{ all -> 0x0692 }
            r6.b = r0     // Catch:{ all -> 0x0692 }
            int r0 = r6.a     // Catch:{ all -> 0x0692 }
            r7 = 1
            r0 = r0 | r7
            r6.a = r0     // Catch:{ all -> 0x0692 }
            long r6 = r4.f()     // Catch:{ all -> 0x0692 }
            boolean r0 = r13.c     // Catch:{ all -> 0x0692 }
            if (r0 != 0) goto L_0x03cd
            goto L_0x03d2
        L_0x03cd:
            r13.c()     // Catch:{ all -> 0x0692 }
            r13.c = r15     // Catch:{ all -> 0x0692 }
        L_0x03d2:
            aucj r0 = r13.b     // Catch:{ all -> 0x0692 }
            aojl r0 = (defpackage.aojl) r0     // Catch:{ all -> 0x0692 }
            int r12 = r0.a     // Catch:{ all -> 0x0692 }
            r17 = 2
            r12 = r12 | 2
            r0.a = r12     // Catch:{ all -> 0x0692 }
            r0.c = r6     // Catch:{ all -> 0x0692 }
            long r6 = r4.e()     // Catch:{ all -> 0x0692 }
            boolean r0 = r13.c     // Catch:{ all -> 0x0692 }
            if (r0 != 0) goto L_0x03e9
            goto L_0x03ee
        L_0x03e9:
            r13.c()     // Catch:{ all -> 0x0692 }
            r13.c = r15     // Catch:{ all -> 0x0692 }
        L_0x03ee:
            aucj r0 = r13.b     // Catch:{ all -> 0x0692 }
            aojl r0 = (defpackage.aojl) r0     // Catch:{ all -> 0x0692 }
            int r12 = r0.a     // Catch:{ all -> 0x0692 }
            r16 = 4
            r12 = r12 | 4
            r0.a = r12     // Catch:{ all -> 0x0692 }
            r0.d = r6     // Catch:{ all -> 0x0692 }
            long r6 = r4.b     // Catch:{ all -> 0x0692 }
            r18 = 8
            r12 = r12 | 8
            r0.a = r12     // Catch:{ all -> 0x0692 }
            r0.e = r6     // Catch:{ all -> 0x0692 }
            boolean r0 = r4.a()     // Catch:{ all -> 0x0692 }
            boolean r4 = r13.c     // Catch:{ all -> 0x0692 }
            if (r4 != 0) goto L_0x040f
            goto L_0x0414
        L_0x040f:
            r13.c()     // Catch:{ all -> 0x0692 }
            r13.c = r15     // Catch:{ all -> 0x0692 }
        L_0x0414:
            aucj r4 = r13.b     // Catch:{ all -> 0x0692 }
            aojl r4 = (defpackage.aojl) r4     // Catch:{ all -> 0x0692 }
            int r6 = r4.a     // Catch:{ all -> 0x0692 }
            r6 = r6 | 16
            r4.a = r6     // Catch:{ all -> 0x0692 }
            r4.f = r0     // Catch:{ all -> 0x0692 }
            aucj r0 = r13.i()     // Catch:{ all -> 0x0692 }
            aojl r0 = (defpackage.aojl) r0     // Catch:{ all -> 0x0692 }
            aoji r4 = defpackage.aoji.R     // Catch:{ all -> 0x0692 }
            aucd r4 = r4.o()     // Catch:{ all -> 0x0692 }
            long r6 = defpackage.axrp.c()     // Catch:{ all -> 0x0692 }
            boolean r12 = r4.c     // Catch:{ all -> 0x0692 }
            if (r12 != 0) goto L_0x0435
            goto L_0x043a
        L_0x0435:
            r4.c()     // Catch:{ all -> 0x0692 }
            r4.c = r15     // Catch:{ all -> 0x0692 }
        L_0x043a:
            aucj r12 = r4.b     // Catch:{ all -> 0x0692 }
            aoji r12 = (defpackage.aoji) r12     // Catch:{ all -> 0x0692 }
            int r13 = r12.a     // Catch:{ all -> 0x0692 }
            r13 = r13 | r14
            r12.a = r13     // Catch:{ all -> 0x0692 }
            r12.s = r6     // Catch:{ all -> 0x0692 }
            r0.getClass()     // Catch:{ all -> 0x0692 }
            r12.d = r0     // Catch:{ all -> 0x0692 }
            r6 = 2
            r0 = r13 | 2
            r12.a = r0     // Catch:{ all -> 0x0692 }
            java.lang.String r0 = "sstate"
            r5.a((java.lang.String) r0, (defpackage.aucd) r4)     // Catch:{ all -> 0x0692 }
        L_0x0454:
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x045c
            r1.a((double) r2, (int) r8)     // Catch:{ all -> 0x0692 }
            goto L_0x0466
        L_0x045c:
            if (r9 == 0) goto L_0x0463
            r2 = 4
            r1.a((int) r2)     // Catch:{ all -> 0x0692 }
            goto L_0x0466
        L_0x0463:
            r25.l()     // Catch:{ all -> 0x0692 }
        L_0x0466:
            monitor-exit(r11)     // Catch:{ all -> 0x0692 }
            monitor-exit(r10)     // Catch:{ all -> 0x0695 }
            agvx r0 = defpackage.ozx.au     // Catch:{ SQLiteException -> 0x04b9 }
            java.lang.Object r0 = r0.c()     // Catch:{ SQLiteException -> 0x04b9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ SQLiteException -> 0x04b9 }
            boolean r0 = r0.booleanValue()     // Catch:{ SQLiteException -> 0x04b9 }
            if (r0 != 0) goto L_0x0485
            agvx r0 = defpackage.ozx.ax     // Catch:{ SQLiteException -> 0x04b9 }
            java.lang.Object r0 = r0.c()     // Catch:{ SQLiteException -> 0x04b9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ SQLiteException -> 0x04b9 }
            boolean r0 = r0.booleanValue()     // Catch:{ SQLiteException -> 0x04b9 }
            if (r0 != 0) goto L_0x0485
            goto L_0x04c7
        L_0x0485:
            android.content.Context r0 = r1.b     // Catch:{ SQLiteException -> 0x04b9 }
            oxx r0 = defpackage.oxx.a((android.content.Context) r0)     // Catch:{ SQLiteException -> 0x04b9 }
            agvx r2 = defpackage.ozx.au     // Catch:{ SQLiteException -> 0x04b9 }
            java.lang.Object r2 = r2.c()     // Catch:{ SQLiteException -> 0x04b9 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ SQLiteException -> 0x04b9 }
            boolean r2 = r2.booleanValue()     // Catch:{ SQLiteException -> 0x04b9 }
            if (r2 != 0) goto L_0x049a
            goto L_0x04a2
        L_0x049a:
            java.lang.String r2 = "errors"
            r3 = 2592000(0x278d00, float:3.632166E-39)
            r0.a((java.lang.String) r2, (int) r3)     // Catch:{ SQLiteException -> 0x04b9 }
        L_0x04a2:
            agvx r2 = defpackage.ozx.ax     // Catch:{ SQLiteException -> 0x04b9 }
            java.lang.Object r2 = r2.c()     // Catch:{ SQLiteException -> 0x04b9 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ SQLiteException -> 0x04b9 }
            boolean r2 = r2.booleanValue()     // Catch:{ SQLiteException -> 0x04b9 }
            if (r2 == 0) goto L_0x04c7
            java.lang.String r2 = "user_actions"
            r3 = 7776000(0x76a700, float:1.0896497E-38)
            r0.a((java.lang.String) r2, (int) r3)     // Catch:{ SQLiteException -> 0x04b9 }
            goto L_0x04c7
        L_0x04b9:
            r0 = move-exception
            oyt r2 = r25.n()
            long r3 = defpackage.axrp.f()
            java.lang.String r5 = "IndexManager doMaintenanceInternal"
            r2.a(r5, r0, r3)
        L_0x04c7:
            oyq r0 = r1.r
            agvx r2 = defpackage.ozx.l
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0678
            long r2 = defpackage.axrp.c()
            boolean r0 = r0.a((long) r2)
            if (r0 == 0) goto L_0x0678
            long r2 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.n
            ove r0 = r0.h()
            if (r0 == 0) goto L_0x066c
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            aucx r0 = r0.a
            int r5 = r0.size()
            r8 = 0
        L_0x04f9:
            if (r8 < r5) goto L_0x0655
            aojd r0 = defpackage.aojd.b
            aucd r0 = r0.o()
            aojc r0 = (defpackage.aojc) r0
            ozs r5 = r25.a()
            r6 = r5
            ozq r6 = (defpackage.ozq) r6
            java.lang.Object r6 = r6.a()
            monitor-enter(r6)
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0652 }
            r8 = r5
            ozq r8 = (defpackage.ozq) r8     // Catch:{ all -> 0x0652 }
            java.util.Map r8 = r8.f     // Catch:{ all -> 0x0652 }
            int r8 = r8.size()     // Catch:{ all -> 0x0652 }
            r7.<init>(r8)     // Catch:{ all -> 0x0652 }
            ozq r5 = (defpackage.ozq) r5     // Catch:{ all -> 0x0652 }
            java.util.Map r5 = r5.f     // Catch:{ all -> 0x0652 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x0652 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0652 }
        L_0x0529:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0652 }
            if (r8 == 0) goto L_0x0539
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0652 }
            ota r8 = (defpackage.ota) r8     // Catch:{ all -> 0x0652 }
            r7.add(r8)     // Catch:{ all -> 0x0652 }
            goto L_0x0529
        L_0x0539:
            monitor-exit(r6)     // Catch:{ all -> 0x0652 }
            int r5 = r7.size()
            r8 = 0
        L_0x053f:
            if (r8 < r5) goto L_0x0578
            oyq r4 = r1.r
            aucj r0 = r0.i()
            aojd r0 = (defpackage.aojd) r0
            aoji r5 = defpackage.aoji.R
            aucd r5 = r5.o()
            long r6 = defpackage.axrp.c()
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x0558
            goto L_0x055d
        L_0x0558:
            r5.c()
            r5.c = r15
        L_0x055d:
            aucj r8 = r5.b
            aoji r8 = (defpackage.aoji) r8
            int r9 = r8.a
            r9 = r9 | r14
            r8.a = r9
            r8.s = r6
            r0.getClass()
            r8.i = r0
            r0 = r9 | 64
            r8.a = r0
            java.lang.String r0 = "cstats"
            r4.a((java.lang.String) r0, (defpackage.aucd) r5)
            goto L_0x0672
        L_0x0578:
            java.lang.Object r6 = r7.get(r8)
            ota r6 = (defpackage.ota) r6
            otg r9 = r6.c
            if (r9 == 0) goto L_0x0583
            goto L_0x0585
        L_0x0583:
            otg r9 = defpackage.otg.h
        L_0x0585:
            int r9 = r9.c
            int r9 = defpackage.otf.a(r9)
            if (r9 != 0) goto L_0x0590
            r9 = 0
            r12 = 1
            goto L_0x0596
        L_0x0590:
            r12 = 1
            if (r9 == r12) goto L_0x0595
            r9 = 1
            goto L_0x0596
        L_0x0595:
            r9 = 0
        L_0x0596:
            osz r10 = r6.b
            if (r10 == 0) goto L_0x059b
            goto L_0x059d
        L_0x059b:
            osz r10 = defpackage.osz.s
        L_0x059d:
            int r10 = r10.b
            java.lang.Object r10 = r4.get(r10)
            ovd r10 = (defpackage.ovd) r10
            agvx r11 = defpackage.pba.o
            java.lang.Object r11 = r11.c()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x05b4
            goto L_0x05bf
        L_0x05b4:
            if (r10 == 0) goto L_0x0646
            if (r9 == 0) goto L_0x05bf
            r9 = 0
            r17 = 2
            r18 = 8
            goto L_0x064b
        L_0x05bf:
            aoks r11 = defpackage.aoks.i
            aucd r11 = r11.o()
            osz r13 = r6.b
            if (r13 == 0) goto L_0x05ca
            goto L_0x05cc
        L_0x05ca:
            osz r13 = defpackage.osz.s
        L_0x05cc:
            java.lang.String r13 = r13.e
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x05d3
            goto L_0x05d8
        L_0x05d3:
            r11.c()
            r11.c = r15
        L_0x05d8:
            aucj r12 = r11.b
            aoks r12 = (defpackage.aoks) r12
            r13.getClass()
            int r14 = r12.a
            r14 = r14 | 16
            r12.a = r14
            r12.f = r13
            r13 = r14 | 64
            r12.a = r13
            r12.h = r9
            if (r10 == 0) goto L_0x0614
            int r9 = r10.b
            r13 = r13 | 1
            r12.a = r13
            r12.b = r9
            int r9 = r10.c
            r14 = 4
            r13 = r13 | r14
            r12.a = r13
            r12.d = r9
            long r14 = r10.d
            r17 = 2
            r13 = r13 | 2
            r12.a = r13
            r12.c = r14
            long r14 = r10.e
            r18 = 8
            r10 = r13 | 8
            r12.a = r10
            r12.e = r14
            goto L_0x0618
        L_0x0614:
            r17 = 2
            r18 = 8
        L_0x0618:
            osz r6 = r6.b
            if (r6 == 0) goto L_0x061d
            goto L_0x061f
        L_0x061d:
            osz r6 = defpackage.osz.s
        L_0x061f:
            java.lang.String r6 = defpackage.pxa.a(r6)
            if (r6 == 0) goto L_0x0641
            boolean r10 = r11.c
            if (r10 != 0) goto L_0x062b
            r9 = 0
            goto L_0x0631
        L_0x062b:
            r11.c()
            r9 = 0
            r11.c = r9
        L_0x0631:
            aucj r10 = r11.b
            aoks r10 = (defpackage.aoks) r10
            r6.getClass()
            int r12 = r10.a
            r12 = r12 | 32
            r10.a = r12
            r10.g = r6
            goto L_0x0642
        L_0x0641:
            r9 = 0
        L_0x0642:
            r0.a(r11)
            goto L_0x064b
        L_0x0646:
            r9 = 0
            r17 = 2
            r18 = 8
        L_0x064b:
            int r8 = r8 + 1
            r14 = 524288(0x80000, float:7.34684E-40)
            r15 = 0
            goto L_0x053f
        L_0x0652:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0652 }
            throw r0
        L_0x0655:
            r9 = 0
            r17 = 2
            r18 = 8
            java.lang.Object r6 = r0.get(r8)
            ovd r6 = (defpackage.ovd) r6
            int r7 = r6.a
            r4.put(r7, r6)
            int r8 = r8 + 1
            r14 = 524288(0x80000, float:7.34684E-40)
            r15 = 0
            goto L_0x04f9
        L_0x066c:
            java.lang.String r0 = "Failed to get usage stats for logging."
            defpackage.oso.b(r0)
        L_0x0672:
            aolt r0 = defpackage.aolt.CORPUS_STATS_CALCULATION
            r1.a((defpackage.aolt) r0, (long) r2)
            return
        L_0x0678:
            return
        L_0x0679:
            r8 = 3
            r9 = 0
            r17 = 2
            r18 = 8
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0692 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0692 }
            ors r5 = r0.c     // Catch:{ all -> 0x0692 }
            r5.a(r2)     // Catch:{ all -> 0x0692 }
            r2 = 2
            r8 = 0
            r9 = 1
            goto L_0x01c7
        L_0x068f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x068f }
            throw r0     // Catch:{ all -> 0x0692 }
        L_0x0692:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0692 }
            throw r0     // Catch:{ all -> 0x0695 }
        L_0x0695:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0695 }
            goto L_0x0699
        L_0x0698:
            throw r0
        L_0x0699:
            goto L_0x0698
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osf.m():void");
    }

    public final oyt n() {
        return new oyt(this.b);
    }

    public final void o() {
        this.f.acquireUninterruptibly();
        ppp ppp = this.c;
        synchronized (ppp.a) {
            ppp.a();
            ppp.f++;
        }
        ppp.e.block();
        synchronized (ppp.a) {
            ppp.f--;
            ppp.a();
        }
        this.c.d(new ory(this, aonk.DESTROY_INDEX_MANAGER));
    }

    public final boolean c() {
        boolean z2;
        if (this.c.a(2) || this.f.availablePermits() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        return this.n != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str) {
        oso.a(str.length() == 0 ? new String("Checking if upgrade is available for mdd group = ") : "Checking if upgrade is available for mdd group = ".concat(str));
        return this.h.a(str);
    }

    public final void e() {
        if (!d()) {
            throw new paw("Not initialized");
        }
    }

    private final void a(antj antj) {
        HashSet<oyz> hashSet;
        char c2 = 2;
        this.c.b(2);
        switch (antj.b) {
            case 0:
                break;
            case 1:
                c2 = 3;
                break;
            case 2:
                c2 = 4;
                break;
            case 3:
                c2 = 5;
                break;
            case 4:
                c2 = 6;
                break;
            case 5:
                c2 = 7;
                break;
            case 6:
                c2 = 8;
                break;
            case 7:
                c2 = 9;
                break;
            case 8:
                c2 = 10;
                break;
            case 9:
                c2 = 11;
                break;
            case 10:
                c2 = 12;
                break;
            case 11:
                c2 = 13;
                break;
            case 12:
                c2 = 14;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                c2 = 15;
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                c2 = 16;
                break;
            case Service.START_CONTINUATION_MASK:
                c2 = 17;
                break;
            case 16:
                c2 = 18;
                break;
            case 17:
                c2 = 19;
                break;
            case 18:
                c2 = 20;
                break;
            default:
                c2 = 0;
                break;
        }
        if (c2 != 0 && c2 == 3) {
            ozq b2 = b();
            synchronized (b2.a()) {
                paq paq = b2.b;
                HashSet<String> hashSet2 = new HashSet<>();
                for (Map.Entry next : ((par) paq).a.getAll().entrySet()) {
                    if (((String) next.getKey()).startsWith("corpuskey:")) {
                        otg otg = ((ota) plc.a((String) next.getValue(), (auef) ota.d.c(7))).c;
                        if (otg == null) {
                            otg = otg.h;
                        }
                        int a2 = otf.a(otg.c);
                        if (a2 != 0 && a2 == 3) {
                            hashSet2.add((String) next.getKey());
                        }
                    }
                }
                if (!hashSet2.isEmpty()) {
                    SharedPreferences.Editor edit = ((par) paq).a.edit();
                    for (String remove : hashSet2) {
                        edit.remove(remove);
                    }
                    if (!edit.commit()) {
                        b2.e.a("metadata_union_compact_err");
                    }
                }
                b2.f.clear();
                for (oyz oyz : b2.c.a()) {
                    for (pao a3 : oyz.a()) {
                        oyz.a(a3);
                    }
                }
                for (ota a4 : b2.b.a()) {
                    b2.b(b2.a(a4));
                }
                b2.g = false;
            }
            Set a5 = this.m.a();
            ozb ozb = this.m;
            synchronized (ozb.b) {
                hashSet = new HashSet<>(ozb.c.values());
            }
            hashSet.removeAll(a5);
            for (oyz k2 : hashSet) {
                k2.k();
            }
            if (antj.c > 0) {
                this.r.a("compaction_with_errors");
            }
            this.r.a(antj);
            return;
        }
        oso.b("Compaction failed");
        this.r.a("compaction_failed");
        this.r.a(antj);
    }

    public final CorpusStatus b(ozc ozc, String str, String str2) {
        ozs a2 = a();
        synchronized (a2.a()) {
            Set a3 = a2.a(ozc, new String[]{str}, false, str2);
            if (!a3.isEmpty()) {
                ota b2 = a2.b((pao) a3.iterator().next());
                Bundle bundle = new Bundle();
                otg otg = b2.c;
                if (otg == null) {
                    otg = otg.h;
                }
                for (otc otc : otg.b) {
                    bundle.putInt(otc.b, otc.c);
                }
                NativeIndex nativeIndex = this.n;
                osz osz = b2.b;
                if (osz == null) {
                    osz = osz.s;
                }
                long a4 = nativeIndex.a(osz.b, false);
                NativeIndex nativeIndex2 = this.n;
                osz osz2 = b2.b;
                if (osz2 == null) {
                    osz2 = osz.s;
                }
                long a5 = nativeIndex2.a(osz2.b, true);
                osz osz3 = b2.b;
                if (osz3 == null) {
                    osz3 = osz.s;
                }
                String str3 = osz3.d;
                otg otg2 = b2.c;
                if (otg2 == null) {
                    otg2 = otg.h;
                }
                CorpusStatus corpusStatus = new CorpusStatus(true, a4, a5, 0, bundle, str3, otg2.g);
                return corpusStatus;
            }
            CorpusStatus corpusStatus2 = new CorpusStatus(false, 0, 0, 0, (Bundle) null, (String) null, (String) null);
            return corpusStatus2;
        }
    }

    public final String b(String str, String str2) {
        oso.a("handleCorpusDataCleared package:%s, corpus:%s", (Object) str, (Object) str2);
        oyz d2 = this.m.d(str);
        if (d2 != null) {
            try {
                a(d2, str2);
                return null;
            } catch (pau | pax e2) {
                return String.format("handleCorpusDataCleared failed: %s", new Object[]{e2});
            }
        } else {
            return String.format("handleCorpusDataCleared %s: not a known client.", new Object[]{str});
        }
    }

    public final List a(ozc ozc, GlobalSearchQuerySpecification globalSearchQuerySpecification, boolean z2) {
        List<osz> a2 = a().a(ozc, globalSearchQuerySpecification, z2);
        if (ozc.a()) {
            return a2;
        }
        Set<oyz> b2 = this.m.b(ozc);
        HashSet hashSet = new HashSet(b2.size());
        for (oyz oyz : b2) {
            hashSet.add(oyz.b);
        }
        ArrayList arrayList = new ArrayList();
        for (osz osz : a2) {
            if (hashSet.contains(osz.e)) {
                arrayList.add(osz);
            }
        }
        return arrayList;
    }

    public final ozq b() {
        return this.j.a();
    }

    public final void b(String str) {
        this.c.b(2);
        e(str);
        this.m.c(str).d();
        c(str);
    }

    public final osz a(ozc ozc, String str, String str2) {
        ozs a2 = a();
        synchronized (a2.a()) {
            Set a3 = a2.a(ozc, new String[]{str}, false, str2);
            if (a3.isEmpty()) {
                return null;
            }
            osz d2 = a2.d((pao) a3.iterator().next());
            return d2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0515, code lost:
        if (r7 != false) goto L_0x0517;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.osz a(defpackage.ozc r18, defpackage.oyz r19, boolean r20, defpackage.ozv r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r21
            ppp r4 = r1.c
            r5 = 2
            r4.b((int) r5)
            boolean r4 = r19.c()
            if (r4 != 0) goto L_0x062b
            java.lang.Object r4 = r21.c()
            osz r4 = (defpackage.osz) r4
            java.lang.String r4 = r4.f
            boolean r4 = r4.isEmpty()
            r6 = 0
            if (r4 != 0) goto L_0x0135
            android.content.Context r4 = r1.b
            java.lang.Object r7 = r21.c()
            osz r7 = (defpackage.osz) r7
            java.lang.String r7 = r7.f
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r8 = r7.getAuthority()
            if (r8 == 0) goto L_0x012d
            android.content.pm.PackageManager r9 = r4.getPackageManager()
            android.content.pm.ProviderInfo r8 = r9.resolveContentProvider(r8, r6)
            if (r8 == 0) goto L_0x0103
            java.lang.String r9 = r7.getAuthority()
            java.lang.String r10 = "com.google.android.gms.icing.indexapi"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x005a
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            java.lang.String r9 = r9.packageName
            java.lang.String r10 = "com.google.android.gms"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x0135
        L_0x005a:
            boolean r9 = r0.b
            if (r9 != 0) goto L_0x00b7
            int r9 = r0.a
            android.content.pm.ApplicationInfo r10 = r8.applicationInfo
            int r10 = r10.uid
            if (r9 != r10) goto L_0x0067
            goto L_0x00b7
        L_0x0067:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = java.lang.String.valueOf(r7)
            java.lang.String r4 = r7.getAuthority()
            android.content.pm.ApplicationInfo r5 = r8.applicationInfo
            int r5 = r5.uid
            int r0 = r0.a
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r4)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 82
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = "ContentProvider "
            r8.append(r6)
            r8.append(r3)
            java.lang.String r3 = " authority "
            r8.append(r3)
            r8.append(r4)
            java.lang.String r3 = " uid "
            r8.append(r3)
            r8.append(r5)
            java.lang.String r3 = " does not match calling uid "
            r8.append(r3)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r2.<init>(r0)
            throw r2
        L_0x00b7:
            boolean r9 = r0.b
            if (r9 != 0) goto L_0x0135
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            java.lang.String r8 = r8.packageName
            int r9 = r0.a
            boolean r4 = defpackage.hxz.a(r4, r9, r8)
            if (r4 == 0) goto L_0x00c8
            goto L_0x0135
        L_0x00c8:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 66
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "ContentProvider "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = " package name "
            r5.append(r2)
            r5.append(r8)
            java.lang.String r2 = " does not match client package names"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2)
            throw r0
        L_0x0103:
            pau r0 = new pau
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 31
            r4.<init>(r3)
            java.lang.String r3 = "ContentProvider "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = " does not exist"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L_0x012d:
            pau r0 = new pau
            java.lang.String r2 = "Content Provider uri authority is empty"
            r0.<init>(r2)
            throw r0
        L_0x0135:
            int r4 = r19.b((boolean) r20)
            r7 = 1
            if (r4 != r5) goto L_0x0154
            java.lang.String r4 = r2.b
            java.lang.String r8 = "App %s registering with different sigs, clearing old corpora"
            defpackage.oso.c((java.lang.String) r8, (java.lang.Object) r4)
            r1.a((defpackage.oyz) r2)
            java.lang.String[] r4 = new java.lang.String[r7]
            java.lang.String r8 = r2.b
            r4[r6] = r8
            r1.a((java.lang.String[]) r4)
            int r4 = r19.b((boolean) r20)
            goto L_0x0155
        L_0x0154:
        L_0x0155:
            if (r4 != 0) goto L_0x05f0
            ozq r4 = r17.b()
            int r8 = r21.a()
            if (r8 != r5) goto L_0x01b5
            amzy r5 = r4.a((defpackage.oyz) r2)
            anhk r5 = r5.listIterator()
        L_0x0169:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01b5
            java.lang.Object r8 = r5.next()
            pao r8 = (defpackage.pao) r8
            ozv r9 = r4.c((defpackage.pao) r8)
            if (r9 == 0) goto L_0x0169
            int r10 = r9.a()
            if (r10 != r7) goto L_0x0169
            java.lang.Object r10 = r9.c()
            ota r10 = (defpackage.ota) r10
            osz r10 = r10.b
            if (r10 == 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            osz r10 = defpackage.osz.s
        L_0x018e:
            boolean r10 = defpackage.ozq.f((defpackage.osz) r10)
            if (r10 != 0) goto L_0x0169
            java.lang.Object r9 = r9.c()
            ota r9 = (defpackage.ota) r9
            osz r9 = r9.b
            if (r9 != 0) goto L_0x01a0
            osz r9 = defpackage.osz.s
        L_0x01a0:
            boolean r9 = defpackage.ozq.e((defpackage.osz) r9)
            if (r9 != 0) goto L_0x0169
            java.lang.String r9 = r8.b()
            java.lang.String r10 = r2.b
            java.lang.String r11 = "Removing api-based corpus %s for %s"
            defpackage.oso.c((java.lang.String) r11, (java.lang.Object) r9, (java.lang.Object) r10)
            r1.a((defpackage.pao) r8, (defpackage.oyz) r2)
            goto L_0x0169
        L_0x01b5:
            pao r5 = new pao
            java.lang.String r8 = r2.b
            java.lang.Object r9 = r21.c()
            osz r9 = (defpackage.osz) r9
            java.lang.String r9 = r9.c
            r5.<init>(r8, r9)
            ozv r8 = r4.e((defpackage.pao) r5)
            if (r8 == 0) goto L_0x057d
            boolean r0 = r8.a((defpackage.ozv) r3)
            if (r0 == 0) goto L_0x0543
            otg r0 = r4.f((defpackage.pao) r5)
            if (r0 == 0) goto L_0x052b
            int r0 = r0.c
            int r0 = defpackage.otf.a(r0)
            if (r0 != 0) goto L_0x01df
            goto L_0x01e1
        L_0x01df:
            if (r0 != r7) goto L_0x052b
        L_0x01e1:
            java.lang.Object r0 = r8.c()
            osz r0 = (defpackage.osz) r0
            java.lang.Object r9 = r21.c()
            osz r9 = (defpackage.osz) r9
            r10 = 5
            java.lang.Object r11 = r0.c(r10)
            aucd r11 = (defpackage.aucd) r11
            r11.a((defpackage.aucj) r0)
            int r12 = r8.a()
            int r13 = r21.a()
            if (r12 == r13) goto L_0x021e
            int r12 = r21.a()
            boolean r13 = r11.c
            if (r13 == 0) goto L_0x020e
            r11.c()
            r11.c = r6
        L_0x020e:
            aucj r13 = r11.b
            osz r13 = (defpackage.osz) r13
            osz r14 = defpackage.osz.s
            int r14 = r13.a
            r14 = r14 | 256(0x100, float:3.59E-43)
            r13.a = r14
            r13.l = r12
            r12 = 1
            goto L_0x021f
        L_0x021e:
            r12 = 0
        L_0x021f:
            java.lang.String r13 = r0.c
            java.lang.String r14 = r9.c
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x052b
            java.lang.String r13 = r0.d
            java.lang.String r14 = r9.d
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x052b
            java.lang.String r13 = r0.e
            java.lang.String r14 = r9.e
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x052b
            java.lang.String r13 = r0.f
            java.lang.String r14 = r9.f
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x052b
            boolean r13 = r0.g
            boolean r14 = r9.g
            if (r13 != r14) goto L_0x024e
            goto L_0x0267
        L_0x024e:
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x0253
            goto L_0x0258
        L_0x0253:
            r11.c()
            r11.c = r6
        L_0x0258:
            aucj r12 = r11.b
            osz r12 = (defpackage.osz) r12
            osz r13 = defpackage.osz.s
            int r13 = r12.a
            r13 = r13 | 32
            r12.a = r13
            r12.g = r14
            r12 = 1
        L_0x0267:
            aucx r13 = r0.j
            int r13 = r13.size()
            aucx r14 = r9.j
            int r14 = r14.size()
            if (r13 == r14) goto L_0x0277
            goto L_0x052b
        L_0x0277:
            r13 = 0
        L_0x0278:
            aucx r14 = r0.j
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x0446
            aucx r14 = r0.j
            java.lang.Object r14 = r14.get(r13)
            oqy r14 = (defpackage.oqy) r14
            aucx r15 = r9.j
            java.lang.Object r15 = r15.get(r13)
            oqy r15 = (defpackage.oqy) r15
            java.lang.Object r16 = r14.c(r10)
            r7 = r16
            aucd r7 = (defpackage.aucd) r7
            r7.a((defpackage.aucj) r14)
            java.lang.String r10 = r14.b
            java.lang.String r6 = r15.b
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x052b
            boolean r6 = r14.c
            boolean r10 = r15.c
            if (r6 != r10) goto L_0x052b
            int r6 = r14.d
            oqv r6 = defpackage.oqv.a(r6)
            if (r6 == 0) goto L_0x02b4
            goto L_0x02b6
        L_0x02b4:
            oqv r6 = defpackage.oqv.TOKENIZER_TEXT
        L_0x02b6:
            int r10 = r15.d
            oqv r10 = defpackage.oqv.a(r10)
            if (r10 != 0) goto L_0x02c0
            oqv r10 = defpackage.oqv.TOKENIZER_TEXT
        L_0x02c0:
            if (r6 != r10) goto L_0x052b
            boolean r6 = r14.f
            boolean r10 = r15.f
            if (r6 != r10) goto L_0x052b
            aucu r6 = new aucu
            aucs r10 = r14.h
            r20 = r12
            auct r12 = defpackage.oqy.i
            r6.<init>(r10, r12)
            java.util.List r6 = defpackage.ozq.a((java.util.List) r6)
            aucu r10 = new aucu
            aucs r12 = r15.h
            auct r1 = defpackage.oqy.i
            r10.<init>(r12, r1)
            java.util.List r1 = defpackage.ozq.a((java.util.List) r10)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x052b
            int r1 = r14.k
            int r6 = r15.k
            if (r1 != r6) goto L_0x052b
            int r1 = r14.l
            int r6 = r15.l
            if (r1 != r6) goto L_0x052b
            int r1 = r14.o
            int r1 = defpackage.oqr.a(r1)
            if (r1 == 0) goto L_0x02ff
            goto L_0x0300
        L_0x02ff:
            r1 = 1
        L_0x0300:
            int r6 = r15.o
            int r6 = defpackage.oqr.a(r6)
            if (r6 == 0) goto L_0x0309
            goto L_0x030a
        L_0x0309:
            r6 = 1
        L_0x030a:
            if (r1 != r6) goto L_0x052b
            int r1 = r14.p
            int r1 = defpackage.oqt.a(r1)
            if (r1 == 0) goto L_0x0315
            goto L_0x0316
        L_0x0315:
            r1 = 1
        L_0x0316:
            int r6 = r15.p
            int r6 = defpackage.oqt.a(r6)
            if (r6 == 0) goto L_0x031f
            goto L_0x0320
        L_0x031f:
            r6 = 1
        L_0x0320:
            if (r1 != r6) goto L_0x052b
            boolean r1 = r14.q
            boolean r6 = r15.q
            if (r1 != r6) goto L_0x052b
            aucu r1 = new aucu
            aucs r6 = r14.h
            auct r10 = defpackage.oqy.i
            r1.<init>(r6, r10)
            aucu r6 = new aucu
            aucs r10 = r15.h
            auct r12 = defpackage.oqy.i
            r6.<init>(r10, r12)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0343
            r12 = r20
            goto L_0x0365
        L_0x0343:
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x0348
            goto L_0x034e
        L_0x0348:
            r7.c()
            r1 = 0
            r7.c = r1
        L_0x034e:
            aucj r1 = r7.b
            oqy r1 = (defpackage.oqy) r1
            aucs r6 = defpackage.aucj.q()
            r1.h = r6
            aucu r1 = new aucu
            aucs r6 = r15.h
            auct r10 = defpackage.oqy.i
            r1.<init>(r6, r10)
            r7.J(r1)
            r12 = 1
        L_0x0365:
            aucx r1 = r14.j
            aucx r6 = r15.j
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0370
            goto L_0x038b
        L_0x0370:
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x0375
            goto L_0x037b
        L_0x0375:
            r7.c()
            r1 = 0
            r7.c = r1
        L_0x037b:
            aucj r1 = r7.b
            oqy r1 = (defpackage.oqy) r1
            aucx r6 = defpackage.aucj.s()
            r1.j = r6
            aucx r1 = r15.j
            r7.I(r1)
            r12 = 1
        L_0x038b:
            java.lang.String r1 = r14.g
            java.lang.String r6 = r15.g
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0396
            goto L_0x03b3
        L_0x0396:
            java.lang.String r1 = r15.g
            boolean r6 = r7.c
            if (r6 != 0) goto L_0x039d
            goto L_0x03a3
        L_0x039d:
            r7.c()
            r6 = 0
            r7.c = r6
        L_0x03a3:
            aucj r6 = r7.b
            oqy r6 = (defpackage.oqy) r6
            r1.getClass()
            int r10 = r6.a
            r10 = r10 | 32
            r6.a = r10
            r6.g = r1
            r12 = 1
        L_0x03b3:
            int r1 = r14.e
            int r6 = r15.e
            if (r1 != r6) goto L_0x03ba
            goto L_0x03d2
        L_0x03ba:
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x03bf
            goto L_0x03c5
        L_0x03bf:
            r7.c()
            r1 = 0
            r7.c = r1
        L_0x03c5:
            aucj r1 = r7.b
            oqy r1 = (defpackage.oqy) r1
            int r10 = r1.a
            r10 = r10 | 8
            r1.a = r10
            r1.e = r6
            r12 = 1
        L_0x03d2:
            java.lang.String r1 = r14.m
            java.lang.String r6 = r15.m
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x03dd
            goto L_0x03fa
        L_0x03dd:
            java.lang.String r1 = r15.m
            boolean r6 = r7.c
            if (r6 != 0) goto L_0x03e4
            goto L_0x03ea
        L_0x03e4:
            r7.c()
            r6 = 0
            r7.c = r6
        L_0x03ea:
            aucj r6 = r7.b
            oqy r6 = (defpackage.oqy) r6
            r1.getClass()
            int r10 = r6.a
            r10 = r10 | 256(0x100, float:3.59E-43)
            r6.a = r10
            r6.m = r1
            r12 = 1
        L_0x03fa:
            int r1 = r14.n
            int r6 = r15.n
            if (r1 == r6) goto L_0x0418
            boolean r1 = r7.c
            if (r1 != 0) goto L_0x0405
            goto L_0x040b
        L_0x0405:
            r7.c()
            r1 = 0
            r7.c = r1
        L_0x040b:
            aucj r1 = r7.b
            oqy r1 = (defpackage.oqy) r1
            int r10 = r1.a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r1.a = r10
            r1.n = r6
            r12 = 1
        L_0x0418:
            if (r12 != 0) goto L_0x041b
            goto L_0x043d
        L_0x041b:
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x0420
            goto L_0x0426
        L_0x0420:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x0426:
            aucj r1 = r11.b
            osz r1 = (defpackage.osz) r1
            aucj r6 = r7.i()
            oqy r6 = (defpackage.oqy) r6
            osz r7 = defpackage.osz.s
            r6.getClass()
            r1.a()
            aucx r1 = r1.j
            r1.set(r13, r6)
        L_0x043d:
            int r13 = r13 + 1
            r6 = 0
            r7 = 1
            r10 = 5
            r1 = r17
            goto L_0x0278
        L_0x0446:
            r20 = r12
            aucx r1 = r0.k
            aucx r6 = r9.k
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0455
            r12 = r20
            goto L_0x0472
        L_0x0455:
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x045a
            goto L_0x0460
        L_0x045a:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x0460:
            aucj r1 = r11.b
            osz r1 = (defpackage.osz) r1
            osz r6 = defpackage.osz.s
            aucx r6 = defpackage.aucj.s()
            r1.k = r6
            aucx r1 = r9.k
            r11.K(r1)
            r12 = 1
        L_0x0472:
            boolean r1 = r0.m
            boolean r6 = r9.m
            if (r1 != r6) goto L_0x0479
            goto L_0x0493
        L_0x0479:
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x047e
            goto L_0x0484
        L_0x047e:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x0484:
            aucj r1 = r11.b
            osz r1 = (defpackage.osz) r1
            osz r7 = defpackage.osz.s
            int r7 = r1.a
            r7 = r7 | 512(0x200, float:7.175E-43)
            r1.a = r7
            r1.m = r6
            r12 = 1
        L_0x0493:
            long r6 = r0.n
            long r13 = r9.n
            int r1 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x049c
            goto L_0x04b6
        L_0x049c:
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x04a1
            goto L_0x04a7
        L_0x04a1:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x04a7:
            aucj r1 = r11.b
            osz r1 = (defpackage.osz) r1
            osz r6 = defpackage.osz.s
            int r6 = r1.a
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r1.a = r6
            r1.n = r13
            r12 = 1
        L_0x04b6:
            java.lang.String r1 = r0.o
            java.lang.String r6 = r9.o
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x052b
            java.lang.String r1 = r0.p
            java.lang.String r6 = r9.p
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x052b
            java.lang.String r1 = r0.q
            java.lang.String r2 = r9.q
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04f4
            java.lang.String r1 = r9.q
            boolean r2 = r11.c
            if (r2 != 0) goto L_0x04db
            goto L_0x04e1
        L_0x04db:
            r11.c()
            r2 = 0
            r11.c = r2
        L_0x04e1:
            aucj r2 = r11.b
            osz r2 = (defpackage.osz) r2
            osz r6 = defpackage.osz.s
            r1.getClass()
            int r6 = r2.a
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            r2.a = r6
            r2.q = r1
            r7 = 1
            goto L_0x04f5
        L_0x04f4:
            r7 = r12
        L_0x04f5:
            int r0 = r0.r
            int r1 = r9.r
            if (r0 == r1) goto L_0x0515
            boolean r0 = r11.c
            if (r0 != 0) goto L_0x0500
            goto L_0x0506
        L_0x0500:
            r11.c()
            r0 = 0
            r11.c = r0
        L_0x0506:
            aucj r0 = r11.b
            osz r0 = (defpackage.osz) r0
            osz r2 = defpackage.osz.s
            int r2 = r0.a
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r0.a = r2
            r0.r = r1
            goto L_0x0517
        L_0x0515:
            if (r7 == 0) goto L_0x0524
        L_0x0517:
            aucj r0 = r11.i()
            osz r0 = (defpackage.osz) r0
            ozv r0 = r3.a((java.lang.Object) r0)
            r4.a((defpackage.pao) r5, (defpackage.ozv) r0)
        L_0x0524:
            java.lang.Object r0 = r8.c()
            osz r0 = (defpackage.osz) r0
            return r0
        L_0x052b:
            java.lang.String r0 = "Corpus registration info changed, replacing corpus"
            defpackage.oso.a(r0)
            r1 = r17
            boolean r0 = r1.a((defpackage.pao) r5, (defpackage.oyz) r2)
            if (r0 == 0) goto L_0x053b
            goto L_0x05e8
        L_0x053b:
            pax r0 = new pax
            java.lang.String r2 = "Could not unregister old corpus"
            r0.<init>(r2)
            throw r0
        L_0x0543:
            pau r0 = new pau
            java.lang.String r2 = r21.d()
            java.lang.String r3 = r8.d()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 38
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "CorpusConfig: cannot "
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = " when previously "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r0.<init>(r2)
            throw r0
        L_0x057d:
            java.lang.Object r2 = r21.c()
            osz r2 = (defpackage.osz) r2
            java.lang.String r2 = r2.c
            java.lang.Object r6 = r4.a()
            monitor-enter(r6)
            ozb r7 = r4.c     // Catch:{ all -> 0x05ed }
            java.util.Set r0 = r7.b((defpackage.ozc) r0)     // Catch:{ all -> 0x05ed }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x05ed }
        L_0x0594:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x05ed }
            if (r7 == 0) goto L_0x05e7
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x05ed }
            oyz r7 = (defpackage.oyz) r7     // Catch:{ all -> 0x05ed }
            amzy r8 = r4.a((defpackage.oyz) r7)     // Catch:{ all -> 0x05ed }
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x05ed }
            if (r9 != 0) goto L_0x0594
            pao r9 = new pao     // Catch:{ all -> 0x05ed }
            java.lang.String r7 = r7.b     // Catch:{ all -> 0x05ed }
            r9.<init>(r7, r2)     // Catch:{ all -> 0x05ed }
            boolean r7 = r8.contains(r9)     // Catch:{ all -> 0x05ed }
            if (r7 != 0) goto L_0x05b8
            goto L_0x0594
        L_0x05b8:
            monitor-exit(r6)     // Catch:{ all -> 0x05ed }
            pau r0 = new pau
            java.lang.Object r2 = r21.c()
            osz r2 = (defpackage.osz) r2
            java.lang.String r2 = r2.c
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 59
            r4.<init>(r3)
            java.lang.String r3 = "Corpus "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = " already exists in a different package from this uid"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L_0x05e7:
            monitor-exit(r6)     // Catch:{ all -> 0x05ed }
        L_0x05e8:
            osz r0 = r1.a((defpackage.pao) r5, (defpackage.ozv) r3)
            return r0
        L_0x05ed:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x05ed }
            throw r0
        L_0x05f0:
            oyq r0 = r1.r
            java.lang.String r3 = "register_auth_fail"
            r0.a((java.lang.String) r3)
            pax r0 = new pax
            java.lang.String r2 = r2.b
            java.lang.String r3 = defpackage.oyz.a((int) r4)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r5 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 26
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "Package "
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = " cannot register: "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r6.toString()
            r0.<init>(r2)
            throw r0
        L_0x062b:
            pax r0 = new pax
            java.lang.String r2 = r2.b
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 20
            r4.<init>(r3)
            java.lang.String r3 = "Package "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = " is blocked."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            goto L_0x0654
        L_0x0653:
            throw r0
        L_0x0654:
            goto L_0x0653
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osf.a(ozc, oyz, boolean, ozv):osz");
    }

    public final pqa a(boolean z2) {
        orw orw = new orw(this, aonk.INIT_INDEX_MANAGER, z2);
        this.f.acquireUninterruptibly();
        try {
            this.c.d(orw);
            return orw;
        } catch (IllegalStateException e2) {
            oso.b((Throwable) e2, "Unable to initialize index manager due to start service failure: %s", e2.getMessage());
            this.r.a("init_index_manager_svc_failed");
            this.f.release();
            return new orx();
        }
    }

    public final void a(double d2, int i2) {
        long[] jArr;
        int[] iArr;
        this.c.b(2);
        oso.d("Starting purge with target free %.3f%% min disk %.3f%% min index %.3f%%", Double.valueOf(d2 * 100.0d), Double.valueOf(this.i.b() * 100.0d), Double.valueOf(this.n.g() * 100.0d));
        NativeIndex nativeIndex = this.n;
        int i3 = ozq.a;
        otr a2 = ozy.a();
        ozq b2 = b();
        synchronized (b2.a()) {
            iva.b(Thread.holdsLock(b2.a()));
            int i4 = -1;
            for (ota ota : b2.f.values()) {
                osz osz = ota.b;
                if (osz == null) {
                    osz = osz.s;
                }
                int i5 = osz.b;
                if (i5 > i4) {
                    i4 = i5;
                }
            }
            jArr = new long[(i4 + 1)];
            CRC32 crc32 = new CRC32();
            for (ota ota2 : b2.f.values()) {
                crc32.reset();
                try {
                    osz osz2 = ota2.b;
                    if (osz2 == null) {
                        osz2 = osz.s;
                    }
                    crc32.update(osz2.e.getBytes("UTF-8"));
                    osz osz3 = ota2.b;
                    if (osz3 == null) {
                        osz3 = osz.s;
                    }
                    jArr[osz3.b] = crc32.getValue();
                } catch (UnsupportedEncodingException e2) {
                    throw new IllegalArgumentException("CannotHappenException");
                }
            }
        }
        ozq b3 = b();
        synchronized (b3.a()) {
            Collection<ota> values = b3.f.values();
            int i6 = 0;
            for (ota ota3 : values) {
                osz osz4 = ota3.b;
                if (osz4 == null) {
                    osz4 = osz.s;
                }
                if (!osz4.g) {
                    i6++;
                }
            }
            iArr = new int[i6];
            int i7 = 0;
            for (ota ota4 : values) {
                osz osz5 = ota4.b;
                if (osz5 == null) {
                    osz5 = osz.s;
                }
                if (!osz5.g) {
                    iArr[i7] = osz5.b;
                    i7++;
                }
            }
        }
        antj a3 = nativeIndex.a(d2, i3, a2, jArr, iArr, b().e());
        aucd aucd = (aucd) a3.c(5);
        aucd.a((aucj) a3);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        antj antj = antj.d;
        ((antj) aucd.b).a = anti.a(i2);
        a((antj) aucd.i());
    }

    public final void a(int i2) {
        this.c.b(2);
        oso.c("Starting compaction min disk %.3f%% min index %.3f%%", (Object) Double.valueOf(this.i.b() * 100.0d), (Object) Double.valueOf(this.n.g() * 100.0d));
        antj a2 = this.n.a(0.0d, ozq.a, ozy.a(), (long[]) null, (int[]) null, b().e());
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        antj antj = antj.d;
        ((antj) aucd.b).a = anti.a(i2);
        a((antj) aucd.i());
    }

    public final void a(aolt aolt, long j2) {
        this.r.a(aolt, (int) (SystemClock.elapsedRealtime() - j2));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.c.b(2);
        e(str);
    }

    public final void a(String str, String str2) {
        String b2 = b(str, str2);
        if (b2 != null) {
            oso.b(b2);
        }
    }

    public final void a(String str, pqy pqy) {
        String str2;
        if (hxz.a()) {
            str2 = "<redacted>";
        } else {
            str2 = str;
        }
        if (!((Boolean) ozx.bw.c()).booleanValue() && pqy.b.size() > 0) {
            oso.a("Notifying GSA of setting change for account:%s changed.", (Object) str2);
            int[] iArr = new int[pqy.b.size()];
            for (int i2 = 0; i2 < pqy.b.size(); i2++) {
                iArr[i2] = ((atzl) pqy.b.get(i2)).b;
            }
            itg.a(this.b, str, iArr);
        }
    }

    public final void a(ose ose, ots ots) {
        if (ots.b) {
            this.r.a("init_docstore_recovery");
            ose.b = true;
        }
    }

    public final void a(ots ots) {
        if ((ots.a & 2) != 0) {
            aojs aojs = ots.c;
            if (aojs == null) {
                aojs = aojs.c;
            }
            int a2 = aomd.a(aojs.a);
            if (a2 == 0 || a2 != 3) {
                this.r.a("init_full_lost");
            }
            aojs aojs2 = ots.c;
            if (aojs2 == null) {
                aojs2 = aojs.c;
            }
            int a3 = aomd.a(aojs2.b);
            if (a3 == 0 || a3 != 3) {
                this.r.a("init_lite_lost");
            }
            oyq oyq = this.r;
            aojs aojs3 = ots.c;
            if (aojs3 == null) {
                aojs3 = aojs.c;
            }
            long j2 = axrp.a.a().j();
            if (oyq.a(j2)) {
                aucd o2 = aoji.R.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoji aoji = (aoji) o2.b;
                aojs3.getClass();
                aoji.z = aojs3;
                aoji.a |= 268435456;
                oyq.a(6007, o2, j2);
            }
        }
    }

    public final void a(oyz oyz, String str) {
        ozq b2 = b();
        pao pao = new pao(oyz.b, str);
        ozv e2 = b2.e(pao);
        if (e2 != null) {
            a(pao, oyz);
            if (!NativeIndex.nativeClearUsageReportDataForIdAndUri(this.n.b, ((osz) e2.c()).i, NativeIndex.a(""))) {
                String valueOf = String.valueOf(str);
                throw new pax(valueOf.length() == 0 ? new String("Failed to clear usage report data for corpus ") : "Failed to clear usage report data for corpus ".concat(valueOf));
            } else {
                a(pao, e2);
            }
        } else {
            String str2 = oyz.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(str2).length());
            sb.append("No CorpusConfig for ");
            sb.append(str);
            sb.append(" of ");
            sb.append(str2);
            throw new pau(sb.toString());
        }
    }

    public final void a(pqz pqz) {
        if (!d()) {
            oso.b("Couldn't handle gcm msg due to initialization failure");
        } else {
            this.c.d(new orj(this, aonk.HANDLE_GCM_MESSAGE, pqz));
        }
    }

    public final void a(Account[] accountArr) {
        boolean z2;
        this.c.b(2);
        ozu ozu = new ozu(this.m, this.B, accountArr);
        if (accountArr != null) {
            Set h2 = this.g.h();
            boolean z3 = false;
            for (Account remove : accountArr) {
                if (!h2.remove(remove)) {
                    z3 = true;
                }
            }
            z2 = z3 || !h2.isEmpty();
            ozu.b = z2;
        } else {
            z2 = false;
        }
        ozu.a(false);
        if (z2) {
            prp prp = this.g;
            aucd o2 = opr.b.o();
            for (Account account : accountArr) {
                aucd o3 = opq.d.o();
                String str = account.name;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                opq opq = (opq) o3.b;
                str.getClass();
                opq.a |= 1;
                opq.b = str;
                String str2 = account.type;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                opq opq2 = (opq) o3.b;
                str2.getClass();
                opq2.a |= 2;
                opq2.c = str2;
                opq opq3 = (opq) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                opr opr = (opr) o2.b;
                opq3.getClass();
                if (!opr.a.a()) {
                    opr.a = aucj.a(opr.a);
                }
                opr.a.add(opq3);
            }
            prp.b.edit().putString("known-accounts", Base64.encodeToString(((opr) o2.i()).k(), 0)).apply();
        }
    }

    public final void a(String... strArr) {
        ppp ppp = this.c;
        osb osb = new osb(this, aonk.APP_INDEXING_HANDLE_PACKAGE_REMOVAL, strArr);
        osb.a = this;
        ppp.d(osb);
    }

    public final boolean a(osz osz, String str) {
        if (!ozq.f(osz)) {
            return false;
        }
        return NativeIndex.nativeClearUsageReportDataForIdAndUri(this.n.b, osz.i, NativeIndex.a(str)) && this.n.a(0, osz.b, str) == aond.OK;
    }

    public final boolean a(oyz oyz) {
        this.c.b(2);
        boolean z2 = true;
        if (this.m.b(oyz.b)) {
            if (((Boolean) ozx.bu.c()).booleanValue() && ptl.a()) {
                try {
                    this.b.getPackageManager().getApplicationInfo("com.google.android.gms.apitest", 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    oso.b((Throwable) e2, "Could not get app info for %s", "com.google.android.gms.apitest");
                }
            }
            this.t.b();
        }
        amzy a2 = b().a(oyz);
        int size = a2.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            z3 = a((pao) a2.get(i2), oyz) || z3;
        }
        try {
            if (((Boolean) ozx.av.c()).booleanValue() || ((Boolean) ozx.ay.c()).booleanValue()) {
                oxx.a(this.b).a(oyz.b);
            }
        } catch (SQLiteException e3) {
            n().a("IndexManager", e3, axrp.f());
        }
        ozb ozb = this.m;
        synchronized (ozb.b) {
            if (oyz != null) {
                if (oyz != ozb.c.get(oyz.b)) {
                    z2 = false;
                }
                iva.a(z2);
                synchronized (oyz.e) {
                    oyz.f.clear();
                }
                try {
                    oyz.a(ozv.a);
                    oyz.k();
                } catch (pau e4) {
                    throw new paw((Throwable) e4);
                }
            }
        }
        return z3;
    }

    public final boolean a(ozc ozc, ozv ozv) {
        this.c.b(2);
        boolean a2 = oxe.a(((RegisterCorpusInfo) ozv.c()).a);
        oyz a3 = this.m.a(ozc);
        if (a2) {
            oso.a("Set global search info for package %s.", (Object) a3.b);
            a3.d();
            a3.a(System.currentTimeMillis());
        }
        pbj pbj = new pbj(a3.b, (RegisterCorpusInfo) ozv.c(), a2 ? this.b.getResources() : a3.l());
        pbj.a();
        osz a4 = ozq.a(a3, (RegisterCorpusInfo) ozv.c());
        aucd aucd = (aucd) a4.c(5);
        aucd.a((aucj) a4);
        List b2 = pbj.b();
        if (b2 != null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            osz osz = osz.s;
            ((osz) aucd.b).k = aucj.s();
            aucd.K(b2);
        }
        osz d2 = b().d(new pao(a3.b, ((RegisterCorpusInfo) ozv.c()).a));
        osz a5 = a(ozc, a3, !a2, ozv.a((Object) (osz) aucd.i()));
        if (d2 == null || d2.b == a5.b) {
            return false;
        }
        return true;
    }

    public final boolean a(pao pao, oyz oyz) {
        boolean z2;
        boolean z3;
        this.c.b(2);
        oso.c("Removing corpus key %s for package %s", (Object) pao.b(), (Object) oyz.b);
        ozq b2 = b();
        ota b3 = b2.b(pao);
        if (b3 == null || !oyz.b(pao)) {
            return true;
        }
        synchronized (b2.a()) {
            ota ota = (ota) b2.f.get(pao);
            if (ota != null) {
                otg otg = ota.c;
                if (otg == null) {
                    otg = otg.h;
                }
                int a2 = otf.a(otg.c);
                if (a2 != 0) {
                    if (a2 != 1) {
                        z2 = true;
                    }
                }
                aucd aucd = (aucd) ota.c(5);
                aucd.a((aucj) ota);
                otg otg2 = ota.c;
                if (otg2 == null) {
                    otg2 = otg.h;
                }
                aucd aucd2 = (aucd) otg2.c(5);
                aucd2.a((aucj) otg2);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                otg otg3 = (otg) aucd2.b;
                otg3.c = 1;
                otg3.a |= 4;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                ota ota2 = (ota) aucd.b;
                otg otg4 = (otg) aucd2.i();
                otg4.getClass();
                ota2.c = otg4;
                ota2.a |= 2;
                ota ota3 = (ota) aucd.i();
                b2.f.put(pao, ota3);
                z2 = b2.b.a(ota3);
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            oso.b("Failed to start deactivating corpus key %s", (Object) pao.b());
            this.r.a("start_deactivate_corpus_failed");
            return false;
        }
        NativeIndex nativeIndex = this.n;
        osz osz = b3.b;
        if (osz == null) {
            osz = osz.s;
        }
        if (NativeIndex.nativeDeleteCorpus(nativeIndex.b, osz.b)) {
            synchronized (b2.a()) {
                if (oyz.b(pao)) {
                    ota ota4 = (ota) b2.f.get(pao);
                    if (ota4 != null) {
                        otg otg5 = ota4.c;
                        if (otg5 == null) {
                            otg5 = otg.h;
                        }
                        int a3 = otf.a(otg5.c);
                        if (a3 == 0) {
                            z3 = false;
                        } else if (a3 == 2) {
                            ota ota5 = (ota) b2.f.remove(pao);
                            if (ota5 == null) {
                                oso.b("Can't find corpus with key %s", (Object) pao.b());
                            } else {
                                osz osz2 = ota5.b;
                                if (osz2 == null) {
                                    osz2 = osz.s;
                                }
                                String str = osz2.c;
                                otg otg6 = ota5.c;
                                if (otg6 == null) {
                                    otg6 = otg.h;
                                }
                                int a4 = otf.a(otg6.c);
                                if (a4 != 0) {
                                    if (a4 == 2) {
                                        oso.a("Removing inactive corpus %s", (Object) str);
                                        b2.g = true;
                                        ozb ozb = b2.c;
                                        osz osz3 = ota5.b;
                                        if (osz3 == null) {
                                            osz3 = osz.s;
                                        }
                                        oyz c2 = ozb.c(osz3.e);
                                        c2.a(pao);
                                        c2.b();
                                    }
                                }
                                Object[] objArr = new Object[3];
                                objArr[0] = str;
                                objArr[1] = 1;
                                otg otg7 = ota5.c;
                                if (otg7 == null) {
                                    otg7 = otg.h;
                                }
                                int a5 = otf.a(otg7.c);
                                if (a5 == 0) {
                                    a5 = 1;
                                }
                                objArr[2] = Integer.valueOf(a5 - 1);
                                oso.c("Can't remove corpus %s, not in expected state %s, actual state=%s", objArr);
                            }
                            aucd aucd3 = (aucd) ota4.c(5);
                            aucd3.a((aucj) ota4);
                            otg otg8 = ota4.c;
                            if (otg8 == null) {
                                otg8 = otg.h;
                            }
                            aucd aucd4 = (aucd) otg8.c(5);
                            aucd4.a((aucj) otg8);
                            if (aucd4.c) {
                                aucd4.c();
                                aucd4.c = false;
                            }
                            otg otg9 = (otg) aucd4.b;
                            otg9.c = 2;
                            otg9.a |= 4;
                            if (aucd3.c) {
                                aucd3.c();
                                aucd3.c = false;
                            }
                            ota ota6 = (ota) aucd3.b;
                            otg otg10 = (otg) aucd4.i();
                            otg10.getClass();
                            ota6.c = otg10;
                            ota6.a = 2 | ota6.a;
                            ota a6 = b2.a((ota) aucd3.i());
                            b2.b(a6);
                            paq paq = b2.b;
                            SharedPreferences.Editor edit = ((par) paq).a.edit();
                            String valueOf = String.valueOf(((par) paq).a(pao));
                            edit.remove(valueOf.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf));
                            String valueOf2 = String.valueOf(((par) paq).a(new pao(a6)));
                            edit.putString(valueOf2.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf2), plc.a((audx) a6));
                            z3 = edit.commit();
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    String a7 = pao.a();
                    String str2 = oyz.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(a7).length() + 27 + String.valueOf(str2).length());
                    sb.append("Key ");
                    sb.append(a7);
                    sb.append(" doesn't exist for pkg ");
                    sb.append(str2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (z3) {
                return true;
            }
            oso.b("Failed to finish deactivating corpus key %s", (Object) pao.b());
            this.r.a("finish_deactivate_corpus_failed");
            return false;
        }
        oso.b("Failed to delete corpus key %s", (Object) pao.b());
        this.r.a("delete_corpus_failed");
        return false;
    }
}
