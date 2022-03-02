package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: xkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xkf implements auco {
    UNKNOWN(0),
    ONLY_EXIST_IN_SERVER(1),
    ONLY_EXIST_IN_LOCAL(2),
    DATA1(3),
    DATA2(4),
    DATA3(5),
    DATA4(6),
    DATA5(7),
    DATA6(8),
    DATA7(9),
    DATA8(10),
    DATA9(11),
    DATA10(12),
    DATA11(13),
    DATA12(14),
    DATA13(15),
    DATA14(16),
    DATA15(17),
    IS_PRIMARY(18),
    GROUP_SOURCE_ID(19),
    SYNC1(20),
    SYNC2(21),
    SYNC3(22);
    
    public final int x;

    private xkf(int i) {
        this.x = i;
    }

    public static xkf a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ONLY_EXIST_IN_SERVER;
            case 2:
                return ONLY_EXIST_IN_LOCAL;
            case 3:
                return DATA1;
            case 4:
                return DATA2;
            case 5:
                return DATA3;
            case 6:
                return DATA4;
            case 7:
                return DATA5;
            case 8:
                return DATA6;
            case 9:
                return DATA7;
            case 10:
                return DATA8;
            case 11:
                return DATA9;
            case 12:
                return DATA10;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return DATA11;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return DATA12;
            case Service.START_CONTINUATION_MASK:
                return DATA13;
            case 16:
                return DATA14;
            case 17:
                return DATA15;
            case 18:
                return IS_PRIMARY;
            case 19:
                return GROUP_SOURCE_ID;
            case 20:
                return SYNC1;
            case 21:
                return SYNC2;
            case 22:
                return SYNC3;
            default:
                return null;
        }
    }

    public static aucq b() {
        return xke.a;
    }

    public final int a() {
        return this.x;
    }

    public final String toString() {
        return Integer.toString(this.x);
    }
}
