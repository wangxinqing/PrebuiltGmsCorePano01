package defpackage;

import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kax extends kad {
    private static final ith h = new ith("CreateFolderAction", "");

    public kax(kkz kkz, AppIdentity appIdentity, MetadataBundle metadataBundle, DriveId driveId) {
        super(kaj.CREATE_FOLDER, kkz, appIdentity, metadataBundle, driveId, kdo.a);
        if (!this.e.c(lce.N)) {
            this.e.b(lce.N, "application/vnd.google-apps.folder");
        }
        iva.b("application/vnd.google-apps.folder".equals(this.e.a((kyq) lce.N)));
        if (!this.e.c(lce.g)) {
            this.e.b(lce.g, (String) jzq.V.c());
        }
    }

    /* access modifiers changed from: protected */
    public final String a(khq khq) {
        return "application/vnd.google-apps.folder";
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
        return a((kac) (kax) obj);
    }

    public final int hashCode() {
        return n();
    }

    public final String toString() {
        return String.format(Locale.US, "CreateFolderAction[%s]", new Object[]{m()});
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext) {
        khq d;
        lnn lnn;
        boolean ai;
        lnj lnj;
        kkf kkf;
        NetworkResponse networkResponse;
        p();
        lsm lsm = kan.a;
        kkf kkf2 = lsm.d;
        try {
            d = d(kkf2);
            kmp a = kkf2.a(d, s());
            lnn = lsm.i;
            ai = a.ai();
            MetadataBundle metadataBundle = this.e;
            File a2 = lbb.a(metadataBundle);
            if (kyo.a(metadataBundle)) {
                a2.a(lnn.a((String) metadataBundle.a(lce.E), ai));
            }
            lnj = lnn.a(clientContext, a2);
        } catch (VolleyError e) {
            if (!r() || (networkResponse = e.networkResponse) == null || networkResponse.statusCode != 409) {
                throw e;
            }
            lnj = lnn.a(clientContext, lnn.a(clientContext, (String) this.e.a(lce.E), ai), this.e);
        } catch (Throwable th) {
            try {
                kan.d.a(kkf2.a(khq.a(this.b), s()));
            } catch (kcs e2) {
            }
            throw th;
        }
        kkf = lsm.d;
        long j = kan.b;
        String str = d.b;
        String g = lnj.g();
        kkf.d();
        try {
            kmp a3 = kkf.a(khq.a(this.b), g);
            iva.a(r());
            if (!a3.a().equals(s())) {
                a3.ao();
            }
        } catch (kcs e3) {
        }
        try {
            kmp a4 = kkf.a(khq.a(this.b), s());
            a(kkf, a4, g);
            if (r()) {
                String str2 = (String) jzq.aA.c();
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                a4.d(str2);
            }
            kju.a(kkf, lnj, a4, str);
            a4.M();
            a4.n(false);
            lrt.a(kkf, this.b, j, false);
            lrt.a(kkf, this.b, j);
            kkf.f();
        } catch (kcs e4) {
            h.c("CreateFolderAction", "Unable to retrieve entry.", e4);
        }
        kkf.e();
        try {
            kan.d.a(kkf2.a(khq.a(this.b), s()));
        } catch (kcs e5) {
        }
    }

    public kax(kkz kkz, JSONObject jSONObject) {
        super(kaj.CREATE_FOLDER, kkz, jSONObject);
    }

    public final boolean a(kah kah) {
        if (super.a(kah)) {
            return true;
        }
        if (!(kah instanceof kbd) || !((kbd) kah).q().contains(s())) {
            return false;
        }
        return true;
    }
}
