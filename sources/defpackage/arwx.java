package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.StrictMode;
import android.text.TextUtils;

/* renamed from: arwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arwx {
    public static avbh a(Context context, amrm amrm) {
        int length;
        avbh avbh;
        if (Binder.getCallingUid() == 1000) {
            return avbh.BLUETOOTH_SETTINGS;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null && (length = packagesForUid.length) > 0) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitCustomSlowCalls().build());
            int i = 0;
            while (i < length) {
                try {
                    String str = packagesForUid[i];
                    if (!context.getPackageName().equals(str)) {
                        if (aymt.s().equals(str)) {
                            if (amrm.a(str)) {
                                avbh = avbh.GOOGLE_APPS;
                            }
                        }
                        i++;
                    } else {
                        avbh = avbh.GMS_SETTINGS;
                    }
                    return avbh;
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
            StrictMode.setThreadPolicy(threadPolicy);
            ((anih) ((anih) aryq.a.c()).a("arwx", "a", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("CommonUtils: uid:%d is not whitelisted and google signed", Binder.getCallingUid());
            return avbh.ENTRY_POINT_UNKNOWN;
        }
        ((anih) ((anih) aryq.a.c()).a("arwx", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("CommonUtils: can't find package for uid:%d", Binder.getCallingUid());
        return avbh.ENTRY_POINT_UNKNOWN;
    }

    public static String b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static boolean a(Context context, String str) {
        return !TextUtils.isEmpty(b(context, str));
    }

    public static boolean a(uaj uaj) {
        if ((uaj.a & Integer.MIN_VALUE) == 0) {
            return false;
        }
        auzo auzo = uaj.I;
        if (auzo == null) {
            auzo = auzo.j;
        }
        if ((auzo.a & 4) != 0) {
            avan avan = auzo.d;
            if (avan == null) {
                avan = avan.d;
            }
            if (!avan.a.isEmpty()) {
                avan avan2 = auzo.d;
                if (avan2 == null) {
                    avan2 = avan.d;
                }
                if (!avan2.b.isEmpty()) {
                    avan avan3 = auzo.d;
                    if (avan3 == null) {
                        avan3 = avan.d;
                    }
                    if (!avan3.c.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
