package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: aahl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aahl extends aahm {
    public aahl(Context context, Looper looper, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, looper, 30, ise, iea, igg, aafk);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
        if (queryLocalInterface instanceof aahd) {
            return (aahd) queryLocalInterface;
        }
        return new aahb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.search.administration.internal.ISearchAdministrationService";
    }

    public final int d() {
        return 12600000;
    }

    public aahl(Context context, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, context.getMainLooper(), 30, ise, iea, igg, aafk);
    }
}
