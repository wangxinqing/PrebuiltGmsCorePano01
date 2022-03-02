package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastPairScanner$FastPairFoundScanCallback extends nkz {
    public static final /* synthetic */ int c = 0;
    public final txr a;
    public final AtomicInteger b = new AtomicInteger(-1);
    private final arwg d;

    public FastPairScanner$FastPairFoundScanCallback(Context context, txr txr, arwg arwg) {
        super(context, "nearby");
        this.a = txr;
        this.d = arwg;
    }

    public final void a(int i, ScanResult scanResult) {
        byte[] serviceData;
        if (scanResult.getScanRecord() != null && scanResult.getDevice() != null && (serviceData = scanResult.getScanRecord().getServiceData(tzr.b)) != null) {
            String a2 = jjp.a(serviceData);
            if (a2.length() >= 6) {
                if (tzr.a.contains(a2.substring(0, 6))) {
                    return;
                }
            }
            int i2 = this.b.get();
            if (aymw.P()) {
                this.d.c(new tzp(this, "reportSighting", scanResult, i2));
            } else {
                this.a.b(scanResult, i2);
            }
        }
    }
}
