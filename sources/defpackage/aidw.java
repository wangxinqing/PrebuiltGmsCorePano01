package defpackage;

import com.google.android.gms.common.internal.ClientIdentity;
import java.util.Collections;

/* renamed from: aidw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aidw implements Runnable {
    private final aiei a;
    private final ClientIdentity b;
    private final rge c;

    public aidw(aiei aiei, ClientIdentity clientIdentity, rge rge) {
        this.a = aiei;
        this.b = clientIdentity;
        this.c = rge;
    }

    public final void run() {
        aiei aiei = this.a;
        ClientIdentity clientIdentity = this.b;
        rge rge = this.c;
        aidf aidf = aiei.u;
        aidf.a(31, aidf.k.a((Object) Collections.singletonList(clientIdentity)));
        aiei.e.a(new aido(rge));
    }
}
