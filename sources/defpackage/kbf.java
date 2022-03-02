package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbf extends kae {
    private final MetadataBundle f;

    public kbf(kkz kkz, AppIdentity appIdentity, knc knc, MetadataBundle metadataBundle) {
        super(kaj.METADATA, kkz, appIdentity, knc, kbi.NORMAL);
        iva.a((Object) metadataBundle);
        this.f = metadataBundle;
        iva.b(!metadataBundle.c(lce.M));
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq, kmp kmp) {
        knl knl;
        kkf kkf = kam.a;
        if (kmp.ag()) {
            knl = kkf.b(kmp.b());
        } else {
            knl = kkf.a(kmp);
            kmp.j(true);
        }
        kmp kmp2 = kmp;
        knl knl2 = knl;
        lbb.a(kmp2, knl2, kam.b, c(kkf).b, this.f);
        kmp.f((Date) null);
        kmp.f((String) null);
        kmp.m(true);
        knl.t();
        return new kcf(khq.a, khq.c, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kbf kbf = (kbf) obj;
            return a((kac) kbf) && this.f.equals(kbf.f);
        }
    }

    public final JSONObject h() {
        JSONObject h = super.h();
        h.put("metadataDelta", lbb.b(this.f));
        return h;
    }

    public final int hashCode() {
        return (n() * 31) + this.f.hashCode();
    }

    public final String toString() {
        return String.format(Locale.US, "MetadataAction [%s, metadataChangeSet=%s]", new Object[]{m(), this.f});
    }

    public kbf(kkz kkz, JSONObject jSONObject) {
        super(kaj.METADATA, kkz, jSONObject);
        this.f = lbb.a(jSONObject.getJSONObject("metadataDelta"));
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        lsm lsm = kan.a;
        kkf kkf = lsm.d;
        String str2 = d(kkf).b;
        long j = kan.b;
        lnj a = lsm.i.a(clientContext, str, this.f);
        kkf.d();
        try {
            kmp e = e(kkf);
            kju.a(kkf, a, e, str2);
            e.n(false);
            lrt.b(kkf, this.b, j, false);
            lrt.a(kkf, this.b, j);
            kkf.f();
        } finally {
            kkf.e();
        }
    }
}
