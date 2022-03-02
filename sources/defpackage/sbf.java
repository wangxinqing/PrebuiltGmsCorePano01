package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: sbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sbf extends isy {
    /* access modifiers changed from: package-private */
    public final sas A() {
        return (sas) x();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
        if (queryLocalInterface instanceof sas) {
            return (sas) queryLocalInterface;
        }
        return new saq(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.mdh.service.listener.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.mdh.internal.IMobileDataHubListenerService";
    }

    public final int d() {
        return 12600000;
    }

    public sbf(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 164, ise, ica, icb);
    }
}
