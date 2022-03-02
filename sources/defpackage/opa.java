package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: opa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class opa {
    public static WebViewClient a(nzu nzu) {
        int i = Build.VERSION.SDK_INT;
        return new oou(nzu);
    }

    public static void b(WebView webView, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (!ofq.b(axpv.a.a().a())) {
            str5 = axnu.c();
        } else if (!z) {
            str5 = axmj.a.a().S();
        } else {
            str5 = axnu.c();
        }
        webView.loadDataWithBaseURL(str, a(str2, str3, str4, str5, true), "text/html", "UTF-8", (String) null);
    }

    public static String a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head>");
        if (!z) {
            str5 = "<style>.ghelp-search-snippet {  font-size:small;  margin-top:4px;}</style>";
        } else {
            str5 = "<style>.ghelp-body { margin: 0; }</style>";
        }
        sb.append(str5);
        sb.append("<title>");
        sb.append(str);
        sb.append("</title></head><body class=\"ghelp-body\"><script>window['sc_visit_id'] = '");
        sb.append(TextUtils.htmlEncode(str3));
        sb.append("'; </script>");
        sb.append(str4);
        sb.append("<div class=\"ghelp-content\">");
        sb.append(str2);
        sb.append("</div></body></html>");
        return sb.toString();
    }

    public static void a(Context context, WebView webView) {
        if (!a(context)) {
            webView.setOnLongClickListener(new ooy());
        }
    }

    public static void a(Activity activity, Intent intent, HelpConfig helpConfig) {
        intent.setClassName(activity, "com.google.android.gms.googlehelp.webview.GoogleHelpWebViewActivity");
        intent.putExtra("EXTRA_HELP_CONFIG", helpConfig);
        activity.startActivityForResult(intent, 0);
    }

    public static void a(Activity activity, Uri uri, HelpConfig helpConfig, okc okc) {
        if (!jkf.a(activity)) {
            Toast.makeText(activity, activity.getString(R.string.gh_network_request_failed), 0).show();
            return;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(uri);
        if (!jhg.a((Context) activity, data)) {
            a(activity, data, helpConfig);
            return;
        }
        activity.startActivity(data);
        okg.a((Context) activity, helpConfig, uri.toString(), okc);
    }

    public static void a(WebView webView, String str, String str2, String str3, String str4, boolean z) {
        webView.loadDataWithBaseURL(str, a(str2, str3, str4, "", z), "text/html", "UTF-8", (String) null);
    }

    public static void a(nzu nzu, WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkLoads(false);
        settings.setBlockNetworkImage(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        if ("goldfish".equals(Build.HARDWARE)) {
            webView.setBackgroundColor(0);
        }
        webView.setOnTouchListener(new oox(settings, webView));
        webView.setWebChromeClient(new WebChromeClient());
        int i = Build.VERSION.SDK_INT;
        a(nzu.k(), webView);
        settings.setDomStorageEnabled(true);
    }

    public static boolean a(Context context) {
        if (!jkr.b()) {
            return true;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException e) {
            Log.w("gH_WebViewUtils", "USER_SETUP_COMPLETE setting not found, assuming it was completed.", e);
            return true;
        }
    }

    public static boolean a(Activity activity, Intent intent, HelpConfig helpConfig, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (!(intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null)) {
            Uri data = intent.getData();
            String uri = data.toString();
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (oab.a(uri, oal.a(), helpConfig, z, i) != null && oow.a(data, true)) {
                intent.setClassName(activity, "com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewActivity");
                intent.putExtra("EXTRA_HELP_CONFIG", helpConfig);
                intent.putExtra("extra_is_from_chat", z);
                if (axor.c()) {
                    if (i == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    intent.putExtra("extra_is_from_c2c", z3);
                }
                if (i == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intent.putExtra("extra_is_from_email", z2);
                if (i == 5) {
                    z4 = true;
                }
                intent.putExtra("extra_is_from_sj", z4);
                activity.startActivityForResult(intent, 1);
                return true;
            }
        }
        return false;
    }

    static boolean a(String str, oiy oiy, agxz agxz) {
        String str2;
        HelpConfig helpConfig = oiy.x;
        if (helpConfig != null) {
            Uri parse = Uri.parse(str);
            String uri = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
            if (!ofx.a(uri, axor.a.a().d())) {
                if (!TextUtils.isEmpty(uri)) {
                    ob obVar = new ob(r5);
                    for (String trim : TextUtils.split(axor.a.a().c(), ",")) {
                        String trim2 = trim.trim();
                        if (!TextUtils.isEmpty(trim2)) {
                            obVar.add(trim2);
                        }
                    }
                    for (String str3 : ofx.a(axor.a.a().e())) {
                        if (!TextUtils.isEmpty(str3)) {
                            String[] split = TextUtils.split(str3, "%1\\$s");
                            if (split.length == 2 && uri.startsWith(split[0]) && uri.endsWith(split[1]) && obVar.contains(uri.substring(split[0].length(), uri.length() - split[1].length()))) {
                            }
                        }
                    }
                }
            }
            Account account = helpConfig.d;
            if (account == null) {
                str2 = "";
            } else {
                try {
                    str2 = account.name;
                } catch (agxy e) {
                    a((Activity) oiy, parse, helpConfig, oiy.y);
                }
            }
            agxz.a(oiy, str2);
            return true;
        }
        return false;
    }
}
