package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ffv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ffv extends isy {
    private final Bundle a;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
        if (queryLocalInterface instanceof fgf) {
            return (fgf) queryLocalInterface;
        }
        return new fgd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.auth.api.credentials.internal_service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService";
    }

    public final int d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        return this.a;
    }

    public ffv(Context context, Looper looper, ffx ffx, ise ise, ica ica, icb icb) {
        super(context, looper, 179, ise, ica, icb);
        Bundle bundle = new Bundle();
        bundle.putString("log_session_id", ffx.a);
        this.a = bundle;
    }
}
