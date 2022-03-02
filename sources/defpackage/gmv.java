package defpackage;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Locale;

/* renamed from: gmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gmv extends WebChromeClient {
    final /* synthetic */ gmx a;

    public gmv(gmx gmx) {
        this.a = gmx;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        gmx.a.b(String.format(Locale.getDefault(), "%s/%s:%d - %s", new Object[]{consoleMessage.messageLevel(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message()}), new Object[0]);
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        message.obj = this.a.c;
        message.sendToTarget();
        return true;
    }
}
