package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.util.Log;

/* renamed from: qgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgn {
    private static qgn b;
    public final Context a;

    private qgn(Context context) {
        this.a = context;
    }

    public static synchronized qgn a(Context context) {
        qgn qgn;
        synchronized (qgn.class) {
            Context a2 = qfu.a(context);
            if (b == null || b.a != a2) {
                int i = Build.VERSION.SDK_INT;
                qgn qgn2 = null;
                try {
                    PackageInfo packageInfo = a2.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    if (!hya.a(a2).b(packageInfo)) {
                        String valueOf = String.valueOf(packageInfo.packageName);
                        Log.e("InstantAppsApi", valueOf.length() == 0 ? new String("Incorrect signature for package ") : "Incorrect signature for package ".concat(valueOf));
                    } else {
                        ProviderInfo resolveContentProvider = a2.getPackageManager().resolveContentProvider(qgo.a.getAuthority(), 0);
                        if (resolveContentProvider != null) {
                            if (!resolveContentProvider.packageName.equals("com.google.android.gms")) {
                                String str = resolveContentProvider.packageName;
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85);
                                sb.append("Package ");
                                sb.append(str);
                                sb.append(" is invalid for instant apps content provider; instant apps will be disabled.");
                                Log.e("IAMetadataClient", sb.toString());
                            } else {
                                qgn2 = new qgn(a2);
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
                b = qgn2;
            }
            qgn = b;
        }
        return qgn;
    }

    public static synchronized void a() {
        synchronized (qgn.class) {
            b = null;
        }
    }
}
