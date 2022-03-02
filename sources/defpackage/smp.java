package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: smp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smp implements Runnable {
    final /* synthetic */ Context a;

    public smp(Context context) {
        this.a = context;
    }

    public final void run() {
        Context context = this.a;
        Intent a2 = smy.a(context, false, avup.a(((Integer) smo.h.a()).intValue()), avup.RETRY_AFTER_SERVER_DELAY, snb.b(context), snh.a(context));
        if (a2 != null) {
            int i = crc.a;
            acsb.b(this.a, a2);
        }
    }
}
