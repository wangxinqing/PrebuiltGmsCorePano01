package defpackage;

import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;

/* renamed from: uip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uip {
    public final SendConnectionRequestParams a;

    public uip() {
        this.a = new SendConnectionRequestParams();
    }

    public final void a(String str) {
        this.a.d = str;
    }

    public final void a(uge uge) {
        this.a.b = uge;
    }

    public final void a(ugh ugh) {
        this.a.g = ugh;
    }

    public final void a(ugk ugk) {
        this.a.c = ugk;
    }

    public final void a(uha uha) {
        this.a.a = uha;
    }

    public final void b(String str) {
        this.a.e = str;
    }

    public uip(SendConnectionRequestParams sendConnectionRequestParams) {
        SendConnectionRequestParams sendConnectionRequestParams2 = new SendConnectionRequestParams();
        this.a = sendConnectionRequestParams2;
        sendConnectionRequestParams2.a = sendConnectionRequestParams.a;
        sendConnectionRequestParams2.b = sendConnectionRequestParams.b;
        sendConnectionRequestParams2.c = sendConnectionRequestParams.c;
        sendConnectionRequestParams2.d = sendConnectionRequestParams.d;
        sendConnectionRequestParams2.e = sendConnectionRequestParams.e;
        sendConnectionRequestParams2.f = sendConnectionRequestParams.f;
        sendConnectionRequestParams2.g = sendConnectionRequestParams.g;
        sendConnectionRequestParams2.h = sendConnectionRequestParams.h;
        sendConnectionRequestParams2.i = sendConnectionRequestParams.i;
    }
}
