package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: gsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsz extends isy {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.backup.internal.IGmsRestoreService");
        if (queryLocalInterface instanceof gtb) {
            return (gtb) queryLocalInterface;
        }
        return new gtb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.backup.GMS_MODULE_RESTORE";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.backup.internal.IGmsRestoreService";
    }

    public final int d() {
        return 16200000;
    }

    public gsz(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 201, ise, ica, icb);
    }
}
