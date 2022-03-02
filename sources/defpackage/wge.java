package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: wge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wge implements vtx {
    final /* synthetic */ vtx a;
    final /* synthetic */ wgu b;
    private boolean c = false;

    public wge(wgu wgu, vtx vtx) {
        this.b = wgu;
        this.a = vtx;
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!this.c) {
            this.c = transferMetadata.e;
            this.b.x = transferMetadata.a;
            this.a.a(shareTarget, transferMetadata);
        }
    }
}
