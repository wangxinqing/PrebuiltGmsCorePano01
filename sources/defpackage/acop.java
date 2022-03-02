package defpackage;

import android.webkit.ValueCallback;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;

/* renamed from: acop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acop implements ValueCallback {
    final /* synthetic */ String a;
    final /* synthetic */ AccountChallengeWebView b;

    public acop(AccountChallengeWebView accountChallengeWebView, String str) {
        this.b = accountChallengeWebView;
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        Boolean bool = (Boolean) obj;
        this.b.l.loadUrl(this.a);
    }
}
