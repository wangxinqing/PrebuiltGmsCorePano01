package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SendParams;

/* renamed from: vsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vsr implements igp {
    private final ShareTarget a;
    private final Intent b;

    public vsr(ShareTarget shareTarget, Intent intent) {
        this.a = shareTarget;
        this.b = intent;
    }

    public final void a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.a;
        Intent intent = this.b;
        int i = vts.a;
        wal wal = new wal();
        SendParams sendParams = wal.a;
        sendParams.a = shareTarget;
        sendParams.b = intent;
        ifu b2 = vts.b((acwd) obj2);
        SendParams sendParams2 = wal.a;
        sendParams2.c = b2;
        ((vyk) ((waz) obj).x()).a(sendParams2);
    }
}
