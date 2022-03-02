package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: sul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sul extends irx {
    public sul(Context context, Looper looper, irn irn, iro iro) {
        super(context, looper, 93, irn, iro);
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof sug) {
            return (sug) queryLocalInterface;
        }
        return new sue(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.measurement.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final int d() {
        return 12451000;
    }
}
