package com.google.android.gms.security.recaptcha;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import com.google.android.chimera.Activity;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RecaptchaChimeraActivity extends Activity {
    public static String j = "https://www.google.com/recaptcha/api2/mframe";
    public static long k = TimeUnit.MINUTES.toMillis(2);
    public String a;
    public int b;
    public int c;
    public float d;
    public LinearLayout e;
    public WebView f;
    public ResultReceiver g;
    public long h;
    public boolean i;
    private aaou l = null;
    private ScheduledExecutorService m;

    public final void b() {
        a("Session Timeout", 15);
        finish();
    }

    public final aaou c() {
        if (this.l == null) {
            this.l = new aaou();
        }
        return this.l;
    }

    public final void finish() {
        if (this.f != null) {
            b(0, 0, false);
        }
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.m;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.m = null;
            }
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("result");
        this.g = resultReceiver;
        if (resultReceiver != null) {
            this.a = intent.getStringExtra("params");
            requestWindowFeature(1);
            setContentView((int) R.layout.recaptcha_activity);
            this.e = (LinearLayout) findViewById(R.id.recaptcha_loading_layout);
            WebView webView = (WebView) findViewById(R.id.recaptcha_webview);
            this.f = webView;
            int i2 = Build.VERSION.SDK_INT;
            webView.setWebViewClient(new aaom(this));
            WebSettings settings = this.f.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(false);
            settings.setDisplayZoomControls(false);
            settings.setCacheMode(2);
            this.f.addJavascriptInterface(new aaoo(this), "RecaptchaEmbedder");
            this.f.setVisibility(8);
            if (!jix.a(getResources()) && Build.VERSION.SDK_INT != 26) {
                setRequestedOrientation(1);
            }
            this.m = jfm.a(1, 9);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.d = displayMetrics.density;
            this.b = displayMetrics.widthPixels;
            this.c = (displayMetrics.heightPixels - jgv.a(getContainerActivity())) - ((int) (this.d * 20.0f));
            a();
            a((Runnable) new aaoq(this), k, TimeUnit.MILLISECONDS);
            a(new StringBuilder(this.a), "frame", true);
            return;
        }
        finish();
    }

    public final void a() {
        this.h = SystemClock.elapsedRealtime();
    }

    public final void b(int i2, int i3, boolean z) {
        runOnUiThread(new aaoh(this, i2, i3, z));
    }

    public final void a(int i2, int i3, boolean z) {
        runOnUiThread(new aaof(this, Math.min((int) (((float) i2) * this.d), this.b), Math.min((int) (((float) i3) * this.d), this.c), z));
    }

    public final void a(Runnable runnable, long j2, TimeUnit timeUnit) {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.m;
            if (scheduledExecutorService != null) {
                ((jfv) scheduledExecutorService).schedule(runnable, j2, timeUnit);
            }
        }
    }

    public final void a(String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("error", str);
        bundle.putInt("errorCode", i2);
        this.g.send(i2, bundle);
    }

    public final void a(StringBuilder sb, String str, boolean z) {
        aans.a(sb, "mt", String.valueOf(System.currentTimeMillis()));
        new jfx(9, new aaoj(this, str, sb.toString(), z)).start();
    }
}
