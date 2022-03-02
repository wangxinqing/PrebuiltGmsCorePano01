package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ffu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ffu extends isy {
    private final esn a;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof fgi) {
            return (fgi) queryLocalInterface;
        }
        return new fgg(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final int d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        esn esn = this.a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", esn.b);
        bundle.putBoolean("force_save_dialog", esn.c);
        bundle.putString("log_session_id", esn.d);
        return bundle;
    }

    public ffu(Context context, Looper looper, ise ise, esn esn, ica ica, icb icb) {
        super(context, looper, 68, ise, ica, icb);
        esm esm = new esm(esn == null ? esn.a : esn);
        esm.c = qbw.a();
        this.a = esm.a();
    }
}
