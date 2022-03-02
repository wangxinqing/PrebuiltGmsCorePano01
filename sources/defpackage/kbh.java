package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbh extends kac {
    public kbh(kkz kkz, AppIdentity appIdentity, kbi kbi) {
        super(kaj.NULL, kkz, appIdentity, kbi);
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq) {
        return this;
    }

    public final DriveId b(kkf kkf) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return a((kac) (kbh) obj);
    }

    public final int hashCode() {
        return n() * 17;
    }

    public final knc s() {
        return null;
    }

    public final String toString() {
        return String.format(Locale.US, "NullAction[%s]", new Object[]{m()});
    }

    public kbh(kkz kkz, JSONObject jSONObject) {
        super(kaj.NULL, kkz, jSONObject);
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext) {
        throw new UnsupportedOperationException("Cannot apply null action on the server");
    }
}
