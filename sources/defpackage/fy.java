package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: fy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fy {
    public static IBinder a(Bundle bundle, String str) {
        int i = Build.VERSION.SDK_INT;
        return bundle.getBinder(str);
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) {
        int i = Build.VERSION.SDK_INT;
        bundle.putBinder(str, iBinder);
    }
}
