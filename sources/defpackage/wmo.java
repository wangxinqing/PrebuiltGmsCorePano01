package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.chimera.Service;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* renamed from: wmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmo {
    private final amsn a;

    public wmo(amsn amsn) {
        this.a = amsn;
    }

    public static int a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 1;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 3;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                case Service.START_CONTINUATION_MASK:
                    return 4;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    return 5;
                default:
                    return 1;
            }
        } else if (type == 1) {
            return 2;
        } else {
            if (type == 6) {
                return 6;
            }
            if (type != 9) {
                return 1;
            }
            return 7;
        }
    }

    public final void a() {
        this.a.c();
        this.a.d();
    }

    public final void a(Context context, String str, boolean z) {
        this.a.e();
        wml a2 = wml.a();
        long a3 = this.a.a(TimeUnit.MILLISECONDS);
        if (a3 < 0) {
            return;
        }
        if (!z) {
            a2.a(str, a3, 1);
        } else {
            a2.a(str, a3, a(context));
        }
    }
}
