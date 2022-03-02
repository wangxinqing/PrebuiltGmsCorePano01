package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: acpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpo {
    private static final iwd a = acqa.a("Utils", "PackageVerifier");
    private final Context b;
    private final PackageManager c;

    public acpo(Context context) {
        iva.a((Object) context, (Object) "context cannot be null.");
        this.b = context;
        this.c = context.getPackageManager();
    }

    public final boolean a(String str) {
        iva.a(str, (Object) "name cannot be null or empty.");
        try {
            PackageInfo packageInfo = this.c.getPackageInfo(str, 0);
            return (packageInfo == null || (packageInfo.applicationInfo.flags & 1) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException e) {
            a.d(String.format("Could not find package [%s]", new Object[]{str}), e, new Object[0]);
        }
    }

    public final boolean b(String str) {
        return hya.a(this.b).b(str);
    }
}
