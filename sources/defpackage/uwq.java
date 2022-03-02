package defpackage;

import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;

/* renamed from: uwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwq extends arwm {
    final /* synthetic */ DebugPokeRequest a;
    final /* synthetic */ uwr b;
    final /* synthetic */ asnb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uwq(uwr uwr, String str, asnb asnb, DebugPokeRequest debugPokeRequest) {
        super(str);
        this.b = uwr;
        this.c = asnb;
        this.a = debugPokeRequest;
    }

    public final void run() {
        uws uws = (uws) thl.a(this.b.a, uws.class);
        asnb asnb = this.c;
        if (asnb != null && uws != null) {
            uws.a(this.a, asnb);
        }
    }
}
