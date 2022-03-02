package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b extends mcb {
    public b() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }
}
