package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: acpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpn {
    private final PackageManager a;

    public acpn(Context context) {
        iva.a((Object) context);
        this.a = context.getPackageManager();
    }

    public final boolean a(String str) {
        iva.a((Object) str);
        try {
            this.a.getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
