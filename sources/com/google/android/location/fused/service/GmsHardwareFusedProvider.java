package com.google.android.location.fused.service;

import android.os.Binder;
import com.android.location.provider.FusedLocationHardware;
import com.android.location.provider.FusedProvider;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsHardwareFusedProvider extends FusedProvider {
    public static final Object a = new Object();
    public static GmsHardwareFusedProvider b;
    private static volatile boolean c = false;
    private volatile FusedLocationHardware d;

    public void setFusedLocationHardware(FusedLocationHardware fusedLocationHardware) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != 1000) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Ignoring calls from non-system server. Uid:");
            sb.append(callingUid);
            sb.toString();
            return;
        }
        this.d = fusedLocationHardware;
        boolean z = aijg.a;
    }
}
