package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ooo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ooo {
    final /* synthetic */ GoogleHelpRenderingApiWebViewChimeraActivity a;

    public ooo(GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity) {
        this.a = googleHelpRenderingApiWebViewChimeraActivity;
    }

    @JavascriptInterface
    public String getGcmRegistrationId() {
        String b = ohj.b(this.a);
        return TextUtils.isEmpty(b) ? "" : b;
    }

    @JavascriptInterface
    public JSONObject getPsd() {
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = this.a;
        HelpConfig helpConfig = googleHelpRenderingApiWebViewChimeraActivity.x;
        JSONObject jSONObject = new JSONObject();
        List<olz> a2 = helpConfig.a((Context) googleHelpRenderingApiWebViewChimeraActivity);
        if (a2 != null && !a2.isEmpty()) {
            try {
                for (olz olz : a2) {
                    jSONObject.put(olz.b, olz.c);
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return jSONObject;
    }

    @JavascriptInterface
    public void onSubmit(String str, String str2, String str3) {
        int a2 = ooz.a(str);
        okg.c((nzu) this.a, GoogleHelpRenderingApiWebViewChimeraActivity.a(a2));
        if (a2 == 3) {
            if (ofq.a(axqt.b())) {
                GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = this.a;
                googleHelpRenderingApiWebViewChimeraActivity.x.b(str2, (Context) googleHelpRenderingApiWebViewChimeraActivity);
                GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity2 = this.a;
                googleHelpRenderingApiWebViewChimeraActivity2.x.a(str3, (Context) googleHelpRenderingApiWebViewChimeraActivity2);
            } else {
                HelpConfig helpConfig = this.a.x;
                helpConfig.I = str2;
                helpConfig.J = str3;
            }
            GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity3 = this.a;
            ChatRequestAndConversationChimeraService.a((Context) googleHelpRenderingApiWebViewChimeraActivity3, googleHelpRenderingApiWebViewChimeraActivity3.x);
            GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity4 = this.a;
            googleHelpRenderingApiWebViewChimeraActivity4.startActivity(ChatConversationChimeraActivity.a(googleHelpRenderingApiWebViewChimeraActivity4, googleHelpRenderingApiWebViewChimeraActivity4.x));
            this.a.finish();
        }
    }

    @JavascriptInterface
    public void onSubmitError(String str) {
        okg.b((nzu) this.a, GoogleHelpRenderingApiWebViewChimeraActivity.a(ooz.a(str)));
    }
}
