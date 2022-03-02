package defpackage;

import com.google.android.location.internal.server.GoogleLocationChimeraService;

/* renamed from: aipm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipm implements arnb {
    final /* synthetic */ GoogleLocationChimeraService a;

    public aipm(GoogleLocationChimeraService googleLocationChimeraService) {
        this.a = googleLocationChimeraService;
    }

    public final void a(int i) {
        this.a.c.b();
    }

    public final void b(int i) {
    }

    public final void be() {
        this.a.c.b();
        arnd a2 = new aipq().a(this.a);
        GoogleLocationChimeraService googleLocationChimeraService = this.a;
        googleLocationChimeraService.c = aipe.a(googleLocationChimeraService, googleLocationChimeraService.b, a2);
        this.a.c.a();
    }
}
