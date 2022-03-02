package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import java.util.List;

/* renamed from: wip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wip extends jfx {
    private final Context a;
    private final wio e;
    private final Intent f;

    public wip(Context context, wio wio, Intent intent) {
        super(9);
        this.a = context;
        this.e = wio;
        this.f = intent;
    }

    public final void run() {
        List b = whp.b(this.a, this.f);
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = b;
        this.e.sendMessage(obtain);
    }
}
