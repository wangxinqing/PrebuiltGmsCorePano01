package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: dva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dva extends isy {
    public dva(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 19, ise, iea, igg);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (queryLocalInterface instanceof duu) {
            return (duu) queryLocalInterface;
        }
        return new dus(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public final int d() {
        return 12600000;
    }

    public final duu a() {
        return (duu) x();
    }
}
