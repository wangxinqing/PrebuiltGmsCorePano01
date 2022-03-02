package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: fut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fut extends isy {
    private final Bundle a;

    public fut(Context context, Looper looper, ise ise, ess ess, iea iea, igg igg) {
        super(context, looper, 16, ise, iea, igg);
        Bundle bundle;
        if (ess == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(ess.a);
        }
        this.a = bundle;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof fuz) {
            return (fuz) queryLocalInterface;
        }
        return new fux(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.auth.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        return this.a;
    }

    public final boolean g() {
        ise ise = this.s;
        return !TextUtils.isEmpty(ise.a()) && !ise.a(esq.a).isEmpty();
    }
}
