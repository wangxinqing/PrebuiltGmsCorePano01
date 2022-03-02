package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: auwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auwd implements aucq {
    static final aucq a = new auwd();

    private auwd() {
    }

    public final boolean a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
            case Service.START_CONTINUATION_MASK:
            case 16:
            case 17:
            case 18:
                return true;
            default:
                return false;
        }
    }
}
