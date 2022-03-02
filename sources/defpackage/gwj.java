package defpackage;

import android.content.Context;
import com.google.android.gms.checkin.CheckinChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: gwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwj extends jba {
    private final Context a;
    private final ifu d;

    protected gwj(Context context, ifu ifu) {
        super(130, "HasFirstAccountCheckin");
        this.a = context;
        this.d = ifu;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        int i;
        if (!CheckinChimeraService.c(this.a)) {
            i = 21040;
        } else {
            i = 21020;
        }
        this.d.a(new Status(i));
    }
}
