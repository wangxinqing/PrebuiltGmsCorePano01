package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.location.WifiScan;
import java.lang.reflect.Method;

/* renamed from: rev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rev {
    private static final Method a;

    private static int a(Location location, String str, int i) {
        Bundle extras = location.getExtras();
        return extras != null ? extras.getInt(str, i) : i;
    }

    public static void b(Location location, String str) {
        a(location, "levelId", str);
    }

    public static void c(Location location, String str) {
        a(location, "floorLabel", str);
    }

    public static Integer d(Location location) {
        int a2 = a(location, "levelNumberE3", -1);
        if (a2 != -1) {
            return Integer.valueOf(a2);
        }
        return null;
    }

    public static String e(Location location) {
        return e(location, "floorLabel");
    }

    public static boolean f(Location location) {
        return d(location, "floorLabel");
    }

    public static boolean g(Location location) {
        if (Build.VERSION.SDK_INT < 26 || !location.hasVerticalAccuracy()) {
            return d(location, "verticalAccuracy");
        }
        return true;
    }

    public static float h(Location location) {
        if (Build.VERSION.SDK_INT >= 26 && location.hasVerticalAccuracy()) {
            return location.getVerticalAccuracyMeters();
        }
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.getFloat("verticalAccuracy", -1.0f);
        }
        return -1.0f;
    }

    public static int i(Location location) {
        return a(location, "locationType", 0);
    }

    static {
        Method method;
        int i = Build.VERSION.SDK_INT;
        try {
            method = Location.class.getMethod("setIsFromMockProvider", new Class[]{Boolean.TYPE});
        } catch (Exception e) {
            method = null;
        }
        a = method;
    }

    private static void b(Location location, String str, int i) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putInt(str, i);
        a(location, extras);
    }

    public static boolean c(Location location) {
        return d(location, "levelNumberE3");
    }

    private static String e(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.getString(str);
        }
        return null;
    }

    public static boolean j(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null && extras.getBoolean("mockLocation", false)) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        return location.isFromMockProvider();
    }

    public static void k(Location location) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putBoolean("mockLocation", true);
        a(location, extras);
        Method method = a;
        if (method != null) {
            try {
                method.invoke(location, new Object[]{true});
            } catch (Exception e) {
            }
        }
    }

    public static boolean d(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.containsKey(str);
        }
        return false;
    }

    public static Location a(Location location, String str) {
        Parcelable parcelable;
        Bundle extras = location.getExtras();
        if (extras != null) {
            parcelable = extras.getParcelable(str);
        } else {
            parcelable = null;
        }
        return (Location) parcelable;
    }

    public static boolean b(Location location) {
        return d(location, "levelId");
    }

    public static String a(Location location) {
        return e(location, "levelId");
    }

    public static void a(Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            location.setVerticalAccuracyMeters(f);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putFloat("verticalAccuracy", f);
        a(location, extras);
    }

    public static void a(Location location, int i) {
        b(location, "locationType", i);
    }

    private static void a(Location location, Bundle bundle) {
        if (bundle.isEmpty()) {
            bundle = null;
        }
        location.setExtras(bundle);
    }

    public static void a(Location location, WifiScan wifiScan) {
        byte[] bArr;
        if (wifiScan != null) {
            bArr = ivy.a(wifiScan);
        } else {
            bArr = null;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            if (bArr != null) {
                extras = new Bundle();
            } else {
                return;
            }
        }
        if (bArr == null) {
            extras.remove("wifiScan");
        } else {
            extras.putByteArray("wifiScan", bArr);
        }
        a(location, extras);
    }

    public static void a(Location location, Integer num) {
        if (num != null) {
            b(location, "levelNumberE3", num.intValue());
            return;
        }
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove("levelNumberE3");
            a(location, extras);
        }
    }

    public static void a(Location location, String str, Location location2) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putParcelable(str, location2);
        a(location, extras);
    }

    private static void a(Location location, String str, String str2) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            if (str2 != null) {
                extras = new Bundle();
            } else {
                return;
            }
        }
        if (str2 == null) {
            extras.remove(str);
        } else {
            extras.putString(str, str2);
        }
        a(location, extras);
    }
}
