package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;

/* renamed from: adxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxp extends isy {
    public final Context a;
    public final int u;
    public final String v;
    public final int w;
    public final boolean x;

    public static Bundle a(int i, String str, String str2, int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    public final Feature[] D() {
        return adwf.c;
    }

    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    public final int d() {
        return 12600000;
    }

    public adxp(Context context, Looper looper, ise ise, ica ica, icb icb, int i, int i2, boolean z) {
        super(context, looper, 4, ise, ica, icb);
        this.a = context;
        this.u = i;
        this.v = ise.a();
        this.w = i2;
        this.x = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof adxm) {
            return (adxm) queryLocalInterface;
        }
        return new adxm(iBinder);
    }
}
