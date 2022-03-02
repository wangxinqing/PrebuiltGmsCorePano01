package com.google.android.gms.ads.internal.overlay.client;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a extends mcb {
    public a() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof b) {
            return (b) queryLocalInterface;
        }
        return new b(iBinder);
    }
}
