package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: svi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svi {
    final svv a;

    public svi(svv svv) {
        this.a = svv;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        String str2;
        if (str != null && !str.isEmpty()) {
            this.a.p();
            if (!a()) {
                this.a.E().i.a("Install Referrer Reporter is not available");
                return;
            }
            svh svh = new svh(this, str);
            this.a.p();
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            PackageManager packageManager = this.a.a.getPackageManager();
            if (packageManager == null) {
                this.a.E().g.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                return;
            }
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                this.a.E().i.a("Play Service for fetching Install Referrer is unavailable on device");
                return;
            }
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str3 = resolveInfo.serviceInfo.packageName;
                if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str3) || !a()) {
                    this.a.E().f.a("Play Store version 8.3.73 or higher required for Install Referrer");
                    return;
                }
                try {
                    boolean a2 = jca.a().a(this.a.a, new Intent(intent), svh, 1);
                    sur sur = this.a.E().k;
                    if (!a2) {
                        str2 = "not available";
                    } else {
                        str2 = "available";
                    }
                    sur.a("Install Referrer Service is", str2);
                } catch (Exception e) {
                    this.a.E().c.a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        } else {
            this.a.E().g.a("Install Referrer Reporter was called with invalid app package name");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        try {
            jnh b = jni.b(this.a.a);
            if (b == null) {
                this.a.E().k.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (b.b("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.a.E().k.a("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
