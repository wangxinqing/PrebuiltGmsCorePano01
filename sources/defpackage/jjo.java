package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: jjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjo {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public WebView e;
    private FrameLayout f;
    private View g;
    private TextView h;
    private final float i;
    private boolean j;

    public jjo(Context context) {
        this.a = context;
        this.i = context.getResources().getDisplayMetrics().density;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String lowerCase = locale.getCountry().toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(lowerCase).length());
        sb.append(language);
        sb.append("_");
        sb.append(lowerCase);
        return String.format(str, new Object[]{sb.toString()});
    }

    public final synchronized void b() {
        if (this.f == null) {
            FrameLayout frameLayout = new FrameLayout(this.a);
            this.f = frameLayout;
            frameLayout.setForegroundGravity(17);
            int i2 = (int) ((this.i * 10.0f) + 0.5f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ProgressBar progressBar = new ProgressBar(this.a);
            progressBar.setIndeterminate(true);
            this.f.addView(progressBar, layoutParams);
            this.g = progressBar;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            com.google.android.chimera.WebView webView = new com.google.android.chimera.WebView(this.a);
            this.e = webView;
            webView.setVisibility(4);
            this.e.getSettings().setCacheMode(2);
            this.e.setWebViewClient(new jjn(this));
            this.f.addView(this.e, layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            TextView textView = new TextView(this.a);
            this.h = textView;
            textView.setVisibility(8);
            this.h.setPadding(i2, i2, i2, i2);
            this.h.setText(this.d);
            this.f.addView(this.h, layoutParams3);
        }
    }

    public final ViewGroup a() {
        b();
        return this.f;
    }

    public final synchronized void a(boolean z) {
        View view;
        View view2;
        if (!this.j) {
            this.j = true;
            ((ViewGroup) this.g.getParent()).removeView(this.g);
            if (!z) {
                view = this.e;
            } else {
                view = this.h;
            }
            ((ViewGroup) view.getParent()).removeView(view);
            if (!z) {
                view2 = this.h;
            } else {
                view2 = this.e;
            }
            view2.setVisibility(0);
        }
    }
}
