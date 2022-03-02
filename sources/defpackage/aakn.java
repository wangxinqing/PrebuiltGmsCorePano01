package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: aakn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aakn extends aahm {
    public aakn(Context context, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, context.getMainLooper(), 66, ise, iea, igg, aafk);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.ime.internal.IIMEUpdatesService");
        if (queryLocalInterface instanceof aakm) {
            return (aakm) queryLocalInterface;
        }
        return new aakk(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.search.ime.internal.IIMEUpdatesService";
    }

    public final int d() {
        return 12600000;
    }
}
