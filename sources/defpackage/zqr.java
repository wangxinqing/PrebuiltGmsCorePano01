package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: zqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqr extends isy {
    public zqr(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 205, ise, iea, igg);
    }

    public final Feature[] D() {
        return zoq.e;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptcha.internal.IRecaptchaService");
        if (queryLocalInterface instanceof zqq) {
            return (zqq) queryLocalInterface;
        }
        return new zqo(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.recaptcha.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.recaptcha.internal.IRecaptchaService";
    }

    public final int d() {
        return 17108000;
    }
}
