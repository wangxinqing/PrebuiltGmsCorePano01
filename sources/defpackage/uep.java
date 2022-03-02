package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

/* renamed from: uep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uep extends uhc {
    private final idg a;

    public uep(idg idg) {
        iva.a((Object) idg);
        this.a = idg;
    }

    public final void a(OnStartAdvertisingResultParams onStartAdvertisingResultParams) {
        Status b = ueq.b(onStartAdvertisingResultParams.a);
        if (b.c()) {
            this.a.a((Object) new ueo(b));
        } else {
            this.a.a(b);
        }
    }
}
