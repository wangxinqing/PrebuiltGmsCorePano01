package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: vzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vzg {
    public final OnTransferUpdateParams a = new OnTransferUpdateParams();

    public final void a(ShareTarget shareTarget) {
        this.a.a = shareTarget;
    }

    public final void a(TransferMetadata transferMetadata) {
        this.a.b = transferMetadata;
    }
}
