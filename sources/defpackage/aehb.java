package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.util.Log;

/* renamed from: aehb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aehb {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("battery_status_update").build();

    static {
        Log.isLoggable("FPDeviceDetailConnUtil", 4);
    }

    public static void a(Context context) {
        context.getContentResolver().notifyChange(a, (ContentObserver) null);
    }
}
