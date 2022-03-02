package defpackage;

import android.util.Log;

/* renamed from: akii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akii implements aksb {
    final /* synthetic */ boolean a;
    final /* synthetic */ aknj b;

    public akii(aknj aknj, boolean z) {
        this.b = aknj;
        this.a = z;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        asux asux = (asux) obj;
        aucx aucx = asux.b;
        aucx aucx2 = asux.a;
        this.b.a((astz[]) aucx.toArray(new astz[aucx.size()]), (asto[]) aucx2.toArray(new asto[aucx2.size()]), this.a);
    }

    public final void a(Throwable th) {
        if (Log.isLoggable("Places", 5)) {
            alfy.b("Places", "Failed to download placeinfos", th);
        }
        this.b.a(this.a);
    }
}
