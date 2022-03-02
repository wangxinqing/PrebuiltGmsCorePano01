package defpackage;

import android.os.SystemClock;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.location.reporting.collectors.ble.BleScanner$2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajib implements Runnable {
    final /* synthetic */ acrz a;
    final /* synthetic */ BleScanner$2 b;

    public ajib(BleScanner$2 bleScanner$2, acrz acrz) {
        this.b = bleScanner$2;
        this.a = acrz;
    }

    public final void run() {
        try {
            ajic ajic = this.b.a;
            BleSettings bleSettings = ajic.a;
            jiq jiq = ajic.f;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ajic ajic2 = this.b.a;
            if (!ajic2.n) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (elapsedRealtime2 - ajic2.o <= ajic2.l) {
                    if (!ajic2.p) {
                    }
                }
                ajic2.p = false;
                if (ajic2.a(ajic.a)) {
                    ajic2.o = elapsedRealtime2;
                    try {
                        Thread.sleep(this.b.a.j);
                    } catch (InterruptedException e) {
                    }
                    ajic ajic3 = this.b.a;
                    if (ajic3.g) {
                        ajic3.a(ajic.b);
                    } else {
                        ajic3.b();
                    }
                    jiq jiq2 = this.b.a.f;
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("BLE Scanned for ");
                    sb.append(elapsedRealtime3);
                    sb.append("ms");
                    sb.toString();
                    ajic ajic4 = this.b.a;
                    if (ajic4.m) {
                        ajhv ajhv = ajic4.r;
                        if (ajhv != null) {
                            ajhv.a((List) new ArrayList(ajic4.d));
                        }
                    }
                    int size = ajic4.d.size();
                    StringBuilder sb2 = new StringBuilder(34);
                    sb2.append("BLE: collected ");
                    sb2.append(size);
                    sb2.append(" results");
                    ajix.a("GCoreUlr", sb2.toString());
                    ajic4.d.clear();
                }
            }
            if (this.a.e()) {
                this.a.c();
            }
        } catch (Throwable th) {
            if (this.a.e()) {
                this.a.c();
            }
            throw th;
        }
    }
}
