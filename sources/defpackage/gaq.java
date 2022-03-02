package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: gaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gaq extends isy {
    public final Feature[] D() {
        return gqx.b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.ICryptauthService");
        if (queryLocalInterface instanceof gar) {
            return (gar) queryLocalInterface;
        }
        return new gar(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.auth.cryptauth.cryptauthservice.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.auth.cryptauth.internal.ICryptauthService";
    }

    public final int d() {
        return 12800000;
    }

    public gaq(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 129, ise, ica, icb);
    }
}
