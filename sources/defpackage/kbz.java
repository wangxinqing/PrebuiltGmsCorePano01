package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: kbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kbz extends kae {
    private final boolean f;

    static {
        new ith("UndoContentAndMetadataA", "");
    }

    public kbz(kkz kkz, AppIdentity appIdentity, knc knc) {
        super(kaj.UNDO_CONTENT_AND_METADATA, kkz, appIdentity, knc, kbi.NONE);
        this.f = false;
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq, kmp kmp) {
        kkf kkf = kam.a;
        if (this.f) {
            String i = kmp.i();
            try {
                lsm.a().z.a(khq, i, new lnk(203, 2, false, true));
            } catch (Exception e) {
            }
        }
        long j = kam.b;
        lrt.a(kkf, this.b, j);
        lrt.b(kkf, this.b, j, false);
        lrt.a(kkf, this.b, kmp.a(), j, true);
        return new kbh(this.b, khq.c, kbi.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return a((kac) (kbz) obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n())});
    }

    public final String toString() {
        String m = m();
        StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 31);
        sb.append("UndoContentAndMetadataAction [");
        sb.append(m);
        sb.append("]");
        return sb.toString();
    }

    public kbz(kkz kkz, JSONObject jSONObject) {
        super(kaj.UNDO_CONTENT_AND_METADATA, kkz, jSONObject);
        this.f = jSONObject.has("metadataDelta");
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
