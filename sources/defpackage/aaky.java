package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: aaky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaky extends aahm {
    public aaky(Context context, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, context.getMainLooper(), 78, ise, iea, igg, aafk);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiService");
        if (queryLocalInterface instanceof aakx) {
            return (aakx) queryLocalInterface;
        }
        return new aakv(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.search.nativeapi.internal.INativeApiService";
    }

    public final int d() {
        return 12600000;
    }
}
