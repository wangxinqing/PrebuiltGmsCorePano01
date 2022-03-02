package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: acix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acix extends isy {
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
        if (queryLocalInterface instanceof acjv) {
            return (acjv) queryLocalInterface;
        }
        return new acjt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.smartdevice.setup.accounts.AccountsService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService";
    }

    public final int d() {
        return 12800000;
    }

    public acix(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 81, ise, ica, icb);
    }
}
