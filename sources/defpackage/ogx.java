package defpackage;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.WebView;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ogx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ogx {
    final /* synthetic */ WebView a;
    final /* synthetic */ ohd b;

    public ogx(ohd ohd, WebView webView) {
        this.b = ohd;
        this.a = webView;
    }

    @JavascriptInterface
    public String getGcmRegistrationId() {
        String b2 = ohj.b(this.b.getContext());
        return TextUtils.isEmpty(b2) ? "" : b2;
    }

    @JavascriptInterface
    public JSONObject getPsd() {
        ohd ohd = this.b;
        HelpConfig f = ohd.c.f();
        JSONObject jSONObject = new JSONObject();
        List<olz> a2 = f.a(ohd.getContext());
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
        okg.c(this.b.c, ohd.a(a2));
        if (a2 == 3) {
            HelpConfig f = this.b.c.f();
            if (ofq.a(axqt.b())) {
                f.b(str2, this.b.getContext());
                f.a(str3, this.b.getContext());
            } else {
                f.I = str2;
                f.J = str3;
            }
            ChatRequestAndConversationChimeraService.a(this.b.getContext(), f);
            ohd ohd = this.b;
            ohd.startActivity(ChatConversationChimeraActivity.a(ohd.getContext(), f));
            if (this.b.c instanceof HelpChimeraActivity) {
                this.a.post(new ogw(this));
            }
        }
    }

    @JavascriptInterface
    public void onSubmitError(String str) {
        okg.b((nzu) this.b.getContext(), ohd.a(ooz.a(str)));
    }
}
