package defpackage;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: ztj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ztj {
    private final hol a;
    private final Queue b = new ArrayDeque();
    private final int c = ((int) azdq.a.a().f());

    static {
        zsg.a("ClearcutLoggerProxy");
    }

    public ztj(Context context, String str) {
        this.a = new hol(context, str, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, byte[] bArr, int i) {
        new Object[1][0] = str;
        if (azdq.f()) {
            while (this.b.size() >= this.c) {
                ((icf) this.b.poll()).a();
            }
            hoi a2 = this.a.a(bArr);
            a2.c(str);
            a2.f = avsd.a(i);
            this.b.offer(a2.b());
            return;
        }
        hoi a3 = this.a.a(bArr);
        a3.c(str);
        a3.f = avsd.a(i);
        a3.b();
    }
}
