package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: jvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jvb extends jvl {
    public static final clb a = new juz();
    private final grc b;
    private final Handler c;

    public jvb(grc grc, Looper looper) {
        iva.a((Object) grc);
        this.b = grc;
        iva.a((Object) looper);
        this.c = jwu.a(looper);
    }

    public final void a(FenceStateImpl fenceStateImpl) {
        this.c.post(new jva(this.b, fenceStateImpl));
    }

    @Deprecated
    public final void a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
        bxl.a("ContextFenceListenerWrapper", "Unexpected call to deprecated method onFenceTriggered() with %s.", (Object) fenceTriggerInfoImpl);
        this.c.post(new jva(this.b, new FenceStateImpl(FenceState.a(fenceTriggerInfoImpl.a), 0, fenceTriggerInfoImpl.b, 0)));
    }
}
