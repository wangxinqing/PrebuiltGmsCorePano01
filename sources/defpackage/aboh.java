package defpackage;

import android.content.Context;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: aboh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aboh implements acvv {
    private final CleanSharedSecretChimeraService a;

    public aboh(CleanSharedSecretChimeraService cleanSharedSecretChimeraService) {
        this.a = cleanSharedSecretChimeraService;
    }

    public final void a(Object obj) {
        CleanSharedSecretChimeraService cleanSharedSecretChimeraService = this.a;
        ManagedAccountSetupInfo managedAccountSetupInfo = (ManagedAccountSetupInfo) obj;
        if (managedAccountSetupInfo != null && managedAccountSetupInfo.b != 0) {
            CleanSharedSecretChimeraService.a((Context) cleanSharedSecretChimeraService);
        }
    }
}
