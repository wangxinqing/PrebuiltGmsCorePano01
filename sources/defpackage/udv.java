package defpackage;

import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;

/* renamed from: udv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class udv extends ueh {
    final /* synthetic */ OnConnectionInitiatedParams a;

    public udv(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        this.a = onConnectionInitiatedParams;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = this.a.a;
        tik tik = new tik();
        OnConnectionInitiatedParams onConnectionInitiatedParams = this.a;
        tik.a = onConnectionInitiatedParams.b;
        tik.b = onConnectionInitiatedParams.c;
        tik.c = onConnectionInitiatedParams.f;
        boolean z = onConnectionInitiatedParams.d;
        tik.d = onConnectionInitiatedParams.g;
        ((tim) obj).a(str, new til(tik.a, tik.b, tik.c, z, onConnectionInitiatedParams.h, tik.d));
    }
}
