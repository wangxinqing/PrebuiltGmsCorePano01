package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: apeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apeo {
    public static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
    }
}
