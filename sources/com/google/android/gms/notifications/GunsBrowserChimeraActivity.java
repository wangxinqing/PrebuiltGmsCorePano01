package com.google.android.gms.notifications;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GunsBrowserChimeraActivity extends Activity implements LoaderManager.LoaderCallbacks, wjn {
    public static final jjg a = jjg.a(iyc.GUNS);
    private static final IntentFilter f = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
    public final Set b;
    public WebView c;
    public boolean d;
    public ProgressBar e;
    private final Set g;
    private amen h;
    private amew i;
    private wjo j;
    private boolean k;
    private String l;
    private GunsSmsReceiver m;
    private Handler n;

    public GunsBrowserChimeraActivity() {
        HashSet hashSet = new HashSet();
        if (aynt.a.a().o()) {
            hashSet.addAll(Arrays.asList(new String[]{"adssettings.google.com", "myaccount.google.com", "security.google.com", "www.google.com", "accounts.google.com", "accounts.google.net", "accounts.google.org", "accounts.google.biz", "accounts.google.info", "accounts.google.mobi", "accounts.google.name", "accounts.google.pro", "accounts.google.us", "accounts.google.ag", "accounts.google.ba", "accounts.google.ca", "accounts.google.co.cr", "accounts.google.co.uk", "accounts.g.cn", "accounts.google.cn", "accounts.google.com.cn", "accounts.guge.com", "accounts.guge.com.cn", "accounts.guge.cn", "accounts.googel.cn", "accounts.xn--flW351E.cn", "accounts.google.al", "accounts.google.org.uk", "accounts.google.cl", "accounts.google.de", "accounts.google.ec", "accounts.google.ee", "accounts.google.fi", "accounts.google.fr", "accounts.google.gd", "accounts.google.ge", "accounts.google.gy", "accounts.google.com.gy", "accounts.google.ie", "accounts.google.in", "accounts.google.net.in", "accounts.google.org.in", "accounts.google.it", "accounts.google.co.nz", "accounts.google.org.nz", "accounts.google.net.nz", "accounts.google.co.at", "accounts.google.com.af", "accounts.google.org.af", "accounts.google.at", "accounts.google.com.au", "accounts.google.com.br", "accounts.google.com.gt", "accounts.google.com.mx", "accounts.google.mx", "accounts.google.co.ma", "accounts.google.jobs", "accounts.google.cz", "accounts.google.hu", "accounts.google.co.hu", "accounts.google.nl", "accounts.google.is", "accounts.google.dk", "accounts.google.pf", "accounts.google.com.pg", "accounts.google.pl", "accounts.google.com.pl", "accounts.google.com.ph", "accounts.google.com.pr", "accounts.google.ro", "accounts.google.se", "accounts.google.ch", "accounts.google.gm", "accounts.xn--2e0b0k.kr", "accounts.google.co.kr", "accounts.google.kr", "accounts.google.jp", "accounts.google.co.jp", "accounts.google.ne.jp", "accounts.google.co.je", "accounts.google.com.ar", "accounts.google.am", "accounts.google.be", "accounts.google.fm", "accounts.google.tv", "accounts.google.vg", "accounts.google.bi", "accounts.google.cc", "accounts.google.cd", "accounts.google.co.il", "accounts.google.kz", "accounts.google.la", "accounts.google.lv", "accounts.google.lt", "accounts.google.md", "accounts.google.mw", "accounts.google.mr", "accounts.google.ms", "accounts.google.nr", "accounts.google.nu", "accounts.google.ps", "accounts.google.com.ps", "accounts.google.com.nf", "accounts.google.com.pa", "accounts.google.com.py", "accounts.google.ru", "accounts.google.com.ru", "accounts.xn--c1aay4a.xn--p1ai", "accounts.google.rw", "accounts.google.sh", "accounts.google.com.ec", "accounts.google.co.gg", "accounts.google.li", "accounts.google.com.ua", "accounts.google.ua", "accounts.google.co.ua", "accounts.google.as", "accounts.google.ws", "accounts.google.sg", "accounts.google.co.th", "accounts.google.ae", "accounts.google.gr", "accounts.google.com.gr", "accounts.google.no", "accounts.google.com.pt", "accounts.google.pt", "accounts.google.com.sg", "accounts.google.io", "accounts.google.td", "accounts.google.tw", "accounts.google.com.hk", "accounts.google.hk", "accounts.google.com.pe", "accounts.google.com.tw", "accounts.google.je", "accounts.google.com.tr", "accounts.google.ac", "accounts.google.ad", "accounts.google.it.ao", "accounts.google.aw", "accounts.google.az", "accounts.google.bf", "accounts.google.bg", "accounts.google.bj", "accounts.google.bm", "accounts.google.bn", "accounts.google.bo", "accounts.google.bs", "accounts.google.bt", "accounts.google.by", "accounts.google.bz", "accounts.google.cat", "accounts.google.cf", "accounts.google.cg", "accounts.google.ci", "accounts.google.cm", "accounts.google.co.ao", "accounts.google.co.ba", "accounts.google.co.bi", "accounts.google.co.bw", "accounts.google.co.ci", "accounts.google.co.ck", "accounts.google.co.gl", "accounts.google.co.gy", "accounts.google.co.id", "accounts.google.co.im", "accounts.google.co.in", "accounts.google.co.it", "accounts.google.co.ke", "accounts.google.co.ls", "accounts.google.co.mu", "accounts.google.co.mw", "accounts.google.co.mz", "accounts.google.co.pn", "accounts.google.co.rs", "accounts.google.co.tt", "accounts.google.co.tz", "accounts.google.co.ug", "accounts.google.co.uz", "accounts.google.co.ve", "accounts.google.co.vi", "accounts.google.co.za", "accounts.google.co.zm", "accounts.google.co.zw", "accounts.google.com.ag", "accounts.google.com.ai", "accounts.google.com.az", "accounts.google.com.bd", "accounts.google.com.bh", "accounts.google.com.bi", "accounts.google.com.bn", "accounts.google.com.bo", "accounts.google.com.bs", "accounts.google.com.by", "accounts.google.com.bz", "accounts.google.com.cy", "accounts.google.com.dz", "accounts.google.com.eg", "accounts.google.com.er", "accounts.google.com.et", "accounts.google.com.ge", "accounts.google.com.gh", "accounts.google.com.gi", "accounts.google.com.gl", "accounts.google.com.gp", "accounts.google.com.hn", "accounts.google.com.hr", "accounts.google.com.ht", "accounts.google.com.iq", "accounts.google.com.jm", "accounts.google.com.jo", "accounts.google.com.kg", "accounts.google.com.kh", "accounts.google.com.ki", "accounts.google.com.kw", "accounts.google.com.kz", "accounts.google.com.lb", "accounts.google.com.lc", "accounts.google.com.lk", "accounts.google.com.lv", "accounts.google.com.ly", "accounts.google.com.mk", "accounts.google.com.mm", "accounts.google.com.mt", "accounts.google.com.mu", "accounts.google.com.mw", "accounts.google.com.my", "accounts.google.com.na", "accounts.google.com.nc", "accounts.google.com.ng", "accounts.google.com.ni", "accounts.google.com.np", "accounts.google.com.nr", "accounts.google.com.om", "accounts.google.com.pk", "accounts.google.com.qa", "accounts.google.com.sa", "accounts.google.com.sb", "accounts.google.com.sc", "accounts.google.com.sl", "accounts.google.com.sv", "accounts.google.com.tj", "accounts.google.com.tm", "accounts.google.com.tn", "accounts.google.com.tt", "accounts.google.com.uy", "accounts.google.com.uz", "accounts.google.com.vc", "accounts.google.com.vi", "accounts.google.com.vn", "accounts.google.com.ws", "accounts.google.com.cu", "accounts.google.cv", "accounts.google.cx", "accounts.google.dj", "accounts.google.dm", "accounts.google.do", "accounts.google.dz", "accounts.google.es", "accounts.google.eu", "accounts.google.nom.es", "accounts.google.org.es", "accounts.google.ga", "accounts.google.gf", "accounts.google.gg", "accounts.google.gl", "accounts.google.gp", "accounts.google.gw", "accounts.google.hn", "accounts.google.hr", "accounts.google.ht", "accounts.google.im", "accounts.google.in.rs", "accounts.google.iq", "accounts.google.jo", "accounts.google.kg", "accounts.google.ki", "accounts.google.km", "accounts.google.kn", "accounts.google.lk", "accounts.google.lu", "accounts.google.ma", "accounts.google.me", "accounts.google.mg", "accounts.google.mh", "accounts.google.mk", "accounts.google.ml", "accounts.google.mn", "accounts.google.mu", "accounts.google.mv", "accounts.google.ne", "accounts.google.nf", "accounts.google.ng", "accounts.google.off.ai", "accounts.google.ph", "accounts.google.pk", "accounts.google.pn", "accounts.google.pr", "accounts.google.qa", "accounts.google.re", "accounts.google.rs", "accounts.google.sc", "accounts.google.si", "accounts.google.sk", "accounts.google.sl", "accounts.google.sm", "accounts.google.sn", "accounts.google.so", "accounts.google.sr", "accounts.google.st", "accounts.google.sz", "accounts.google.tk", "accounts.google.tg", "accounts.google.tm", "accounts.google.tn", "accounts.google.to", "accounts.google.tt", "accounts.google.ug", "accounts.google.uz", "accounts.google.vc", "accounts.google.vn", "accounts.google.vu", "accounts.google.yt", "accounts.google.af", "accounts.google.com.ve", "accounts.google.tel", "accounts.google.tp", "accounts.google.tl", "accounts.google.com.do", "accounts.google.com.co", "accounts.google.com.fj", "accounts.youtube.com"}));
        }
        for (String str : wjb.a(aynt.a.a().b())) {
            if (e(str)) {
                hashSet.add(str);
            }
        }
        for (String remove : wjb.a(aynt.a.a().f())) {
            hashSet.remove(remove);
        }
        this.g = hashSet;
        HashSet hashSet2 = new HashSet();
        for (String str2 : wjb.a(aynt.a.a().h())) {
            if (e(str2)) {
                hashSet2.add(str2);
            }
        }
        for (String str3 : wjb.a(aynt.a.a().g())) {
            if (e(str3)) {
                hashSet2.add(str3);
            }
        }
        this.b = hashSet2;
    }

    private final String a() {
        amew amew = this.i;
        if (amew == null) {
            return null;
        }
        amex amex = amew.b;
        if (amex == null) {
            amex = amex.c;
        }
        if (amex.a.isEmpty()) {
            return null;
        }
        amex amex2 = this.i.b;
        if (amex2 == null) {
            amex2 = amex.c;
        }
        if (!amex2.b || TextUtils.isEmpty(this.l)) {
            return null;
        }
        amex amex3 = this.i.b;
        if (amex3 == null) {
            amex3 = amex.c;
        }
        return amex3.a;
    }

    private final String b() {
        amen amen = this.h;
        if (amen == null) {
            return null;
        }
        amej amej = amen.c;
        if (amej == null) {
            amej = amej.g;
        }
        if (amej.c.isEmpty()) {
            return null;
        }
        amej amej2 = this.h.c;
        if (amej2 == null) {
            amej2 = amej.g;
        }
        return amej2.c;
    }

    private final void d(String str) {
        CookieManager.getInstance().removeAllCookie();
        if (TextUtils.isEmpty(str)) {
            str = a();
        }
        this.c.loadUrl(str);
    }

    private static boolean e(String str) {
        return !TextUtils.isEmpty(str) && Patterns.DOMAIN_NAME.matcher(str).matches();
    }

    public final void c(String str) {
        if (this.c != null) {
            this.n.post(new wjc(this, str));
        }
    }

    public final void onBackPressed() {
        if (this.c.canGoBack()) {
            this.c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = new qvr();
        setContentView((int) R.layout.guns_web_view);
        WebView webView = (WebView) findViewById(R.id.gunsWebView);
        this.c = webView;
        WebSettings settings = webView.getSettings();
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setSupportZoom(true);
        String userAgentString = settings.getUserAgentString();
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 22);
        sb.append(userAgentString);
        sb.append(" GnotsGcoreWebView/1.1");
        settings.setUserAgentString(sb.toString());
        if (jkr.c()) {
            settings.setDisabledActionModeMenuItems(7);
        }
        this.c.setWebViewClient(new wjg(this));
        this.e = (ProgressBar) findViewById(R.id.gunsProgressBar);
        this.j = null;
        this.k = false;
        this.m = new GunsSmsReceiver(this.c);
        a(getIntent());
    }

    public final Loader onCreateLoader(int i2, Bundle bundle) {
        if (i2 != 0) {
            return null;
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            return new wjx(this, this.l, a2);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Bundle bundle = (Bundle) obj;
        if (loader.getId() == 0) {
            if (bundle.getBoolean("WebLoginUrlLoader.hadError", false)) {
                d((String) null);
            } else {
                d(bundle.getString("WebloginUrlLoader.authenticatedUrl"));
            }
            if (aynz.a.a().a()) {
                getSupportLoaderManager().destroyLoader(0);
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a(intent);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (this.k) {
            unregisterReceiver(this.m);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (this.k) {
            registerReceiver(this.m, f);
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.d) {
            finish();
        }
    }

    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e2) {
        }
    }

    public final boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Set set = this.g;
        return set != null && set.contains(parse.getHost()) && "https".equals(parse.getScheme());
    }

    private final void a(Intent intent) {
        String str = this.l;
        String a2 = a();
        String b2 = b();
        this.h = wjp.a(intent);
        this.i = wjp.b(intent);
        this.l = intent.getStringExtra("com.google.android.gms.notifications.intents.accountName");
        String a3 = a();
        String b3 = b();
        if (jgu.g(getApplicationContext(), this.l)) {
            if (a2 == null || str == null || b2 == null || !str.equals(this.l) || !a2.equals(a3) || !b2.equals(b3)) {
                if (TextUtils.isEmpty(a3)) {
                    ((anih) a.b()).a("Trying to navigate to null/empty url/accountname");
                    finish();
                    return;
                } else if (!b(a3)) {
                    a(a3);
                    return;
                } else {
                    this.d = false;
                    getSupportLoaderManager().destroyLoader(0);
                    getSupportLoaderManager().initLoader(0, (Bundle) null, this);
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            String string = getString(R.string.guns_lock_screen_content_title);
            amen amen = this.h;
            if (amen != null) {
                amev amev = amen.e;
                if (amev == null) {
                    amev = amev.t;
                }
                if (!amev.q.isEmpty()) {
                    amev amev2 = this.h.e;
                    if (amev2 == null) {
                        amev2 = amev.t;
                    }
                    string = amev2.q;
                }
            }
            setTaskDescription(new ActivityManager.TaskDescription(string));
            return;
        }
        finish();
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
            if (str.equals(a())) {
                a(false);
                finish();
            }
        }
    }

    public final void a(boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (!z) {
            if (this.k) {
                this.c.removeJavascriptInterface("mm");
                unregisterReceiver(this.m);
                this.k = false;
            }
        } else if (!this.k) {
            if (this.j == null) {
                this.j = new wjo(this, this, this.c);
            }
            this.c.addJavascriptInterface(this.j, "mm");
            registerReceiver(this.m, f);
            this.k = true;
        }
    }
}
