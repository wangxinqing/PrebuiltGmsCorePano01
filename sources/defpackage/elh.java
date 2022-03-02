package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: elh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elh implements eio {
    public static final elh a = new elh();

    private elh() {
    }

    public final void a(Context context) {
    }

    public final void b(Context context) {
    }

    public final void c(Context context) {
        context.startService(new Intent().setClassName(context, "com.google.android.gms.auth.account.be.channelid.ChannelBindingStateIntentService"));
    }
}
