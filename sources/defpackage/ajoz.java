package defpackage;

import android.content.Intent;

/* renamed from: ajoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajoz {
    public static boolean a(bjs bjs) {
        if (!jjm.c(bjs) || jjm.a(bjs)) {
            return false;
        }
        bjs.startActivityForResult(new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS"), 137);
        return true;
    }
}
