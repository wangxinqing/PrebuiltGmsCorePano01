package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.android.volley.toolbox.ImageRequest;

/* renamed from: var  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class var {
    public final vat a = new vam(this);
    public final nz b = new nz();
    public final vat c = new van(this);
    public final nz d = new nz();
    public final arwg e;
    private final Context f;

    public var(Context context) {
        this.e = (arwg) thl.a(context, arwg.class);
        this.f = context;
    }

    public final void a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.f, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        intent.setAction("com.google.android.gms.nearby.messages.service.STOP_SERVICE_IF_IDLE");
        this.f.startService(intent);
    }

    public final void a(PendingIntent pendingIntent) {
        a(new vaq(pendingIntent));
    }

    public final void a(String str) {
        jjg jjg = tgc.a;
        arwm arwm = (arwm) this.b.remove(str);
        if (arwm != null) {
            this.e.e(arwm);
        }
        this.a.b(str);
    }

    public final void a(vaq vaq) {
        arwm arwm = (arwm) this.d.remove(vaq);
        if (arwm != null) {
            this.e.e(arwm);
        }
        this.c.b(vaq);
    }

    public final void a(vaq vaq, int i, vcq vcq) {
        if (vcq != null && i != Integer.MAX_VALUE) {
            this.c.a(vaq, vcq);
            String valueOf = String.valueOf(vaq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("PublishSubscribeCallbackCache.subscribe:");
            sb.append(valueOf);
            this.e.a(new vap(this, sb.toString(), vaq), (long) (i * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
        }
    }
}
