package defpackage;

import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: tzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzw {
    public final Context a;
    public ServiceConnection b;

    public tzw(Context context) {
        this.a = context;
    }

    public final void a() {
        if (this.b != null) {
            ((anih) tsp.a.d()).a("FastPair: Device detail service unbind DiscoveryService");
            jca.a().a(this.a, this.b);
        }
    }
}
