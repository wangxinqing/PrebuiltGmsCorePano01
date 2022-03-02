package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.location.internal.LocationSettings$1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* renamed from: aioi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aioi {
    public final Context a;
    public final WifiManager b;
    public final PackageManager c = this.a.getPackageManager();
    public final ContentResolver d = this.a.getContentResolver();
    public final UserManager e;
    public final BluetoothAdapter f;
    private final LocationManager g = ((LocationManager) this.a.getSystemService("location"));
    private final UserHandle h;

    public aioi(Context context) {
        UserHandle userHandle;
        this.a = context;
        this.b = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        int i = Build.VERSION.SDK_INT;
        this.e = (UserManager) this.a.getSystemService("user");
        if (this.c.hasSystemFeature("android.hardware.bluetooth_le")) {
            this.f = ((BluetoothManager) this.a.getSystemService("bluetooth")).getAdapter();
        } else {
            this.f = null;
        }
        int i2 = Build.VERSION.SDK_INT;
        Iterator<UserHandle> it = this.e.getUserProfiles().iterator();
        while (true) {
            if (!it.hasNext()) {
                userHandle = null;
                break;
            }
            userHandle = it.next();
            if (userHandle.isOwner()) {
                break;
            }
        }
        if (userHandle == null || Process.myUserHandle().equals(userHandle)) {
            this.h = null;
        } else {
            this.h = userHandle;
        }
    }

    public final void a(int i, aiol aiol, int i2, int... iArr) {
        if (this.h != null) {
            Context context = this.a;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, "com.google.android.location.internal.LocationProviderEnabler"));
            intent.putExtra("locationMode", i);
            int i3 = i2 - 1;
            if (i2 != 0) {
                intent.putExtra("source", i3);
                intent.putExtra("textResources", iArr);
                this.a.sendOrderedBroadcastAsUser(intent, this.h, "android.permission.WRITE_SECURE_SETTINGS", new LocationSettings$1("location", aiol), (Handler) null, 0, (String) null, (Bundle) null);
                return;
            }
            throw null;
        }
        if (i == 3 || i == 2) {
            rns.a(this.a, true, rnu.a, i2, iArr);
        }
        rns.a(this.a, i, rnu.a);
        if (aiol != null) {
            aiol.a();
        }
    }

    public final boolean b() {
        return this.c.hasSystemFeature("android.hardware.location.gps");
    }

    public final boolean c() {
        if (ayap.b()) {
            return rns.a(this.a, "network");
        }
        return this.g.isProviderEnabled("network");
    }

    public final boolean d() {
        return this.c.hasSystemFeature("android.hardware.location.network");
    }

    public final boolean e() {
        return this.f != null;
    }

    public final boolean g() {
        if ((Build.VERSION.SDK_INT <= 23 && !"N".equals(Build.VERSION.CODENAME)) || this.e == null) {
            return false;
        }
        Class<UserManager> cls = UserManager.class;
        Class<UserHandle> cls2 = UserHandle.class;
        try {
            Method method = cls2.getMethod("of", new Class[]{Integer.TYPE});
            Method method2 = cls.getMethod("hasBaseUserRestriction", new Class[]{String.class, UserHandle.class});
            Object[] objArr = {Integer.valueOf(UserHandle.myUserId())};
            return ((Boolean) method2.invoke(this.e, new Object[]{"no_share_location", (UserHandle) method.invoke((Object) null, objArr)})).booleanValue();
        } catch (NoSuchMethodException e2) {
            if (!Log.isLoggable("LocationSettings", 6)) {
                return false;
            }
            Log.e("LocationSettings", "Method not found.", e2);
            return false;
        } catch (ClassCastException | IllegalAccessException | InvocationTargetException e3) {
            if (!Log.isLoggable("LocationSettings", 6)) {
                return false;
            }
            Log.e("LocationSettings", "Method invocation failed.", e3);
            return false;
        }
    }

    public final boolean h() {
        return jjm.a(this.a);
    }

    public final boolean i() {
        BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }

    public final boolean j() {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(this.a.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public final boolean f() {
        if (!jkr.b() || Settings.Global.getInt(this.d, "ble_scan_always_enabled", 0) != 1 || j()) {
            return false;
        }
        return true;
    }

    public final boolean a() {
        if (ayap.b()) {
            return rns.a(this.a, "gps");
        }
        return this.g.isProviderEnabled("gps");
    }

    public final boolean a(String str) {
        UserManager userManager = this.e;
        if (userManager != null) {
            return userManager.hasUserRestriction(str);
        }
        return false;
    }
}
