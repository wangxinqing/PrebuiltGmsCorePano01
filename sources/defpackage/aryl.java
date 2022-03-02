package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: aryl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryl {
    public static Intent a(Context context, Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.putExtra("overlay", true);
        intent2.putExtra("callerId", context.getPackageName());
        Intent intent3 = new Intent();
        intent3.setClassName(context.getPackageName(), "com.google.android.gms.nearby.discovery.fastpair.CompanionAppInstallActivity");
        intent3.putExtra("intent", intent2);
        return intent3;
    }
}
