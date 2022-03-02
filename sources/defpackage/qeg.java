package defpackage;

import android.content.pm.PackageManager;

/* renamed from: qeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qeg {
    public static final qfn a = new qfn("DevManagerStatus");
    public static Boolean b = null;
    public static final Object c = new Object();
    private final PackageManager d;

    public qeg(PackageManager packageManager) {
        this.d = packageManager;
        a(packageManager);
    }

    private static boolean a(PackageManager packageManager) {
        synchronized (c) {
            if (b != null) {
                boolean booleanValue = b.booleanValue();
                return booleanValue;
            }
            try {
                packageManager.getPackageInfo("com.google.android.instantapps.devman", 0);
                b = true;
            } catch (PackageManager.NameNotFoundException e) {
                b = false;
            }
            boolean booleanValue2 = b.booleanValue();
            return booleanValue2;
        }
    }

    public final boolean a() {
        return a(this.d);
    }
}
