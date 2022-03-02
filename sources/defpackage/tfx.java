package defpackage;

import android.content.Context;

/* renamed from: tfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tfx {
    public static arxj a(Context context) {
        arxi arxi = new arxi();
        jix.g(context);
        if (!jix.c(context) && !jix.b(context) && !jix.a(context)) {
            jix.h(context);
        }
        boolean z = true;
        arxi.a = true;
        if (kf.a(context, "android.permission.MANAGE_USERS") != 0) {
            z = false;
        } else if (!jkb.a(context).d()) {
            z = false;
        }
        arxi.b = Boolean.valueOf(z);
        String str = arxi.a == null ? " isBlackListDeviceType" : "";
        if (arxi.b == null) {
            str = str.concat(" isManagedProfile");
        }
        if (str.isEmpty()) {
            return new arwu(arxi.a.booleanValue(), arxi.b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }
}
