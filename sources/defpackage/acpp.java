package defpackage;

import android.content.Context;
import android.os.Process;

/* renamed from: acpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpp {
    public static boolean a(Context context) {
        return context.checkPermission("android.permission.READ_WIFI_CREDENTIAL", Process.myPid(), Process.myUid()) == 0;
    }
}
