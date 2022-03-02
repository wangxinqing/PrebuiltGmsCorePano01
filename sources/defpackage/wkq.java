package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: wkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wkq {
    static final ibg a = new ibg();
    static final ibn b = new wkp();

    static {
        new ibq("Pay.API", b, a);
    }

    public static boolean a(Context context) {
        return new Intent().setAction("com.google.android.gms.pay.PAY_OPTIONAL").setPackage("com.google.android.gms").resolveActivity(context.getApplicationContext().getPackageManager()) != null;
    }
}
