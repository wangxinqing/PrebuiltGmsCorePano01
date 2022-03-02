package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: lzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lzn extends isy {
    public lzn(Context context, Looper looper, iea iea, igg igg) {
        super(context, looper, 25, ise.a(context), iea, igg);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        if (queryLocalInterface instanceof mac) {
            return (mac) queryLocalInterface;
        }
        return new maa(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.droidguard.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    public final int d() {
        return 12800000;
    }
}
