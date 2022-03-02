package defpackage;

import android.content.Context;
import com.google.android.gms.checkin.CheckinChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: gwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwh extends jba {
    private final Context a;
    private final gyf d;

    protected gwh(Context context, gyf gyf) {
        super(130, "GetAndroidId");
        this.a = context;
        this.d = gyf;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        this.d.a(Status.a, CheckinChimeraService.d(this.a));
    }
}
