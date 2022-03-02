package defpackage;

import android.util.Log;
import com.android.volley.VolleyError;

/* renamed from: akij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akij implements aksb {
    final /* synthetic */ boolean a;
    final /* synthetic */ aknj b;

    public akij(aknj aknj, boolean z) {
        this.b = aknj;
        this.a = z;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atai atai = (atai) obj;
        aucx aucx = atai.b;
        aucx aucx2 = atai.a;
        this.b.a((astz[]) aucx.toArray(new astz[aucx.size()]), (asto[]) aucx2.toArray(new asto[aucx2.size()]), this.a);
    }

    public final void a(Throwable th) {
        if (Log.isLoggable("Places", 5)) {
            alfy.b("Places", "getPlaceInfos (SLS) failure", th);
            if (th instanceof VolleyError) {
                int a2 = aksc.a((VolleyError) th);
                StringBuilder sb = new StringBuilder(43);
                sb.append("getPlaceInfos (SLS) VolleyError ");
                sb.append(a2);
                alfy.c("Places", sb.toString());
            }
        }
        this.b.a(this.a);
    }
}
