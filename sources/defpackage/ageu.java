package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: ageu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ageu {
    public static final anhq a = anhq.a("ageu");
    public final String b;
    public final String c;
    public final String d;
    public final aekw e;
    public final long f;
    public final Long g;
    public final amsv h;
    public final int i;

    public ageu(String str, String str2, String str3, int i2, Long l, aekw aekw, amsv amsv) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.i = i2;
        this.g = l;
        this.e = aekw;
        this.f = aekw.a().getTotalSpace() / 1024;
        this.h = amsv;
    }

    public static ageu a(Context context, amsv amsv) {
        int i2;
        amrl.a((Object) context);
        String packageName = context.getPackageName();
        int i3 = agjs.b;
        String packageName2 = context.getPackageName();
        String a2 = agjs.a();
        String str = null;
        if (!(a2 == null || packageName2 == null || !a2.startsWith(packageName2))) {
            int length = packageName2.length();
            a2 = a2.length() != length ? a2.substring(length + 1) : null;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            str = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            anhn anhn = (anhn) a.c();
            anhn.a((Throwable) e2);
            ((anhn) anhn.a("ageu", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get PackageInfo for: %s", (Object) packageName);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (!packageManager.hasSystemFeature("android.hardware.type.watch")) {
            int i5 = Build.VERSION.SDK_INT;
            i2 = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        } else {
            i2 = 3;
        }
        if (Build.VERSION.SDK_INT >= 23 && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            i2 = 5;
        }
        return new ageu(packageName, a2, str, i2, 301303711L, new aekw(context), amsv);
    }
}
