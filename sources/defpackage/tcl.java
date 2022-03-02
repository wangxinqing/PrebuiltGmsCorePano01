package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: tcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tcl extends isy {
    public final Feature[] D() {
        return oqd.h;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
        if (queryLocalInterface instanceof tbz) {
            return (tbz) queryLocalInterface;
        }
        return new tbx(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.mobstore.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.mobstore.IMobStoreFileService";
    }

    public final int d() {
        return 12600000;
    }

    public tcl(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 160, ise, ica, icb);
    }
}
