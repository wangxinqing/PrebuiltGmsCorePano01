package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/* renamed from: gwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwk {
    private static final SecureRandom a = new SecureRandom();

    static long d(Context context) {
        String a2 = gwd.a(context);
        if (a2 == null || !gwd.a(a2)) {
            return 0;
        }
        try {
            return Long.parseLong((String) amsk.a(':').c(a2).get(0));
        } catch (Exception e) {
            Log.w("GoogleSettingsUtils", "Exception while parsing Android ID", e);
            return 0;
        }
    }

    static void e(Context context) {
        long j = 0;
        long a2 = aeeg.a(context.getContentResolver(), "android_id", 0);
        if (a2 == 0) {
            if (awrq.h()) {
                j = d(context);
            }
            b(context, j, a2);
        }
    }

    static void f(Context context) {
        long j;
        try {
            j = m(context).getLong("CheckinTask_securityToken", 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GoogleSettingsUtils", "Cannot find CheckinChimeraService.xml shared prefs");
            j = 0;
        }
        try {
            if (awrq.a.a().n()) {
                long b = gwd.b(context);
                long d = gwd.d(context);
                if (d != 0) {
                    if (d != b) {
                        Log.i("GoogleSettingsUtils", "Resetting security token from Checkin Prefs");
                        gwd.b("Resetting security token from Checkin Prefs");
                        b(context, d);
                        return;
                    }
                }
                long e2 = gwd.e(context);
                if (e2 != 0) {
                    if (e2 != b) {
                        Log.i("GoogleSettingsUtils", "Resetting security token from Backup File");
                        gwd.b("Resetting security token from Backup File");
                        c(context, e2);
                        b(context, e2);
                        return;
                    }
                }
                if (j != 0 && j != b) {
                    Log.i("GoogleSettingsUtils", "Resetting security token from Chimera Prefs");
                    gwd.b("Resetting security token from Chimera Prefs");
                    a(context, j);
                    b(context, j);
                }
            } else if (j != 0) {
                long e3 = gwd.e(context);
                if (e3 == 0) {
                    Log.w("GoogleSettingsUtils", "Backup security token is 0");
                } else {
                    j = e3;
                }
                Log.i("GoogleSettingsUtils", "Resetting security token");
                StringBuilder sb = new StringBuilder(48);
                sb.append("Resetting security token to ");
                sb.append(j);
                gwd.b(sb.toString());
                a(context, j);
                b(context, j);
                g(context);
            }
        } catch (IOException e4) {
            Log.e("GoogleSettingsUtils", "Exception while trying to reset security token", e4);
        }
    }

    static void g(Context context) {
        try {
            SharedPreferences m = m(context);
            if (m.getLong("CheckinTask_securityToken", 0) == 0) {
                if (m.getLong("OperationScheduler_lastSuccessTimeMillis", 0) == 0) {
                    return;
                }
            }
            SharedPreferences.Editor edit = m.edit();
            edit.remove("CheckinTask_securityToken");
            edit.remove("OperationScheduler_lastSuccessTimeMillis");
            edit.apply();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GoogleSettingsUtils", "Cannot clear Chimera Service Shared prefs, failed to find GoogleServicesFramework package");
        }
    }

    public static long h(Context context) {
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("CheckinLogging", 0);
        try {
            j = sharedPreferences.getLong("logging_id", 0);
        } catch (ClassCastException e) {
            Log.e("GoogleSettingsUtils", "Can't parse Logging ID", e);
            j = 0;
        }
        if (j != 0) {
            return j;
        }
        long nextLong = a.nextLong();
        sharedPreferences.edit().putLong("logging_id", nextLong).commit();
        return nextLong;
    }

    public static gzl i(Context context) {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        try {
            j = m(context).getLong("CheckinTask_securityToken", 0);
        } catch (PackageManager.NameNotFoundException e) {
            j = 0;
        }
        aucd o = gzl.f.o();
        boolean z4 = true;
        if (gwd.c(context) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzl gzl = (gzl) o.b;
        gzl.a |= 1;
        gzl.b = z;
        if (gwd.e(context) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzl gzl2 = (gzl) o.b;
        gzl2.a |= 2;
        gzl2.c = z2;
        if (gwd.d(context) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzl gzl3 = (gzl) o.b;
        int i = gzl3.a | 4;
        gzl3.a = i;
        gzl3.d = z3;
        if (j == 0) {
            z4 = false;
        }
        gzl3.a = i | 8;
        gzl3.e = z4;
        return (gzl) o.i();
    }

    public static String j(Context context) {
        return context.getSharedPreferences("wearable", jnl.a().e()).getString("network_id", (String) null);
    }

    public static String k(Context context) {
        return context.getSharedPreferences("wearable", jnl.a().e()).getString("network_secret", (String) null);
    }

    public static SharedPreferences l(Context context) {
        return context.getSharedPreferences("Checkin", 0);
    }

    private static SharedPreferences m(Context context) {
        return gwe.a(context).getSharedPreferences("CheckinChimeraService", 0);
    }

    static void a(Context context) {
        if (new File(context.getFilesDir(), "checkin_id_token").exists() && !context.deleteFile("checkin_id_token")) {
            Log.w("GoogleSettingsUtils", "Unable to clear checkin_id_token file");
            gwd.b("Unable to clear checkin_id_token file");
        }
    }

    public static long b(Context context) {
        long a2 = aeeg.a(context.getContentResolver(), "android_id", 0);
        if (awrq.h()) {
            long d = d(context);
            if (d != 0) {
                if (d != a2) {
                    String l = Long.toString(d);
                    b(context, d, a2);
                    String valueOf = String.valueOf(l);
                    gwd.b(valueOf.length() == 0 ? new String("setAndroidIdGservices, New Aid:") : "setAndroidIdGservices, New Aid:".concat(valueOf));
                    ContentResolver contentResolver = context.getContentResolver();
                    if (contentResolver == null) {
                        Log.w("GoogleSettingsUtils", "Content Resolver is null, not updating gservices");
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("android_id", l);
                        Log.i("GoogleSettingsUtils", "Updating Android ID in Gservices");
                        try {
                            contentResolver.update(jnl.b, contentValues, (String) null, (String[]) null);
                        } catch (RuntimeException e) {
                            String message = e.getMessage();
                            String packageName = context.getPackageName();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 65 + String.valueOf(packageName).length());
                            sb.append("Caught exception updating gservices MAIN DIFF: ");
                            sb.append(message);
                            sb.append(" Context package: ");
                            sb.append(packageName);
                            Log.w("GoogleSettingsUtils", sb.toString());
                        }
                    }
                    a(context, l);
                }
                return d;
            } else if (a2 != 0) {
                a(context, a2, gwd.b(context));
            }
        } else {
            a(context);
        }
        if (a2 == 0) {
            b(context, 0, a2);
        }
        return a2;
    }

    static void c(Context context, long j) {
        try {
            SharedPreferences sharedPreferences = gwe.a(context).getSharedPreferences("CheckinService", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (j != sharedPreferences.getLong("CheckinTask_securityToken", 0)) {
                edit.putLong("CheckinTask_securityToken", j);
                edit.apply();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GoogleSettingsUtils", "Cannot write token, failed to find GoogleServicesFramework package");
        }
    }

    static void a(Context context, long j) {
        c(context, j);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(gwe.a(context).openFileOutput("security_token", 0));
            dataOutputStream.writeLong(j);
            dataOutputStream.close();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GoogleSettingsUtils", "Cannot write token, failed to find GoogleServicesFramework package");
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("GoogleSettingsUtils", valueOf.length() == 0 ? new String("Cannot write token, exception in Context lookup ") : "Cannot write token, exception in Context lookup ".concat(valueOf));
        }
    }

    public static boolean c(Context context) {
        return b(context) != 0 || gwd.j(context) > 0;
    }

    static void a(Context context, long j, long j2) {
        if (j != 0 && j2 != 0) {
            StringBuilder sb = new StringBuilder(41);
            sb.append(j);
            sb.append(":");
            sb.append(j2);
            String sb2 = sb.toString();
            if (!sb2.equals(gwd.a(context))) {
                try {
                    FileOutputStream openFileOutput = context.openFileOutput("checkin_id_token", 0);
                    openFileOutput.write(sb2.getBytes(amqn.c));
                    openFileOutput.close();
                    Log.i("GoogleSettingsUtils", "Updated ID in checkin_id_token file");
                    gwd.b("Updated ID in checkin_id_token file");
                } catch (IOException e) {
                    Log.e("GoogleSettingsUtils", "Exception while updating checkin_id_token file");
                    String valueOf = String.valueOf(sb2);
                    gwd.b(valueOf.length() == 0 ? new String("writeCheckinIdToken, IOException IdToken") : "writeCheckinIdToken, IOException IdToken".concat(valueOf));
                }
            }
        }
    }

    static void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("Checkin", 0);
        if (str != null || sharedPreferences.contains("android_id")) {
            sharedPreferences.edit().putString("android_id", str).apply();
        }
    }

    static void b(Context context, long j) {
        if (awrq.h()) {
            a(context, b(context), j);
        } else {
            a(context);
        }
    }

    private static void b(Context context, long j, long j2) {
        String a2 = aeeg.a(context.getContentResolver(), "android_id");
        SharedPreferences sharedPreferences = context.getSharedPreferences("Checkin", 0);
        String str = null;
        try {
            str = sharedPreferences.getString("android_id", (String) null);
        } catch (ClassCastException e) {
            try {
                long j3 = sharedPreferences.getLong("android_id", 0);
                if (j3 != 0) {
                    str = Long.toString(j3);
                }
            } catch (ClassCastException e2) {
                Log.w("GoogleSettingsUtils", "Exception while fetching event log AID as a long", e2);
            }
        }
        if (j2 != 0 || a2 != null || j != 0 || str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 91 + String.valueOf(str).length());
            sb.append("AID GSERVICES:");
            sb.append(j2);
            sb.append(",CR:");
            sb.append(a2);
            sb.append(",CHECKIN_ID_TOKEN:");
            sb.append(j);
            sb.append(",CHECKIN PREFS:");
            sb.append(str);
            gwd.b(sb.toString());
        }
    }
}
