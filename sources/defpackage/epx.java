package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: epx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class epx extends isy {
    public epx(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 153, ise, iea, igg);
    }

    public final Feature[] D() {
        return new Feature[]{eia.a, eia.b, eia.c};
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IAccountDataService");
        if (queryLocalInterface instanceof eol) {
            return (eol) queryLocalInterface;
        }
        return new eoj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.auth.account.data.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.auth.account.data.IAccountDataService";
    }

    public final int d() {
        return 12451000;
    }
}
