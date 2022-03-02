package defpackage;

import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;

/* renamed from: udp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udp {
    public final AcceptConnectionRequestParams a;

    public udp() {
        this.a = new AcceptConnectionRequestParams();
    }

    public final void a(String str) {
        this.a.c = str;
    }

    public final void a(uge uge) {
        this.a.b = uge;
    }

    public final void a(ugx ugx) {
        this.a.e = ugx;
    }

    public final void a(uha uha) {
        this.a.a = uha;
    }

    public udp(AcceptConnectionRequestParams acceptConnectionRequestParams) {
        AcceptConnectionRequestParams acceptConnectionRequestParams2 = new AcceptConnectionRequestParams();
        this.a = acceptConnectionRequestParams2;
        acceptConnectionRequestParams2.a = acceptConnectionRequestParams.a;
        acceptConnectionRequestParams2.b = acceptConnectionRequestParams.b;
        acceptConnectionRequestParams2.c = acceptConnectionRequestParams.c;
        acceptConnectionRequestParams2.d = acceptConnectionRequestParams.d;
        acceptConnectionRequestParams2.e = acceptConnectionRequestParams.e;
    }
}
