package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;

/* renamed from: vgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vgc extends arwm {
    final /* synthetic */ RegisterStatusCallbackRequest a;
    final /* synthetic */ vgh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vgc(vgh vgh, String str, RegisterStatusCallbackRequest registerStatusCallbackRequest) {
        super(str);
        this.b = vgh;
        this.a = registerStatusCallbackRequest;
    }

    public final void run() {
        uxy a2 = this.b.a(this.a.e);
        RegisterStatusCallbackRequest registerStatusCallbackRequest = this.a;
        if (a2.e.c(registerStatusCallbackRequest.b)) {
            boolean z = true;
            if (registerStatusCallbackRequest.c) {
                vau vau = a2.g;
                vcn vcn = registerStatusCallbackRequest.f;
                jjg jjg = tgc.a;
                vcn.a.hashCode();
                boolean register = vau.a.register(vcn);
                if (!register) {
                    ((anih) ((anih) tgc.a.d()).a("vau", "a", 22, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to register status callback: %s", vcn.a.hashCode());
                }
                z = register;
            } else {
                vau vau2 = a2.g;
                vcn vcn2 = registerStatusCallbackRequest.f;
                jjg jjg2 = tgc.a;
                vcn2.a.hashCode();
                if (!vau2.a.unregister(vcn2)) {
                    ((anih) ((anih) tgc.a.d()).a("vau", "b", 31, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No status callback found to unregister: %s", vcn2.a.hashCode());
                }
            }
            uxy.a(!z ? Status.c : Status.a, registerStatusCallbackRequest.b);
            if (z && registerStatusCallbackRequest.c) {
                a2.a();
            }
        }
    }
}
