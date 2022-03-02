package defpackage;

import android.os.Handler;

/* renamed from: acbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbg extends tim {
    public final tim a;
    private final Handler b;

    public acbg(Handler handler, tim tim) {
        this.b = handler;
        this.a = tim;
    }

    public final void a(String str) {
        this.b.post(new acbe(this, str));
    }

    public final void a(String str, tij tij) {
        this.b.post(new acbf(this, str, tij));
    }

    public final void a(String str, til til) {
        this.b.post(new acbc(this, str, til));
    }

    public final void a(String str, tip tip) {
        this.b.post(new acbd(this, str, tip));
    }
}
