package defpackage;

import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

/* renamed from: vgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vgd extends arwm {
    final /* synthetic */ ClientAppContext a;
    final /* synthetic */ vgh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vgd(vgh vgh, String str, ClientAppContext clientAppContext) {
        super(str);
        this.b = vgh;
        this.a = clientAppContext;
    }

    public final void run() {
        uxy a2 = this.b.a(this.a);
        jjg jjg = tgc.a;
        ClientAppIdentifier clientAppIdentifier = a2.b;
        a2.a(false);
    }
}
