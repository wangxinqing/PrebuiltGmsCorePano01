package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: aknn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aknn implements icb {
    final /* synthetic */ aknq a;

    public aknn(aknq aknq) {
        this.a = aknq;
    }

    public final void a(ConnectionResult connectionResult) {
        akof a2 = aklz.a();
        int i = connectionResult.c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("GoogleApiClient connection failure - error code: ");
        sb.append(i);
        a2.b(sb.toString());
        this.a.e = false;
        this.a.g = null;
    }
}
