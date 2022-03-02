package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.mdns.MdnsOptions;

/* renamed from: sol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sol extends isy {
    public final ou a = new ou();
    private final MdnsOptions u;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdns.internal.IMdnsApiService");
        if (queryLocalInterface instanceof soa) {
            return (soa) queryLocalInterface;
        }
        return new soa(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.mdns.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.mdns.internal.IMdnsApiService";
    }

    public final int d() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("MDNS_OPTIONS", ivy.a(this.u));
        return bundle;
    }

    public sol(Context context, Looper looper, ise ise, ica ica, icb icb, MdnsOptions mdnsOptions) {
        super(context, looper, 168, ise, ica, icb);
        this.u = mdnsOptions;
    }
}
