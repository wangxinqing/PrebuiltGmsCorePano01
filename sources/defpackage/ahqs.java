package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: ahqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqs {
    public final argi a;
    private final ahqv b;

    public ahqs(ahqv ahqv) {
        this.b = ahqv;
        argi argi = new argi();
        this.a = new argc(argi, argb.a((int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, argi.c)).a();
    }

    public final int a() {
        return this.a.size();
    }

    public final ahqt a(long j) {
        return (ahqt) this.a.a(j, true);
    }

    public final void a(ahqt ahqt) {
        if (a() == 1000) {
            this.b.a();
        }
        this.a.a(ahqt.a, (Object) ahqt);
    }
}
