package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: aocv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aocv implements aucq {
    static final aucq a = new aocv();

    private aocv() {
    }

    public final boolean a(int i) {
        if (i == 0) {
            return true;
        }
        switch (i) {
            case ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS:
            case 1001:
            case 1002:
            case 1003:
                return true;
            default:
                return false;
        }
    }
}
