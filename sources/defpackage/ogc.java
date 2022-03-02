package defpackage;

import android.util.Log;
import java.io.IOException;

/* renamed from: ogc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ogc implements amrm {
    private final ogg a;

    public ogc(ogg ogg) {
        this.a = ogg;
    }

    public final boolean a(Object obj) {
        ogg ogg = this.a;
        Throwable th = (Throwable) obj;
        if ((th instanceof ogd) && ogg.e != null) {
            try {
                eig.b(ogg.c, ogg.j);
            } catch (eif | IOException e) {
                String valueOf = String.valueOf(ogg.e.name);
                Log.e("gH_CronetBaseRequest", valueOf.length() == 0 ? new String("Clearing auth token failed for ") : "Clearing auth token failed for ".concat(valueOf), e);
            }
        }
        return !(th instanceof ogf);
    }
}
