package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: anux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anux implements aucq {
    static final aucq a = new anux();

    private anux() {
    }

    public final boolean a(int i) {
        if (!(i == 0 || i == 1 || i == 2)) {
            switch (i) {
                case 11:
                case 12:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                case Service.START_CONTINUATION_MASK:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
