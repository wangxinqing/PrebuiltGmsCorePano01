package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: nw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nw {
    public static final np a = new nu((ns) null, false);
    public static final np b = new nu((ns) null, true);
    public static final np c = new nu(nr.a, false);
    public static final np d = new nu(nr.a, true);

    static {
        new nu(nq.a, false);
        int i = nv.a;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                case Service.START_CONTINUATION_MASK:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
