package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: tav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tav extends isy {
    public final Feature[] D() {
        return taj.b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionService");
        if (queryLocalInterface instanceof tau) {
            return (tau) queryLocalInterface;
        }
        return new tau(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.mobilesubscription.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.mobilesubscription.internal.IMobileSubscriptionService";
    }

    public final int d() {
        return 16200000;
    }

    public tav(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 200, ise, ica, icb);
    }
}
