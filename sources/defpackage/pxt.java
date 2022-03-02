package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: pxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pxt {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final ozs c;
    private final PackageManager d;
    private final ozb e;

    public pxt(PackageManager packageManager, ozs ozs, ozb ozb) {
        this.d = packageManager;
        this.c = ozs;
        this.e = ozb;
    }

    private final PackageInfo b(String str) {
        PackageInfo packageInfo;
        if (this.a.containsKey(str)) {
            return (PackageInfo) this.a.get(str);
        }
        try {
            packageInfo = this.d.getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            packageInfo = null;
        }
        this.a.put(str, packageInfo);
        return packageInfo;
    }

    /* access modifiers changed from: package-private */
    public final ozc a(String str) {
        PackageInfo b2 = b(str);
        if (b2 != null) {
            return this.e.a(b2.applicationInfo.uid, str, -1);
        }
        return null;
    }

    public final boolean a(String str, long j) {
        PackageInfo b2 = b(str);
        return b2 != null && b2.firstInstallTime < j;
    }
}
