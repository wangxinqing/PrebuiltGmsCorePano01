package defpackage;

import android.content.Context;
import com.google.android.gms.auth.frp.FrpUpdateIntentOperation;

/* renamed from: gfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfm implements eio {
    public static final gfm a = new gfm();

    private gfm() {
    }

    public final void a(Context context) {
    }

    public final void b(Context context) {
        FrpUpdateIntentOperation.a(context, "android.intent.action.BOOT_COMPLETED");
    }

    public final void c(Context context) {
    }
}
