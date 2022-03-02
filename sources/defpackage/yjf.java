package defpackage;

import android.content.Context;

/* renamed from: yjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjf {
    public final Context a;
    public final yjd b;
    public final amri c;

    public yjf(Context context, yjd yjd) {
        this.a = context;
        this.b = yjd;
        this.c = amri.c(iwq.a(context));
    }

    public final String a(int i) {
        return this.a.getResources().getString(i);
    }

    public final void a() {
        if (!this.c.a()) {
            yja.b("Missing NotificationManager - cannot cancel notification", new Object[0]);
        } else {
            ((iwq) this.c.b()).a(1);
        }
    }
}
