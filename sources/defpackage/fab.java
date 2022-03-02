package defpackage;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: fab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fab extends WebChromeClient {
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        fae.a.d("%s/%s:%d - %s", consoleMessage.messageLevel(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message());
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        message.obj = webView;
        message.sendToTarget();
        return true;
    }
}
