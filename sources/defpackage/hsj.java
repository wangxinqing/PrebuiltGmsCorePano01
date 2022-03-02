package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: hsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsj extends isy {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountService");
        if (queryLocalInterface instanceof hsu) {
            return (hsu) queryLocalInterface;
        }
        return new hss(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.clearcut.bootcount.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.clearcut.internal.IBootCountService";
    }

    public final int d() {
        return 11925000;
    }

    public hsj(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 124, ise, ica, icb);
    }
}
