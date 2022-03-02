package defpackage;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.auth.login.BrowserChimeraActivity;

/* renamed from: ggf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggf extends WebChromeClient {
    final /* synthetic */ BrowserChimeraActivity a;

    public ggf(BrowserChimeraActivity browserChimeraActivity) {
        this.a = browserChimeraActivity;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        message.obj = this.a.q;
        message.sendToTarget();
        return true;
    }
}
