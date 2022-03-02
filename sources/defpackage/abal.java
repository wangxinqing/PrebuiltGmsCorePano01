package defpackage;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Locale;

/* renamed from: abal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abal extends WebChromeClient {
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        aban.a.b(String.format(Locale.getDefault(), "%s/%s:%d - %s", new Object[]{consoleMessage.messageLevel(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message()}), new Object[0]);
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        message.obj = webView;
        message.sendToTarget();
        return true;
    }
}
