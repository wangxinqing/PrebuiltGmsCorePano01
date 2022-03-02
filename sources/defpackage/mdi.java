package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: mdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mdi extends isy {
    public mdi(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 222, ise, iea, igg);
    }

    public final Feature[] D() {
        return new Feature[]{mdh.a};
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.enterprise.internal.IEnterpriseService");
        if (queryLocalInterface instanceof mdj) {
            return (mdj) queryLocalInterface;
        }
        return new mdj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.enterprise.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.enterprise.internal.IEnterpriseService";
    }

    public final int d() {
        return 17895000;
    }
}
