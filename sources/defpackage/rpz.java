package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: rpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rpz extends isy {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.lockbox.internal.ILockboxService");
        if (queryLocalInterface instanceof rpt) {
            return (rpt) queryLocalInterface;
        }
        return new rpr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.lockbox.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.lockbox.internal.ILockboxService";
    }

    public final int d() {
        return 12800000;
    }

    public rpz(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 26, ise, ica, icb);
    }
}
