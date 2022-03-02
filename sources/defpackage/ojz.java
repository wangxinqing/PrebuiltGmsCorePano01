package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ojz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojz {
    private final WeakReference a;

    public ojz(HelpChimeraActivity helpChimeraActivity) {
        this.a = new WeakReference(helpChimeraActivity);
    }

    static final avmt a(int i) {
        int i2 = i - 2;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return avmt.CHAT;
                }
                if (i2 == 2) {
                    return avmt.HANGOUTS;
                }
                if (i2 == 3) {
                    return avmt.C2C;
                }
                if (i2 != 50) {
                    return avmt.UNKNOWN_CONTACT_MODE;
                }
            }
            return avmt.EMAIL;
        }
        throw null;
    }

    @JavascriptInterface
    public String getGcmRegistrationId() {
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.a.get();
        if (helpChimeraActivity == null) {
            return "";
        }
        String b = ohj.b(helpChimeraActivity);
        if (TextUtils.isEmpty(b)) {
            return "";
        }
        return b;
    }

    @JavascriptInterface
    public JSONObject getPsd() {
        if (((HelpChimeraActivity) this.a.get()) == null) {
            return new JSONObject();
        }
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.a.get();
        JSONObject jSONObject = new JSONObject();
        List<olz> a2 = helpChimeraActivity.x.a((Context) helpChimeraActivity);
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
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.a.get();
        if (helpChimeraActivity != null) {
            int a2 = ooz.a(str);
            okg.c((nzu) helpChimeraActivity, a(a2));
            if (a2 == 3) {
                HelpConfig helpConfig = helpChimeraActivity.x;
                if (!ofq.a(axqt.b())) {
                    helpConfig.I = str2;
                    helpConfig.J = str3;
                } else {
                    helpConfig.b(str2, (Context) helpChimeraActivity);
                    helpConfig.a(str3, (Context) helpChimeraActivity);
                }
                ChatRequestAndConversationChimeraService.a((Context) helpChimeraActivity, helpConfig);
                helpChimeraActivity.startActivity(ChatConversationChimeraActivity.a(helpChimeraActivity, helpConfig));
                helpChimeraActivity.runOnUiThread(new ojy(helpChimeraActivity));
            }
        }
    }

    @JavascriptInterface
    public void onSubmitError(String str) {
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.a.get();
        if (helpChimeraActivity != null) {
            okg.b((nzu) helpChimeraActivity, a(ooz.a(str)));
        }
    }
}
