package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: adcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adcn extends isy {
    public final boolean E() {
        return true;
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.udc.internal.IUdcService");
        if (queryLocalInterface instanceof adca) {
            return (adca) queryLocalInterface;
        }
        return new adby(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.udc.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.udc.internal.IUdcService";
    }

    public final int d() {
        return 12800000;
    }

    public adcn(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 35, ise, ica, icb);
        iva.a((Object) ise.a, (Object) "Must pass an account via UdcOptions or call GoogleApiClient.Builder.setAccount()");
    }
}
