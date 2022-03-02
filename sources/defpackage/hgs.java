package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* renamed from: hgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgs {
    public static final ikz a = ikz.a("gms:chimera:dev_test_package", "");
    public static final ikz b = ikz.a("gms:chimera:dev_test_filter_rules", "");
    public final Set c;
    private final Context d;
    private final hya e;
    private final String f;
    private final boolean g;

    public hgs(Context context, hya hya) {
        String str;
        this.d = context;
        this.e = hya;
        if (ikz.b()) {
            str = (String) a.c();
        } else {
            str = "";
        }
        this.f = str;
        boolean z = !TextUtils.isEmpty(str);
        this.g = z;
        anax anax = null;
        if (z) {
            String str2 = (String) b.c();
            if (TextUtils.isEmpty(str2)) {
                Log.e("TestHelper", "No classloader filter rules were provided for testing");
            } else {
                anax = anax.a((Object[]) TextUtils.split(str2, ","));
            }
        }
        this.c = anax;
    }

    private final ApplicationInfo c() {
        if (!this.g) {
            return null;
        }
        String valueOf = String.valueOf(this.f);
        if (valueOf.length() == 0) {
            new String("Using testPackageName: ");
        } else {
            "Using testPackageName: ".concat(valueOf);
        }
        PackageManager packageManager = this.d.getPackageManager();
        if (this.e.b(packageManager.getPackageInfo(this.f, 64))) {
            return packageManager.getApplicationInfo(this.f, 0);
        }
        Log.e("TestHelper", String.format("Test package %s is not signed by Google, not adding  its APK path to the module's class path.", new Object[]{this.f}));
        return null;
    }

    public final String b() {
        ApplicationInfo c2 = c();
        if (c2 != null) {
            return c2.nativeLibraryDir;
        }
        return null;
    }

    public static hgs a(Context context) {
        CharSequence charSequence;
        if (ikz.b()) {
            charSequence = (CharSequence) a.c();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            return new hgs(context, hya.a(context));
        }
        return null;
    }

    public final String a() {
        ApplicationInfo c2 = c();
        if (c2 != null) {
            return c2.sourceDir;
        }
        return null;
    }
}
