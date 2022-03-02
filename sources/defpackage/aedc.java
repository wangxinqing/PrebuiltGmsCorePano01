package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: aedc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aedc extends jnh {
    private static final anax b = anax.a("com.android.vending", "com.google.android.gms", "com.google.android.apps.work.core", "com.google.android.apps.auth.test.support");

    public aedc(Context context) {
        super(context);
    }

    private final aecy b() {
        if (aecx.a()) {
            return aecy.a(this.a);
        }
        aecy.a();
        return null;
    }

    private final String e(String str) {
        aecy b2 = b();
        if (b2 != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("packageName", str);
                return b2.a("getApplicationLabel", bundle).getString("result");
            } catch (RemoteException e) {
            }
        }
        return null;
    }

    private static boolean f(String str) {
        anhj a = b.iterator();
        while (a.hasNext()) {
            if (((String) a.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final int a(String str) {
        if (aede.a(Binder.getCallingUid())) {
            return !b(Binder.getCallingUid(), str) ? -1 : 0;
        }
        return super.a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[SYNTHETIC, Splitter:B:13:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.oq c(java.lang.String r6) {
        /*
            r5 = this;
            oq r6 = super.c(r6)     // Catch:{ NameNotFoundException -> 0x0005 }
            return r6
        L_0x0005:
            r0 = move-exception
            java.lang.String r1 = r5.e(r6)
            if (r1 == 0) goto L_0x005a
            aecy r0 = r5.b()
            r2 = 0
            if (r0 == 0) goto L_0x002d
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ RemoteException -> 0x002c }
            r3.<init>()     // Catch:{ RemoteException -> 0x002c }
            java.lang.String r4 = "packageName"
            r3.putString(r4, r6)     // Catch:{ RemoteException -> 0x002c }
            java.lang.String r6 = "getApplicationIcon"
            android.os.Bundle r6 = r0.a(r6, r3)     // Catch:{ RemoteException -> 0x002c }
            java.lang.String r0 = "result"
            android.os.Parcelable r6 = r6.getParcelable(r0)     // Catch:{ RemoteException -> 0x002c }
            android.os.ParcelFileDescriptor r6 = (android.os.ParcelFileDescriptor) r6     // Catch:{ RemoteException -> 0x002c }
            goto L_0x002e
        L_0x002c:
            r6 = move-exception
        L_0x002d:
            r6 = r2
        L_0x002e:
            if (r6 == 0) goto L_0x0054
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ all -> 0x004d }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0)     // Catch:{ all -> 0x004d }
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r5.a     // Catch:{ all -> 0x004d }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ all -> 0x004d }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x004d }
            oq r0 = defpackage.oq.a(r1, r2)     // Catch:{ all -> 0x004d }
            r6.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004c
        L_0x004b:
            r6 = move-exception
        L_0x004c:
            return r0
        L_0x004d:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r6 = move-exception
        L_0x0053:
            throw r0
        L_0x0054:
            oq r6 = defpackage.oq.a(r1, r2)
            return r6
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aedc.c(java.lang.String):oq");
    }

    public final PackageInfo d(String str, int i) {
        if (!aede.a(i)) {
            return super.b(str, 64);
        }
        return b(str, 64);
    }

    public final int a(String str, int i, int i2) {
        if (aede.a(i2)) {
            return !b(i2, str) ? -1 : 0;
        }
        return super.a(str, i, i2);
    }

    private final boolean b(int i, String str) {
        aecy b2 = b();
        if (b2 != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("uid", i);
                bundle.putString("permissionName", str);
                return b2.a("hasPermission", bundle).getBoolean("result");
            } catch (RemoteException e) {
            }
        }
        return false;
    }

    public final int a(String str, int i, int i2, String str2) {
        if (aede.a(i2)) {
            return !b(i2, str) ? -1 : 0;
        }
        return super.a(str, i, i2, str2);
    }

    private final String[] b(int i) {
        aecy b2 = b();
        if (b2 != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("uid", i);
                String string = b2.a("getAppPackageForUid", bundle).getString("result");
                if (string != null) {
                    return new String[]{string};
                }
            } catch (RemoteException e) {
            }
        }
        return null;
    }

    public final int a(String str, String str2) {
        aecy b2;
        int a = super.a(str, str2);
        if (!(a == 0 || f(str2) || (b2 = b()) == null)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("packageName", str2);
                bundle.putString("permissionName", str);
                if (b2.a("packageHasPermission", bundle).getBoolean("result")) {
                    return 0;
                }
            } catch (RemoteException e) {
            }
        }
        return a;
    }

    public final ComponentName b(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null && callingActivity.getPackageName().equals("com.google.android.instantapps.supervisor")) {
            String className = callingActivity.getClassName();
            aecy b2 = b();
            ComponentName componentName = null;
            if (b2 != null) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("shadowActivity", className);
                    componentName = (ComponentName) b2.a("getCallingActivity", bundle).getParcelable("result");
                } catch (RemoteException e) {
                }
            }
            if (componentName != null) {
                return componentName;
            }
        }
        return callingActivity;
    }

    public final ApplicationInfo a(String str, int i) {
        aecy b2;
        try {
            return super.a(str, i);
        } catch (PackageManager.NameNotFoundException e) {
            ApplicationInfo applicationInfo = null;
            if (!f(str) && (b2 = b()) != null) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("packageName", str);
                    bundle.putInt("flags", i);
                    applicationInfo = (ApplicationInfo) b2.a("getWHApplicationInfo", bundle).getParcelable("result");
                } catch (RemoteException e2) {
                }
            }
            if (applicationInfo != null) {
                return applicationInfo;
            }
            throw e;
        }
    }

    public final boolean c(String str, int i) {
        if (!aede.a(Binder.getCallingUid())) {
            return true;
        }
        int callingUid = Binder.getCallingUid();
        aecy b2 = b();
        if (b2 == null) {
            return true;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("uid", callingUid);
            bundle.putString("packageName", str);
            bundle.putInt("serviceId", i);
            return b2.a("allowApiAccess", bundle).getBoolean("result");
        } catch (RemoteException e) {
            return true;
        }
    }

    public final PackageInfo b(String str, int i) {
        aecy b2;
        try {
            return super.b(str, i);
        } catch (PackageManager.NameNotFoundException e) {
            PackageInfo packageInfo = null;
            if (!f(str) && (b2 = b()) != null) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("packageName", str);
                    bundle.putInt("flags", i);
                    packageInfo = (PackageInfo) b2.a("getWHPackageInfo", bundle).getParcelable("result");
                } catch (RemoteException e2) {
                }
            }
            if (packageInfo != null) {
                return packageInfo;
            }
            throw e;
        }
    }

    public final String a(Activity activity) {
        ComponentName b2 = b(activity);
        if (b2 != null) {
            return b2.getPackageName();
        }
        return null;
    }

    public final boolean a() {
        int callingUid = Binder.getCallingUid();
        return aede.a(callingUid) && b(callingUid) != null;
    }

    public final boolean a(int i, String str) {
        if (!aede.a(i)) {
            return super.a(i, str);
        }
        aecy b2 = b();
        if (b2 == null) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("uid", i);
            bundle.putString("packageName", str);
            return b2.a("checkAppPackage", bundle).getBoolean("result");
        } catch (RemoteException e) {
            return false;
        }
    }

    public final CharSequence b(String str) {
        try {
            return super.b(str);
        } catch (PackageManager.NameNotFoundException e) {
            String e2 = e(str);
            if (e2 != null) {
                return e2;
            }
            throw e;
        }
    }

    public final String[] a(int i) {
        if (aede.a(i)) {
            return b(i);
        }
        return super.a(i);
    }
}
