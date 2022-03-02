package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ftz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftz extends isy {
    private final Bundle a;

    public ftz(Context context, Looper looper, ise ise, fsi fsi, iea iea, igg igg) {
        super(context, looper, 213, ise, iea, igg);
        iva.a((Object) fsi);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", fsi.a);
        this.a = bundle;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
        if (queryLocalInterface instanceof fto) {
            return (fto) queryLocalInterface;
        }
        return new ftm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.auth.api.identity.service.gis_internal.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService";
    }

    public final int d() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        return this.a;
    }
}
