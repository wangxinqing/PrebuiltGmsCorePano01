package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kcb extends kae {
    protected kcb(kkz kkz, AppIdentity appIdentity, knc knc) {
        super(kaj.UNDO_CREATE_ENTRY, kkz, appIdentity, knc, kbi.NONE);
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq, kmp kmp) {
        lrt.a(kam.a, this.b, kam.b, false);
        kmp.b(kam.b);
        if (kmp.A() || kmp.J() || !kmp.ab()) {
            kmp.m(true);
        } else {
            kmp.L();
        }
        return new kbh(this.b, khq.c, kbi.NONE);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && a((kac) (kcb) obj);
        }
        return true;
    }

    public final int hashCode() {
        return n();
    }

    public final String toString() {
        return String.format(Locale.US, "UndoCreateEntryAction[%s]", new Object[]{m()});
    }

    protected kcb(kkz kkz, JSONObject jSONObject) {
        super(kaj.UNDO_CREATE_ENTRY, kkz, jSONObject);
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
