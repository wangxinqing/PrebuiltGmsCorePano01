package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.PersistableBundle;

/* renamed from: dms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dms extends dma {
    public boolean a;
    public final dmm b;
    public final dmk c;
    public final dnb e;
    public final dpw f;
    public long g;
    public boolean h;
    private final dpn i;
    private final dpl j;
    private final long k = Long.MIN_VALUE;
    private final dnb l;

    protected dms(dmd dmd, dme dme) {
        super(dmd);
        iva.a((Object) dme);
        this.j = new dpl(dmd);
        this.b = new dmm(dmd);
        this.i = dme.a(dmd);
        this.c = new dmk(dmd);
        this.f = new dpw(c());
        this.l = new dmo(this, dmd);
        this.e = new dmp(this, dmd);
    }

    private final void v() {
        long j2;
        dnd j3 = j();
        if (j3.a && !j3.b) {
            dkw.a();
            q();
            try {
                dmm dmm = this.b;
                dkw.a();
                dmm.q();
                j2 = dmm.a(dmm.b, (String[]) null);
            } catch (SQLiteException e2) {
                e("Failed to get min/max hit times from local store", e2);
                j2 = 0;
            }
            if (j2 != 0) {
                long abs = Math.abs(c().a() - j2);
                f();
                if (abs <= ((Long) doz.i.a()).longValue()) {
                    f();
                    a("Dispatch alarm scheduled (ms)", Long.valueOf(dmy.c()));
                    j3.q();
                    iva.a(j3.a, (Object) "Receiver not registered");
                    j3.f();
                    long c2 = dmy.c();
                    if (c2 > 0) {
                        j3.s();
                        long b2 = j3.c().b() + c2;
                        j3.b = true;
                        if (((Boolean) doz.H.a()).booleanValue()) {
                            j3.b("Scheduling upload with GcmTaskService");
                            j3.a(c2);
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            j3.b("Scheduling upload with JobScheduler");
                            Context d = j3.d();
                            ComponentName componentName = new ComponentName(d, "com.google.android.gms.analytics.AnalyticsJobService");
                            int t = j3.t();
                            PersistableBundle persistableBundle = new PersistableBundle();
                            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                            JobInfo build = new JobInfo.Builder(t, componentName).setMinimumLatency(c2).setOverrideDeadline(c2 + c2).setExtras(persistableBundle).build();
                            j3.a("Scheduling job. JobID", Integer.valueOf(t));
                            qvg.a(d, build, "com.google.android.gms", "DispatchAlarm");
                        } else {
                            j3.b("Scheduling upload with AlarmManager");
                            j3.c.setInexactRepeating(2, b2, c2, j3.b());
                        }
                    }
                }
            }
        }
    }

    private final void w() {
        if (this.l.b()) {
            b("All hits dispatched or no network/service. Going to power save mode");
        }
        this.l.c();
        dnd j2 = j();
        if (j2.b) {
            j2.s();
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.r();
        this.i.r();
        this.c.r();
    }

    public final long t() {
        long j2 = this.k;
        if (j2 != Long.MIN_VALUE) {
            return j2;
        }
        f();
        long longValue = ((Long) doz.f.a()).longValue();
        dpy k2 = k();
        k2.q();
        if (!k2.c) {
            return longValue;
        }
        dpy k3 = k();
        k3.q();
        return ((long) k3.e) * 1000;
    }

    public final void u() {
        q();
        dkw.a();
        this.h = true;
        this.c.t();
        s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0307, code lost:
        if (r7.a == 0) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0309, code lost:
        r9 = r3.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030d, code lost:
        if (r9 != null) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r3.e("Failed to build batching endpoint url");
        r8 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0318, code lost:
        r29 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x031c, code lost:
        if (r14 == false) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r10 = r7.a();
        defpackage.iva.a((java.lang.Object) r9);
        defpackage.iva.a((java.lang.Object) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r3.a(r3.d().getPackageName());
        r12 = new java.io.ByteArrayOutputStream();
        r13 = new java.util.zip.GZIPOutputStream(r12);
        r13.write(r10);
        r13.close();
        r12.close();
        r12 = r12.toByteArray();
        r13 = r12.length;
        r14 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0351, code lost:
        r29 = r5;
        r5 = ((long) r13) * 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r15 = r10.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0359, code lost:
        r25 = r7;
        r31 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        super.a(3, "POST compressed size, ratio %, url", r14, java.lang.Long.valueOf(r5 / ((long) r15)), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x036e, code lost:
        if (r13 <= r15) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0370, code lost:
        r3.c("Compressed payload is larger then uncompressed. compressed, uncompressed", r14, java.lang.Integer.valueOf(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x037d, code lost:
        if (defpackage.dlz.o() == false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x037f, code lost:
        r7 = new java.lang.String(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x038c, code lost:
        if (r7.length() != 0) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x038e, code lost:
        r7 = new java.lang.String("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0394, code lost:
        r7 = "\n".concat(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0398, code lost:
        r3.a("Post payload", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x039b, code lost:
        r5 = r3.a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r5.setDoOutput(true);
        r5.addRequestProperty("Content-Encoding", "gzip");
        r5.setFixedLengthStreamingMode(r13);
        r5.connect();
        r6 = r5.getOutputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r6.write(r12);
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r3.a(r5);
        r6 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c3, code lost:
        if (r6 == 200) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03c6, code lost:
        r3.i().b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03cd, code lost:
        r3.b("POST status", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03d6, code lost:
        if (r5 == null) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03db, code lost:
        r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03de, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03e2, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e5, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e8, code lost:
        r7 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ec, code lost:
        r7 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ef, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03f1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03f5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03f6, code lost:
        r29 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f8, code lost:
        r7 = r0;
        r5 = null;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03fc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03fd, code lost:
        r29 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ff, code lost:
        r25 = r7;
        r31 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0403, code lost:
        r7 = r0;
        r5 = null;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r3.d("Network compressed POST connection error", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x040b, code lost:
        if (r6 != null) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0411, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        r3.e("Error closing http compressed post connection output stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0416, code lost:
        if (r5 != null) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0418, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x041b, code lost:
        r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x041e, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0420, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0421, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0422, code lost:
        if (r6 != null) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0428, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        r3.e("Error closing http compressed post connection output stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x042d, code lost:
        if (r5 != null) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x042f, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0432, code lost:
        r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0435, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0436, code lost:
        r29 = r5;
        r25 = r7;
        r31 = r8;
        r15 = r3.a(r9, r25.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0446, code lost:
        if (r15 != 200) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0448, code lost:
        r5 = java.lang.Integer.valueOf(r15);
        r3.a("Network error uploading hits. status code", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x045d, code lost:
        if (r3.f().b().contains(r5) != false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x045f, code lost:
        r3.d("Server instructed the client to stop batching");
        r3.a.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0469, code lost:
        r8 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x046f, code lost:
        r3.a("Batched upload completed. Hits batched", java.lang.Integer.valueOf(r25.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x047d, code lost:
        r29 = r5;
        r31 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0481, code lost:
        r8 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        r1.b.s();
        r1.b.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x061a, code lost:
        r29 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:?, code lost:
        b("Store is empty, nothing to dispatch");
        w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        r1.b.s();
        r1.b.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0630, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:?, code lost:
        e("Failed to commit local dispatch transaction", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0659, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0678, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0150, code lost:
        d("Database contains successfully uploaded hit", java.lang.Long.valueOf(r12), java.lang.Integer.valueOf(r10.size()));
        w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r1.b.s();
        r1.b.t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016e, code lost:
        r29 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0172, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        e("Failed to commit local dispatch transaction", r0);
        w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017a, code lost:
        r29 = r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03f1 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:134:0x0358] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x040d A[SYNTHETIC, Splitter:B:187:0x040d] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0418 A[Catch:{ IOException -> 0x0411, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0424 A[SYNTHETIC, Splitter:B:200:0x0424] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x042f A[Catch:{ IOException -> 0x0411, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0448 A[Catch:{ IOException -> 0x0411, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x046f A[Catch:{ IOException -> 0x0411, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0485 A[Catch:{ IOException -> 0x0411, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0519 A[SYNTHETIC, Splitter:B:256:0x0519] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x051e A[Catch:{ IOException -> 0x0411, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0524 A[Catch:{ IOException -> 0x0411, all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05aa A[Catch:{ IOException -> 0x0411, all -> 0x0678 }, LOOP:5: B:282:0x05a4->B:284:0x05aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05ea A[SYNTHETIC, Splitter:B:301:0x05ea] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0608 A[EDGE_INSN: B:309:0x0608->B:310:? ?: BREAK  , SYNTHETIC, Splitter:B:309:0x0608] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0655 A[SYNTHETIC, Splitter:B:339:0x0655] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x069c A[Catch:{ Exception -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x069d A[Catch:{ Exception -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x06a6 A[Catch:{ Exception -> 0x06c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021c A[SYNTHETIC, Splitter:B:88:0x021c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dne r33) {
        /*
            r32 = this;
            r1 = r32
            java.lang.String r2 = "Error closing http compressed post connection output stream"
            java.lang.String r3 = "hit_id"
            java.lang.String r4 = "Failed to commit local dispatch transaction"
            long r5 = r1.g
            defpackage.dkw.a()
            r32.q()
            dpp r7 = r32.l()
            long r7 = r7.s()
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x002c
            jiq r11 = r32.c()
            long r11 = r11.a()
            long r11 = r11 - r7
            long r7 = java.lang.Math.abs(r11)
            goto L_0x002e
        L_0x002c:
            r7 = -1
        L_0x002e:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "Dispatching local hits. Elapsed time since last dispatch (ms)"
            r1.b(r8, r7)
            r32.f()
            defpackage.dkw.a()     // Catch:{ Exception -> 0x06c5 }
            r32.q()     // Catch:{ Exception -> 0x06c5 }
            java.lang.String r7 = "Dispatching a batch of local hits"
            r1.b(r7)     // Catch:{ Exception -> 0x06c5 }
            dmk r7 = r1.c     // Catch:{ Exception -> 0x06c5 }
            boolean r7 = r7.b()     // Catch:{ Exception -> 0x06c5 }
            if (r7 == 0) goto L_0x004f
        L_0x004e:
            goto L_0x0053
        L_0x004f:
            r32.f()     // Catch:{ Exception -> 0x06c5 }
            goto L_0x004e
        L_0x0053:
            dpn r7 = r1.i     // Catch:{ Exception -> 0x06c5 }
            r7.s()     // Catch:{ Exception -> 0x06c5 }
            r32.f()     // Catch:{ Exception -> 0x06c5 }
            int r7 = defpackage.dmy.f()     // Catch:{ Exception -> 0x06c5 }
            r32.f()     // Catch:{ Exception -> 0x06c5 }
            int r8 = defpackage.dmy.e()     // Catch:{ Exception -> 0x06c5 }
            int r7 = java.lang.Math.max(r7, r8)     // Catch:{ Exception -> 0x06c5 }
            long r7 = (long) r7     // Catch:{ Exception -> 0x06c5 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x06c5 }
            r11.<init>()     // Catch:{ Exception -> 0x06c5 }
            r12 = r9
        L_0x0071:
            dmm r14 = r1.b     // Catch:{ all -> 0x067a }
            r14.b()     // Catch:{ all -> 0x067a }
            r11.clear()     // Catch:{ all -> 0x067a }
            dmm r14 = r1.b     // Catch:{ SQLiteException -> 0x065b }
            r15 = 0
            int r16 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r16 < 0) goto L_0x0083
            r16 = 1
            goto L_0x0085
        L_0x0083:
            r16 = 0
        L_0x0085:
            defpackage.iva.b((boolean) r16)     // Catch:{ SQLiteException -> 0x065b }
            defpackage.dkw.a()     // Catch:{ SQLiteException -> 0x065b }
            r14.q()     // Catch:{ SQLiteException -> 0x065b }
            android.database.sqlite.SQLiteDatabase r17 = r14.v()     // Catch:{ SQLiteException -> 0x065b }
            r9 = 5
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            r9[r15] = r3     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            java.lang.String r10 = "hit_time"
            r16 = 1
            r9[r16] = r10     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            java.lang.String r10 = "hit_string"
            r15 = 2
            r9[r15] = r10     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            java.lang.String r10 = "hit_url"
            r15 = 3
            r9[r15] = r10     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            java.lang.String r10 = "hit_app_id"
            r15 = 4
            r9[r15] = r10     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            r10 = 1
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            r10 = 0
            r15[r10] = r3     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            java.lang.String r18 = "hits2"
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r10 = "%s ASC"
            java.lang.String r24 = java.lang.String.format(r10, r15)     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            java.lang.String r25 = java.lang.Long.toString(r7)     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            r19 = r9
            android.database.Cursor r9 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ SQLiteException -> 0x0646, all -> 0x0640 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x063b, all -> 0x0636 }
            r10.<init>()     // Catch:{ SQLiteException -> 0x063b, all -> 0x0636 }
            boolean r15 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x063b, all -> 0x0636 }
            if (r15 == 0) goto L_0x011f
        L_0x00d7:
            r15 = 0
            long r22 = r9.getLong(r15)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r15 = 1
            long r19 = r9.getLong(r15)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r26 = r3
            r15 = 2
            java.lang.String r3 = r9.getString(r15)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r15 = 3
            java.lang.String r16 = r9.getString(r15)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r15 = 4
            int r24 = r9.getInt(r15)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.util.Map r18 = r14.a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            boolean r21 = defpackage.dpx.d(r16)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            dpc r3 = new dpc     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r25 = 0
            r16 = r3
            r17 = r14
            r16.<init>(r17, r18, r19, r21, r22, r24, r25)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r10.add(r3)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            boolean r3 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r3 != 0) goto L_0x0110
            goto L_0x0121
        L_0x0110:
            r3 = r26
            goto L_0x00d7
        L_0x0113:
            r0 = move-exception
            r2 = r0
            r29 = r5
            goto L_0x0653
        L_0x0119:
            r0 = move-exception
            r2 = r0
            r29 = r5
            goto L_0x064b
        L_0x011f:
            r26 = r3
        L_0x0121:
            if (r9 != 0) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r9.close()     // Catch:{ SQLiteException -> 0x065b }
        L_0x0127:
            boolean r3 = r10.isEmpty()     // Catch:{ SQLiteException -> 0x065b }
            if (r3 != 0) goto L_0x061a
            java.lang.String r3 = "Hits loaded from store. count"
            int r9 = r10.size()     // Catch:{ SQLiteException -> 0x065b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x065b }
            r1.a(r3, r9)     // Catch:{ SQLiteException -> 0x065b }
            java.util.Iterator r3 = r10.iterator()     // Catch:{ all -> 0x067a }
        L_0x013e:
            boolean r9 = r3.hasNext()     // Catch:{ all -> 0x067a }
            if (r9 == 0) goto L_0x0184
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x017e }
            dpc r9 = (defpackage.dpc) r9     // Catch:{ all -> 0x017e }
            long r14 = r9.c     // Catch:{ all -> 0x017e }
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x013e
            java.lang.String r2 = "Database contains successfully uploaded hit"
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x017e }
            int r7 = r10.size()     // Catch:{ all -> 0x017e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x017e }
            r1.d(r2, r3, r7)     // Catch:{ all -> 0x017e }
            r32.w()     // Catch:{ all -> 0x017e }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x0172 }
            r2.s()     // Catch:{ SQLiteException -> 0x0172 }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x0172 }
            r2.t()     // Catch:{ SQLiteException -> 0x0172 }
            r29 = r5
            goto L_0x0690
        L_0x0172:
            r0 = move-exception
            r2 = r0
            r1.e(r4, r2)     // Catch:{ Exception -> 0x06c5 }
            r32.w()     // Catch:{ Exception -> 0x06c5 }
            r29 = r5
            goto L_0x0690
        L_0x017e:
            r0 = move-exception
            r2 = r0
            r29 = r5
            goto L_0x067e
        L_0x0184:
            dmk r3 = r1.c     // Catch:{ all -> 0x067a }
            boolean r3 = r3.b()     // Catch:{ all -> 0x067a }
            if (r3 != 0) goto L_0x018d
        L_0x018c:
            goto L_0x0191
        L_0x018d:
            r32.f()     // Catch:{ all -> 0x067a }
            goto L_0x018c
        L_0x0191:
            dpn r3 = r1.i     // Catch:{ all -> 0x067a }
            boolean r3 = r3.s()     // Catch:{ all -> 0x067a }
            if (r3 == 0) goto L_0x05de
            dpn r3 = r1.i     // Catch:{ all -> 0x067a }
            defpackage.dkw.a()     // Catch:{ all -> 0x067a }
            r3.q()     // Catch:{ all -> 0x067a }
            defpackage.iva.a((java.lang.Object) r10)     // Catch:{ all -> 0x067a }
            dmy r9 = r3.f()     // Catch:{ all -> 0x067a }
            java.util.Set r9 = r9.b()     // Catch:{ all -> 0x067a }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x067a }
            if (r9 != 0) goto L_0x0218
            dpw r9 = r3.a     // Catch:{ all -> 0x017e }
            r3.f()     // Catch:{ all -> 0x017e }
            doy r14 = defpackage.doz.w     // Catch:{ all -> 0x017e }
            java.lang.Object r14 = r14.a()     // Catch:{ all -> 0x017e }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x017e }
            int r14 = r14.intValue()     // Catch:{ all -> 0x017e }
            long r14 = (long) r14     // Catch:{ all -> 0x017e }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r16
            boolean r9 = r9.a(r14)     // Catch:{ all -> 0x017e }
            if (r9 == 0) goto L_0x0218
            r3.f()     // Catch:{ all -> 0x017e }
            doy r9 = defpackage.doz.q     // Catch:{ all -> 0x017e }
            java.lang.Object r9 = r9.a()     // Catch:{ all -> 0x017e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x017e }
            java.lang.String r14 = "BATCH_BY_SESSION"
            boolean r14 = r14.equalsIgnoreCase(r9)     // Catch:{ all -> 0x017e }
            if (r14 != 0) goto L_0x0205
            java.lang.String r14 = "BATCH_BY_TIME"
            boolean r14 = r14.equalsIgnoreCase(r9)     // Catch:{ all -> 0x017e }
            if (r14 != 0) goto L_0x0205
            java.lang.String r14 = "BATCH_BY_BRUTE_FORCE"
            boolean r14 = r14.equalsIgnoreCase(r9)     // Catch:{ all -> 0x017e }
            if (r14 != 0) goto L_0x0205
            java.lang.String r14 = "BATCH_BY_COUNT"
            boolean r14 = r14.equalsIgnoreCase(r9)     // Catch:{ all -> 0x017e }
            if (r14 != 0) goto L_0x0205
            java.lang.String r14 = "BATCH_BY_SIZE"
            boolean r9 = r14.equalsIgnoreCase(r9)     // Catch:{ all -> 0x017e }
            if (r9 == 0) goto L_0x0203
            r9 = 1
            goto L_0x0206
        L_0x0203:
            r9 = 0
            goto L_0x0206
        L_0x0205:
            r9 = 1
        L_0x0206:
            r3.f()     // Catch:{ all -> 0x017e }
            doy r14 = defpackage.doz.r     // Catch:{ all -> 0x017e }
            java.lang.Object r14 = r14.a()     // Catch:{ all -> 0x017e }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x017e }
            java.lang.String r15 = "GZIP"
            boolean r14 = r15.equalsIgnoreCase(r14)     // Catch:{ all -> 0x017e }
            goto L_0x021a
        L_0x0218:
            r9 = 0
            r14 = 0
        L_0x021a:
            if (r9 == 0) goto L_0x0485
            boolean r9 = r10.isEmpty()     // Catch:{ all -> 0x067a }
            r16 = 1
            r9 = r9 ^ 1
            defpackage.iva.b((boolean) r9)     // Catch:{ all -> 0x067a }
            java.lang.String r9 = "Uploading batched hits. compression, count"
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x067a }
            int r16 = r10.size()     // Catch:{ all -> 0x067a }
            r23 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x067a }
            r3.a(r9, r15, r7)     // Catch:{ all -> 0x067a }
            dpm r7 = new dpm     // Catch:{ all -> 0x067a }
            r7.<init>(r3)     // Catch:{ all -> 0x067a }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x067a }
            r8.<init>()     // Catch:{ all -> 0x067a }
            java.util.Iterator r9 = r10.iterator()     // Catch:{ all -> 0x067a }
        L_0x0248:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x067a }
            if (r10 == 0) goto L_0x0303
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x017e }
            dpc r10 = (defpackage.dpc) r10     // Catch:{ all -> 0x017e }
            defpackage.iva.a((java.lang.Object) r10)     // Catch:{ all -> 0x017e }
            int r15 = r7.a     // Catch:{ all -> 0x017e }
            r16 = 1
            int r15 = r15 + 1
            r16 = r9
            dpn r9 = r7.c     // Catch:{ all -> 0x017e }
            r9.f()     // Catch:{ all -> 0x017e }
            int r9 = defpackage.dmy.e()     // Catch:{ all -> 0x017e }
            if (r15 > r9) goto L_0x0300
            dpn r9 = r7.c     // Catch:{ all -> 0x017e }
            r15 = 0
            java.lang.String r9 = r9.a((defpackage.dpc) r10, (boolean) r15)     // Catch:{ all -> 0x017e }
            if (r9 == 0) goto L_0x02e4
            byte[] r9 = r9.getBytes()     // Catch:{ all -> 0x017e }
            int r15 = r9.length     // Catch:{ all -> 0x017e }
            r27 = r12
            dpn r12 = r7.c     // Catch:{ all -> 0x017e }
            r12.f()     // Catch:{ all -> 0x017e }
            doy r12 = defpackage.doz.s     // Catch:{ all -> 0x017e }
            java.lang.Object r12 = r12.a()     // Catch:{ all -> 0x017e }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x017e }
            int r12 = r12.intValue()     // Catch:{ all -> 0x017e }
            if (r15 <= r12) goto L_0x0299
            dpn r9 = r7.c     // Catch:{ all -> 0x017e }
            dpk r9 = r9.e()     // Catch:{ all -> 0x017e }
            java.lang.String r12 = "Hit size exceeds the maximum size limit"
            r9.a((defpackage.dpc) r10, (java.lang.String) r12)     // Catch:{ all -> 0x017e }
            goto L_0x02f1
        L_0x0299:
            java.io.ByteArrayOutputStream r12 = r7.b     // Catch:{ all -> 0x017e }
            int r12 = r12.size()     // Catch:{ all -> 0x017e }
            if (r12 <= 0) goto L_0x02a4
            int r15 = r15 + 1
            goto L_0x02a5
        L_0x02a4:
        L_0x02a5:
            java.io.ByteArrayOutputStream r12 = r7.b     // Catch:{ all -> 0x017e }
            int r12 = r12.size()     // Catch:{ all -> 0x017e }
            int r12 = r12 + r15
            dpn r13 = r7.c     // Catch:{ all -> 0x017e }
            r13.f()     // Catch:{ all -> 0x017e }
            doy r13 = defpackage.doz.u     // Catch:{ all -> 0x017e }
            java.lang.Object r13 = r13.a()     // Catch:{ all -> 0x017e }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x017e }
            int r13 = r13.intValue()     // Catch:{ all -> 0x017e }
            if (r12 > r13) goto L_0x0305
            java.io.ByteArrayOutputStream r12 = r7.b     // Catch:{ IOException -> 0x02da }
            int r12 = r12.size()     // Catch:{ IOException -> 0x02da }
            if (r12 <= 0) goto L_0x02ce
            java.io.ByteArrayOutputStream r12 = r7.b     // Catch:{ IOException -> 0x02da }
            byte[] r13 = defpackage.dpn.b     // Catch:{ IOException -> 0x02da }
            r12.write(r13)     // Catch:{ IOException -> 0x02da }
        L_0x02ce:
            java.io.ByteArrayOutputStream r12 = r7.b     // Catch:{ IOException -> 0x02da }
            r12.write(r9)     // Catch:{ IOException -> 0x02da }
            int r9 = r7.a     // Catch:{ all -> 0x017e }
            r12 = 1
            int r9 = r9 + r12
            r7.a = r9     // Catch:{ all -> 0x017e }
            goto L_0x02f1
        L_0x02da:
            r0 = move-exception
            r9 = r0
            dpn r12 = r7.c     // Catch:{ all -> 0x017e }
            java.lang.String r13 = "Failed to write payload when batching hits"
            r12.e(r13, r9)     // Catch:{ all -> 0x017e }
            goto L_0x02f1
        L_0x02e4:
            r27 = r12
            dpn r9 = r7.c     // Catch:{ all -> 0x017e }
            dpk r9 = r9.e()     // Catch:{ all -> 0x017e }
            java.lang.String r12 = "Error formatting hit"
            r9.a((defpackage.dpc) r10, (java.lang.String) r12)     // Catch:{ all -> 0x017e }
        L_0x02f1:
            long r9 = r10.c     // Catch:{ all -> 0x017e }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x017e }
            r8.add(r9)     // Catch:{ all -> 0x017e }
            r9 = r16
            r12 = r27
            goto L_0x0248
        L_0x0300:
            r27 = r12
            goto L_0x0305
        L_0x0303:
            r27 = r12
        L_0x0305:
            int r9 = r7.a     // Catch:{ all -> 0x067a }
            if (r9 == 0) goto L_0x047d
            java.net.URL r9 = r3.t()     // Catch:{ all -> 0x067a }
            if (r9 != 0) goto L_0x031c
            java.lang.String r7 = "Failed to build batching endpoint url"
            r3.e(r7)     // Catch:{ all -> 0x017e }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x017e }
            r29 = r5
            goto L_0x059e
        L_0x031c:
            if (r14 == 0) goto L_0x0436
            byte[] r10 = r7.a()     // Catch:{ all -> 0x067a }
            defpackage.iva.a((java.lang.Object) r9)     // Catch:{ all -> 0x067a }
            defpackage.iva.a((java.lang.Object) r10)     // Catch:{ all -> 0x067a }
            android.content.Context r12 = r3.d()     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            r3.a((java.lang.String) r12)     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            r12.<init>()     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            java.util.zip.GZIPOutputStream r13 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            r13.<init>(r12)     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            r13.write(r10)     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            r13.close()     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            r12.close()     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            byte[] r12 = r12.toByteArray()     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            java.lang.String r18 = "POST compressed size, ratio %, url"
            int r13 = r12.length     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x03fc, all -> 0x03f5 }
            r29 = r5
            long r5 = (long) r13
            r16 = 100
            long r5 = r5 * r16
            int r15 = r10.length     // Catch:{ IOException -> 0x03f3, all -> 0x03f1 }
            r25 = r7
            r31 = r8
            long r7 = (long) r15
            long r5 = r5 / r7
            java.lang.Long r20 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            r17 = 3
            r16 = r3
            r19 = r14
            r21 = r9
            super.a(r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            if (r13 <= r15) goto L_0x0379
            java.lang.String r5 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            r3.c(r5, r14, r6)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
        L_0x0379:
            boolean r5 = defpackage.dlz.o()     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            if (r5 == 0) goto L_0x039b
            java.lang.String r5 = "Post payload"
            java.lang.String r6 = "\n"
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            int r8 = r7.length()     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            if (r8 != 0) goto L_0x0394
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            goto L_0x0398
        L_0x0394:
            java.lang.String r7 = r6.concat(r7)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
        L_0x0398:
            r3.a(r5, r7)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
        L_0x039b:
            java.net.HttpURLConnection r5 = r3.a((java.net.URL) r9)     // Catch:{ IOException -> 0x03ef, all -> 0x03f1 }
            r6 = 1
            r5.setDoOutput(r6)     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r5.addRequestProperty(r6, r7)     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            r5.setFixedLengthStreamingMode(r13)     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            r5.connect()     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            java.io.OutputStream r6 = r5.getOutputStream()     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            r6.write(r12)     // Catch:{ IOException -> 0x03e4, all -> 0x03e1 }
            r6.close()     // Catch:{ IOException -> 0x03e4, all -> 0x03e1 }
            r3.a((java.net.HttpURLConnection) r5)     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            int r6 = r5.getResponseCode()     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 == r7) goto L_0x03c6
            goto L_0x03cd
        L_0x03c6:
            dly r7 = r3.i()     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            r7.b()     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
        L_0x03cd:
            java.lang.String r7 = "POST status"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            r3.b(r7, r8)     // Catch:{ IOException -> 0x03eb, all -> 0x03e7 }
            if (r5 == 0) goto L_0x03db
            r5.disconnect()     // Catch:{ all -> 0x0678 }
        L_0x03db:
            r3.b()     // Catch:{ all -> 0x0678 }
            r15 = r6
            goto L_0x0444
        L_0x03e1:
            r0 = move-exception
            r7 = r0
            goto L_0x0422
        L_0x03e4:
            r0 = move-exception
            r7 = r0
            goto L_0x0406
        L_0x03e7:
            r0 = move-exception
            r7 = r0
            r6 = 0
            goto L_0x0422
        L_0x03eb:
            r0 = move-exception
            r7 = r0
            r6 = 0
            goto L_0x0406
        L_0x03ef:
            r0 = move-exception
            goto L_0x0403
        L_0x03f1:
            r0 = move-exception
            goto L_0x03f8
        L_0x03f3:
            r0 = move-exception
            goto L_0x03ff
        L_0x03f5:
            r0 = move-exception
            r29 = r5
        L_0x03f8:
            r7 = r0
            r5 = 0
            r6 = 0
            goto L_0x0422
        L_0x03fc:
            r0 = move-exception
            r29 = r5
        L_0x03ff:
            r25 = r7
            r31 = r8
        L_0x0403:
            r7 = r0
            r5 = 0
            r6 = 0
        L_0x0406:
            java.lang.String r8 = "Network compressed POST connection error"
            r3.d(r8, r7)     // Catch:{ all -> 0x0420 }
            if (r6 == 0) goto L_0x0416
            r6.close()     // Catch:{ IOException -> 0x0411 }
            goto L_0x0416
        L_0x0411:
            r0 = move-exception
            r6 = r0
            r3.e(r2, r6)     // Catch:{ all -> 0x0678 }
        L_0x0416:
            if (r5 == 0) goto L_0x041b
            r5.disconnect()     // Catch:{ all -> 0x0678 }
        L_0x041b:
            r3.b()     // Catch:{ all -> 0x0678 }
            r15 = 0
            goto L_0x0444
        L_0x0420:
            r0 = move-exception
            r7 = r0
        L_0x0422:
            if (r6 == 0) goto L_0x042d
            r6.close()     // Catch:{ IOException -> 0x0428 }
            goto L_0x042d
        L_0x0428:
            r0 = move-exception
            r6 = r0
            r3.e(r2, r6)     // Catch:{ all -> 0x0678 }
        L_0x042d:
            if (r5 == 0) goto L_0x0432
            r5.disconnect()     // Catch:{ all -> 0x0678 }
        L_0x0432:
            r3.b()     // Catch:{ all -> 0x0678 }
            throw r7     // Catch:{ all -> 0x0678 }
        L_0x0436:
            r29 = r5
            r25 = r7
            r31 = r8
            byte[] r5 = r25.a()     // Catch:{ all -> 0x0678 }
            int r15 = r3.a((java.net.URL) r9, (byte[]) r5)     // Catch:{ all -> 0x0678 }
        L_0x0444:
            r5 = 200(0xc8, float:2.8E-43)
            if (r15 == r5) goto L_0x046f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0678 }
            java.lang.String r6 = "Network error uploading hits. status code"
            r3.a(r6, r5)     // Catch:{ all -> 0x0678 }
            dmy r6 = r3.f()     // Catch:{ all -> 0x0678 }
            java.util.Set r6 = r6.b()     // Catch:{ all -> 0x0678 }
            boolean r5 = r6.contains(r5)     // Catch:{ all -> 0x0678 }
            if (r5 == 0) goto L_0x0469
            java.lang.String r5 = "Server instructed the client to stop batching"
            r3.d(r5)     // Catch:{ all -> 0x0678 }
            dpw r3 = r3.a     // Catch:{ all -> 0x0678 }
            r3.a()     // Catch:{ all -> 0x0678 }
        L_0x0469:
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0678 }
            goto L_0x059e
        L_0x046f:
            java.lang.String r5 = "Batched upload completed. Hits batched"
            r6 = r25
            int r6 = r6.a     // Catch:{ all -> 0x0678 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0678 }
            r3.a(r5, r6)     // Catch:{ all -> 0x0678 }
            goto L_0x0481
        L_0x047d:
            r29 = r5
            r31 = r8
        L_0x0481:
            r8 = r31
            goto L_0x059e
        L_0x0485:
            r29 = r5
            r23 = r7
            r27 = r12
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0678 }
            int r5 = r10.size()     // Catch:{ all -> 0x0678 }
            r8.<init>(r5)     // Catch:{ all -> 0x0678 }
            java.util.Iterator r5 = r10.iterator()     // Catch:{ all -> 0x0678 }
        L_0x0498:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0678 }
            if (r6 == 0) goto L_0x059d
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0678 }
            dpc r6 = (defpackage.dpc) r6     // Catch:{ all -> 0x0678 }
            defpackage.iva.a((java.lang.Object) r6)     // Catch:{ all -> 0x0678 }
            boolean r7 = r6.f     // Catch:{ all -> 0x0678 }
            r9 = 1
            r7 = r7 ^ r9
            java.lang.String r7 = r3.a((defpackage.dpc) r6, (boolean) r7)     // Catch:{ all -> 0x0678 }
            if (r7 == 0) goto L_0x057a
            int r9 = r7.length()     // Catch:{ all -> 0x0678 }
            r3.f()     // Catch:{ all -> 0x0678 }
            doy r10 = defpackage.doz.p     // Catch:{ all -> 0x0678 }
            java.lang.Object r10 = r10.a()     // Catch:{ all -> 0x0678 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0678 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0678 }
            if (r9 > r10) goto L_0x052f
            java.net.URL r7 = r3.a((defpackage.dpc) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0678 }
            if (r7 == 0) goto L_0x0528
            defpackage.iva.a((java.lang.Object) r7)     // Catch:{ all -> 0x0678 }
            java.lang.String r9 = "GET request"
            r3.b(r9, r7)     // Catch:{ all -> 0x0678 }
            java.net.HttpURLConnection r7 = r3.a((java.net.URL) r7)     // Catch:{ IOException -> 0x050f, all -> 0x050b }
            r7.connect()     // Catch:{ IOException -> 0x0508, all -> 0x0505 }
            r3.a((java.net.HttpURLConnection) r7)     // Catch:{ IOException -> 0x0508, all -> 0x0505 }
            int r9 = r7.getResponseCode()     // Catch:{ IOException -> 0x0508, all -> 0x0505 }
            r10 = 200(0xc8, float:2.8E-43)
            if (r9 == r10) goto L_0x04e7
            goto L_0x04ee
        L_0x04e7:
            dly r10 = r3.i()     // Catch:{ IOException -> 0x0508, all -> 0x0505 }
            r10.b()     // Catch:{ IOException -> 0x0508, all -> 0x0505 }
        L_0x04ee:
            java.lang.String r10 = "GET status"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0508, all -> 0x0505 }
            r3.b(r10, r12)     // Catch:{ IOException -> 0x0508, all -> 0x0505 }
            if (r7 == 0) goto L_0x04fc
            r7.disconnect()     // Catch:{ all -> 0x0678 }
        L_0x04fc:
            r7 = 200(0xc8, float:2.8E-43)
            if (r9 != r7) goto L_0x059c
            r7 = 0
            r10 = 200(0xc8, float:2.8E-43)
            goto L_0x0586
        L_0x0505:
            r0 = move-exception
            r2 = r0
            goto L_0x0522
        L_0x0508:
            r0 = move-exception
            r5 = r0
            goto L_0x0512
        L_0x050b:
            r0 = move-exception
            r2 = r0
            r7 = 0
            goto L_0x0522
        L_0x050f:
            r0 = move-exception
            r5 = r0
            r7 = 0
        L_0x0512:
            java.lang.String r6 = "Network GET connection error"
            r3.d(r6, r5)     // Catch:{ all -> 0x0520 }
            if (r7 == 0) goto L_0x051e
            r7.disconnect()     // Catch:{ all -> 0x0678 }
            goto L_0x059e
        L_0x051e:
            goto L_0x059e
        L_0x0520:
            r0 = move-exception
            r2 = r0
        L_0x0522:
            if (r7 == 0) goto L_0x0527
            r7.disconnect()     // Catch:{ all -> 0x0678 }
        L_0x0527:
            throw r2     // Catch:{ all -> 0x0678 }
        L_0x0528:
            java.lang.String r5 = "Failed to build collect GET endpoint url"
            r3.e(r5)     // Catch:{ all -> 0x0678 }
            goto L_0x059e
        L_0x052f:
            r7 = 0
            java.lang.String r9 = r3.a((defpackage.dpc) r6, (boolean) r7)     // Catch:{ all -> 0x0678 }
            if (r9 == 0) goto L_0x056e
            byte[] r9 = r9.getBytes()     // Catch:{ all -> 0x0678 }
            int r10 = r9.length     // Catch:{ all -> 0x0678 }
            r3.f()     // Catch:{ all -> 0x0678 }
            doy r12 = defpackage.doz.t     // Catch:{ all -> 0x0678 }
            java.lang.Object r12 = r12.a()     // Catch:{ all -> 0x0678 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0678 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0678 }
            if (r10 <= r12) goto L_0x0559
            dpk r9 = r3.e()     // Catch:{ all -> 0x0678 }
            java.lang.String r10 = "Hit payload exceeds size limit"
            r9.a((defpackage.dpc) r6, (java.lang.String) r10)     // Catch:{ all -> 0x0678 }
            r10 = 200(0xc8, float:2.8E-43)
            goto L_0x0586
        L_0x0559:
            java.net.URL r10 = r3.a((defpackage.dpc) r6)     // Catch:{ all -> 0x0678 }
            if (r10 == 0) goto L_0x0568
            int r9 = r3.a((java.net.URL) r10, (byte[]) r9)     // Catch:{ all -> 0x0678 }
            r10 = 200(0xc8, float:2.8E-43)
            if (r9 == r10) goto L_0x0586
            goto L_0x059e
        L_0x0568:
            java.lang.String r5 = "Failed to build collect POST endpoint url"
            r3.e(r5)     // Catch:{ all -> 0x0678 }
            goto L_0x059e
        L_0x056e:
            r10 = 200(0xc8, float:2.8E-43)
            dpk r9 = r3.e()     // Catch:{ all -> 0x0678 }
            java.lang.String r12 = "Error formatting hit for POST upload"
            r9.a((defpackage.dpc) r6, (java.lang.String) r12)     // Catch:{ all -> 0x0678 }
            goto L_0x0586
        L_0x057a:
            r7 = 0
            r10 = 200(0xc8, float:2.8E-43)
            dpk r9 = r3.e()     // Catch:{ all -> 0x0678 }
            java.lang.String r12 = "Error formatting hit for upload"
            r9.a((defpackage.dpc) r6, (java.lang.String) r12)     // Catch:{ all -> 0x0678 }
        L_0x0586:
            long r12 = r6.c     // Catch:{ all -> 0x0678 }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0678 }
            r8.add(r6)     // Catch:{ all -> 0x0678 }
            int r6 = r8.size()     // Catch:{ all -> 0x0678 }
            r3.f()     // Catch:{ all -> 0x0678 }
            int r9 = defpackage.dmy.f()     // Catch:{ all -> 0x0678 }
            if (r6 < r9) goto L_0x0498
        L_0x059c:
            goto L_0x059e
        L_0x059d:
        L_0x059e:
            java.util.Iterator r3 = r8.iterator()     // Catch:{ all -> 0x0678 }
            r12 = r27
        L_0x05a4:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0678 }
            if (r5 == 0) goto L_0x05b9
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0678 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0678 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0678 }
            long r12 = java.lang.Math.max(r12, r5)     // Catch:{ all -> 0x0678 }
            goto L_0x05a4
        L_0x05b9:
            dmm r3 = r1.b     // Catch:{ SQLiteException -> 0x05c2 }
            r3.a((java.util.List) r8)     // Catch:{ SQLiteException -> 0x05c2 }
            r11.addAll(r8)     // Catch:{ SQLiteException -> 0x05c2 }
            goto L_0x05e4
        L_0x05c2:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "Failed to remove successfully uploaded hits"
            r1.e(r3, r2)     // Catch:{ all -> 0x0678 }
            r32.w()     // Catch:{ all -> 0x0678 }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x05d8 }
            r2.s()     // Catch:{ SQLiteException -> 0x05d8 }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x05d8 }
            r2.t()     // Catch:{ SQLiteException -> 0x05d8 }
            goto L_0x0690
        L_0x05d8:
            r0 = move-exception
            r2 = r0
            r1.e(r4, r2)     // Catch:{ Exception -> 0x06c5 }
            goto L_0x0603
        L_0x05de:
            r29 = r5
            r23 = r7
            r27 = r12
        L_0x05e4:
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x0678 }
            if (r3 != 0) goto L_0x0608
            dmm r3 = r1.b     // Catch:{ SQLiteException -> 0x05fe }
            r3.s()     // Catch:{ SQLiteException -> 0x05fe }
            dmm r3 = r1.b     // Catch:{ SQLiteException -> 0x05fe }
            r3.t()     // Catch:{ SQLiteException -> 0x05fe }
            r7 = r23
            r3 = r26
            r5 = r29
            r9 = 0
            goto L_0x0071
        L_0x05fe:
            r0 = move-exception
            r2 = r0
            r1.e(r4, r2)     // Catch:{ Exception -> 0x06c5 }
        L_0x0603:
            r32.w()     // Catch:{ Exception -> 0x06c5 }
            goto L_0x0690
        L_0x0608:
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x0614 }
            r2.s()     // Catch:{ SQLiteException -> 0x0614 }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x0614 }
            r2.t()     // Catch:{ SQLiteException -> 0x0614 }
            goto L_0x0690
        L_0x0614:
            r0 = move-exception
            r2 = r0
            r1.e(r4, r2)     // Catch:{ Exception -> 0x06c5 }
            goto L_0x0603
        L_0x061a:
            r29 = r5
            java.lang.String r2 = "Store is empty, nothing to dispatch"
            r1.b(r2)     // Catch:{ SQLiteException -> 0x0659 }
            r32.w()     // Catch:{ SQLiteException -> 0x0659 }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x0630 }
            r2.s()     // Catch:{ SQLiteException -> 0x0630 }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x0630 }
            r2.t()     // Catch:{ SQLiteException -> 0x0630 }
            goto L_0x0690
        L_0x0630:
            r0 = move-exception
            r2 = r0
            r1.e(r4, r2)     // Catch:{ Exception -> 0x06c5 }
            goto L_0x0603
        L_0x0636:
            r0 = move-exception
            r29 = r5
            r2 = r0
            goto L_0x0653
        L_0x063b:
            r0 = move-exception
            r29 = r5
            r2 = r0
            goto L_0x064b
        L_0x0640:
            r0 = move-exception
            r29 = r5
            r2 = r0
            r9 = 0
            goto L_0x0653
        L_0x0646:
            r0 = move-exception
            r29 = r5
            r2 = r0
            r9 = 0
        L_0x064b:
            java.lang.String r3 = "Error loading hits from the database"
            r14.e(r3, r2)     // Catch:{ all -> 0x0651 }
            throw r2     // Catch:{ all -> 0x0651 }
        L_0x0651:
            r0 = move-exception
            r2 = r0
        L_0x0653:
            if (r9 == 0) goto L_0x0658
            r9.close()     // Catch:{ SQLiteException -> 0x0659 }
        L_0x0658:
            throw r2     // Catch:{ SQLiteException -> 0x0659 }
        L_0x0659:
            r0 = move-exception
            goto L_0x065e
        L_0x065b:
            r0 = move-exception
            r29 = r5
        L_0x065e:
            r2 = r0
            java.lang.String r3 = "Failed to read hits from persisted store"
            r1.d(r3, r2)     // Catch:{ all -> 0x0678 }
            r32.w()     // Catch:{ all -> 0x0678 }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x0672 }
            r2.s()     // Catch:{ SQLiteException -> 0x0672 }
            dmm r2 = r1.b     // Catch:{ SQLiteException -> 0x0672 }
            r2.t()     // Catch:{ SQLiteException -> 0x0672 }
            goto L_0x0690
        L_0x0672:
            r0 = move-exception
            r2 = r0
            r1.e(r4, r2)     // Catch:{ Exception -> 0x06c5 }
            goto L_0x0603
        L_0x0678:
            r0 = move-exception
            goto L_0x067d
        L_0x067a:
            r0 = move-exception
            r29 = r5
        L_0x067d:
            r2 = r0
        L_0x067e:
            dmm r3 = r1.b     // Catch:{ SQLiteException -> 0x0689 }
            r3.s()     // Catch:{ SQLiteException -> 0x0689 }
            dmm r3 = r1.b     // Catch:{ SQLiteException -> 0x0689 }
            r3.t()     // Catch:{ SQLiteException -> 0x0689 }
            throw r2     // Catch:{ Exception -> 0x06c5 }
        L_0x0689:
            r0 = move-exception
            r2 = r0
            r1.e(r4, r2)     // Catch:{ Exception -> 0x06c5 }
            goto L_0x0603
        L_0x0690:
            dpp r2 = r32.l()     // Catch:{ Exception -> 0x06c5 }
            r2.t()     // Catch:{ Exception -> 0x06c5 }
            r32.s()     // Catch:{ Exception -> 0x06c5 }
            if (r33 != 0) goto L_0x069d
            goto L_0x06a0
        L_0x069d:
            r33.a()     // Catch:{ Exception -> 0x06c5 }
        L_0x06a0:
            long r2 = r1.g     // Catch:{ Exception -> 0x06c5 }
            int r4 = (r2 > r29 ? 1 : (r2 == r29 ? 0 : -1))
            if (r4 == 0) goto L_0x06dc
            dpl r2 = r1.j     // Catch:{ Exception -> 0x06c5 }
            android.content.Context r2 = r2.d()     // Catch:{ Exception -> 0x06c5 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x06c5 }
            java.lang.String r4 = "com.google.analytics.RADIO_POWERED"
            r3.<init>(r4)     // Catch:{ Exception -> 0x06c5 }
            java.lang.String r4 = r2.getPackageName()     // Catch:{ Exception -> 0x06c5 }
            r3.addCategory(r4)     // Catch:{ Exception -> 0x06c5 }
            java.lang.String r4 = defpackage.dpl.a     // Catch:{ Exception -> 0x06c5 }
            r5 = 1
            r3.putExtra(r4, r5)     // Catch:{ Exception -> 0x06c5 }
            r4 = 0
            r2.sendOrderedBroadcast(r3, r4)     // Catch:{ Exception -> 0x06c5 }
            return
        L_0x06c5:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "Local dispatch failed"
            r1.e(r3, r2)
            dpp r2 = r32.l()
            r2.t()
            r32.s()
            if (r33 == 0) goto L_0x06dc
            r33.a()
            return
        L_0x06dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dms.a(dne):void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
        dkw.a();
        f();
    }

    public final void s() {
        long j2;
        long j3;
        dkw.a();
        q();
        if (!this.h) {
            f();
            if (f().a()) {
                long j4 = 0;
                if (t() > 0) {
                    if (this.b.u() != 0) {
                        if (!((Boolean) doz.B.a()).booleanValue()) {
                            dpl dpl = this.j;
                            dpl.a();
                            if (!dpl.c) {
                                Context d = dpl.d();
                                d.registerReceiver(dpl, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                                intentFilter.addCategory(d.getPackageName());
                                d.registerReceiver(dpl, intentFilter);
                                dpl.d = dpl.c();
                                dpl.b.a().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(dpl.d));
                                dpl.c = true;
                            }
                            dpl dpl2 = this.j;
                            if (!dpl2.c) {
                                dpl2.b.a().d("Connectivity unknown. Receiver not registered");
                            }
                            if (!dpl2.d) {
                                w();
                                v();
                                return;
                            }
                        }
                        v();
                        long t = t();
                        long s = l().s();
                        if (s != 0) {
                            j2 = t - Math.abs(c().a() - s);
                            if (j2 <= 0) {
                                f();
                                j2 = Math.min(dmy.d(), t);
                            }
                        } else {
                            f();
                            j2 = Math.min(dmy.d(), t);
                        }
                        a("Dispatch scheduled (ms)", Long.valueOf(j2));
                        if (this.l.b()) {
                            dnb dnb = this.l;
                            if (dnb.d != 0) {
                                jiq jiq = dnb.b.c;
                                j3 = Math.abs(System.currentTimeMillis() - dnb.d);
                            } else {
                                j3 = 0;
                            }
                            long max = Math.max(1, j2 + j3);
                            dnb dnb2 = this.l;
                            if (!dnb2.b()) {
                                return;
                            }
                            if (max >= 0) {
                                jiq jiq2 = dnb2.b.c;
                                long abs = max - Math.abs(System.currentTimeMillis() - dnb2.d);
                                if (abs >= 0) {
                                    j4 = abs;
                                }
                                dnb2.d().removeCallbacks(dnb2.c);
                                if (!dnb2.d().postDelayed(dnb2.c, j4)) {
                                    dnb2.b.a().e("Failed to adjust delayed post. time", Long.valueOf(j4));
                                    return;
                                }
                                return;
                            }
                            dnb2.c();
                            return;
                        }
                        this.l.a(j2);
                        return;
                    }
                    this.j.b();
                    w();
                    return;
                }
            }
        }
        this.j.b();
        w();
    }

    public final boolean a(String str) {
        return jni.b(d()).a(str) == 0;
    }
}
