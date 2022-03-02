package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: aajt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aajt extends aahm {
    public aajt(Context context, Looper looper, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, looper, 33, ise, iea, igg, aafk);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
        if (queryLocalInterface instanceof aajz) {
            return (aajz) queryLocalInterface;
        }
        return new aajx(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.search.global.internal.IGlobalSearchAdminService";
    }

    public final int d() {
        return 12600000;
    }

    public aajt(Context context, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, context.getMainLooper(), 33, ise, iea, igg, aafk);
    }
}
