package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.gms.libs.accountsettings.utils.DarkThemeManager$1;

/* renamed from: qud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qud implements z {
    public static Boolean a;
    public static Boolean b;
    public final bjs c;
    public final boolean d;
    private final boolean e;
    private BroadcastReceiver f;

    public qud(bjs bjs, int i, int i2, int i3) {
        this.c = bjs;
        boolean z = false;
        if (i3 == 2) {
            b = false;
        } else if (i3 == 3) {
            b = true;
        }
        this.e = i3 != 1 ? true : z;
        if (i()) {
            this.f = new DarkThemeManager$1(this, "accountsettings/lib");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            bjs.registerReceiver(this.f, intentFilter);
            bjs.getLifecycle().a(this);
        }
        a = Boolean.valueOf(f());
        boolean h = h();
        this.d = h;
        bjs.setTheme(h ? i2 : i);
    }

    public static boolean a(boolean z, boolean z2) {
        if (!Boolean.valueOf(awgy.e()).booleanValue() || !i()) {
            return false;
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!z2 && !z) {
            return false;
        }
        return true;
    }

    public static boolean f() {
        if (i()) {
            return ((PowerManager) ihs.b().getSystemService("power")).isPowerSaveMode();
        }
        return false;
    }

    public static boolean g() {
        return (ihs.b().getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean h() {
        boolean a2;
        synchronized (qud.class) {
            if (a == null) {
                a = Boolean.valueOf(f());
            }
            a2 = a(a.booleanValue(), g());
        }
        return a2;
    }

    private static boolean i() {
        if (jkr.g()) {
            return true;
        }
        if (!awgs.a.a().d()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void a(aj ajVar) {
        if (jkr.g()) {
            this.c.unregisterReceiver(this.f);
        }
        a = null;
        if (this.e) {
            b = null;
        }
    }
}
