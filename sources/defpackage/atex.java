package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: atex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atex implements auco {
    ACR_UNKNOWN(0),
    ACR_GCORE(1),
    ACR_UDC(2),
    ACR_GOOGLE_HEART(3),
    ACR_GOOGLE_NOW(4),
    ACR_GOOGLE_PHOTOS(5),
    ACR_GOOGLE_PLUS(6),
    ACR_GMAIL(7),
    ACR_GMM(8),
    ACR_GMM_DOGFOOD(9),
    ACR_GMM_FISHFOOD(10),
    ACR_GMM_DEV(11),
    ACR_GMM_QP(12),
    ACR_RIDE_WITH(13),
    ACR_WAITING_TIME(14),
    ACR_FAMILY_COMPASS(15),
    ACR_WAZE(16),
    ACR_EMERGENCY_ASSIST(17),
    ACR_RIDEMATCH(18),
    ACR_RIDEMATCH_US(19),
    ACR_TYCHO(20),
    ACR_YOUTUBE_MUSIC(21);
    
    public final int w;

    private atex(int i) {
        this.w = i;
    }

    public static atex a(int i) {
        switch (i) {
            case 0:
                return ACR_UNKNOWN;
            case 1:
                return ACR_GCORE;
            case 2:
                return ACR_UDC;
            case 3:
                return ACR_GOOGLE_HEART;
            case 4:
                return ACR_GOOGLE_NOW;
            case 5:
                return ACR_GOOGLE_PHOTOS;
            case 6:
                return ACR_GOOGLE_PLUS;
            case 7:
                return ACR_GMAIL;
            case 8:
                return ACR_GMM;
            case 9:
                return ACR_GMM_DOGFOOD;
            case 10:
                return ACR_GMM_FISHFOOD;
            case 11:
                return ACR_GMM_DEV;
            case 12:
                return ACR_GMM_QP;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return ACR_RIDE_WITH;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return ACR_WAITING_TIME;
            case Service.START_CONTINUATION_MASK:
                return ACR_FAMILY_COMPASS;
            case 16:
                return ACR_WAZE;
            case 17:
                return ACR_EMERGENCY_ASSIST;
            case 18:
                return ACR_RIDEMATCH;
            case 19:
                return ACR_RIDEMATCH_US;
            case 20:
                return ACR_TYCHO;
            case 21:
                return ACR_YOUTUBE_MUSIC;
            default:
                return null;
        }
    }

    public static aucq b() {
        return atew.a;
    }

    public final int a() {
        return this.w;
    }

    public final String toString() {
        return Integer.toString(this.w);
    }
}
