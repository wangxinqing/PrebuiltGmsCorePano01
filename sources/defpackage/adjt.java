package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: adjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjt {
    public static final iwd a = new iwd("SystemUpdate", "Backend", "ConfigDeliveryServiceGrpcWrapper");
    public final adjs b;
    public final ClientContext c;

    public adjt(Context context, String str, int i) {
        this.b = new adjs(new izd(context, str, i, context.getApplicationInfo().uid, 1033));
        ClientContext clientContext = new ClientContext();
        clientContext.e = context.getPackageName();
        clientContext.f = context.getPackageName();
        this.c = clientContext;
    }

    public final void a() {
        this.b.a.h();
    }
}
