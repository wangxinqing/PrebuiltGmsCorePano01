package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajdl implements ajdo {
    private final ajdp a;
    private final ClientContext b;
    private final long c;

    public ajdl(ajdp ajdp, ClientContext clientContext, long j) {
        this.a = ajdp;
        this.b = clientContext;
        this.c = j;
    }

    public final void a() {
        ajdp ajdp = this.a;
        ClientContext clientContext = this.b;
        long j = this.c;
        SystemClock.elapsedRealtime();
        rlv rlv = ajdp.g;
        aucd o = arvd.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arvd) o.b).a = j;
        auay auay = (auay) ajdp.j.get();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auay.getClass();
        ((arvd) o.b).b = auay;
        arve a2 = rlv.a(clientContext, (arvd) o.i());
        AtomicReference atomicReference = ajdp.h;
        long j2 = a2.a;
        SystemClock.elapsedRealtime();
        atomicReference.set(new ajdh(j2));
        ajdp.j.set(a2.b);
    }
}
