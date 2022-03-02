package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: aogz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aogz {
    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 19) {
            return 20;
        }
        switch (i) {
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                switch (i) {
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                        return 14;
                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                        return 15;
                    case Service.START_CONTINUATION_MASK:
                        return 16;
                    case 16:
                        return 17;
                    case 17:
                        return 18;
                    default:
                        return 0;
                }
        }
    }
}
