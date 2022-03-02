package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c extends mcb {
    public c() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }
}
