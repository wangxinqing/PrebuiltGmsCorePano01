package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: vmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vmp implements vtx {
    final /* synthetic */ vyt a;

    public vmp(vyt vyt) {
        this.a = vyt;
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        try {
            vyt vyt = this.a;
            vzg vzg = new vzg();
            vzg.a(shareTarget);
            vzg.a(transferMetadata);
            vyt.a(vzg.a);
        } catch (RemoteException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            anih.a("Failed to invoke onTransferUpdate on registered receive surface.");
        }
    }
}
