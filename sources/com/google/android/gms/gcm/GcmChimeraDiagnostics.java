package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.ContextThemeWrapper;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraDiagnostics extends bjs implements View.OnClickListener {
    public static final Handler c = new qvr();
    boolean a = false;
    boolean b;
    private TextView d;
    private Button e;
    private MenuItem f;
    private TextView g;
    private SearchView h;
    private nsn i;
    private String j;
    private List k;
    private final aoru l = jfm.b(10);
    private final Runnable m = new nrw(this);

    private final void k() {
        String str;
        int i2;
        Button button = this.e;
        if (!this.a) {
            str = "Events";
        } else {
            str = "Status";
        }
        button.setText(str);
        TextView textView = this.d;
        int i3 = 0;
        if (!this.a) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.g;
        if (!this.a) {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        supportInvalidateOptionsMenu();
    }

    public final void e() {
        if (!this.a) {
            this.l.execute(new nrt(this));
        }
    }

    public final synchronized void f() {
        String str;
        if (this.b) {
            str = this.i.c();
        } else {
            str = this.i.b();
        }
        this.j = str;
        runOnUiThread(new nru(this));
    }

    public final synchronized void h() {
        this.d.setText(this.j);
    }

    public final synchronized void i() {
        this.k = this.i.a();
        runOnUiThread(new nrv(this));
    }

    public final synchronized void j() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.k != null) {
            if (!TextUtils.isEmpty(this.h.d())) {
                str = ampw.a(this.h.d().toString());
            } else {
                str = null;
            }
            for (String str2 : this.k) {
                if (str == null || ampw.a(str2).contains(str)) {
                    sb.append(str2);
                    sb.append("\n");
                }
            }
        }
        this.g.setText(sb.toString());
    }

    public void onClick(View view) {
        if (!this.a) {
            this.l.execute(new nrs(this));
        }
        this.a = !this.a;
        k();
        e();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nqw.a(getApplicationContext());
        if (nqw.d() == 0) {
            if (this.i == null) {
                nsn nsn = new nsn(this);
                this.i = nsn;
                Intent intent = new Intent("com.google.android.gms.gcm.GCM_SERVICE_DIAGNOSTICS");
                intent.setPackage("com.google.android.gms");
                Bundle bundle2 = new Bundle();
                fy.a(bundle2, "callback", new nsu(nsn));
                intent.putExtras(bundle2);
                nsn.a.sendBroadcast(intent);
            }
            setTheme(2132018374);
            aE().a(false);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            aE().a((CharSequence) "FCM Diagnostics");
            LinearLayout linearLayout2 = new LinearLayout(this);
            Button button = new Button(this);
            button.setText("Events");
            linearLayout2.addView(button);
            button.setOnClickListener(this);
            this.e = button;
            linearLayout.addView(linearLayout2);
            TextView textView = new TextView(this);
            this.d = textView;
            textView.setMinLines(20);
            this.d.setMovementMethod(new ScrollingMovementMethod());
            linearLayout.addView(this.d);
            SearchView searchView = new SearchView(new ContextThemeWrapper((Context) this, 2132018556));
            this.h = searchView;
            searchView.m = new nrx(this);
            TextView textView2 = new TextView(this);
            this.g = textView2;
            textView2.setMinLines(20);
            this.g.setMovementMethod(new ScrollingMovementMethod());
            linearLayout.addView(this.g);
            k();
            this.b = true;
            setContentView((View) linearLayout);
            return;
        }
        finish();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add("Advanced view");
        this.f = add;
        add.setCheckable(true);
        if (this.a) {
            MenuItem add2 = menu.add(17039372);
            add2.setIcon(17301583);
            add2.setActionView(this.h);
            add2.setShowAsActionFlags(9);
        }
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == this.f) {
            this.b = !this.b;
            e();
        }
        return true;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem = this.f;
        if (menuItem != null) {
            menuItem.setChecked(!this.b);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final void onStart() {
        super.onStart();
        this.m.run();
    }

    public final void onStop() {
        super.onStop();
        c.removeCallbacks(this.m);
    }
}
