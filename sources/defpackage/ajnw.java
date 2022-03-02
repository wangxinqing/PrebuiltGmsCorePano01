package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: ajnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnw {
    static final ikz a = ikz.a("device_country", (String) null);

    static int a(long j, long j2) {
        if (j <= j2) {
            return j2 <= j ? 0 : -1;
        }
        return 1;
    }

    public static void c(SharedPreferences sharedPreferences, String str, String str2, SharedPreferences.Editor editor) {
        if (sharedPreferences.contains(str)) {
            editor.remove(str).putInt(str2, sharedPreferences.getInt(str, 0));
        }
    }

    public static void d(SharedPreferences sharedPreferences, String str, String str2, SharedPreferences.Editor editor) {
        if (sharedPreferences.contains(str)) {
            editor.remove(str).putLong(str2, sharedPreferences.getLong(str, 0));
        }
    }

    public static ClientIdentity a(Context context, String str) {
        if (str == null) {
            return ajqg.a(context);
        }
        for (ApplicationInfo next : context.getPackageManager().getInstalledApplications(128)) {
            if (next.packageName.equals(str)) {
                return new ClientIdentity(next.uid, str);
            }
        }
        return ajqg.a(context);
    }

    public static long b() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public static boolean c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return jix.d(context);
    }

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!aztb.a.a().ao()) {
            return connectivityManager.getBackgroundDataSetting() && jkf.a(context);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return connectivityManager.getBackgroundDataSetting() && activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static PendingIntent b(Context context, String str) {
        return PendingIntent.getBroadcast(context, -1, new Intent(str).setPackage("com.google.android.gms"), 134217728);
    }

    public static String a() {
        String str = (String) a.c();
        if (str != null && str.length() >= 2 && str.length() <= 3 && TextUtils.isGraphic(str)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        ajix.b("GCoreUlr", valueOf.length() == 0 ? new String("undefined device_country: ") : "undefined device_country: ".concat(valueOf));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r3) {
        /*
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            r0 = 0
            if (r3 == 0) goto L_0x0018
            r1 = 6
            android.hardware.Sensor r3 = r3.getDefaultSensor(r1)     // Catch:{ NullPointerException -> 0x0017 }
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = r3.getName()     // Catch:{ NullPointerException -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r3 = move-exception
        L_0x0018:
            r3 = r0
        L_0x0019:
            if (r3 == 0) goto L_0x0031
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0031
            r0 = 0
            int r1 = r3.length()
            r2 = 25
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnw.b(android.content.Context):java.lang.String");
    }

    public static String a(Context context, AccountConfig accountConfig, int i) {
        Conditions conditions = accountConfig.m;
        if (!jjy.a(context)) {
            return context.getString(R.string.location_ulr_settings_device_not_supported);
        }
        List b = conditions.b();
        if (b.size() == 1 && InactiveReason.a(b, 3)) {
            String a2 = a();
            if (a2 != null) {
                Locale locale = Locale.getDefault();
                Locale locale2 = new Locale(locale.getLanguage(), a2, locale.getVariant());
                String displayCountry = locale2.getDisplayCountry(locale);
                if (displayCountry == null || !TextUtils.isGraphic(displayCountry)) {
                    String valueOf = String.valueOf(locale2);
                    String valueOf2 = String.valueOf(locale);
                    int length = String.valueOf(displayCountry).length();
                    StringBuilder sb = new StringBuilder(length + 29 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                    sb.append("getDisplayName() is ");
                    sb.append(displayCountry);
                    sb.append(" for ");
                    sb.append(valueOf);
                    sb.append(" in ");
                    sb.append(valueOf2);
                    ajix.b("GCoreUlr", sb.toString());
                } else {
                    a2 = displayCountry;
                }
            } else {
                a2 = null;
            }
            if (a2 == null) {
                return context.getString(R.string.location_settings_ulr_summary_unsupported_region);
            }
            return context.getString(R.string.location_settings_ulr_summary_unsupported_country, new Object[]{a2});
        } else if (!conditions.c()) {
            ajix.c("GCoreUlr", 37, "Should not call if ineligible (except for unsupported geo)");
            return context.getString(R.string.common_disabled);
        } else if (accountConfig.c()) {
            return context.getString(R.string.common_disabled);
        } else {
            if (!conditions.e) {
                return context.getString(R.string.location_ulr_setting_location_disabled);
            }
            if (!conditions.d) {
                return context.getString(R.string.location_reporting_lgaayl_is_off);
            }
            if (!accountConfig.k) {
                return context.getString(R.string.location_settings_ulr_summary_auth_error);
            }
            if (!accountConfig.h()) {
                String valueOf3 = String.valueOf(accountConfig);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 66);
                sb2.append("getUnavailableReason() not handling at least one inactive reason: ");
                sb2.append(valueOf3);
                ajix.c("GCoreUlr", 36, sb2.toString());
            }
            if (accountConfig.b) {
                String valueOf4 = String.valueOf(accountConfig);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 30);
                sb3.append("ULR not actually unavailable: ");
                sb3.append(valueOf4);
                ajix.c("GCoreUlr", 38, sb3.toString());
                return context.getString(R.string.common_unknown);
            } else if (i != 1) {
                return context.getString(ajnp.a(i));
            } else {
                return context.getString(R.string.location_settings_ulr_summary_loading);
            }
        }
    }

    public static String b(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47 + String.valueOf(lowerCase).length());
        sb.append("Old account name: ");
        sb.append(str);
        sb.append(", canonicalize account name: ");
        sb.append(lowerCase);
        sb.toString();
        return lowerCase;
    }

    public static void b(SharedPreferences sharedPreferences, String str, String str2, SharedPreferences.Editor editor) {
        if (sharedPreferences.contains(str)) {
            editor.remove(str).putBoolean(str2, sharedPreferences.getBoolean(str, false));
        }
    }

    public static List a(String str) {
        return Arrays.asList(str.split(","));
    }

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ajix.a(applicationContext);
        ajjb.a(applicationContext);
        ajjd.a(applicationContext);
    }

    public static void a(SharedPreferences sharedPreferences, Account account) {
        String account2 = account.toString();
        for (String next : sharedPreferences.getAll().keySet()) {
            if (next.contains(account2)) {
                String replace = next.replace(account.name, rmp.a(account));
                StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 54);
                sb.append("Preference was not rekeyed for account name change: '");
                sb.append(replace);
                sb.append("'");
                ajix.c("GCoreUlr", 39, sb.toString());
            }
        }
    }

    public static void a(SharedPreferences sharedPreferences, String str, String str2, SharedPreferences.Editor editor) {
        if (sharedPreferences.contains(str)) {
            editor.remove(str).putString(str2, sharedPreferences.getString(str, (String) null));
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ajix.a("GCoreUlr", (Throwable) e);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static void a(PrintWriter printWriter, Context context, ajmm ajmm, ajmo ajmo) {
        printWriter.println(ajmm.a());
        String valueOf = String.valueOf(ajmm.b.a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("old config: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        String valueOf2 = String.valueOf(ajmo.c());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 16);
        sb2.append("uploadRequests: ");
        sb2.append(valueOf2);
        printWriter.println(sb2.toString());
        boolean d = ajmo.d();
        StringBuilder sb3 = new StringBuilder(16);
        sb3.append("deepStill: ");
        sb3.append(d);
        printWriter.println(sb3.toString());
        String[] strArr = ajnu.a;
        printWriter.println("Gservices values:");
        ajnu.a(aeeg.a(context.getContentResolver(), "user_location_reporting:"), printWriter);
        printWriter.println("Phenotype values:");
        ContentResolver contentResolver = context.getContentResolver();
        Uri a2 = yef.a("com.google.android.gms.ulr");
        HashMap hashMap = new HashMap();
        Cursor query = contentResolver.query(a2, ajnu.a, (String) null, (String[]) null, (String) null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            ajnu.a(hashMap, printWriter);
        }
        ajix.a(printWriter, "GCoreUlrLong");
        ajix.a(printWriter, "GCoreUlr");
    }

    public static void a(List list) {
        Collator instance = Collator.getInstance(Locale.getDefault());
        instance.setStrength(0);
        Collections.sort(list, new ajnv(instance));
    }

    public static boolean a(Context context, Intent intent) {
        String valueOf = String.valueOf(intent);
        String valueOf2 = String.valueOf(intent.getExtras());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
        sb.append("Starting service, intent=");
        sb.append(valueOf);
        sb.append(", extras=");
        sb.append(valueOf2);
        sb.toString();
        ComponentName startService = context.startService(intent);
        if (startService == null) {
            String valueOf3 = String.valueOf(intent);
            String valueOf4 = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 41 + String.valueOf(valueOf4).length());
            sb2.append("Could not start service, intent=");
            sb2.append(valueOf3);
            sb2.append(", extras=");
            sb2.append(valueOf4);
            ajix.c("GCoreUlr", sb2.toString());
        }
        return startService != null;
    }

    public static boolean a(Context context, AccountConfig accountConfig) {
        return accountConfig.b && accountConfig.h() && jjy.a(context);
    }

    public static boolean a(ReportingConfig reportingConfig, ReportingConfig reportingConfig2, ajnd ajnd) {
        if (reportingConfig == null) {
            return true;
        }
        ob<Account> obVar = new ob();
        obVar.addAll(reportingConfig.a());
        obVar.addAll(reportingConfig2.a());
        boolean z = false;
        boolean z2 = false;
        for (Account account : obVar) {
            AccountConfig a2 = reportingConfig.a(account);
            AccountConfig a3 = reportingConfig2.a(account);
            if (a2 == null || a3 == null) {
                return true;
            }
            int b = ajnd.b(a2, "com.google.android.googlequicksearchbox");
            int a4 = ajnd.a(a2, "com.google.android.googlequicksearchbox");
            int b2 = ajnd.b(a3, "com.google.android.googlequicksearchbox");
            int a5 = ajnd.a(a3, "com.google.android.googlequicksearchbox");
            ReportingState a6 = a2.a(b, a4, true, true);
            ReportingState a7 = a3.a(b2, a5, true, true);
            z |= !a7.equals(a6);
            z2 |= (a7.b == a6.b && a7.c() == a6.c()) ? false : true;
        }
        ajjb.a("UlrSettingsChange", z);
        ajjb.a("UlrCoarseSettingsChange", z2);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r5 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r7) {
        /*
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto L_0x000b
            boolean r7 = r7.delete()
            return r7
        L_0x000b:
            java.io.File[] r0 = r7.listFiles()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002d
            int r3 = r0.length
            r4 = 0
            r5 = 1
        L_0x0016:
            if (r4 >= r3) goto L_0x002b
            r6 = r0[r4]
            if (r6 != 0) goto L_0x001d
            goto L_0x0028
        L_0x001d:
            if (r5 == 0) goto L_0x0027
            boolean r5 = a((java.io.File) r6)
            if (r5 == 0) goto L_0x0027
            r5 = 1
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x002b:
            if (r5 == 0) goto L_0x0034
        L_0x002d:
            boolean r7 = r7.delete()
            if (r7 == 0) goto L_0x0034
            return r2
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnw.a(java.io.File):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(byte[] r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0022
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x001b }
            r2.<init>(r1)     // Catch:{ all -> 0x001b }
            r2.write(r3)     // Catch:{ all -> 0x0018 }
            r2.close()
            byte[] r3 = r1.toByteArray()
            return r3
        L_0x0018:
            r3 = move-exception
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            throw r3
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajnw.a(byte[]):byte[]");
    }
}
