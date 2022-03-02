package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: spg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class spg extends swl {
    public spf a = spe.a;
    public Boolean b;
    private Boolean c;

    public spg(svv svv) {
        super(svv);
    }

    public static final long l() {
        return ((Long) sud.d.a()).longValue();
    }

    public static final long m() {
        return (long) ((Integer) sud.k.a()).intValue();
    }

    public static final long n() {
        return ((Long) sud.D.a()).longValue();
    }

    static final void o() {
        ayib.c();
    }

    public static final void p() {
        ayib.c();
    }

    public final int a(String str) {
        return a(str, sud.o);
    }

    public final long b() {
        return u().a ? 201216 : 24000;
    }

    /* access modifiers changed from: package-private */
    public final Bundle c() {
        try {
            if (z().getPackageManager() == null) {
                E().c.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a2 = jni.b(z()).a(z().getPackageName(), 128);
            if (a2 != null) {
                return a2.metaData;
            }
            E().c.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            E().c.a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final boolean d() {
        Boolean b2;
        if (u().a || (b2 = b("firebase_analytics_collection_deactivated")) == null || !b2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final Boolean e() {
        if (!u().a) {
            return b("firebase_analytics_collection_enabled");
        }
        return null;
    }

    public final Boolean f() {
        i();
        Boolean b2 = b("google_analytics_adid_collection_enabled");
        boolean z = true;
        if (b2 != null && !b2.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final String g() {
        return a("debug.firebase.analytics.app", "");
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        if (this.c == null) {
            Boolean b2 = b("app_measurement_lite");
            this.c = b2;
            if (b2 == null) {
                this.c = false;
            }
        }
        if (this.c.booleanValue() || !this.x.e) {
            return true;
        }
        return false;
    }

    public final int a(String str, suc suc) {
        if (str == null) {
            return ((Integer) suc.a()).intValue();
        }
        String a2 = this.a.a(str, suc.a);
        if (TextUtils.isEmpty(a2)) {
            return ((Integer) suc.a()).intValue();
        }
        try {
            return ((Integer) suc.a(Integer.valueOf(Integer.parseInt(a2)))).intValue();
        } catch (NumberFormatException e) {
            return ((Integer) suc.a()).intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean b(String str) {
        iva.c(str);
        Bundle c2 = c();
        if (c2 == null) {
            E().c.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (c2.containsKey(str)) {
            return Boolean.valueOf(c2.getBoolean(str));
        } else {
            return null;
        }
    }

    public final boolean d(String str) {
        return "1".equals(this.a.a(str, "gaia_collection_enabled"));
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return !u().a ? "FA" : "FA-SVC";
    }

    public final String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            E().c.a("Could not find SystemProperties class", e);
            return str2;
        } catch (NoSuchMethodException e2) {
            E().c.a("Could not find SystemProperties.get() method", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            E().c.a("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            E().c.a("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    public final boolean b(String str, suc suc) {
        if (str == null) {
            return ((Boolean) suc.a()).booleanValue();
        }
        String a2 = this.a.a(str, suc.a);
        if (TextUtils.isEmpty(a2)) {
            return ((Boolean) suc.a()).booleanValue();
        }
        return ((Boolean) suc.a(Boolean.valueOf(Boolean.parseBoolean(a2)))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final List c(String str) {
        Integer num;
        iva.c(str);
        Bundle c2 = c();
        if (c2 == null) {
            E().c.a("Failed to load metadata: Metadata bundle is null");
            num = null;
        } else {
            num = c2.containsKey(str) ? Integer.valueOf(c2.getInt(str)) : null;
        }
        if (num == null) {
            return null;
        }
        try {
            String[] stringArray = z().getResources().getStringArray(num.intValue());
            if (stringArray != null) {
                return Arrays.asList(stringArray);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            E().c.a("Failed to load string array from metadata: resource not found", e);
            return null;
        }
    }

    public final boolean a(suc suc) {
        return b((String) null, suc);
    }
}
