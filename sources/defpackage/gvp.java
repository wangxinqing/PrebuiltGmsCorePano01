package defpackage;

import android.os.Bundle;
import com.google.android.gms.checkin.CheckinChimeraService;

/* renamed from: gvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gvp implements Runnable {
    final /* synthetic */ CheckinChimeraService a;
    private final Bundle b;

    public gvp(CheckinChimeraService checkinChimeraService, Bundle bundle) {
        this.a = checkinChimeraService;
        this.b = bundle;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
