package defpackage;

import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;

/* renamed from: ooq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ooq implements Runnable {
    final /* synthetic */ GoogleHelpRenderingApiWebViewChimeraActivity a;

    public ooq(GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity) {
        this.a = googleHelpRenderingApiWebViewChimeraActivity;
    }

    public final void run() {
        this.a.setResult(2);
    }
}
