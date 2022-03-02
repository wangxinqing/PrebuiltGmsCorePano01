package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: vgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgh extends vck {
    public final vgg a;
    public final arwg b;
    private final vav c;

    public vgh(Context context, ClientAppIdentifier clientAppIdentifier, uwl uwl) {
        vgg vgg = new vgg(context, clientAppIdentifier, uwl);
        this.c = (vav) thl.a(context, vav.class);
        this.b = (arwg) thl.a(context, arwg.class);
        this.a = vgg;
    }

    private final void a(ClientAppContext clientAppContext, String str) {
        this.b.c(new vgd(this, str.length() == 0 ? new String("handleClientLifecycleEvent#") : "handleClientLifecycleEvent#".concat(str), clientAppContext));
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.a == null;
    }

    public final uxy b() {
        vgg vgg = this.a;
        int i = vgg.e;
        return vgg.a;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (Exception e) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("vgh", "onTransact", 259, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error on binder transaction.");
            throw e;
        }
    }

    public final int a(int i) {
        if (!a()) {
            return b().a(i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void b(int i) {
        if (!a()) {
            uyf uyf = b().e;
            int i2 = uyf.c;
            if ((i2 | i) == i2) {
                uyf.c = i ^ i2;
                return;
            }
            throw new IllegalArgumentException("Cannot remove permissions that aren't there");
        }
    }

    public final uxy a(ClientAppContext clientAppContext) {
        vgg vgg = this.a;
        uxy uxy = vgg.a;
        if (uxy == null) {
            if (clientAppContext.c == null) {
                clientAppContext = new ClientAppContext(clientAppContext.b, "0p:com.google.android.gms", clientAppContext.d, 0);
            }
            ClientAppIdentifier a2 = ClientAppIdentifier.a("com.google.android.gms", clientAppContext);
            uxy = (uxy) vgg.b.get(a2);
            if (uxy == null) {
                uxy uxy2 = new uxy(vgg.c, a2, vgg.d);
                uxy2.a(-1);
                vgg.b.put(a2, uxy2);
                return uxy2;
            }
        }
        return uxy;
    }

    public final void a(GetPermissionStatusRequest getPermissionStatusRequest) {
        this.b.c(new vgb(this, "getPermissionStatus", getPermissionStatusRequest));
    }

    public final void a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest) {
        auys auys = this.c.f.n;
        if (auys == null) {
            auys = auys.c;
        }
        if (auys.b) {
            int i = handleClientLifecycleEventRequest.c;
            if (i == 1) {
                a(handleClientLifecycleEventRequest.b, "ACTIVITY_STOPPED");
            } else if (i != 2) {
                jjg jjg = tgc.a;
                ClientAppContext clientAppContext = handleClientLifecycleEventRequest.b;
            } else {
                a(handleClientLifecycleEventRequest.b, "CLIENT_DISCONNECTED");
            }
        }
    }

    public final void a(PublishRequest publishRequest) {
        this.b.c(new vfx(this, "publish", publishRequest));
    }

    public final void a(RegisterStatusCallbackRequest registerStatusCallbackRequest) {
        this.b.c(new vgc(this, "registerStatusCallback", registerStatusCallbackRequest));
    }

    public final void a(SubscribeRequest subscribeRequest) {
        this.b.c(new vfz(this, "subscribe", subscribeRequest));
    }

    public final void a(UnpublishRequest unpublishRequest) {
        this.b.c(new vfy(this, "unpublish", unpublishRequest));
    }

    public final void a(UnsubscribeRequest unsubscribeRequest) {
        this.b.c(new vga(this, "unsubscribe", unsubscribeRequest));
    }

    public final void a(boolean z, boolean z2) {
        this.b.c(new vfw(this, "clearPublishesAndSubscribes", z2, z));
    }
}
