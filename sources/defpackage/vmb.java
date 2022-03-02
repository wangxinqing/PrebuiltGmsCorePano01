package defpackage;

import android.os.IBinder;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

/* renamed from: vmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vmb implements IBinder.DeathRecipient {
    private final vmt a;
    private final vye b;

    public vmb(vmt vmt, vye vye) {
        this.a = vmt;
        this.b = vye;
    }

    public final void binderDied() {
        vmt vmt = this.a;
        vye vye = this.b;
        UnregisterSharingProviderParams unregisterSharingProviderParams = new wbk().a;
        unregisterSharingProviderParams.b = vye;
        vmt.a(unregisterSharingProviderParams);
    }
}
