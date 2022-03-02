package defpackage;

import org.chromium.net.UrlRequest;

/* renamed from: amqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqd extends amqm {
    static final amqm a = new amqd();

    private amqd() {
    }

    public final boolean a(char c) {
        if (!(c == ' ' || c == 133 || c == 5760)) {
            if (c != 8199) {
                if (!(c == 8287 || c == 12288 || c == 8232 || c == 8233)) {
                    switch (c) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
