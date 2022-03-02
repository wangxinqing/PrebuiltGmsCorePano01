package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: yjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjm extends isy {
    public yjm(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 31, ise, iea, igg);
        ise.a();
    }

    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        if (queryLocalInterface instanceof yjs) {
            return (yjs) queryLocalInterface;
        }
        return new yjq(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.photos.autobackup.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.photos.autobackup.internal.IAutoBackupService";
    }

    public final int d() {
        return 12800000;
    }
}
