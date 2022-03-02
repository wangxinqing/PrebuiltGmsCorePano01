package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: abzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abzk extends abxp {
    private final acwd b;

    public abzk(acwd acwd) {
        super((idg) null);
        this.b = acwd;
    }

    public final void a(Status status, ManagedAccountSetupInfo managedAccountSetupInfo) {
        if (status.c()) {
            this.b.a((Object) managedAccountSetupInfo);
        } else {
            this.b.a((Exception) new ibr(status));
        }
    }
}
