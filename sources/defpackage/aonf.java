package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: aonf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aonf {
    public static int a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return 15;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return 16;
            case Service.START_CONTINUATION_MASK:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            case 22:
                return 24;
            case 23:
                return 25;
            case 24:
                return 26;
            default:
                return 0;
        }
    }
}
