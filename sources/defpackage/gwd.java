package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: gwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwd {
    static String a(Context context) {
        try {
            return new String(jjt.b((InputStream) context.openFileInput("checkin_id_token")), amqn.c);
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            Log.w("CheckinUtil", "Error reading file: checkin_id_token", e2);
            return null;
        }
    }

    public static long b(Context context) {
        long j;
        if (awrq.h()) {
            j = c(context);
        } else {
            j = 0;
        }
        if (j == 0) {
            j = d(context);
        }
        return j == 0 ? e(context) : j;
    }

    static long c(Context context) {
        String a = a(context);
        if (a == null || !a(a)) {
            return 0;
        }
        try {
            return Long.parseLong(a.split(":")[1]);
        } catch (Exception e) {
            Log.w("CheckinUtil", "Exception while parsing Security token from id", e);
            return 0;
        }
    }

    static long d(Context context) {
        try {
            return gwe.a(context).getSharedPreferences("CheckinService", 0).getLong("CheckinTask_securityToken", 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("CheckinUtil", "Cannot read token, failed to find GoogleServicesFramework package");
            return 0;
        }
    }

    public static boolean f(Context context) {
        if (!jkr.b() || context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static String g(Context context) {
        return context.getSharedPreferences("Checkin", 0).getString("CheckinService_deviceDataVersionInfo", (String) null);
    }

    public static hal h(Context context) {
        try {
            if (!TextUtils.isEmpty(Build.PRODUCT)) {
                if (Build.PRODUCT.startsWith("glass_")) {
                    Log.i("CheckinUtil", "Classify the device as Glass.");
                    return hal.GLASS;
                }
            }
            jix.h(context);
            Log.i("CheckinUtil", "Classify the device as TV.");
            return hal.TV;
        } catch (Exception e) {
            Log.e("CheckinUtil", "Could not determinate device sub type!", e);
            return hal.OTHER;
        }
    }

    public static String i(Context context) {
        return context.getSharedPreferences("Checkin", 0).getString("CheckinService_lastSimOperator", "");
    }

    public static long j(Context context) {
        return context.getSharedPreferences("Checkin", 0).getLong("CheckinService_lastCheckinSuccessTime", 0);
    }

    static long e(Context context) {
        long j = 0;
        try {
            DataInputStream dataInputStream = new DataInputStream(gwe.a(context).openFileInput("security_token"));
            j = dataInputStream.readLong();
            try {
                dataInputStream.close();
            } catch (PackageManager.NameNotFoundException e) {
            } catch (FileNotFoundException e2) {
            } catch (IOException e3) {
                e = e3;
                Log.w("CheckinUtil", "Error reading backup security token file", e);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("CheckinUtil", "Cannot read token from Backup file, failed to find GoogleServicesFramework package");
        } catch (FileNotFoundException e5) {
        } catch (IOException e6) {
            e = e6;
            Log.w("CheckinUtil", "Error reading backup security token file", e);
        }
        return j;
    }

    public static void b(String str) {
        EventLog.writeEvent(70220, str);
    }

    public static void a(int i) {
        EventLog.writeEvent(70220, i);
    }

    public static void a(Object... objArr) {
        EventLog.writeEvent(70220, objArr);
    }

    public static boolean a(String str) {
        String[] split = str.split(":");
        if (split.length != 2) {
            Log.w("CheckinUtil", str.length() == 0 ? new String("Invalid id-token:") : "Invalid id-token:".concat(str));
            b("Invalid id-token");
            return false;
        }
        try {
            Long.parseLong(split[0]);
            Long.parseLong(split[1]);
            return true;
        } catch (NumberFormatException e) {
            Log.w("CheckinUtil", "NumberFormatException while parsing id-token", e);
            b(str.length() == 0 ? new String("NumberFormatException while parsing id-token:") : "NumberFormatException while parsing id-token:".concat(str));
            return false;
        }
    }
}
