package defpackage;

import android.net.wifi.ScanResult;
import java.util.concurrent.TimeUnit;

/* renamed from: akux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akux {
    private static final long c = TimeUnit.HOURS.toMillis(1);
    private int a = 0;
    private int b;

    public final boolean a(long j, ScanResult[] scanResultArr) {
        int length;
        int i = this.a;
        int i2 = 0;
        if (i != 0) {
            return i != 1;
        }
        if (scanResultArr == null || (length = scanResultArr.length) == 0) {
            return true;
        }
        if (i == 0) {
            this.b++;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                ScanResult scanResult = scanResultArr[i2];
                if (scanResult != null) {
                    long j2 = scanResult.timestamp / 1000;
                    if (j2 != 0 && j2 != -1) {
                        if (Math.abs(j - j2) > c) {
                            this.a = 1;
                            break;
                        } else if (this.b > 6) {
                            this.a = 2;
                        }
                    } else {
                        this.a = 1;
                    }
                }
                i2++;
            }
        }
        return a(j, (ScanResult[]) null);
    }
}
