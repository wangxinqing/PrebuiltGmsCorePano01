package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class oos extends WebViewClient {
    protected final HelpChimeraActivity a;
    protected final nzv b;
    private ofn c;
    private final oah d = new oah(this.a, this.b);

    public oos(HelpChimeraActivity helpChimeraActivity, nzv nzv) {
        this.a = helpChimeraActivity;
        this.b = nzv;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.b.d > 0.0f) {
            webView.postDelayed(new oor(this, webView), 10);
        }
        nzv nzv = this.b;
        HelpChimeraActivity helpChimeraActivity = this.a;
        myp myp = nzv.g;
        if (myp != null) {
            int i = nzv.i;
            long a2 = myp.a();
            avmw avmw = avmw.HELP_ANSWER_FRAGMENT;
            String str2 = nzv.c;
            oab oab = nzv.a;
            okg.a((nzu) helpChimeraActivity, i, a2, avmw, str2, oab != null ? oab.e : null, nzv.b);
            nzv.g = null;
            nzv.i = 1;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        HelpChimeraActivity helpChimeraActivity;
        InProductHelp inProductHelp;
        if (!opa.a(str, (oiy) this.a, new agxz())) {
            Uri parse = Uri.parse(str);
            if (!this.d.a(parse, 29)) {
                if (!ofq.b(axpp.d()) || !this.b.c()) {
                    oab a2 = oab.a(str, this.b.d(), this.a.x);
                    if (a2 != null) {
                        if (this.c == null) {
                            this.c = new ofn(this.a);
                        }
                        String a3 = this.c.a(a2.e);
                        if (!TextUtils.isEmpty(a3)) {
                            a2.l = a3;
                        }
                        if (!this.b.b()) {
                            okg.a((nzu) this.a, 29, a2.e, -1, "");
                        }
                        ooe.a(this.a, a2, 29, -1);
                        return true;
                    } else if (TextUtils.isEmpty(str) || (helpChimeraActivity = this.a) == null) {
                        return false;
                    } else {
                        opa.a((Activity) helpChimeraActivity, parse, helpChimeraActivity.x, helpChimeraActivity.y);
                        return true;
                    }
                } else {
                    Intent intent = this.a.getIntent();
                    HelpConfig helpConfig = this.a.x;
                    if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
                        inProductHelp = (InProductHelp) ivy.a(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
                    } else {
                        inProductHelp = new InProductHelp((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"), (String) null, (String) null, 0, (String) null, 0);
                    }
                    inProductHelp.a.D = helpConfig.e;
                    inProductHelp.c = str;
                    inProductHelp.b();
                    Intent intent2 = new Intent(this.a.getIntent());
                    ivy.a((SafeParcelable) inProductHelp, intent2, "EXTRA_IN_PRODUCT_HELP");
                    this.a.startActivity(intent2);
                    return true;
                }
            }
        }
        return true;
    }
}
