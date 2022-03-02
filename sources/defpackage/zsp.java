package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.chimera.Service;
import java.util.Random;
import org.chromium.net.UrlRequest;

/* renamed from: zsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zsp {
    private static final Random a = new Random();
    private long b;
    private boolean c;
    private final zsi d;
    private final int e;

    public zsp(int i) {
        zsi a2 = zsi.a();
        this.e = i;
        this.d = a2;
    }

    public final void a() {
        this.c = true;
        this.b = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public final void b(Context context, String str, boolean z) {
        int i;
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        if (currentTimeMillis < 0) {
            return;
        }
        if (z) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            i = 4;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case UrlRequest.Status.READING_RESPONSE /*14*/:
                        case Service.START_CONTINUATION_MASK:
                            i = 5;
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                            i = 6;
                            break;
                    }
                } else {
                    i = type != 1 ? type != 6 ? type != 9 ? 2 : 8 : 7 : 3;
                }
                this.d.a(this.e, str, currentTimeMillis, i);
                return;
            }
            i = 2;
            this.d.a(this.e, str, currentTimeMillis, i);
            return;
        }
        this.d.a(this.e, str, currentTimeMillis, 2);
    }

    public final void a(Context context, String str) {
        if (this.c && this.b != 0 && a.nextDouble() >= azdq.a.a().K()) {
            b(context, str, true);
        }
        this.c = false;
    }

    public final void a(Context context, String str, boolean z) {
        if (this.c && this.b != 0) {
            b(context, str, z);
        }
        this.c = false;
    }
}
