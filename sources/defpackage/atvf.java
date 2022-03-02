package defpackage;

import org.chromium.net.UrlRequest;

/* renamed from: atvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atvf implements aucq {
    public static final aucq a = new atvf();

    private atvf() {
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
                return true;
            default:
                return false;
        }
    }
}
