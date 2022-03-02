package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;

/* renamed from: qtp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qtp {
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    private static final boolean h;
    private static qtp i;
    private static boolean j;
    private static aplf k;
    public final Context d;
    public final qtv e;
    public final qte f;
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

    public qtp(Context context) {
        this.d = context;
        qog qog = new qog(context.getContentResolver(), (qof) null);
        this.e = new qtv(context, qog);
        this.f = new qte(qog, context);
    }

    public static acvs a(int i2) {
        return new qtl(i2);
    }

    /* JADX INFO: finally extract failed */
    static void b(Context context) {
        if (!h(context)) {
            SQLiteDatabase a2 = qtr.a(context).a();
            if (a2 != null) {
                a2.beginTransaction();
                try {
                    a2.delete("mmssms", (String) null, (String[]) null);
                    if (axvz.l()) {
                        a2.delete("contact_annotation", (String) null, (String[]) null);
                        new Object[1][0] = "contact_annotation";
                    }
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    d(context).b("Message");
                    g(context);
                    a(context, true);
                } catch (Throwable th) {
                    a2.endTransaction();
                    throw th;
                }
            } else {
                qoi.b("Failed to clear SMS Corpus database tables");
            }
        }
    }

    public static qtp c(Context context) {
        synchronized (qtp.class) {
            if (a(context)) {
                if (i == null) {
                    qtp qtp = new qtp(context.getApplicationContext());
                    i = qtp;
                    synchronized (qtp) {
                        if (!qtp.g) {
                            qok.a().a(new qtn(qtp));
                        }
                    }
                }
                qtp qtp2 = i;
                return qtp2;
            }
            i = null;
            qtj.a();
            qok.a().a(new qtm(context));
            return null;
        }
    }

    public static aplf d(Context context) {
        if (k == null) {
            k = aplf.a(context);
        }
        return k;
    }

    static synchronized boolean e(Context context) {
        boolean z;
        synchronized (qtp.class) {
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

    static SharedPreferences f(Context context) {
        return context.getSharedPreferences("ipa-sms-corpus", 0);
    }

    static void g(Context context) {
        f(context).edit().remove("last_sms_date").remove("last_mms_date").remove("last_sms_id").remove("last_mms_id").apply();
    }

    private static boolean h(Context context) {
        return f(context).getBoolean("clear_completed_after_disable", false);
    }

    private static void a(Context context, boolean z) {
        if (h(context) != z) {
            f(context).edit().putBoolean("clear_completed_after_disable", z).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return f(this.d).getInt("last_sms_id", -1);
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        a(this.d, false);
    }

    public static boolean a(Context context) {
        PackageManager packageManager;
        int i2 = Build.VERSION.SDK_INT;
        if (!axvz.a.a().u() || !jhg.f() || ((!"true".equals(jli.a("ro.mobile_ninjas.is_emulated", "")) && (!h || (packageManager = context.getPackageManager()) == null || !packageManager.hasSystemFeature("android.hardware.telephony"))) || !e(context))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return f(this.d).getInt("last_mms_id", -1);
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return f(this.d).getLong("last_mms_date", -1);
    }

    /* access modifiers changed from: package-private */
    public final qtr a() {
        return qtr.a(this.d);
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        return f(this.d).getLong("last_sms_date", -1);
    }

    public final void a(boolean z, boolean z2) {
        qok.a().a(new qto(this, z, z2));
        qtj.b(this.d);
    }
}
