package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.LocationManager;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: arxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxk {
    public final Context a;

    public arxk(Context context) {
        this.a = context;
    }

    public static boolean a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean b() {
        BluetoothAdapter defaultAdapter;
        if (Build.VERSION.SDK_INT < 23 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || !defaultAdapter.isLeEnabled()) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        BluetoothAdapter defaultAdapter;
        if (!aynf.a.a().a() || Build.VERSION.SDK_INT < 23 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || !defaultAdapter.isBleScanAlwaysAvailable()) {
            return false;
        }
        return true;
    }

    public static Locale d() {
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleList.getDefault().get(0);
        }
        return Locale.getDefault();
    }

    public static boolean a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null || (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network"))) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context, arxj arxj) {
        if (aymq.a.a().w() && Build.VERSION.SDK_INT >= Math.max(19, (int) aymq.a.a().L())) {
            arwu arwu = (arwu) arxj;
            if (arwu.b || arwu.a || (!aymq.a.a().f() && !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean a(Context context, arxj arxj) {
        return b(context, arxj) && (a() || c()) && (a(context) || aymq.f());
    }

    public static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public final Bitmap a(int i) {
        return BitmapFactory.decodeResource(this.a.getResources(), i);
    }
}
