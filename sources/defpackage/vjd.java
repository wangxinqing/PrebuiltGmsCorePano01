package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.Arrays;

/* renamed from: vjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vjd implements Runnable {
    private final NearbySharingChimeraService a;
    private final aosh b;
    private final Intent c;

    public vjd(NearbySharingChimeraService nearbySharingChimeraService, aosh aosh, Intent intent) {
        this.a = nearbySharingChimeraService;
        this.b = aosh;
        this.c = intent;
    }

    public final void run() {
        Object obj;
        NearbySharingChimeraService nearbySharingChimeraService = this.a;
        aosh aosh = this.b;
        Intent intent = this.c;
        TextAttachment a2 = whp.a((Context) nearbySharingChimeraService, intent);
        if (a2 != null) {
            obj = Arrays.asList(new TextAttachment[]{a2});
        } else {
            WifiCredentialsAttachment a3 = whp.a(intent);
            if (a3 != null) {
                obj = amzy.a((Object) a3);
            } else {
                obj = whp.b(nearbySharingChimeraService, intent);
            }
        }
        aosh.b(obj);
    }
}
