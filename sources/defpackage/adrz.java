package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: adrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrz {
    @Deprecated
    public static final ibq a = new ibq("UsageReporting.API", c, b);
    private static final ibg b = new ibg();
    private static final ibn c = new adrv();

    public static iby a(Context context, adry adry) {
        return new iby(context, adry);
    }

    public static iby b(Context context) {
        return new iby(context, (adry) null);
    }

    public static boolean a(Context context) {
        int i = adth.a;
        return !context.getPackageManager().queryIntentServices(new Intent("com.google.android.gms.usagereporting.service.START").setPackage("com.google.android.gms"), 0).isEmpty();
    }
}
