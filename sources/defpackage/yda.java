package defpackage;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: yda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yda {
    private final hol a;
    private final Queue b = new ArrayDeque();
    private final int c;

    public yda(Context context, String str) {
        this.a = new hol(context, str, (String) null);
        xip.a();
        this.c = Integer.valueOf((int) aywy.a.a().C()).intValue();
    }

    public final synchronized void a(String str, byte[] bArr, int i) {
        xip.a();
        if (((Boolean) xfv.a.a()).booleanValue()) {
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
