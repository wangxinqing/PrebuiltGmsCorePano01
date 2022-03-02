package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: idb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class idb implements icb {
    public final int a;
    public final icc b;
    public final icb c;
    final /* synthetic */ idc d;

    public idb(idc idc, int i, icc icc, icb icb) {
        this.d = idc;
        this.a = i;
        this.b = icc;
        this.c = icb;
        icc.a((icb) this);
    }

    public final void a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("beginFailureResolution for ");
        sb.append(valueOf);
        sb.toString();
        this.d.b(connectionResult, this.a);
    }
}
