package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: nba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nba extends isy {
    public final Feature[] D() {
        return myr.e;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
        if (queryLocalInterface instanceof nbb) {
            return (nbb) queryLocalInterface;
        }
        return new nbb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.fido.fido2.zeroparty.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService";
    }

    public final int d() {
        return 13000000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.zeroparty.START");
        return bundle;
    }

    public nba(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 180, ise, ica, icb);
    }
}
