package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: adnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adnr extends isy {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.update.ISystemUpdateApiService");
        if (queryLocalInterface instanceof adif) {
            return (adif) queryLocalInterface;
        }
        return new adid(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.update.START_API_SERVICE";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.update.ISystemUpdateApiService";
    }

    public final int d() {
        return 11400000;
    }

    public adnr(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 157, ise, ica, icb);
    }
}
