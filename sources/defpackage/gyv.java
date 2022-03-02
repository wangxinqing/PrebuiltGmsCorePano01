package defpackage;

import android.app.PendingIntent;
import android.content.Context;

/* renamed from: gyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gyv {
    public final Context a;
    public final jbs b;

    public gyv(Context context) {
        this.a = context;
        this.b = new jbs(context);
    }

    public final void a() {
        jbs jbs = this.b;
        Context context = this.a;
        jbs.a(PendingIntent.getService(context, 0, gyx.a(context), 134217728));
    }
}
