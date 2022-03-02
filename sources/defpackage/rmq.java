package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;

/* renamed from: rmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rmq extends isy {
    private final String a;

    public final Feature[] D() {
        return rcy.e;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.reporting.internal.IReportingService");
        if (queryLocalInterface instanceof rmo) {
            return (rmo) queryLocalInterface;
        }
        return new rmm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.location.reporting.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.location.reporting.internal.IReportingService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.a)) {
            bundle.putString("real_client_package_name", this.a);
        }
        return bundle;
    }

    public rmq(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 22, ise, ica, icb);
        this.a = ise.e;
    }
}
