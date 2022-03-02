package defpackage;

import android.content.Context;
import com.google.android.gms.auth.setup.devicesignals.LockScreenChimeraService;

/* renamed from: gku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gku implements eio {
    public static final gku a = new gku();

    private gku() {
    }

    private static final void a(Context context, boolean z) {
        context.startService(LockScreenChimeraService.a(context).putExtra("is_boot", z));
    }

    public final void b(Context context) {
        a(context, true);
    }

    public final void c(Context context) {
    }

    public final void a(Context context) {
        a(context, false);
    }
}
