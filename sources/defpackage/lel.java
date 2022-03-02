package defpackage;

import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.gms.drive.DriveId;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: lel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lel {
    public static final ith a = new ith("SingleItemSynchronizer", "");
    private final Context b;
    private final kkb c;
    private final lnn d;
    private final ldv e;
    private final ksw f;
    private final khw g;

    public lel(lnn lnn, ksw ksw, kkb kkb, ldv ldv, Context context, khw khw) {
        iva.a((Object) kkb);
        this.c = kkb;
        iva.a((Object) lnn);
        this.d = lnn;
        iva.a((Object) ksw);
        this.f = ksw;
        iva.a((Object) ldv);
        this.e = ldv;
        iva.a((Object) context);
        this.b = context;
        iva.a((Object) khw);
        this.g = khw;
    }

    public final void a(khq khq, String str, lnk lnk) {
        a(khq, b(khq, str, lnk));
    }

    public final lnj b(khq khq, String str, lnk lnk) {
        HashSet hashSet = new HashSet();
        if (!khq.a() && khq.e.contains(jzl.APPDATA)) {
            try {
                this.e.a(khq);
                hashSet.add(khq.b);
            } catch (VolleyError e2) {
                a.b("SingleItemSynchronizer", String.format("Failed to retrieve app folder ID from the server so cannot sync %s", new Object[]{str}), (Throwable) e2);
                throw e2;
            }
        }
        try {
            return this.d.a(khq.a(khq.a).a(this.b), str, hashSet, lnk);
        } catch (VolleyError e3) {
            if (lnn.a(e3)) {
                return new lnq(str);
            }
            throw e3;
        } catch (eif e4) {
            a.c("SingleItemSynchronizer", "Google Play Services is not authorized with the server. Something is really wrong here!");
            throw new AuthFailureError("Unexpected auth failure", e4);
        }
    }

    public final void a(khq khq, String str, boolean z, lnk lnk) {
        try {
            a(khq, this.d.a(khq.a(this.b), str, z), lnk);
        } catch (VolleyError e2) {
            a.b("SingleItemSynchronizer", String.format("Failed to retrieve resource ID for file with unique ID %s", new Object[]{str}), (Throwable) e2);
            throw e2;
        }
    }

    public final void a(khq khq, lnj lnj) {
        DriveId driveId;
        kkz kkz = khq.a;
        kkh c2 = this.c.c();
        try {
            kkl kkl = c2.a;
            krk b2 = kkl.b(kkz.a);
            kkl.a(b2, (Collection) amzy.a((Object) lnj));
            if (lnj.c()) {
                driveId = ldx.a(b2, lnj);
                this.g.a();
            } else {
                driveId = ldx.a(b2, lnj, false);
            }
            c2.a();
            if (driveId != null) {
                this.f.a(driveId);
            }
        } finally {
            c2.b();
        }
    }
}
