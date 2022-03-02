package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kcj extends kae {
    protected kcj(kkz kkz, AppIdentity appIdentity, knc knc) {
        super(kaj.UNDO_TRASH, kkz, appIdentity, knc, kbi.NONE);
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq, kmp kmp) {
        lrt.b(kam.a, this.b, kam.b, true);
        return new kbh(this.b, khq.c, kbi.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a((kac) (kcj) obj);
    }

    public final int hashCode() {
        return n();
    }

    public final String toString() {
        return String.format(Locale.US, "UndoSetTrashedAction[%s]", new Object[]{m()});
    }

    protected kcj(kkz kkz, JSONObject jSONObject) {
        super(kaj.UNDO_TRASH, kkz, jSONObject);
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
