package defpackage;

import android.os.SystemClock;

/* renamed from: upl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class upl extends jfx {
    final /* synthetic */ upm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public upl(upm upm) {
        super(9);
        this.a = upm;
    }

    public final void run() {
        SystemClock.sleep(aymi.f());
        this.a.b();
    }
}
