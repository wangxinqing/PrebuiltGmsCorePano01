package defpackage;

import android.app.Notification;
import android.content.Context;

/* renamed from: iwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwr {
    public final jo a;
    public final iwq b;

    public iwr(jo joVar, iwq iwq) {
        this.a = joVar;
        this.b = iwq;
    }

    public static iwr a(Context context) {
        return new iwr(new jo(context), iwq.a(context));
    }

    public final void a(String str, int i) {
        this.a.a(str, i);
        if (!iwq.f()) {
            this.b.b();
        }
    }

    public final void a(String str, int i, Notification notification) {
        if (iwq.f()) {
            this.a.a(str, i, notification);
        } else if (!iwp.a(this.b.b)) {
            this.b.c.c();
        } else {
            this.a.a(str, i, this.b.a(notification));
            this.b.c.a();
        }
    }

    public final boolean a() {
        return this.a.a();
    }
}
