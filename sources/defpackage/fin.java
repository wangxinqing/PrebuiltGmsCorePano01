package defpackage;

import android.content.pm.PackageManager;
import java.util.concurrent.TimeUnit;

/* renamed from: fin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fin implements fcu {
    private final String a;

    public fin(String str) {
        iva.c(str);
        this.a = str;
    }

    public final aorr a(fde fde) {
        try {
            ((fgy) fgy.a.a()).a(this.a, 0, TimeUnit.MINUTES);
            return aorl.a((Object) null);
        } catch (PackageManager.NameNotFoundException e) {
            throw qbf.a(28442);
        }
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_RESET_SIGN_IN_CANCELLATION_COUNTER;
    }
}
