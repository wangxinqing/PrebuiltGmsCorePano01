package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface c extends IInterface {
    IBinder newAdShieldClient(String str, mby mby);

    IBinder newAdShieldClientWithoutAdvertisingId(String str, mby mby);
}
