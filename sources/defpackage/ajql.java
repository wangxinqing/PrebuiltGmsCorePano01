package defpackage;

import android.content.Context;
import android.os.Binder;

/* renamed from: ajql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajql {
    public static int a(Context context) {
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        if (jni.b(context).a("android.permission.ACCESS_FINE_LOCATION", callingPid, callingUid) != 0) {
            return jni.b(context).a("android.permission.ACCESS_COARSE_LOCATION", callingPid, callingUid) == 0 ? 1 : 0;
        }
        return 2;
    }
}
