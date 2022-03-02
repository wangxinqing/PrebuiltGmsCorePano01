package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.OptInRequest;
import org.chromium.net.UrlRequest;

/* renamed from: rmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class rmc implements igp {
    private final OptInRequest a;

    public rmc(OptInRequest optInRequest) {
        this.a = optInRequest;
    }

    public final void a(Object obj, Object obj2) {
        int i;
        switch (((rmo) ((rmq) obj).x()).a(this.a)) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 3507;
                break;
            case 2:
            case 3:
                i = 5;
                break;
            case 4:
                i = 10;
                break;
            case 5:
                i = 3500;
                break;
            case 6:
                i = 3501;
                break;
            case 7:
                i = 3502;
                break;
            case 8:
                i = 3503;
                break;
            case 10:
                i = 3510;
                break;
            case 11:
                i = 3511;
                break;
            case 12:
                i = 3512;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                i = 3513;
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                i = 3514;
                break;
            default:
                i = 8;
                break;
        }
        ihd.a(new Status(i), (acwd) obj2);
    }
}
