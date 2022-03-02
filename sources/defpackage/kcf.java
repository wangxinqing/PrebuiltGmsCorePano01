package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kcf extends kae {
    private final boolean f;

    static {
        new ith("UndoMetadataAction", "");
    }

    public kcf(kkz kkz, AppIdentity appIdentity, knc knc) {
        super(kaj.UNDO_METADATA, kkz, appIdentity, knc, kbi.NONE);
        this.f = false;
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq, kmp kmp) {
        if (this.f) {
            String i = kmp.i();
            try {
                lsm.a().z.a(khq, i, new lnk(912, 2, false, true));
            } catch (Exception e) {
            }
        }
        kkf kkf = kam.a;
        long j = kam.b;
        lrt.a(kkf, this.b, j);
        lrt.b(kkf, this.b, j, false);
        return new kbh(this.b, khq.c, kbi.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return a((kac) (kcf) obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n())});
    }

    public final String toString() {
        return String.format(Locale.US, "UndoMetadataAction [%s]", new Object[]{m()});
    }

    public kcf(kkz kkz, JSONObject jSONObject) {
        super(kaj.UNDO_METADATA, kkz, jSONObject);
        this.f = jSONObject.has("metadataDelta");
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
