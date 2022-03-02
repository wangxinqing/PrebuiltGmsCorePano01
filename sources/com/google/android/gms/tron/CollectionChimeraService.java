package com.google.android.gms.tron;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.LruCache;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.udc.UdcCacheRequest;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CollectionChimeraService extends Service implements acxa {
    public static final UdcCacheRequest b = new UdcCacheRequest(i);
    private static final Charset g = Charset.forName("UTF-8");
    private static final int[] i = {8, 10};
    public final Object a = new Object();
    public hph c;
    public SharedPreferences d;
    public acwv e;
    public acwy f;
    private final SecureRandom h = new SecureRandom();
    private boolean j;
    private acwu k;
    private ArrayList l;
    private final LruCache m = new LruCache(100);
    private final MessageDigest n;
    private byte[] o;
    private jbs p;
    private acwx q;
    private bazg r;
    private Random s;
    private ModuleManager t;
    private ModuleManager.ModuleInfo u;

    public CollectionChimeraService() {
        try {
            this.n = MessageDigest.getInstance("MD5");
            this.e = new acwv();
            if (azqn.a.a().a()) {
                this.e.c = adrz.a(ihs.b(), new adry());
                if (azqq.c()) {
                    Log.i("CollectionChimeraSvc", "Using new consent API");
                }
            } else if (azqq.c()) {
                Log.i("CollectionChimeraSvc", "NOT using new consent API");
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.tron.CollectionService");
    }

    public final aucd b() {
        if (this.l.isEmpty()) {
            return avqd.al.o();
        }
        avqd avqd = (avqd) this.l.remove(0);
        aucd aucd = (aucd) avqd.c(5);
        aucd.a((aucj) avqd);
        aucd.b = (aucj) aucd.b.c(4);
        return aucd;
    }

    public final long c(String str) {
        long j2;
        synchronized (this.a) {
            j2 = this.d.getLong(str, 0);
        }
        return j2;
    }

    public final void d(String str) {
        synchronized (this.a) {
            this.d.edit().putBoolean(str, true).apply();
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.s = new Random(System.currentTimeMillis());
        this.j = false;
        if (getApplicationInfo().targetSdkVersion > 19) {
            this.l = new ArrayList();
            hol hol = new hol(this, "TRON", (String) null);
            hol.a(avsd.a((int) azqq.b()));
            this.k = new acwu(hol);
            this.c = new hph(hol, "TRON_COUNTERS", 1024);
            this.d = getSharedPreferences("tron_prefs", 0);
            this.p = new jbs(this);
            if (azqq.d()) {
                this.j = true;
            }
            jfp jfp = new jfp(10);
            jfp.start();
            this.q = new acwx(this, jfp);
        }
    }

    public final void onDestroy() {
        acwx acwx = this.q;
        if (acwx != null) {
            acwx.d.shutdown();
        }
        this.q = null;
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i2) {
        ExperimentTokens experimentTokens;
        if (this.j) {
            a();
            acwy acwy = new acwy((Context) this, 1);
            acwy.b = i2;
            if (intent != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.tron.extra.serializedExpTokens");
                if (byteArrayExtra != null) {
                    experimentTokens = (ExperimentTokens) ivy.a(byteArrayExtra, ExperimentTokens.CREATOR);
                } else {
                    experimentTokens = null;
                }
                acwy.d = experimentTokens;
                acwy.h = intent.getIntExtra("com.google.android.gms.tron.extra.reason", 0);
            } else {
                acwy.h = 6;
            }
            a(acwy);
        }
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return this.j ? 1 : 2;
    }

    public static boolean a(iby iby) {
        acwa f2 = iby.f("TRON");
        try {
            acws.a(f2, 10000, TimeUnit.MILLISECONDS);
            if (!f2.b() || f2.d() == null || !((Boolean) f2.d()).booleanValue()) {
                return false;
            }
            if (!azqq.c()) {
                return true;
            }
            Log.i("CollectionChimeraSvc", "Consent API says canLog is true");
            return true;
        } catch (ExecutionException | TimeoutException e2) {
            return false;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final void b(String str, int i2) {
        if (azqq.c()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
            sb.append("increment counter ");
            sb.append(str);
            sb.append(" with ");
            sb.append(i2);
            sb.toString();
        }
        this.c.c(str).a((long) i2);
    }

    public final acwy a(acwz acwz) {
        return new acwy((Context) this, acwz);
    }

    public final void a() {
        byte[] bArr;
        bazg q2 = azqq.a.a().q();
        if (q2 != null) {
            bArr = q2.k();
        } else {
            bArr = null;
        }
        if (bArr != null) {
            try {
                this.r = (bazg) aucj.a((aucj) bazg.b, bArr, aubs.c());
            } catch (auda e2) {
                Log.e("CollectionChimeraSvc", "failed to decode rate configuration", e2);
            }
        } else {
            this.r = null;
        }
    }

    public final void b(String str, long j2) {
        synchronized (this.a) {
            this.d.edit().putLong(str, j2).apply();
        }
    }

    public final boolean b(String str) {
        boolean z;
        synchronized (this.a) {
            z = this.d.getBoolean(str, false);
        }
        return z;
    }

    public final void a(long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean c2 = azqq.c();
        if (j2 != Long.MAX_VALUE) {
            long min = Math.min(Math.max(j2, (long) ((int) azqq.a.a().i())), (long) ((int) azqq.a.a().h()));
            if (c2) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("scheduling collection interval: ");
                sb.append(min);
                sb.toString();
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.tron.ALARM").setClassName(this, "com.google.android.gms.tron.AlarmReceiver"), 134217728);
            this.p.a(broadcast);
            this.p.a("CollectionChimeraSvc", 3, elapsedRealtime + min, broadcast, "com.google.android.gms");
            return;
        }
        this.c.c("tron_disable").a();
        if (c2) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("disabling collection: ");
            sb2.append(j2);
            sb2.toString();
        }
    }

    public final void a(acwy acwy) {
        acwx acwx = this.q;
        if (acwx != null) {
            Message obtainMessage = acwx.obtainMessage();
            obtainMessage.obj = acwy;
            this.q.sendMessage(obtainMessage);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015e, code lost:
        if (defpackage.azqq.a.a().k() != false) goto L_0x01d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aucd r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            aucj r2 = r19.i()
            avqd r2 = (defpackage.avqd) r2
            bbl r3 = defpackage.bbl.VIEW_UNKNOWN
            int r3 = r2.c
            int r3 = defpackage.bbj.a(r3)
            r4 = 1
            if (r3 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 1
        L_0x0017:
            int r3 = r3 + -1
            r5 = 4
            r6 = 3
            if (r3 == r4) goto L_0x0052
            if (r3 == r6) goto L_0x003a
            if (r3 == r5) goto L_0x0022
            goto L_0x0069
        L_0x0022:
            hph r3 = r1.c
            java.lang.String r7 = "tron_action"
            hpb r3 = r3.d(r7)
            int r7 = r2.d
            bbl r7 = defpackage.bbl.a(r7)
            if (r7 != 0) goto L_0x0034
            bbl r7 = defpackage.bbl.VIEW_UNKNOWN
        L_0x0034:
            int r7 = r7.CA
            r3.a(r7)
            goto L_0x0069
        L_0x003a:
            hph r3 = r1.c
            java.lang.String r7 = "tron_detail"
            hpb r3 = r3.d(r7)
            int r7 = r2.d
            bbl r7 = defpackage.bbl.a(r7)
            if (r7 != 0) goto L_0x004c
            bbl r7 = defpackage.bbl.VIEW_UNKNOWN
        L_0x004c:
            int r7 = r7.CA
            r3.a(r7)
            goto L_0x0069
        L_0x0052:
            hph r3 = r1.c
            java.lang.String r7 = "tron_view"
            hpb r3 = r3.d(r7)
            int r7 = r2.d
            bbl r7 = defpackage.bbl.a(r7)
            if (r7 != 0) goto L_0x0064
            bbl r7 = defpackage.bbl.VIEW_UNKNOWN
        L_0x0064:
            int r7 = r7.CA
            r3.a(r7)
        L_0x0069:
            int r3 = r2.d
            bbl r3 = defpackage.bbl.a(r3)
            if (r3 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            bbl r3 = defpackage.bbl.VIEW_UNKNOWN
        L_0x0074:
            int r3 = r3.ordinal()
            r9 = 11
            r10 = 10
            r11 = 128(0x80, float:1.794E-43)
            r12 = 7
            r13 = 2
            r14 = 5
            if (r3 == r11) goto L_0x00ad
            r15 = 199(0xc7, float:2.79E-43)
            if (r3 == r15) goto L_0x0089
            goto L_0x0126
        L_0x0089:
            int r3 = r2.g
            r3 = r3 & r4
            if (r3 != 0) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            java.lang.String r3 = "tron_note_buzz"
            r1.a((java.lang.String) r3)
        L_0x0095:
            int r3 = r2.g
            r3 = r3 & r13
            if (r3 != 0) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            java.lang.String r3 = "tron_note_beep"
            r1.a((java.lang.String) r3)
        L_0x00a1:
            int r2 = r2.g
            r2 = r2 & r5
            if (r2 == 0) goto L_0x0126
            java.lang.String r2 = "tron_note_blink"
            r1.a((java.lang.String) r2)
            goto L_0x0126
        L_0x00ad:
            int r3 = r2.c
            int r3 = defpackage.bbj.a(r3)
            if (r3 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r3 = 1
        L_0x00b7:
            int r3 = r3 + -1
            r15 = 60000(0xea60, double:2.9644E-319)
            if (r3 == r4) goto L_0x011c
            if (r3 == r5) goto L_0x0111
            if (r3 == r14) goto L_0x00c3
            goto L_0x0126
        L_0x00c3:
            java.lang.String r3 = "tron_note_dismiss"
            r1.a((java.lang.String) r3)
            long r7 = r2.h
            long r7 = r7 / r15
            int r8 = (int) r7
            java.lang.String r7 = "tron_note_lifetime"
            r1.a((java.lang.String) r7, (int) r8)
            int r2 = r2.g
            if (r2 == r4) goto L_0x010a
            if (r2 == r13) goto L_0x0103
            if (r2 == r6) goto L_0x0103
            if (r2 == r12) goto L_0x00fc
            if (r2 == r10) goto L_0x00f5
            if (r2 == r9) goto L_0x00f5
            r7 = 17
            if (r2 == r7) goto L_0x00ee
            r3 = 18
            if (r2 == r3) goto L_0x00e8
            goto L_0x0126
        L_0x00e8:
            java.lang.String r2 = "tron_note_dismiss_snooze"
            r1.a((java.lang.String) r2)
            goto L_0x0126
        L_0x00ee:
            java.lang.String r2 = "tron_note_dismiss_channel"
            r1.a((java.lang.String) r2)
            goto L_0x0126
        L_0x00f5:
            java.lang.String r2 = "tron_note_dismiss_listener"
            r1.a((java.lang.String) r2)
            goto L_0x0126
        L_0x00fc:
            java.lang.String r2 = "tron_note_dismiss_ban"
            r1.a((java.lang.String) r2)
            goto L_0x0126
        L_0x0103:
            java.lang.String r2 = "tron_note_dismiss_user"
            r1.a((java.lang.String) r2)
            goto L_0x0126
        L_0x010a:
            java.lang.String r2 = "tron_note_dismiss_click"
            r1.a((java.lang.String) r2)
            goto L_0x0126
        L_0x0111:
            long r7 = r2.j
            long r7 = r7 / r15
            int r2 = (int) r7
            java.lang.String r7 = "tron_note_exposure"
            r1.a((java.lang.String) r7, (int) r2)
            goto L_0x0126
        L_0x011c:
            long r7 = r2.i
            long r7 = r7 / r15
            int r2 = (int) r7
            java.lang.String r7 = "tron_note_freshness"
            r1.a((java.lang.String) r7, (int) r2)
        L_0x0126:
            aucj r2 = r0.b
            avqd r2 = (defpackage.avqd) r2
            int r2 = r2.d
            bbl r2 = defpackage.bbl.a(r2)
            if (r2 == 0) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            bbl r2 = defpackage.bbl.VIEW_UNKNOWN
        L_0x0135:
            int r2 = r2.ordinal()
            r7 = 0
            if (r2 == r11) goto L_0x0162
            r8 = 129(0x81, float:1.81E-43)
            if (r2 == r8) goto L_0x0162
            switch(r2) {
                case 186: goto L_0x0154;
                case 187: goto L_0x0154;
                case 188: goto L_0x0154;
                case 189: goto L_0x0154;
                case 190: goto L_0x0154;
                case 191: goto L_0x0154;
                case 192: goto L_0x0154;
                case 193: goto L_0x0154;
                default: goto L_0x0143;
            }
        L_0x0143:
            switch(r2) {
                case 196: goto L_0x0154;
                case 197: goto L_0x0154;
                case 198: goto L_0x0154;
                case 199: goto L_0x0162;
                default: goto L_0x0146;
            }
        L_0x0146:
            azqq r2 = defpackage.azqq.a
            azqr r2 = r2.a()
            boolean r2 = r2.p()
            if (r2 == 0) goto L_0x050e
            goto L_0x01d5
        L_0x0154:
            azqq r2 = defpackage.azqq.a
            azqr r2 = r2.a()
            boolean r2 = r2.k()
            if (r2 != 0) goto L_0x01d5
            goto L_0x050e
        L_0x0162:
            azqq r2 = defpackage.azqq.a
            azqr r2 = r2.a()
            boolean r2 = r2.m()
            if (r2 == 0) goto L_0x050e
            aucj r2 = r19.i()
            avqd r2 = (defpackage.avqd) r2
            int r8 = r2.d
            bbl r8 = defpackage.bbl.a(r8)
            if (r8 != 0) goto L_0x017e
            bbl r8 = defpackage.bbl.VIEW_UNKNOWN
        L_0x017e:
            bbl r11 = defpackage.bbl.NOTIFICATION_ITEM
            if (r8 != r11) goto L_0x01a6
            int r8 = r2.c
            int r8 = defpackage.bbj.a(r8)
            if (r8 != 0) goto L_0x018b
            goto L_0x01a6
        L_0x018b:
            r11 = 6
            if (r8 != r11) goto L_0x01a6
            int r2 = r2.g
            if (r2 == r13) goto L_0x01a6
            if (r2 == r6) goto L_0x01a6
            if (r2 == r10) goto L_0x01a6
            if (r2 == r9) goto L_0x01a6
            if (r2 == r4) goto L_0x01a6
            if (r2 == r12) goto L_0x01a6
            r8 = 17
            if (r2 == r8) goto L_0x01a6
            r3 = 18
            if (r2 == r3) goto L_0x01a6
            goto L_0x050e
        L_0x01a6:
            azqq r2 = defpackage.azqq.a
            azqr r2 = r2.a()
            boolean r2 = r2.n()
            if (r2 != 0) goto L_0x01d5
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x01b7
            goto L_0x01bc
        L_0x01b7:
            r19.c()
            r0.c = r7
        L_0x01bc:
            aucj r2 = r0.b
            avqd r2 = (defpackage.avqd) r2
            avqd r3 = defpackage.avqd.al
            int r3 = r2.a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2.a = r3
            r2.k = r7
            java.lang.String r8 = ""
            r8.getClass()
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r2.a = r3
            r2.l = r8
        L_0x01d5:
            bazg r2 = r1.r
            if (r2 != 0) goto L_0x01db
            goto L_0x026b
        L_0x01db:
            aucx r2 = r2.a
            int r2 = r2.size()
            if (r2 == 0) goto L_0x026b
            r2 = 0
        L_0x01e4:
            bazg r3 = r1.r
            aucx r3 = r3.a
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x050e
            aucj r3 = r0.b
            avqd r3 = (defpackage.avqd) r3
            int r3 = r3.d
            bbl r3 = defpackage.bbl.a(r3)
            if (r3 == 0) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            bbl r3 = defpackage.bbl.VIEW_UNKNOWN
        L_0x01fd:
            int r3 = r3.CA
            bazg r8 = r1.r
            aucx r8 = r8.a
            java.lang.Object r8 = r8.get(r2)
            bazh r8 = (defpackage.bazh) r8
            int r8 = r8.a
            if (r3 < r8) goto L_0x0267
            aucj r3 = r0.b
            avqd r3 = (defpackage.avqd) r3
            int r3 = r3.d
            bbl r3 = defpackage.bbl.a(r3)
            if (r3 == 0) goto L_0x021a
            goto L_0x021c
        L_0x021a:
            bbl r3 = defpackage.bbl.VIEW_UNKNOWN
        L_0x021c:
            int r3 = r3.CA
            bazg r8 = r1.r
            aucx r8 = r8.a
            java.lang.Object r8 = r8.get(r2)
            bazh r8 = (defpackage.bazh) r8
            int r8 = r8.b
            if (r3 > r8) goto L_0x0267
            bazg r3 = r1.r
            aucx r3 = r3.a
            java.lang.Object r3 = r3.get(r2)
            bazh r3 = (defpackage.bazh) r3
            float r3 = r3.c
            r8 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x026b
            bazg r3 = r1.r
            aucx r3 = r3.a
            java.lang.Object r3 = r3.get(r2)
            bazh r3 = (defpackage.bazh) r3
            float r3 = r3.c
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x050e
            java.util.Random r3 = r1.s
            float r3 = r3.nextFloat()
            bazg r8 = r1.r
            aucx r8 = r8.a
            java.lang.Object r2 = r8.get(r2)
            bazh r2 = (defpackage.bazh) r2
            float r2 = r2.c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x026b
            goto L_0x050e
        L_0x0267:
            int r2 = r2 + 1
            goto L_0x01e4
        L_0x026b:
            azqq r2 = defpackage.azqq.a
            azqr r2 = r2.a()
            boolean r2 = r2.o()
            r3 = 0
            if (r2 == 0) goto L_0x033f
            aucj r2 = r0.b
            avqd r2 = (defpackage.avqd) r2
            java.lang.String r2 = r2.l
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 != 0) goto L_0x0317
            android.util.LruCache r8 = r1.m
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x0319
            java.security.MessageDigest r8 = r1.n
            r8.reset()
            java.security.MessageDigest r8 = r1.n
            byte[] r9 = r1.o
            if (r9 != 0) goto L_0x02f0
            java.lang.Object r9 = r1.a
            monitor-enter(r9)
            android.content.SharedPreferences r10 = r1.d     // Catch:{ all -> 0x02ed }
            java.lang.String r11 = "hash_salt"
            java.lang.String r10 = r10.getString(r11, r3)     // Catch:{ all -> 0x02ed }
            if (r10 != 0) goto L_0x02e3
            r10 = 16
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x02ed }
            java.security.SecureRandom r11 = r1.h     // Catch:{ all -> 0x02ed }
            r11.nextBytes(r10)     // Catch:{ all -> 0x02ed }
            java.lang.String r10 = android.util.Base64.encodeToString(r10, r6)     // Catch:{ all -> 0x02ed }
            android.content.SharedPreferences r11 = r1.d     // Catch:{ all -> 0x02ed }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x02ed }
            java.lang.String r15 = "hash_salt"
            android.content.SharedPreferences$Editor r11 = r11.putString(r15, r10)     // Catch:{ all -> 0x02ed }
            r11.apply()     // Catch:{ all -> 0x02ed }
            boolean r11 = defpackage.azqq.c()     // Catch:{ all -> 0x02ed }
            if (r11 == 0) goto L_0x02e3
            java.lang.String r11 = "CollectionChimeraSvc"
            java.lang.String r15 = "created a new salt: "
            java.lang.String r12 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02ed }
            int r17 = r12.length()     // Catch:{ all -> 0x02ed }
            if (r17 != 0) goto L_0x02dc
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x02ed }
            r12.<init>(r15)     // Catch:{ all -> 0x02ed }
            goto L_0x02e0
        L_0x02dc:
            java.lang.String r12 = r15.concat(r12)     // Catch:{ all -> 0x02ed }
        L_0x02e0:
            android.util.Log.i(r11, r12)     // Catch:{ all -> 0x02ed }
        L_0x02e3:
            java.nio.charset.Charset r11 = g     // Catch:{ all -> 0x02ed }
            byte[] r10 = r10.getBytes(r11)     // Catch:{ all -> 0x02ed }
            r1.o = r10     // Catch:{ all -> 0x02ed }
            monitor-exit(r9)     // Catch:{ all -> 0x02ed }
            goto L_0x02f0
        L_0x02ed:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x02ed }
            throw r0
        L_0x02f0:
            byte[] r9 = r1.o
            r8.update(r9)
            java.security.MessageDigest r8 = r1.n
            java.nio.charset.Charset r9 = g
            byte[] r9 = r2.getBytes(r9)
            r8.update(r9)
            java.security.MessageDigest r8 = r1.n
            byte[] r8 = r8.digest()
            r9 = 8
            int r10 = r8.length
            int r9 = java.lang.Math.min(r9, r10)
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r7, r9, r6)
            android.util.LruCache r6 = r1.m
            r6.put(r2, r8)
            goto L_0x0319
        L_0x0317:
            java.lang.String r8 = ""
        L_0x0319:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x031e
            goto L_0x0323
        L_0x031e:
            r19.c()
            r0.c = r7
        L_0x0323:
            aucj r2 = r0.b
            avqd r2 = (defpackage.avqd) r2
            avqd r6 = defpackage.avqd.al
            r8.getClass()
            int r6 = r2.a
            r6 = r6 | 2048(0x800, float:2.87E-42)
            r2.a = r6
            r2.m = r8
            java.lang.String r8 = ""
            r8.getClass()
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r2.a = r6
            r2.l = r8
        L_0x033f:
            anuv r2 = defpackage.anuv.g
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x0346
            goto L_0x034b
        L_0x0346:
            r19.c()
            r0.c = r7
        L_0x034b:
            aucj r6 = r0.b
            avqd r6 = (defpackage.avqd) r6
            avqd r8 = defpackage.avqd.al
            r2.getClass()
            r6.n = r2
            int r2 = r6.a
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r6.a = r2
            com.google.android.chimera.config.ModuleManager$ModuleInfo r2 = r1.u
            if (r2 == 0) goto L_0x0361
            goto L_0x0374
        L_0x0361:
            com.google.android.chimera.config.ModuleManager r2 = r1.t
            if (r2 == 0) goto L_0x0366
            goto L_0x036c
        L_0x0366:
            com.google.android.chimera.config.ModuleManager r2 = com.google.android.chimera.config.ModuleManager.get(r18)
            r1.t = r2
        L_0x036c:
            com.google.android.chimera.config.ModuleManager r2 = r1.t
            com.google.android.chimera.config.ModuleManager$ModuleInfo r2 = r2.getCurrentModule()
            r1.u = r2
        L_0x0374:
            com.google.android.chimera.config.ModuleManager$ModuleInfo r2 = r1.u
            int r2 = r2.moduleVersion
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x037d
            goto L_0x0382
        L_0x037d:
            r19.c()
            r0.c = r7
        L_0x0382:
            aucj r6 = r0.b
            avqd r6 = (defpackage.avqd) r6
            int r8 = r6.a
            r9 = 4194304(0x400000, float:5.877472E-39)
            r8 = r8 | r9
            r6.a = r8
            r6.x = r2
            acwv r2 = r1.e
            iby r6 = r2.c
            if (r6 != 0) goto L_0x04da
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0451
            defpackage.azqq.c()
            acwv r2 = r1.e
            java.util.List r2 = r2.a
            int r2 = r2.size()
            aucj r3 = r0.b
            avqd r3 = (defpackage.avqd) r3
            anuv r3 = r3.n
            if (r3 == 0) goto L_0x03af
            goto L_0x03b1
        L_0x03af:
            anuv r3 = defpackage.anuv.g
        L_0x03b1:
            java.lang.Object r6 = r3.c(r14)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r3)
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x03c0
            goto L_0x03c5
        L_0x03c0:
            r6.c()
            r6.c = r7
        L_0x03c5:
            aucj r3 = r6.b
            anuv r3 = (defpackage.anuv) r3
            int r8 = r3.a
            r4 = r4 | r8
            r3.a = r4
            r3.b = r2
            aucj r3 = r6.i()
            anuv r3 = (defpackage.anuv) r3
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x03db
            goto L_0x03e0
        L_0x03db:
            r19.c()
            r0.c = r7
        L_0x03e0:
            aucj r4 = r0.b
            avqd r4 = (defpackage.avqd) r4
            r3.getClass()
            r4.n = r3
            int r3 = r4.a
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r4.a = r3
            r3 = 0
        L_0x03f0:
            if (r3 >= r2) goto L_0x04a6
            aucj r4 = r0.b
            avqd r4 = (defpackage.avqd) r4
            anuv r4 = r4.n
            if (r4 == 0) goto L_0x03fb
            goto L_0x03fd
        L_0x03fb:
            anuv r4 = defpackage.anuv.g
        L_0x03fd:
            java.lang.Object r6 = r4.c(r14)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r4)
            boolean r4 = r6.c
            if (r4 != 0) goto L_0x040c
            goto L_0x0411
        L_0x040c:
            r6.c()
            r6.c = r7
        L_0x0411:
            aucj r4 = r6.b
            anuv r4 = (defpackage.anuv) r4
            int r8 = r4.a
            r8 = r8 | r5
            r4.a = r8
            r4.d = r3
            aucj r4 = r6.i()
            anuv r4 = (defpackage.anuv) r4
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x0427
            goto L_0x042c
        L_0x0427:
            r19.c()
            r0.c = r7
        L_0x042c:
            aucj r6 = r0.b
            avqd r6 = (defpackage.avqd) r6
            r4.getClass()
            r6.n = r4
            int r4 = r6.a
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r6.a = r4
            aucj r4 = r19.i()
            avqd r4 = (defpackage.avqd) r4
            acwv r6 = r1.e
            java.util.List r6 = r6.a
            java.lang.Object r6 = r6.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            r1.a((defpackage.avqd) r4, (java.lang.String) r6)
            int r3 = r3 + 1
            goto L_0x03f0
        L_0x0451:
            defpackage.azqq.c()
            aucj r2 = r0.b
            avqd r2 = (defpackage.avqd) r2
            anuv r2 = r2.n
            if (r2 == 0) goto L_0x045d
            goto L_0x045f
        L_0x045d:
            anuv r2 = defpackage.anuv.g
        L_0x045f:
            java.lang.Object r5 = r2.c(r14)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r2)
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x046e
            goto L_0x0473
        L_0x046e:
            r5.c()
            r5.c = r7
        L_0x0473:
            aucj r2 = r5.b
            anuv r2 = (defpackage.anuv) r2
            int r6 = r2.a
            r6 = r6 | r13
            r2.a = r6
            r2.c = r4
            aucj r2 = r5.i()
            anuv r2 = (defpackage.anuv) r2
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x0489
            goto L_0x048e
        L_0x0489:
            r19.c()
            r0.c = r7
        L_0x048e:
            aucj r4 = r0.b
            avqd r4 = (defpackage.avqd) r4
            r2.getClass()
            r4.n = r2
            int r2 = r4.a
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r4.a = r2
            aucj r2 = r19.i()
            avqd r2 = (defpackage.avqd) r2
            r1.a((defpackage.avqd) r2, (java.lang.String) r3)
        L_0x04a6:
            boolean r2 = defpackage.azqq.c()
            if (r2 == 0) goto L_0x04d0
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 7
            int r3 = r3 + r5
            r4.<init>(r3)
            java.lang.String r3 = "proto: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "CollectionChimeraSvc"
            android.util.Log.i(r3, r2)
        L_0x04d0:
            aucj r0 = r19.i()
            avqd r0 = (defpackage.avqd) r0
            r1.a((defpackage.avqd) r0)
            return
        L_0x04da:
            boolean r2 = defpackage.azqq.c()
            if (r2 == 0) goto L_0x04e7
            java.lang.String r2 = "CollectionChimeraSvc"
            java.lang.String r3 = "Uploading with new consent API"
            android.util.Log.i(r2, r3)
        L_0x04e7:
            acwv r2 = r1.e
            iby r2 = r2.c
            aucj r3 = r19.i()
            avqd r3 = (defpackage.avqd) r3
            byte[] r3 = r3.k()
            acwt r4 = new acwt
            r4.<init>()
            long r5 = defpackage.azqq.b()
            int r6 = (int) r5
            java.lang.String r5 = "TRON"
            r2.a((java.lang.String) r5, (byte[]) r3, (defpackage.adsa) r4, (int) r6)
            aucj r0 = r19.i()
            avqd r0 = (defpackage.avqd) r0
            r1.a((defpackage.avqd) r0)
            return
        L_0x050e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tron.CollectionChimeraService.a(aucd):void");
    }

    public final void a(avqd avqd) {
        if (!this.l.contains(avqd)) {
            this.l.add(avqd);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(avqd avqd, String str) {
        try {
            hoi a2 = this.k.a.a(avqd.k());
            if (str != null) {
                a2.c(str);
            }
            ExperimentTokens experimentTokens = this.f.d;
            if (experimentTokens != null) {
                byte[] bytes = experimentTokens.b().getBytes(g);
                if (!a2.a.k) {
                    a2.c = false;
                    if (!(bytes == null || bytes.length == 0)) {
                        if (a2.b == null) {
                            a2.b = new ArrayList();
                        }
                        a2.b.add(bytes);
                    }
                } else {
                    throw new IllegalArgumentException("addExperimentToken forbidden on anonymous logger");
                }
            }
            a2.b();
        } catch (IllegalArgumentException e2) {
            hpb d2 = this.c.d("tron_bad_proto");
            bbl a3 = bbl.a(avqd.d);
            if (a3 == null) {
                a3 = bbl.VIEW_UNKNOWN;
            }
            d2.a(a3.CA);
        }
    }

    public final void a(String str) {
        if (azqq.c()) {
            if (str.length() == 0) {
                new String("increment counter ");
            } else {
                "increment counter ".concat(str);
            }
        }
        this.c.c(str).a();
    }

    public final void a(String str, int i2) {
        if (azqq.c()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append("increment int histogram ");
            sb.append(str);
            sb.append(" with ");
            sb.append(i2);
            sb.toString();
        }
        this.c.d(str).a(i2);
    }

    public final void a(String str, long j2) {
        if (azqq.c()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("increment long histogram ");
            sb.append(str);
            sb.append(" with ");
            sb.append(j2);
            sb.toString();
        }
        this.c.e(str).a(j2);
    }
}
