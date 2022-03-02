package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: mex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mex extends isy {
    public mex(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 220, ise, iea, igg);
    }

    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean F() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsInternalSyncService");
        if (queryLocalInterface instanceof mfj) {
            return (mfj) queryLocalInterface;
        }
        return new mfh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.facs.internal.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.facs.cache.internal.IFacsInternalSyncService";
    }

    public final int d() {
        return 20059000;
    }
}
