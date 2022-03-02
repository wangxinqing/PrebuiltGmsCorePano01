package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.Map;

/* renamed from: asdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdw extends arwm {
    final /* synthetic */ aseb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdw(aseb aseb, String str) {
        super(str);
        this.a = aseb;
    }

    public final void run() {
        Iterator it = this.a.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.a.d() <= SystemClock.elapsedRealtime() - ((Long) entry.getValue()).longValue()) {
                it.remove();
                this.a.c.a((String) entry.getKey());
            }
        }
        this.a.b();
    }
}
