package defpackage;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import java.util.List;

/* renamed from: nkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nkz extends ScanCallback {
    private final njy a;

    public nkz(Context context, String str) {
        this.a = new njy(context, (Class) getClass(), 18, str);
    }

    public void a(int i) {
    }

    public void a(int i, ScanResult scanResult) {
        throw null;
    }

    public final void onBatchScanResults(List list) {
        amky a2 = njy.a(this.a, "onBatchScanResults");
        if (a2 != null) {
            a2.close();
        }
    }

    public final void onScanFailed(int i) {
        amky a2 = njy.a(this.a, "onScanFailed");
        try {
            a(i);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        amky a2 = njy.a(this.a, "onScanResult");
        try {
            a(i, scanResult);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public nkz(String str, String str2) {
        this.a = new njy((Class) getClass(), 18, str2, str);
    }
}
