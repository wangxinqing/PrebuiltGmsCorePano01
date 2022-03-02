package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: vjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vjt implements Runnable {
    private final vju a;
    private final ShareTarget b;
    private final TransferMetadata c;

    public vjt(vju vju, ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.a = vju;
        this.b = shareTarget;
        this.c = transferMetadata;
    }

    public final void run() {
        vju vju = this.a;
        vju.a.a(this.b, this.c);
    }
}
