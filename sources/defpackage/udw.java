package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;

/* renamed from: udw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class udw extends ueh {
    final /* synthetic */ OnConnectionResultParams a;
    final /* synthetic */ Status b;

    public udw(OnConnectionResultParams onConnectionResultParams, Status status) {
        this.a = onConnectionResultParams;
        this.b = status;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((tim) obj).a(this.a.a, new tip(this.b));
    }
}
