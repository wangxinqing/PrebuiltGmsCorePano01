package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: hjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjr extends isy {
    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.chromesync.internal.IChromeSyncApiService");
        if (queryLocalInterface instanceof hjx) {
            return (hjx) queryLocalInterface;
        }
        return new hjv(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.chromesync.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.chromesync.internal.IChromeSyncApiService";
    }

    public final int d() {
        return 12800000;
    }

    protected hjr(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 80, ise, ica, icb);
    }
}
