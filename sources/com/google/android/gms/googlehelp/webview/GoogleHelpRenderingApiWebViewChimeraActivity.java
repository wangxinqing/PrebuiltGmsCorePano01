package com.google.android.gms.googlehelp.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.chimera.Activity;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleHelpRenderingApiWebViewChimeraActivity extends oiy {
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public LinearLayout e;
    private String f;
    private boolean g;
    private oab h;
    private boolean i;
    private boolean j;
    private WebView k;
    private aoru l;

    public static final avmt a(int i2) {
        int i3 = i2 - 2;
        if (i2 != 0) {
            if (i3 != 0) {
                if (i3 == 1) {
                    return avmt.CHAT;
                }
                if (i3 == 2) {
                    return avmt.HANGOUTS;
                }
                if (i3 == 3) {
                    return avmt.C2C;
                }
                if (i3 != 50) {
                    return avmt.UNKNOWN_CONTACT_MODE;
                }
            }
            return avmt.EMAIL;
        }
        throw null;
    }

    private final void m() {
        setResult(0);
        finish();
    }

    public final void e() {
        oab oab = this.h;
        boolean z = this.g;
        if (this.l == null) {
            this.l = jfm.a(9);
        }
        aoru aoru = this.l;
        new ooi(new WeakReference(this), oab, z, aoru).executeOnExecutor(aoru, new Void[0]);
    }

    public final ofn i() {
        throw null;
    }

    public final oar j() {
        throw null;
    }

    public final void onBackPressed() {
        WebView webView = this.k;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.k.goBack();
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        oab oab = this.h;
        if (oab == null || !oab.p()) {
            return super.onCreateOptionsMenu(menu);
        }
        if (this.x != null) {
            getMenuInflater().inflate(R.menu.gh_rendering_api_webview_activity_menu, menu);
        } else {
            getMenuInflater().inflate(R.menu.gh_rendering_api_activity_menu, menu);
        }
        if (!ofy.b()) {
            return true;
        }
        ofx.a(menu.findItem(R.id.gh_rendering_api_activity_menu_close), (Context) this, ofy.a(this, R.attr.ghf_greyIconColor));
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId != R.id.gh_rendering_api_activity_menu_close) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            setResult(1);
            finish();
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        if (!(getIntent() == null || getIntent().getData() == null)) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", this.x);
            bundle.putString("saved_instance_state_content_url", this.a);
            bundle.putString("saved_instance_state_page_title", this.b);
        }
        super.onSaveInstanceState(bundle);
    }

    public final void l() {
        WebView webView = new WebView(this);
        webView.setWebViewClient(opa.a((nzu) this));
        opa.a((nzu) this, webView);
        if (!ofq.b(axpp.d()) && this.j) {
            webView.addJavascriptInterface(new ooo(this), "activity");
        } else {
            webView.addJavascriptInterface(new oop(this), "activity");
        }
        opa.b(webView, this.f, this.b, this.a, omt.a(this.x), this.j);
        setContentView((View) webView);
        if (!ofq.b(axpp.d()) && this.j) {
            this.k = webView;
        }
    }

    public final void onCreate(Bundle bundle) {
        int i2;
        int i3;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.w("gH_RndrApiWebViewActvty", "The intent that started the Activity is null.");
            m();
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            Log.w("gH_RndrApiWebViewActvty", "The intent data is null.");
            m();
        } else if (!oow.a(data, true)) {
            String valueOf = String.valueOf(data);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("The URL is not whitelisted to be shown: ");
            sb.append(valueOf);
            Log.w("gH_RndrApiWebViewActvty", sb.toString());
            a(data);
        } else {
            if (this.x != null) {
                boolean a2 = ofy.a();
                int i4 = R.style.gh_DarkActivityStyle;
                if (a2) {
                    ofy.a((Activity) this, this.x, (int) R.style.gh_LightActivityStyle, (int) R.style.gh_DarkActivityStyle, (int) R.style.gh_DayNightActivityStyle);
                } else {
                    if (!ofy.a(this.x)) {
                        i4 = R.style.gh_LightActivityStyle;
                    }
                    setTheme(i4);
                }
                sg aE = aE();
                if (aE != null) {
                    if (ofy.b()) {
                        aE.c(ofx.b(kf.a((Context) this, (int) R.drawable.quantum_ic_arrow_back_black_24), (Context) this, ofy.a(this, R.attr.ghf_greyIconColor)));
                    } else {
                        aE.o();
                    }
                    if (!this.c) {
                        i3 = R.string.close_button_label;
                    } else {
                        i3 = R.string.gh_switch_back_to_chat_button_description;
                    }
                    aE.e(i3);
                    aE.b(true);
                    aE.c(true);
                }
            }
            this.c = intent.getBooleanExtra("extra_is_from_chat", false);
            this.d = intent.getBooleanExtra("extra_is_from_email", false);
            this.i = intent.getBooleanExtra("extra_is_from_c2c", false);
            this.j = intent.getBooleanExtra("extra_is_from_sj", false);
            this.f = data.toString();
            if (!this.c) {
                i2 = !this.d ? !this.i ? 1 : 4 : 3;
            } else {
                i2 = 2;
            }
            oab a3 = oab.a(this.f, oal.a(), this.x, this.c, i2);
            this.h = a3;
            if (a3 != null) {
                if (!ofq.a(axng.b())) {
                    oay.a((Activity) this);
                }
                this.g = intent.getBooleanExtra("requireGcmToken", false);
                if (bundle != null) {
                    this.a = bundle.getString("saved_instance_state_content_url");
                    this.b = bundle.getString("saved_instance_state_page_title");
                    l();
                } else {
                    if (this.d) {
                        this.b = getString(R.string.gh_email_form_title);
                    } else if (this.h.p()) {
                        this.b = getString(R.string.gh_survey);
                    } else if (this.h.c == 21) {
                        okg.g(this, 164);
                        this.b = getString(R.string.gh_c2c_form_title);
                    } else if (this.j) {
                        this.b = getString(R.string.gh_top_appbar_support_label);
                    } else {
                        this.b = getString(R.string.common_list_apps_menu_help);
                    }
                    e();
                }
                setTitle((CharSequence) this.b);
                aE().a((CharSequence) this.b);
                setResult(-1);
                return;
            }
            Log.w("gH_RndrApiWebViewActvty", String.format("Not a recognized support URL: %s", new Object[]{this.f}));
            a(data);
        }
    }

    private final void a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (!jhg.a((Context) this, intent)) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("No activity can handle this URL: ");
            sb.append(valueOf);
            Log.w("gH_RndrApiWebViewActvty", sb.toString());
            m();
            return;
        }
        startActivity(intent);
        finish();
    }
}
