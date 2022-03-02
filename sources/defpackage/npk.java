package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.a;

/* renamed from: npk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npk extends a {
    private final int a;

    public npk(Context context, Looper looper, irn irn, iro iro, int i) {
        super(context, looper, irn, iro);
        this.a = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof npp) {
            return (npp) queryLocalInterface;
        }
        return new npn(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.gass.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final int d() {
        return this.a;
    }

    public final npp q() {
        return (npp) super.x();
    }
}
