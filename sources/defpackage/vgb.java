package defpackage;

import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;

/* renamed from: vgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vgb extends arwm {
    final /* synthetic */ GetPermissionStatusRequest a;
    final /* synthetic */ vgh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vgb(vgh vgh, String str, GetPermissionStatusRequest getPermissionStatusRequest) {
        super(str);
        this.b = vgh;
        this.a = getPermissionStatusRequest;
    }

    public final void run() {
        uxy a2 = this.b.a(this.a.d);
        GetPermissionStatusRequest getPermissionStatusRequest = this.a;
        jjg jjg = tgc.a;
        ClientAppIdentifier clientAppIdentifier = a2.b;
        if (a2.e.b(getPermissionStatusRequest.b)) {
            uxy.a(getPermissionStatusRequest.b);
        }
    }
}
