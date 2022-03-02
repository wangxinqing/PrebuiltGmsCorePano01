package defpackage;

import org.chromium.net.UrlRequest;

/* renamed from: bawn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bawn extends UrlRequest.StatusListener {
    private final UrlRequest.StatusListener a;

    public bawn(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
