package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.cast.JGCastService;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: gib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gib extends nis {
    private final ghq a;
    private final String b;
    private final Bundle c;

    public gib(ghq ghq, String str, Bundle bundle) {
        super(136, "GetPhoneskyDpcInstallIntent");
        this.a = ghq;
        this.b = str;
        this.c = bundle;
    }

    public final void a(Context context) {
        this.a.a(Status.a, PendingIntent.getActivity(context, 0, PhoneskyDpcInstallChimeraActivity.a(context, this.b, true, this.c), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.a.a(status, (PendingIntent) null);
    }
}
