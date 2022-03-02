package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: ybj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybj {
    public static String a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("feed");
        }
        return null;
    }

    public static int b(Bundle bundle) {
        if (bundle == null) {
            return 3;
        }
        if (ayws.b() && bundle.getBoolean("container_update", false)) {
            return 5;
        }
        if (ayws.d() && bundle.getBoolean("db_upgrade", false)) {
            return 6;
        }
        if (ayws.c() && bundle.getBoolean("db_downgrade", false)) {
            return 7;
        }
        if (!TextUtils.isEmpty(a(bundle))) {
            return 2;
        }
        if (aywp.c() && bundle.getBoolean("periodic_gcm", false)) {
            return 8;
        }
        if (!bundle.getBoolean("periodic_sync", false)) {
            return bundle.getBoolean("upload", false) ? 4 : 3;
        }
        return 1;
    }
}
