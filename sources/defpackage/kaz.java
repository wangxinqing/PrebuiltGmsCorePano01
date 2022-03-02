package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kaz extends kad {
    public kaz(kkz kkz, AppIdentity appIdentity, MetadataBundle metadataBundle, DriveId driveId) {
        super(kaj.CREATE_SHORTCUT_FILE, kkz, appIdentity, metadataBundle, driveId, kdo.a);
        if (!this.e.c(lce.N)) {
            this.e.b(lce.N, "application/vnd.google-apps.drive-sdk");
        }
        lbq a = lbq.a((String) this.e.a((kyq) lce.N));
        boolean z = false;
        if (a != null && a.a()) {
            z = true;
        }
        iva.b(z);
        iva.b(!r());
    }

    /* access modifiers changed from: protected */
    public final String a(khq khq) {
        String valueOf = String.valueOf(khq.b);
        return lbq.a(valueOf.length() == 0 ? new String("application/vnd.google-apps.drive-sdk.") : "application/vnd.google-apps.drive-sdk.".concat(valueOf)).a;
    }

    /* access modifiers changed from: protected */
    public final void a(kam kam, kmp kmp) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a((kac) (kaz) obj);
    }

    public final int hashCode() {
        return n();
    }

    public final String toString() {
        return String.format(Locale.US, "CreateFileAction[%s]", new Object[]{m()});
    }

    public kaz(kkz kkz, JSONObject jSONObject) {
        super(kaj.CREATE_SHORTCUT_FILE, kkz, jSONObject);
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext) {
        p();
        lsm lsm = kan.a;
        kkf kkf = lsm.d;
        khq d = d(kkf);
        try {
            lnj a = lsm.i.a(clientContext, lbb.a(this.e));
            kkf.d();
            kmp a2 = kkf.a(d, s());
            a(kkf, a2, a.g());
            kju.a(kkf, a, a2, d.b);
            a2.M();
            a2.n(false);
            long j = kan.b;
            lrt.a(kkf, this.b, j, false);
            lrt.a(kkf, this.b, j);
            kkf.f();
            kkf.e();
            try {
                kan.d.a(kkf.a(khq.a(this.b), s()));
            } catch (kcs e) {
            }
        } catch (VolleyError e2) {
            lry.a(e2);
            throw e2;
        } catch (Throwable th) {
            try {
                kan.d.a(kkf.a(khq.a(this.b), s()));
            } catch (kcs e3) {
            }
            throw th;
        }
    }
}
