package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.icing.proxy.SmsChimeraContentProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: poo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class poo {
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    private static final boolean h;
    private static poo i;
    private static boolean j;
    public final Context d;
    public final oyq e = new oyq(this.d);
    public final pou f;
    public boolean g;

    static {
        boolean z;
        Uri uri;
        Uri uri2;
        Uri uri3;
        try {
            uri3 = Telephony.Sms.CONTENT_URI;
            uri2 = Telephony.Mms.CONTENT_URI;
            uri = Telephony.MmsSms.CONTENT_URI;
            z = true;
        } catch (NoClassDefFoundError e2) {
            uri3 = Uri.parse("content://sms");
            uri2 = Uri.parse("content://mms");
            uri = Uri.parse("content://mms-sms/");
            z = false;
        }
        a = uri3;
        b = uri2;
        c = uri;
        h = z;
    }

    public poo(Context context) {
        this.d = context;
        this.f = new pou(context, new pni(this.e, context.getContentResolver()));
        if (e(this.d).getBoolean("clear_completed_after_disable", false)) {
            e(this.d).edit().putBoolean("clear_completed_after_disable", false).apply();
        }
    }

    static void a(Context context, aaig aaig) {
        pnz.d("Maybe clear SMS Corpus");
        SharedPreferences e2 = e(context);
        if (e2.getBoolean("clear_completed_after_disable", false)) {
            pnz.d("Clear completed before. No need to clear");
            return;
        }
        poq a2 = poq.a(context, SmsChimeraContentProvider.a);
        SQLiteDatabase f2 = a2.f();
        if (f2 != null) {
            f2.beginTransaction();
            try {
                f2.delete("mmssms", (String) null, (String[]) null);
                f2.delete("mmssms_tag", (String) null, (String[]) null);
                boolean b2 = a2.b(a2.c.b[0], Long.MAX_VALUE);
                f2.setTransactionSuccessful();
                if (b2) {
                    acwa b3 = aaig.b(context.getPackageName(), "sms");
                    try {
                        acws.a(b3, 5000, TimeUnit.MILLISECONDS);
                        CorpusStatus corpusStatus = (CorpusStatus) b3.d();
                        if (corpusStatus.a && corpusStatus.b != 0) {
                            pnz.d("Clearing SMS Corpus");
                            try {
                                acws.a(aaig.a(context.getPackageName(), "sms"), 5000, TimeUnit.MILLISECONDS);
                            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                                pnz.e("Failed to get SMS Corpus status");
                                return;
                            }
                        }
                        SharedPreferences.Editor edit = e2.edit();
                        pnz.d("SMS Corpus is empty now");
                        edit.remove("last_sms_date").remove("last_sms_id").remove("last_mms_date").remove("last_mms_id");
                        edit.putBoolean("clear_completed_after_disable", true).apply();
                        return;
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        pnz.e("Failed to get SMS Corpus status");
                        return;
                    }
                }
            } finally {
                f2.endTransaction();
            }
        }
        pnz.e("Failed to clear SMS Corpus database tables");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getPackageManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean b(android.content.Context r3) {
        /*
            boolean r0 = defpackage.ptl.a()
            r1 = 1
            if (r0 != 0) goto L_0x001c
            boolean r0 = h
            r2 = 0
            if (r0 == 0) goto L_0x001b
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 == 0) goto L_0x001b
            java.lang.String r0 = "android.hardware.telephony"
            boolean r3 = r3.hasSystemFeature(r0)
            if (r3 == 0) goto L_0x001b
            return r1
        L_0x001b:
            return r2
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poo.b(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.poo c(android.content.Context r5) {
        /*
            java.lang.Class<poo> r0 = defpackage.poo.class
            monitor-enter(r0)
            boolean r1 = a((android.content.Context) r5)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x003f
            poo r1 = i     // Catch:{ all -> 0x005f }
            if (r1 != 0) goto L_0x003b
            poo r1 = new poo     // Catch:{ all -> 0x005f }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x005f }
            r1.<init>(r5)     // Catch:{ all -> 0x005f }
            i = r1     // Catch:{ all -> 0x005f }
            monitor-enter(r1)     // Catch:{ all -> 0x005f }
            boolean r5 = r1.g     // Catch:{ all -> 0x0038 }
            if (r5 != 0) goto L_0x0031
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            poi r5 = defpackage.poi.a()     // Catch:{ all -> 0x005f }
            pol r2 = new pol     // Catch:{ all -> 0x005f }
            r2.<init>(r1)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "SmsCorpusInitRunnable"
            java.lang.Runnable r1 = defpackage.poi.a(r1, r2)     // Catch:{ all -> 0x005f }
            r5.a(r1)     // Catch:{ all -> 0x005f }
            goto L_0x0032
        L_0x0031:
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
        L_0x0032:
            java.lang.String r5 = "Created SMSCorpus"
            defpackage.pnz.d(r5)     // Catch:{ all -> 0x005f }
            goto L_0x003b
        L_0x0038:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            throw r5     // Catch:{ all -> 0x005f }
        L_0x003b:
            poo r5 = i     // Catch:{ all -> 0x005f }
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return r5
        L_0x003f:
            r1 = 0
            i = r1     // Catch:{ all -> 0x005f }
            defpackage.poj.a()     // Catch:{ all -> 0x005f }
            boolean r2 = b(r5)     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005d
            poi r2 = defpackage.poi.a()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "SmsCorpusClearRunnable"
            pok r4 = new pok     // Catch:{ all -> 0x005f }
            r4.<init>(r5)     // Catch:{ all -> 0x005f }
            java.lang.Runnable r5 = defpackage.poi.a(r3, r4)     // Catch:{ all -> 0x005f }
            r2.a(r5)     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return r1
        L_0x005f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poo.c(android.content.Context):poo");
    }

    static synchronized boolean d(Context context) {
        boolean z;
        synchronized (poo.class) {
            z = true;
            if (jkr.b() && !j) {
                if (kr.a(context, "android.permission.READ_SMS") != 0 || kr.a(context, "android.permission.READ_PHONE_STATE") != 0) {
                    z = false;
                }
                j = z;
            }
        }
        return z;
    }

    static SharedPreferences e(Context context) {
        return context.getSharedPreferences("proxy-sms-corpus", 0);
    }

    public final long b() {
        return e(this.d).getLong("last_sms_date", -1);
    }

    public final long c() {
        return e(this.d).getLong("last_mms_date", -1);
    }

    public static boolean a(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (axsd.b()) {
            pnz.d("SMS Corpus is disabled by Gservices flag");
            return false;
        } else if (!jhg.f()) {
            pnz.d("SMS Corpus is disabled because it's not in main profile");
            return false;
        } else if (!b(context)) {
            pnz.d("SMS Corpus is disabled because SMS is not supported on the device");
            return false;
        } else if (d(context)) {
            return true;
        } else {
            pnz.d("SMS Corpus is disabled because indexing is not permitted");
            return false;
        }
    }

    public final poq a() {
        return poq.a(this.d, SmsChimeraContentProvider.a);
    }

    public final void a(aolt aolt, int i2) {
        this.e.a(aolt, i2, axrp.a.a().q());
    }

    public final void a(boolean z) {
        poi.a().a(poi.a("SmsCorpusProcessChangeRunnable", new pon(this, z)));
        poj.b(this.d);
    }
}
