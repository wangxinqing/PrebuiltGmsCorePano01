package com.google.android.gms.clearcut.uploader;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.Closeable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class QosUploaderChimeraService extends qwf {
    private static final amzy a = amzy.a(avsd.FAST_IF_RADIO_AWAKE, avsd.DEFAULT, avsd.UNMETERED_OR_DAILY, avsd.UNMETERED_ONLY);
    private Context b;
    private hwn c;
    private hvh d;
    private hwp e;
    private jiq g;
    private yfa h;

    public QosUploaderChimeraService() {
    }

    private final void c(String str) {
        SharedPreferences.Editor edit = c().edit();
        edit.putLong(String.valueOf(str).concat("lastUnmeteredOrDailySent"), this.g.a());
        if (!edit.commit()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append("Failed to update ");
            sb.append(str);
            sb.append("lastUnmeteredOrDailySent");
            Log.e("QosUploaderService", sb.toString());
        }
    }

    private static boolean d(String str) {
        return str.contains("qos_debug_force_upload");
    }

    private static boolean e(String str) {
        return str.contains("qos_collect_for_debug_upload");
    }

    public final int a(qxz qxz) {
        if ((!d(qxz.a) || awtr.d()) && a(qxz.a)) {
            return 0;
        }
        return 2;
    }

    public final void b() {
        jjt.b((Closeable) this.d);
    }

    public final void onCreate() {
        super.onCreate();
        a((Context) this);
    }

    public final void onDestroy() {
        b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && ikh.a(intent)) {
            synchronized (hpk.b) {
                hpk.e.c(intent);
                hpk.a.countDown();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    QosUploaderChimeraService(Context context, hwn hwn, hvh hvh, hwp hwp, jiq jiq, yfa yfa) {
        this.b = context;
        this.c = hwn;
        this.d = hvh;
        this.e = hwp;
        this.g = jiq;
        this.h = yfa;
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences c() {
        return this.b.getSharedPreferences("QosUploaderService", 0);
    }

    public final void a(Context context) {
        this.b = context;
        this.c = hwn.a();
        this.d = hvk.c();
        this.e = new hwp(context);
        this.g = jiu.a;
        this.h = new yfb(yef.a(context), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x024b, code lost:
        if (r9 == false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03ae, code lost:
        if (r19 != false) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0437, code lost:
        if (r19 != false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x04dd, code lost:
        if (r19 != false) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0540, code lost:
        if (r19 != false) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        if (r2.equals("qos_unmetered_periodic") != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0137, code lost:
        if (r0.isDefaultNetworkActive() == false) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x021c A[Catch:{ all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x021e A[Catch:{ all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0221 A[Catch:{ all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0223 A[Catch:{ all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0268 A[Catch:{ all -> 0x0401 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02c4 A[Catch:{ all -> 0x03ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02ed A[Catch:{ all -> 0x03ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x032e A[Catch:{ all -> 0x03ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0386 A[Catch:{ all -> 0x03ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0491 A[SYNTHETIC, Splitter:B:284:0x0491] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x04bd A[Catch:{ all -> 0x052b }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x04c3 A[Catch:{ all -> 0x052b }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x04cc A[SYNTHETIC, Splitter:B:306:0x04cc] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x04d7 A[Catch:{ RuntimeException -> 0x00ee, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x04d8 A[Catch:{ RuntimeException -> 0x00ee, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0522 A[Catch:{ RuntimeException -> 0x00ee, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x052f A[SYNTHETIC, Splitter:B:335:0x052f] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x053a A[Catch:{ RuntimeException -> 0x00ee, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x053b A[Catch:{ RuntimeException -> 0x00ee, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0397 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            boolean r0 = defpackage.awsu.b()
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0078
            avts r0 = defpackage.avts.b
            aucd r0 = r0.o()
            avtq r0 = (defpackage.avtq) r0
            avtr r5 = defpackage.avtr.e
            aucd r5 = r5.o()
            long r6 = java.lang.System.currentTimeMillis()
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r5.c()
            r5.c = r3
        L_0x0028:
            aucj r8 = r5.b
            avtr r8 = (defpackage.avtr) r8
            int r9 = r8.a
            r9 = r9 | r4
            r8.a = r9
            r8.b = r6
            r21.getClass()
            r6 = r9 | 4
            r8.a = r6
            r8.d = r2
            r0.a(r5)
            aucj r0 = r0.i()
            avts r0 = (defpackage.avts) r0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006f }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x006f }
            ihs r7 = defpackage.ihs.b()     // Catch:{ IOException -> 0x006f }
            java.io.File r7 = r7.getFilesDir()     // Catch:{ IOException -> 0x006f }
            java.lang.String r8 = "clearcut_simulation_upload_events.pb"
            r6.<init>(r7, r8)     // Catch:{ IOException -> 0x006f }
            r5.<init>(r6, r4)     // Catch:{ IOException -> 0x006f }
            r0.a(r5)     // Catch:{ all -> 0x0063 }
            r5.flush()     // Catch:{ all -> 0x0063 }
            r5.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0078
        L_0x0063:
            r0 = move-exception
            r2 = r0
            r5.close()     // Catch:{ all -> 0x0069 }
            goto L_0x006e
        L_0x0069:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x006f }
        L_0x006e:
            throw r2     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Failed to write simulation upload events to file."
            r2.<init>(r3, r0)
            throw r2
        L_0x0078:
            java.lang.Class<com.google.android.gms.clearcut.uploader.QosUploaderChimeraService> r5 = com.google.android.gms.clearcut.uploader.QosUploaderChimeraService.class
            monitor-enter(r5)
            java.lang.String r0 = "executing QosUploaderService: "
            java.lang.String r6 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x05a2 }
            int r7 = r6.length()     // Catch:{ all -> 0x05a2 }
            if (r7 != 0) goto L_0x008d
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x05a2 }
            r6.<init>(r0)     // Catch:{ all -> 0x05a2 }
            goto L_0x0090
        L_0x008d:
            r0.concat(r6)     // Catch:{ all -> 0x05a2 }
        L_0x0090:
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x0590 }
            boolean r0 = defpackage.aekv.a(r0)     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x057e
            awsu r0 = defpackage.awsu.a     // Catch:{ all -> 0x0590 }
            awsv r0 = r0.a()     // Catch:{ all -> 0x0590 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x00a5
            goto L_0x00bd
        L_0x00a5:
            java.lang.String r0 = "qos_default_periodic"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            java.lang.String r0 = "qos_unmetered_periodic"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x00bd
        L_0x00b6:
            yfa r0 = r1.h     // Catch:{ all -> 0x0590 }
            java.lang.String r6 = ""
            r0.a((java.lang.String) r6)     // Catch:{ all -> 0x0590 }
        L_0x00bd:
            awtr r0 = defpackage.awtr.a     // Catch:{ all -> 0x0590 }
            awts r0 = r0.a()     // Catch:{ all -> 0x0590 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x00ca
            goto L_0x0107
        L_0x00ca:
            boolean r0 = defpackage.jkr.h()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0107
            android.content.ContentResolver r0 = r20.getContentResolver()     // Catch:{ RuntimeException -> 0x00ee }
            java.lang.String r6 = "user_setup_complete"
            int r0 = android.provider.Settings.Secure.getInt(r0, r6, r3)     // Catch:{ RuntimeException -> 0x00ee }
            if (r0 == r4) goto L_0x0107
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r0.e()     // Catch:{ all -> 0x05a2 }
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x058d
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
        L_0x00e9:
            r0.b()     // Catch:{ all -> 0x05a2 }
            goto L_0x058d
        L_0x00ee:
            r0 = move-exception
            java.lang.String r2 = "QosUploaderService"
            java.lang.String r3 = "Exception thrown when trying to get user_setup_complete setting."
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0590 }
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r0.e()     // Catch:{ all -> 0x05a2 }
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x0104
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            goto L_0x00e9
        L_0x0104:
            r3 = 1
            goto L_0x058e
        L_0x0107:
            java.lang.String r0 = "qos_oneoff"
            boolean r6 = r0.equals(r2)     // Catch:{ all -> 0x0590 }
            if (r6 != 0) goto L_0x0110
            goto L_0x014e
        L_0x0110:
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            java.lang.Object r7 = r0.b     // Catch:{ all -> 0x0590 }
            monitor-enter(r7)     // Catch:{ all -> 0x0590 }
            r0.a = r3     // Catch:{ all -> 0x057b }
            monitor-exit(r7)     // Catch:{ all -> 0x057b }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0590 }
            awtr r0 = defpackage.awtr.a     // Catch:{ all -> 0x0590 }
            awts r0 = r0.a()     // Catch:{ all -> 0x0590 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x014e
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x0590 }
            java.lang.String r7 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r7)     // Catch:{ all -> 0x0590 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x0133
            goto L_0x0139
        L_0x0133:
            boolean r0 = r0.isDefaultNetworkActive()     // Catch:{ all -> 0x0590 }
            if (r0 != 0) goto L_0x014e
        L_0x0139:
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.a(r2)     // Catch:{ all -> 0x0590 }
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r0.e()     // Catch:{ all -> 0x05a2 }
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x058d
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            goto L_0x00e9
        L_0x014e:
            java.lang.String r0 = "qos_default_periodic"
            boolean r7 = r0.equals(r2)     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = "qos_unmetered_periodic"
            boolean r8 = r0.equals(r2)     // Catch:{ all -> 0x0590 }
            android.content.Context r0 = r1.b     // Catch:{ SQLiteException -> 0x04a9, all -> 0x04a1 }
            hvh r11 = r1.d     // Catch:{ SQLiteException -> 0x04a9, all -> 0x04a1 }
            htg r11 = defpackage.hth.a(r0, r11)     // Catch:{ SQLiteException -> 0x04a9, all -> 0x04a1 }
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x0488 }
            boolean r12 = defpackage.hwr.a(r0)     // Catch:{ all -> 0x0488 }
            if (r7 == 0) goto L_0x019c
            if (r12 == 0) goto L_0x019c
            if (r11 != 0) goto L_0x016f
            goto L_0x0172
        L_0x016f:
            r11.close()     // Catch:{ SQLiteException -> 0x04a9, all -> 0x04a1 }
        L_0x0172:
            defpackage.awtr.k()     // Catch:{ all -> 0x0590 }
            boolean r0 = e(r21)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x018a
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x0590 }
            jiq r2 = r1.g     // Catch:{ all -> 0x0590 }
            boolean r0 = defpackage.hpo.a((android.content.Context) r0, (defpackage.jiq) r2)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x018a
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            r0.b()     // Catch:{ all -> 0x0590 }
        L_0x018a:
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r0.e()     // Catch:{ all -> 0x05a2 }
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x0199
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            goto L_0x00e9
        L_0x0199:
            r3 = 1
            goto L_0x058e
        L_0x019c:
            if (r8 == 0) goto L_0x01b8
            java.lang.String r0 = "reschedule periodic scheduler on "
            java.lang.String r13 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0488 }
            int r14 = r13.length()     // Catch:{ all -> 0x0488 }
            if (r14 != 0) goto L_0x01b0
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x0488 }
            r13.<init>(r0)     // Catch:{ all -> 0x0488 }
            goto L_0x01b3
        L_0x01b0:
            r0.concat(r13)     // Catch:{ all -> 0x0488 }
        L_0x01b3:
            hwn r0 = r1.c     // Catch:{ all -> 0x0488 }
            r0.c()     // Catch:{ all -> 0x0488 }
        L_0x01b8:
            hvh r0 = r1.d     // Catch:{ all -> 0x0488 }
            amzy r0 = r0.b()     // Catch:{ all -> 0x0488 }
            anhk r13 = r0.listIterator()     // Catch:{ all -> 0x0488 }
            r14 = 0
            r15 = 0
        L_0x01c4:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x0412
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0480 }
            r3 = r0
            hvg r3 = (defpackage.hvg) r3     // Catch:{ all -> 0x0480 }
            boolean r4 = r3.a()     // Catch:{ IOException -> 0x0207, SQLiteException -> 0x0205 }
            if (r15 == 0) goto L_0x01d9
            r15 = 1
            goto L_0x01de
        L_0x01d9:
            if (r4 != 0) goto L_0x01dd
            r15 = 0
            goto L_0x01de
        L_0x01dd:
            r15 = 1
        L_0x01de:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0203, SQLiteException -> 0x0201, all -> 0x01f9 }
            r9 = 48
            r0.<init>(r9)     // Catch:{ IOException -> 0x0203, SQLiteException -> 0x0201, all -> 0x01f9 }
            java.lang.String r9 = "hasFastData: "
            r0.append(r9)     // Catch:{ IOException -> 0x0203, SQLiteException -> 0x0201, all -> 0x01f9 }
            r0.append(r4)     // Catch:{ IOException -> 0x0203, SQLiteException -> 0x0201, all -> 0x01f9 }
            java.lang.String r9 = ", hasFastDataAnyLogStore:"
            r0.append(r9)     // Catch:{ IOException -> 0x0203, SQLiteException -> 0x0201, all -> 0x01f9 }
            r0.append(r15)     // Catch:{ IOException -> 0x0203, SQLiteException -> 0x0201, all -> 0x01f9 }
            r0.toString()     // Catch:{ IOException -> 0x0203, SQLiteException -> 0x0201, all -> 0x01f9 }
            goto L_0x0210
        L_0x01f9:
            r0 = move-exception
            r3 = r0
            r19 = r8
            r4 = r14
            r14 = r7
            goto L_0x048f
        L_0x0201:
            r0 = move-exception
            goto L_0x0209
        L_0x0203:
            r0 = move-exception
            goto L_0x0209
        L_0x0205:
            r0 = move-exception
            goto L_0x0208
        L_0x0207:
            r0 = move-exception
        L_0x0208:
            r4 = 0
        L_0x0209:
            java.lang.String r9 = "QosUploaderService"
            java.lang.String r10 = "Failed to see if we have fast data. Won't try to upload fast."
            android.util.Log.e(r9, r10, r0)     // Catch:{ all -> 0x0480 }
        L_0x0210:
            boolean r0 = d(r21)     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x021e
            boolean r0 = e(r21)     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x021e
            r0 = 0
            goto L_0x021f
        L_0x021e:
            r0 = 1
        L_0x021f:
            if (r4 == 0) goto L_0x0223
            r9 = 1
            goto L_0x0228
        L_0x0223:
            if (r6 == 0) goto L_0x0227
            r9 = 0
            goto L_0x0228
        L_0x0227:
            r9 = 1
        L_0x0228:
            hwp r10 = r1.e     // Catch:{ all -> 0x0409 }
            long r16 = r10.b()     // Catch:{ all -> 0x0409 }
            r18 = r13
            r10 = r14
            r13 = 0
            if (r0 == 0) goto L_0x0236
            goto L_0x0255
        L_0x0236:
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x024b
            if (r6 != 0) goto L_0x023d
            goto L_0x024e
        L_0x023d:
            if (r4 == 0) goto L_0x024d
            java.lang.String r0 = "DeferFastUpload"
            r11.a((java.lang.String) r0)     // Catch:{ all -> 0x0245 }
            goto L_0x024d
        L_0x0245:
            r0 = move-exception
            r14 = r7
            r19 = r8
            goto L_0x040e
        L_0x024b:
            if (r9 != 0) goto L_0x0255
        L_0x024d:
        L_0x024e:
            r14 = r10
            r13 = r18
            r3 = 0
            r4 = 1
            goto L_0x01c4
        L_0x0255:
            r11.a((defpackage.hvg) r3)     // Catch:{ all -> 0x0401 }
            java.lang.String r0 = r3.k()     // Catch:{ all -> 0x0401 }
            boolean r4 = d(r21)     // Catch:{ all -> 0x0401 }
            if (r4 != 0) goto L_0x02c4
            boolean r4 = e(r21)     // Catch:{ all -> 0x0401 }
            if (r4 != 0) goto L_0x02c4
            java.lang.String r4 = "qos_oneoff"
            boolean r4 = r2.equals(r4)     // Catch:{ all -> 0x0401 }
            if (r4 == 0) goto L_0x027c
            avsd r4 = defpackage.avsd.FAST_IF_RADIO_AWAKE     // Catch:{ all -> 0x0401 }
            avsd r9 = defpackage.avsd.DEFAULT     // Catch:{ all -> 0x0401 }
            amzy r4 = defpackage.amzy.a((java.lang.Object) r4, (java.lang.Object) r9)     // Catch:{ all -> 0x0401 }
            r14 = r7
            r19 = r8
            goto L_0x02c9
        L_0x027c:
            if (r12 != 0) goto L_0x02be
            android.content.SharedPreferences r4 = r20.c()     // Catch:{ all -> 0x0401 }
            jiq r9 = r1.g     // Catch:{ all -> 0x0401 }
            long r9 = r9.a()     // Catch:{ all -> 0x0401 }
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0401 }
            java.lang.String r14 = "lastUnmeteredOrDailySent"
            java.lang.String r13 = r13.concat(r14)     // Catch:{ all -> 0x0401 }
            r14 = r7
            r19 = r8
            r7 = 0
            long r7 = r4.getLong(r13, r7)     // Catch:{ all -> 0x03ff }
            long r9 = r9 - r7
            awtr r4 = defpackage.awtr.a     // Catch:{ all -> 0x03ff }
            awts r4 = r4.a()     // Catch:{ all -> 0x03ff }
            long r7 = r4.s()     // Catch:{ all -> 0x03ff }
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x02b5
            avsd r4 = defpackage.avsd.FAST_IF_RADIO_AWAKE     // Catch:{ all -> 0x03ff }
            avsd r7 = defpackage.avsd.DEFAULT     // Catch:{ all -> 0x03ff }
            avsd r8 = defpackage.avsd.UNMETERED_OR_DAILY     // Catch:{ all -> 0x03ff }
            amzy r4 = defpackage.amzy.a(r4, r7, r8)     // Catch:{ all -> 0x03ff }
            goto L_0x02c9
        L_0x02b5:
            avsd r4 = defpackage.avsd.FAST_IF_RADIO_AWAKE     // Catch:{ all -> 0x03ff }
            avsd r7 = defpackage.avsd.DEFAULT     // Catch:{ all -> 0x03ff }
            amzy r4 = defpackage.amzy.a((java.lang.Object) r4, (java.lang.Object) r7)     // Catch:{ all -> 0x03ff }
            goto L_0x02c9
        L_0x02be:
            r14 = r7
            r19 = r8
            amzy r4 = a     // Catch:{ all -> 0x03ff }
            goto L_0x02c9
        L_0x02c4:
            r14 = r7
            r19 = r8
            amzy r4 = a     // Catch:{ all -> 0x03ff }
        L_0x02c9:
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03ff }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x03ff }
            int r8 = r8.length()     // Catch:{ all -> 0x03ff }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ff }
            int r8 = r8 + 21
            r9.<init>(r8)     // Catch:{ all -> 0x03ff }
            java.lang.String r8 = "uploading log tiers: "
            r9.append(r8)     // Catch:{ all -> 0x03ff }
            r9.append(r7)     // Catch:{ all -> 0x03ff }
            r9.toString()     // Catch:{ all -> 0x03ff }
            boolean r7 = defpackage.awua.b()     // Catch:{ all -> 0x03ff }
            if (r7 == 0) goto L_0x032e
            hwq r7 = defpackage.hwq.a((defpackage.hvg) r3, (defpackage.htg) r11)     // Catch:{ all -> 0x03ff }
            boolean r7 = r7.a((java.lang.String) r2, (defpackage.amzy) r4)     // Catch:{ all -> 0x03ff }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x03ff }
            int r9 = r9.length()     // Catch:{ all -> 0x03ff }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ff }
            int r9 = r9 + 43
            r10.<init>(r9)     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = "upload events for QosTier "
            r10.append(r9)     // Catch:{ all -> 0x03ff }
            r10.append(r8)     // Catch:{ all -> 0x03ff }
            java.lang.String r8 = " succeeded: "
            r10.append(r8)     // Catch:{ all -> 0x03ff }
            r10.append(r7)     // Catch:{ all -> 0x03ff }
            r10.toString()     // Catch:{ all -> 0x03ff }
            if (r7 == 0) goto L_0x032c
            avsd r7 = defpackage.avsd.UNMETERED_OR_DAILY     // Catch:{ all -> 0x03ff }
            boolean r4 = r4.contains(r7)     // Catch:{ all -> 0x03ff }
            if (r4 == 0) goto L_0x032a
            r1.c(r0)     // Catch:{ all -> 0x03ff }
            r0 = 1
            goto L_0x037d
        L_0x032a:
            r0 = 1
            goto L_0x037d
        L_0x032c:
            r0 = 0
            goto L_0x037d
        L_0x032e:
            anhk r4 = r4.listIterator()     // Catch:{ all -> 0x03ff }
        L_0x0332:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x03ff }
            if (r7 == 0) goto L_0x037c
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x03ff }
            avsd r7 = (defpackage.avsd) r7     // Catch:{ all -> 0x03ff }
            hwq r8 = defpackage.hwq.a((defpackage.hvg) r3, (defpackage.htg) r11)     // Catch:{ all -> 0x03ff }
            amzy r9 = defpackage.amzy.a((java.lang.Object) r7)     // Catch:{ all -> 0x03ff }
            boolean r8 = r8.a((java.lang.String) r2, (defpackage.amzy) r9)     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x03ff }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x03ff }
            int r10 = r10.length()     // Catch:{ all -> 0x03ff }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ff }
            int r10 = r10 + 43
            r13.<init>(r10)     // Catch:{ all -> 0x03ff }
            java.lang.String r10 = "upload events for QosTier "
            r13.append(r10)     // Catch:{ all -> 0x03ff }
            r13.append(r9)     // Catch:{ all -> 0x03ff }
            java.lang.String r9 = " succeeded: "
            r13.append(r9)     // Catch:{ all -> 0x03ff }
            r13.append(r8)     // Catch:{ all -> 0x03ff }
            r13.toString()     // Catch:{ all -> 0x03ff }
            if (r8 == 0) goto L_0x037a
            avsd r8 = defpackage.avsd.UNMETERED_OR_DAILY     // Catch:{ all -> 0x03ff }
            if (r7 != r8) goto L_0x0332
            r1.c(r0)     // Catch:{ all -> 0x03ff }
            goto L_0x0332
        L_0x037a:
            r0 = 0
            goto L_0x037d
        L_0x037c:
            r0 = 1
        L_0x037d:
            hva r3 = r3.i()     // Catch:{ all -> 0x03ff }
            r11.a((defpackage.hva) r3)     // Catch:{ all -> 0x03ff }
            if (r6 == 0) goto L_0x038b
            java.lang.String r3 = "FastUpload"
            r11.a((java.lang.String) r3)     // Catch:{ all -> 0x03ff }
        L_0x038b:
            if (r0 == 0) goto L_0x0397
            r7 = r14
            r13 = r18
            r8 = r19
            r3 = 0
            r4 = 1
            r14 = 1
            goto L_0x01c4
        L_0x0397:
            if (r11 != 0) goto L_0x039a
            goto L_0x039d
        L_0x039a:
            r11.close()     // Catch:{ SQLiteException -> 0x03fb, all -> 0x03f7 }
        L_0x039d:
            hwp r0 = r1.e     // Catch:{ all -> 0x0590 }
            r0.a()     // Catch:{ all -> 0x0590 }
            boolean r0 = defpackage.awtr.k()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x03a9
            goto L_0x03d3
        L_0x03a9:
            if (r15 == 0) goto L_0x03d3
            if (r14 == 0) goto L_0x03ae
            goto L_0x03b0
        L_0x03ae:
            if (r19 == 0) goto L_0x03d3
        L_0x03b0:
            java.lang.String r0 = "try scheduling oneoff task by: "
            java.lang.String r3 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0590 }
            int r4 = r3.length()     // Catch:{ all -> 0x0590 }
            if (r4 != 0) goto L_0x03c2
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0590 }
            r3.<init>(r0)     // Catch:{ all -> 0x0590 }
            goto L_0x03c5
        L_0x03c2:
            r0.concat(r3)     // Catch:{ all -> 0x0590 }
        L_0x03c5:
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            hwp r3 = r1.e     // Catch:{ all -> 0x0590 }
            long r3 = r3.b()     // Catch:{ all -> 0x0590 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 + r6
            r0.a(r3)     // Catch:{ all -> 0x0590 }
        L_0x03d3:
            boolean r0 = e(r21)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x03e8
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x0590 }
            jiq r2 = r1.g     // Catch:{ all -> 0x0590 }
            boolean r0 = defpackage.hpo.a((android.content.Context) r0, (defpackage.jiq) r2)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x03e8
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            r0.b()     // Catch:{ all -> 0x0590 }
        L_0x03e8:
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r0.e()     // Catch:{ all -> 0x05a2 }
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x0527
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            goto L_0x0524
        L_0x03f7:
            r0 = move-exception
            r3 = 1
            goto L_0x052d
        L_0x03fb:
            r0 = move-exception
            r4 = 1
            goto L_0x04af
        L_0x03ff:
            r0 = move-exception
            goto L_0x0405
        L_0x0401:
            r0 = move-exception
            r14 = r7
            r19 = r8
        L_0x0405:
            r3 = r0
            r4 = 1
            goto L_0x048f
        L_0x0409:
            r0 = move-exception
            r19 = r8
            r10 = r14
            r14 = r7
        L_0x040e:
            r3 = r0
            r4 = r10
            goto L_0x048f
        L_0x0412:
            r19 = r8
            r10 = r14
            r14 = r7
            if (r11 == 0) goto L_0x0424
            r11.close()     // Catch:{ SQLiteException -> 0x0420, all -> 0x041c }
            goto L_0x0424
        L_0x041c:
            r0 = move-exception
            r3 = r10
            goto L_0x052d
        L_0x0420:
            r0 = move-exception
            r4 = r10
            goto L_0x04af
        L_0x0424:
            if (r10 == 0) goto L_0x042b
            hwp r0 = r1.e     // Catch:{ all -> 0x0590 }
            r0.a()     // Catch:{ all -> 0x0590 }
        L_0x042b:
            boolean r0 = defpackage.awtr.k()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0432
            goto L_0x045c
        L_0x0432:
            if (r15 == 0) goto L_0x045c
            if (r14 == 0) goto L_0x0437
            goto L_0x0439
        L_0x0437:
            if (r19 == 0) goto L_0x045c
        L_0x0439:
            java.lang.String r0 = "try scheduling oneoff task by: "
            java.lang.String r3 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0590 }
            int r4 = r3.length()     // Catch:{ all -> 0x0590 }
            if (r4 != 0) goto L_0x044b
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0590 }
            r3.<init>(r0)     // Catch:{ all -> 0x0590 }
            goto L_0x044e
        L_0x044b:
            r0.concat(r3)     // Catch:{ all -> 0x0590 }
        L_0x044e:
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            hwp r3 = r1.e     // Catch:{ all -> 0x0590 }
            long r3 = r3.b()     // Catch:{ all -> 0x0590 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 + r6
            r0.a(r3)     // Catch:{ all -> 0x0590 }
        L_0x045c:
            boolean r0 = e(r21)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0471
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x0590 }
            jiq r2 = r1.g     // Catch:{ all -> 0x0590 }
            boolean r0 = defpackage.hpo.a((android.content.Context) r0, (defpackage.jiq) r2)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0471
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            r0.b()     // Catch:{ all -> 0x0590 }
        L_0x0471:
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r0.e()     // Catch:{ all -> 0x05a2 }
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x058d
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            goto L_0x00e9
        L_0x0480:
            r0 = move-exception
            r19 = r8
            r10 = r14
            r14 = r7
            r3 = r0
            r4 = r10
            goto L_0x048f
        L_0x0488:
            r0 = move-exception
            r14 = r7
            r19 = r8
            r3 = r0
            r4 = 0
            r15 = 0
        L_0x048f:
            if (r11 == 0) goto L_0x049a
            r11.close()     // Catch:{ all -> 0x0495 }
            goto L_0x049a
        L_0x0495:
            r0 = move-exception
            r6 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r6)     // Catch:{ SQLiteException -> 0x049f, all -> 0x049b }
        L_0x049a:
            throw r3     // Catch:{ SQLiteException -> 0x049f, all -> 0x049b }
        L_0x049b:
            r0 = move-exception
            r3 = r4
            goto L_0x052d
        L_0x049f:
            r0 = move-exception
            goto L_0x04af
        L_0x04a1:
            r0 = move-exception
            r14 = r7
            r19 = r8
            r3 = 0
            r15 = 0
            goto L_0x052d
        L_0x04a9:
            r0 = move-exception
            r14 = r7
            r19 = r8
            r4 = 0
            r15 = 0
        L_0x04af:
            java.lang.String r3 = "QosUploaderService"
            java.lang.String r6 = "Failed to run QosUploaderService:"
            java.lang.String r7 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x052b }
            int r8 = r7.length()     // Catch:{ all -> 0x052b }
            if (r8 != 0) goto L_0x04c3
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x052b }
            r7.<init>(r6)     // Catch:{ all -> 0x052b }
            goto L_0x04c7
        L_0x04c3:
            java.lang.String r7 = r6.concat(r7)     // Catch:{ all -> 0x052b }
        L_0x04c7:
            android.util.Log.e(r3, r7, r0)     // Catch:{ all -> 0x052b }
            if (r4 == 0) goto L_0x04d1
            hwp r0 = r1.e     // Catch:{ all -> 0x0590 }
            r0.a()     // Catch:{ all -> 0x0590 }
        L_0x04d1:
            boolean r0 = defpackage.awtr.k()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x04d8
            goto L_0x0502
        L_0x04d8:
            if (r15 == 0) goto L_0x0502
            if (r14 == 0) goto L_0x04dd
            goto L_0x04df
        L_0x04dd:
            if (r19 == 0) goto L_0x0502
        L_0x04df:
            java.lang.String r0 = "try scheduling oneoff task by: "
            java.lang.String r3 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0590 }
            int r4 = r3.length()     // Catch:{ all -> 0x0590 }
            if (r4 != 0) goto L_0x04f1
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0590 }
            r3.<init>(r0)     // Catch:{ all -> 0x0590 }
            goto L_0x04f4
        L_0x04f1:
            r0.concat(r3)     // Catch:{ all -> 0x0590 }
        L_0x04f4:
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            hwp r3 = r1.e     // Catch:{ all -> 0x0590 }
            long r3 = r3.b()     // Catch:{ all -> 0x0590 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 + r6
            r0.a(r3)     // Catch:{ all -> 0x0590 }
        L_0x0502:
            boolean r0 = e(r21)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0517
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x0590 }
            jiq r2 = r1.g     // Catch:{ all -> 0x0590 }
            boolean r0 = defpackage.hpo.a((android.content.Context) r0, (defpackage.jiq) r2)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0517
            hwn r0 = r1.c     // Catch:{ all -> 0x0590 }
            r0.b()     // Catch:{ all -> 0x0590 }
        L_0x0517:
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r0.e()     // Catch:{ all -> 0x05a2 }
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x0529
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
        L_0x0524:
            r0.b()     // Catch:{ all -> 0x05a2 }
        L_0x0527:
            r3 = 0
            goto L_0x058e
        L_0x0529:
            r3 = 0
            goto L_0x058e
        L_0x052b:
            r0 = move-exception
            r3 = r4
        L_0x052d:
            if (r3 == 0) goto L_0x0534
            hwp r3 = r1.e     // Catch:{ all -> 0x0590 }
            r3.a()     // Catch:{ all -> 0x0590 }
        L_0x0534:
            boolean r3 = defpackage.awtr.k()     // Catch:{ all -> 0x0590 }
            if (r3 == 0) goto L_0x053b
            goto L_0x0565
        L_0x053b:
            if (r15 == 0) goto L_0x0565
            if (r14 == 0) goto L_0x0540
            goto L_0x0542
        L_0x0540:
            if (r19 == 0) goto L_0x0565
        L_0x0542:
            java.lang.String r3 = "try scheduling oneoff task by: "
            java.lang.String r4 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0590 }
            int r6 = r4.length()     // Catch:{ all -> 0x0590 }
            if (r6 != 0) goto L_0x0554
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0590 }
            r4.<init>(r3)     // Catch:{ all -> 0x0590 }
            goto L_0x0557
        L_0x0554:
            r3.concat(r4)     // Catch:{ all -> 0x0590 }
        L_0x0557:
            hwn r3 = r1.c     // Catch:{ all -> 0x0590 }
            hwp r4 = r1.e     // Catch:{ all -> 0x0590 }
            long r6 = r4.b()     // Catch:{ all -> 0x0590 }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 + r8
            r3.a(r6)     // Catch:{ all -> 0x0590 }
        L_0x0565:
            boolean r2 = e(r21)     // Catch:{ all -> 0x0590 }
            if (r2 == 0) goto L_0x057a
            android.content.Context r2 = r1.b     // Catch:{ all -> 0x0590 }
            jiq r3 = r1.g     // Catch:{ all -> 0x0590 }
            boolean r2 = defpackage.hpo.a((android.content.Context) r2, (defpackage.jiq) r3)     // Catch:{ all -> 0x0590 }
            if (r2 == 0) goto L_0x057a
            hwn r2 = r1.c     // Catch:{ all -> 0x0590 }
            r2.b()     // Catch:{ all -> 0x0590 }
        L_0x057a:
            throw r0     // Catch:{ all -> 0x0590 }
        L_0x057b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x057b }
            throw r0     // Catch:{ all -> 0x0590 }
        L_0x057e:
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r0.e()     // Catch:{ all -> 0x05a2 }
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x058d
            hsa r0 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            goto L_0x00e9
        L_0x058d:
            r3 = 1
        L_0x058e:
            monitor-exit(r5)     // Catch:{ all -> 0x05a2 }
            return r3
        L_0x0590:
            r0 = move-exception
            hsa r2 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r2.e()     // Catch:{ all -> 0x05a2 }
            boolean r2 = defpackage.awsx.c()     // Catch:{ all -> 0x05a2 }
            if (r2 == 0) goto L_0x05a1
            hsa r2 = defpackage.hrw.a     // Catch:{ all -> 0x05a2 }
            r2.b()     // Catch:{ all -> 0x05a2 }
        L_0x05a1:
            throw r0     // Catch:{ all -> 0x05a2 }
        L_0x05a2:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x05a2 }
            goto L_0x05a6
        L_0x05a5:
            throw r0
        L_0x05a6:
            goto L_0x05a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.clearcut.uploader.QosUploaderChimeraService.a(java.lang.String):boolean");
    }
}
