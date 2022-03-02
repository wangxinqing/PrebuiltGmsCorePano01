package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: agdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agdo implements awdt {
    private final bapu a;
    private final bapu b;

    public agdo(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        String str;
        String str2;
        int i;
        int i2;
        amri b2 = ((ageg) this.b).a();
        aget aget = new aget();
        aget.a = (Application) ((awdu) this.a).a;
        if (b2.a()) {
            aget.b = ((aghb) b2.b()).a();
        }
        Context context = aget.a;
        amsv amsv = aget.b;
        amrl.a((Object) context);
        String packageName = context.getPackageName();
        int i3 = agjs.b;
        String packageName2 = context.getPackageName();
        String a2 = agjs.a();
        if (a2 == null || packageName2 == null || !a2.startsWith(packageName2)) {
            str = a2;
        } else {
            int length = packageName2.length();
            str = a2.length() != length ? a2.substring(length + 1) : null;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            str2 = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            anhn anhn = (anhn) ageu.a.c();
            anhn.a((Throwable) e);
            ((anhn) anhn.a("ageu", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get PackageInfo for: %s", (Object) packageName);
            str2 = null;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (!packageManager.hasSystemFeature("android.hardware.type.watch")) {
            int i5 = Build.VERSION.SDK_INT;
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        } else {
            i = 3;
        }
        if (Build.VERSION.SDK_INT < 23 || !packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            i2 = i;
        } else {
            i2 = 5;
        }
        ageu ageu = new ageu(packageName, str, str2, i2, 301303711L, new aekw(context), amsv);
        awdx.a((Object) ageu, "Cannot return null from a non-@Nullable @Provides method");
        return ageu;
    }
}
