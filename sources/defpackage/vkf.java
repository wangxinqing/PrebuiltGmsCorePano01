package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: vkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkf implements Runnable {
    private final vkg a;
    private final ShareTarget b;
    private final TransferMetadata c;

    public vkf(vkg vkg, ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.a = vkg;
        this.b = shareTarget;
        this.c = transferMetadata;
    }

    public final void run() {
        vkg vkg = this.a;
        vkg.a.b(this.b, this.c);
    }
}
