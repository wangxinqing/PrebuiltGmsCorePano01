package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ybl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ybl implements icb {
    final /* synthetic */ ybm a;

    public ybl(ybm ybm) {
        this.a = ybm;
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.a(new Status(connectionResult.c, (String) null, connectionResult.d), (ilh) null);
    }
}
