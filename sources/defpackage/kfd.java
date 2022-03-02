package defpackage;

import android.content.Context;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.CancelPendingActionsRequest;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: kfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfd extends key {
    final CancelPendingActionsRequest f;

    public kfd(kec kec, CancelPendingActionsRequest cancelPendingActionsRequest, kwg kwg) {
        super("CancelPendingActionsOpe", kec, kwg, 32);
        this.f = cancelPendingActionsRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid cancel pending actions operation no request");
        List list = this.f.a;
        njc.a((Object) list, "CancelPendingActions with null tags.");
        kec kec = this.a;
        khq j = kec.j();
        AppIdentity a = kec.a(j);
        kdb kdb = kec.g;
        kdb.a().a(a, j.a, list);
        this.b.b();
    }
}
