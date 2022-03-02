package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kcd extends kac {
    protected kcd(kkz kkz, AppIdentity appIdentity) {
        super(kaj.UNDO_DELETE_FILE, kkz, appIdentity, kbi.NONE);
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq) {
        kbc.a(kam.a, this.b, kam.b, true);
        return new kbh(this.b, khq.c, kbi.NONE);
    }

    /* access modifiers changed from: protected */
    public final DriveId b(kkf kkf) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a((kac) (kcd) obj);
    }

    public final int hashCode() {
        return n();
    }

    public final knc s() {
        return null;
    }

    public final String toString() {
        return String.format(Locale.US, "UndoDeleteFileAction[%s]", new Object[]{m()});
    }

    protected kcd(kkz kkz, JSONObject jSONObject) {
        super(kaj.UNDO_DELETE_FILE, kkz, jSONObject);
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
