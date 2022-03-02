package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import com.google.android.gms.R;

/* renamed from: xry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xry implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {
    public static final /* synthetic */ int e = 0;
    public Spinner a;
    public CheckBox b;
    public final Handler c = new qvr();
    public final Runnable d = new xrr(this);
    private icc f;
    private WebView g;

    static {
        ibq ibq = wlt.a;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.people_settings, viewGroup, false);
        this.a = (Spinner) inflate.findViewById(R.id.show_notification_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(viewGroup.getContext(), R.layout.people_setting_spinner_view);
        arrayAdapter.add("GServices default");
        arrayAdapter.add("Disable");
        arrayAdapter.add("Enable");
        this.a.setAdapter(arrayAdapter);
        this.a.setOnItemSelectedListener(this);
        this.a.setEnabled(false);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.force_verbose_log);
        this.b = checkBox;
        checkBox.setOnCheckedChangeListener(this);
        WebView webView = (WebView) inflate.findViewById(R.id.text_view);
        this.g = webView;
        webView.getSettings().setBuiltInZoomControls(true);
        this.g.setWebViewClient(new xrs(this));
        return inflate;
    }

    public final void b() {
        this.c.removeCallbacks(this.d);
    }

    public final void c() {
        this.g.pageDown(true);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f.i()) {
            Bundle bundle = new Bundle();
            bundle.putString("internal_call_method", "SET_FORCE_VERBOSE_LOG");
            bundle.putBoolean("internal_call_arg_1", z);
            xdm.a(this.f, bundle).a((icm) new xrx());
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f.i()) {
            Bundle bundle = new Bundle();
            bundle.putString("internal_call_method", "SET_SHOW_SYNC_NOTIFICATION_ERROR");
            bundle.putInt("internal_call_arg_1", i);
            xdm.a(this.f, bundle).a((icm) new xrw());
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void a() {
        Bundle bundle = new Bundle();
        bundle.putString("internal_call_method", "LOAD_LOG");
        xdm.a(this.f, bundle).a((icm) new xrt(this));
        a("Loading log...");
        Bundle bundle2 = new Bundle();
        bundle2.putString("internal_call_method", "GET_SHOW_SYNC_NOTIFICATION_ERROR");
        xdm.a(this.f, bundle2).a((icm) new xru(this));
        Bundle bundle3 = new Bundle();
        bundle3.putString("internal_call_method", "GET_FORCE_VERBOSE_LOG");
        xdm.a(this.f, bundle3).a((icm) new xrv(this));
    }

    public final void a(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(R.menu.people_settings_menu, menu);
    }

    public final void a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.scroll_to_top) {
            this.g.pageUp(true);
        } else if (itemId == R.id.scroll_to_end) {
            c();
        }
    }

    public final void a(bjs bjs) {
        iwq.a((Context) bjs).a(1);
        bjs.setTitle((CharSequence) "People debug");
        bjs.aE().b(true);
        wlr wlr = new wlr();
        wlr.a = 80;
        wls a2 = wlr.a();
        ibz ibz = new ibz(bjs.getApplicationContext());
        ibz.a(wlt.a, (ibj) a2);
        ibz.a(bjs, 0, (icb) null);
        this.f = ibz.b();
    }

    public final void a(String str) {
        String htmlEncode = TextUtils.htmlEncode(str);
        StringBuilder sb = new StringBuilder(String.valueOf(htmlEncode).length() + 37);
        sb.append("<html><body><pre>");
        sb.append(htmlEncode);
        sb.append("</pre></body></html>");
        this.g.loadDataWithBaseURL("", sb.toString(), "text/html", "UTF-8", "");
    }
}
