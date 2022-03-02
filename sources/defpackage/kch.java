package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import org.json.JSONObject;

/* renamed from: kch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kch extends kac {
    protected kch(kkz kkz, AppIdentity appIdentity) {
        super(kaj.UNDO_PERMISSION, kkz, appIdentity, kbi.NONE);
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq) {
        lrt.a(kam.a, this.b, kam.b, true);
        return new kbh(this.b, khq.c, kbi.NONE);
    }

    /* access modifiers changed from: protected */
    public final DriveId b(kkf kkf) {
        return null;
    }

    public final knc s() {
        return null;
    }

    public kch(kkz kkz, JSONObject jSONObject) {
        super(kaj.UNDO_PERMISSION, kkz, jSONObject);
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext) {
        throw new UnsupportedOperationException("Cannot apply undo action on the server");
    }
}
