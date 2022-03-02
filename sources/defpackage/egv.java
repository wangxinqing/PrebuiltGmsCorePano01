package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: egv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class egv extends isy {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        if (queryLocalInterface instanceof egy) {
            return (egy) queryLocalInterface;
        }
        return new egw(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.audit.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    public final int d() {
        return 12200000;
    }

    public egv(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 154, ise, ica, icb);
    }
}
