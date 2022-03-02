package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: rfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class rfl extends isy {
    protected final rfk a = new rfk(this);
    private final String u;

    public final Feature[] D() {
        return rcy.e;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof rgk) {
            return (rgk) queryLocalInterface;
        }
        return new rgi(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final int d() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.u);
        return bundle;
    }

    public rfl(Context context, Looper looper, ica ica, icb icb, String str, ise ise) {
        super(context, looper, 23, ise, ica, icb);
        this.u = str;
    }
}
