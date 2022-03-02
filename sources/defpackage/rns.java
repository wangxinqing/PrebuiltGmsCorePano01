package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.UserHandle;
import android.provider.Settings;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.SettingInjectorService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* renamed from: rns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rns {
    public static final amsk b = amsk.a(',').a();
    private static Method c;
    private static Method d;
    private static rns e;
    public final Context a;
    private rmw f;
    private rnn g;
    private rny h;
    private rnp i;

    private rns(Context context) {
        this.a = context;
    }

    private static Method a(String str, Class... clsArr) {
        try {
            Method declaredMethod = LocationManager.class.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e2) {
            Log.e("LocationSettings", str.length() == 0 ? new String("unable to reflect ") : "unable to reflect ".concat(str), e2);
            return null;
        }
    }

    static boolean a(int i2) {
        return i2 == 2 || i2 == 3;
    }

    private final synchronized rnn b() {
        if (this.g == null) {
            this.g = new rnn(this);
        }
        return this.g;
    }

    public static int c(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b(context) ? 3 : 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0);
    }

    private final synchronized rnp d() {
        if (this.i == null) {
            this.i = new rnp(this.a, rnf.a);
        }
        return this.i;
    }

    public static boolean e(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    public static synchronized rns f(Context context) {
        rns rns;
        synchronized (rns.class) {
            if (e == null) {
                e = new rns(context.getApplicationContext());
            }
            rns = e;
        }
        return rns;
    }

    private final synchronized rny c() {
        if (this.h == null) {
            if (jkr.i()) {
                this.h = new roc(this.a, this);
            } else {
                this.h = new roa(this.a, this);
            }
        }
        return this.h;
    }

    public static boolean d(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), "wifi_scan_always_enabled", 0) == 1;
    }

    private final synchronized rmw a() {
        if (this.f == null) {
            if (jkr.i()) {
                if (ayap.n()) {
                    this.f = new rnc(this.a);
                }
            }
            this.f = new rna(this.a);
        }
        return this.f;
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((LocationManager) context.getSystemService(LocationManager.class)).isLocationEnabled();
        }
        return c(context) != 0;
    }

    public static void a(Context context, int i2, rnu rnu) {
        iva.a((Object) rnu);
        if (Build.VERSION.SDK_INT >= 28) {
            a(context, i2 != 0, rnu);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        try {
            Settings.Secure.putInt(context.getContentResolver(), "location_mode", i2);
        } catch (SecurityException e2) {
            Log.e("LocationSettings", "Google Play services lost WRITE_SECURE_SETTINGS permission!", e2);
        }
    }

    public static void a(Context context, String str, boolean z, rnu rnu) {
        iva.a((Object) rnu);
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedOperationException("providers may not be controlled from Q and above");
        } else if (Build.VERSION.SDK_INT >= 28) {
            if (ayap.o()) {
                if (d == null) {
                    d = a("setProviderEnabledForUser", String.class, Boolean.TYPE, UserHandle.class);
                }
                Method method = d;
                if (method != null) {
                    try {
                        method.invoke(context.getSystemService(LocationManager.class), new Object[]{str, Boolean.valueOf(z), Process.myUserHandle()});
                        return;
                    } catch (IllegalAccessException e2) {
                        Log.e("LocationSettings", "unable to access setProviderEnabledForUser", e2);
                    } catch (InvocationTargetException e3) {
                        Log.e("LocationSettings", "unable to invoke setProviderEnabledForUser", e3);
                    }
                }
            }
            try {
                Settings.Secure.setLocationProviderEnabled(context.getContentResolver(), str, z);
            } catch (SecurityException e4) {
                Log.e("LocationSettings", "Google Play services lost WRITE_SECURE_SETTINGS permission!", e4);
            }
        } else {
            try {
                Settings.Secure.setLocationProviderEnabled(context.getContentResolver(), str, z);
            } catch (SecurityException e5) {
                Log.e("LocationSettings", "Google Play services lost WRITE_SECURE_SETTINGS permission!", e5);
            }
        }
    }

    public static void a(Context context, boolean z, rnu rnu) {
        iva.a((Object) rnu);
        int i2 = 3;
        if (Build.VERSION.SDK_INT >= 28) {
            if (ayap.o()) {
                if (c == null) {
                    c = a("setLocationEnabledForUser", Boolean.TYPE, UserHandle.class);
                }
                Method method = c;
                if (method != null) {
                    try {
                        method.invoke(context.getSystemService(LocationManager.class), new Object[]{Boolean.valueOf(z), Process.myUserHandle()});
                        return;
                    } catch (IllegalAccessException e2) {
                        Log.e("LocationSettings", "unable to access setLocationEnabledForUser", e2);
                    } catch (InvocationTargetException e3) {
                        Log.e("LocationSettings", "unable to invoke setLocationEnabledForUser", e3);
                    }
                }
            }
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (!z) {
                    i2 = 0;
                }
                Settings.Secure.putInt(contentResolver, "location_mode", i2);
            } catch (SecurityException e4) {
                Log.e("LocationSettings", "Google Play services lost WRITE_SECURE_SETTINGS permission!", e4);
            }
        } else {
            if (!z) {
                i2 = 0;
            }
            a(context, i2, rnu);
        }
    }

    public static void a(Context context, boolean z, rnu rnu, int i2, int... iArr) {
        iva.a((Object) rnu);
        aeed.b(context.getContentResolver(), "network_location_opt_in", z ? 1 : 0);
        if (Build.VERSION.SDK_INT >= 29) {
            context.sendBroadcast(new Intent(SettingInjectorService.ACTION_INJECTED_SETTING_CHANGED));
        }
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.location.settings.AriLoggingIntentOperation", "com.google.android.location.settings.LOG_NLP_CONSENT");
        if (startIntent != null) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                startIntent.putExtra("source", i3);
                startIntent.putExtra("consent", z);
                startIntent.putExtra("textResources", iArr);
                context.startService(startIntent);
                return;
            }
            throw null;
        }
        Log.w("LocationSettings", "unable to ari log nlp consent", new IllegalStateException());
    }

    public static boolean a(Context context) {
        return aeed.a(context.getContentResolver(), "network_location_opt_in", 0) == 1;
    }

    public static boolean a(Context context, String str) {
        if ("network".equals(str)) {
            return a(context) && a(c(context));
        }
        if (!ayap.n() || !"fused".equals(str)) {
            return ((LocationManager) context.getSystemService("location")).isProviderEnabled(str);
        }
        return c(context) != 0;
    }

    public final void a(rng rng) {
        rmw rmw;
        synchronized (this) {
            rmw = this.f;
        }
        if (rmw != null) {
            synchronized (rmw.b) {
                if (rmw.b.remove(rng) != null && rmw.b.isEmpty()) {
                    rmw.b();
                }
            }
        }
    }

    public final void a(rng rng, Looper looper) {
        a(rng, (Executor) new jls(looper));
    }

    public final void a(rng rng, Executor executor) {
        rmw a2 = a();
        synchronized (a2.b) {
            if (a2.b.put(rng, executor) == null && a2.b.h == 1) {
                a2.a();
                a2.c = c(a2.a);
            }
        }
    }

    public final void a(rnh rnh) {
        rny rny;
        synchronized (this) {
            rny = this.h;
        }
        if (rny != null) {
            synchronized (rny.c) {
                if (rny.c.remove(rnh) != null && rny.c.isEmpty()) {
                    rny.b.a(rny.d);
                    rny.b.a(rny.e);
                    rny.b();
                    rny.f.clear();
                }
            }
        }
    }

    public final void a(rnh rnh, Looper looper) {
        jls jls = new jls(looper);
        rny c2 = c();
        synchronized (c2.c) {
            if (c2.c.isEmpty()) {
                c2.b.a(c2.d, Looper.getMainLooper());
                c2.b.a(c2.e, Looper.getMainLooper());
                c2.f.clear();
                c2.a();
                c2.g = a(c(c2.a));
                c2.h = a(c2.a);
                c2.c();
                if (c(c2.a) != 0) {
                    c2.b("passive", true);
                    c2.b("fused", true);
                }
            }
            c2.c.put(rnh, jls);
        }
    }

    @Deprecated
    public final void a(rni rni) {
        rnn rnn;
        synchronized (this) {
            rnn = this.g;
        }
        if (rnn != null) {
            synchronized (rnn.a) {
                if (rnn.a.remove(rni) != null && rnn.a.isEmpty()) {
                    rnn.d.a(rnn);
                    rnn.h.a(rnn.b);
                    rnn.h.a(rnn.c);
                }
            }
        }
    }

    @Deprecated
    public final void a(rni rni, Looper looper) {
        jls jls = new jls(looper);
        rnn b2 = b();
        synchronized (b2.a) {
            if (b2.a.isEmpty()) {
                b2.h.a(b2.b, Looper.getMainLooper());
                b2.h.a(b2.c, Looper.getMainLooper());
                b2.d.a(Settings.Secure.getUriFor("location_providers_allowed"), b2, new jls(Looper.getMainLooper()));
                b2.e.clear();
                b2.f = a(c(b2.h.a));
                b2.g = a(b2.h.a);
                if (b2.a()) {
                    b2.e.add("network");
                }
                String string = Settings.Secure.getString(b2.h.a.getContentResolver(), "location_providers_allowed");
                if (string != null) {
                    if (string.length() > 0) {
                        for (String str : b.a((CharSequence) string)) {
                            if (!"network".equals(str)) {
                                b2.e.add(str);
                            }
                        }
                    }
                }
            }
            b2.a.put(rni, jls);
        }
    }

    public final void a(rnr rnr) {
        rnp rnp;
        synchronized (this) {
            rnp = this.i;
        }
        if (rnp != null) {
            rnp.a(rnr);
        }
    }

    public final void a(rnr rnr, Looper looper) {
        a(rnr, (Executor) new jls(looper));
    }

    public final synchronized void a(rnr rnr, Executor executor) {
        d().a(Uri.withAppendedPath(aeed.b, "network_location_opt_in"), rnr, executor);
    }

    @Deprecated
    public final boolean a(String str) {
        rnn rnn;
        if (ayap.n()) {
            return a(this.a, str);
        }
        synchronized (this) {
            rnn = this.g;
        }
        if (rnn == null) {
            return a(this.a, str);
        }
        synchronized (rnn.a) {
            if (rnn.a.isEmpty()) {
                return a(rnn.h.a, str);
            }
            boolean contains = rnn.e.contains(str);
            return contains;
        }
    }
}
