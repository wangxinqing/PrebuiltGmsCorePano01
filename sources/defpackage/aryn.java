package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: aryn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryn {
    public static Intent a(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.devices.DevicesListActivity");
        className.setFlags(268435456);
        return className.putExtra("caller", 1).addFlags(32768);
    }
}
