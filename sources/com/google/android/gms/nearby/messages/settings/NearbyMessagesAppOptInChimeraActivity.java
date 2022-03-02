package com.google.android.gms.nearby.messages.settings;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbyMessagesAppOptInChimeraActivity extends Activity {
    public Button a;
    private String b;
    private vgm c;
    private CheckBox d;
    private TextView e;
    private ss f;
    private boolean g;

    public static PendingIntent a(Context context, String str) {
        vgm vgm = new vgm(context);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInActivity"));
        intent.putExtra("FAIL_IMMEDIATELY", false);
        intent.putExtra("OPT_IN_PACKAGE", str);
        vgm.c();
        intent.putExtra("EXTRA_PACKAGE_DENIED", vgm.b().getBoolean(str, false));
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    public final void onBackPressed() {
        a();
    }

    public void onConfirm(View view) {
        this.c.a(this.b, true);
        setResult(-1, new Intent());
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = new vgm(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getBoolean("FAIL_IMMEDIATELY")) {
            setResult(0, new Intent());
            finish();
            return;
        }
        this.b = extras.getString("OPT_IN_PACKAGE");
        this.g = extras.getBoolean("EXTRA_PACKAGE_DENIED", false);
        String str = null;
        View inflate = getLayoutInflater().inflate(R.layout.messages_opt_in_popup, (ViewGroup) null);
        this.d = (CheckBox) inflate.findViewById(R.id.never_ask_again);
        this.e = (TextView) inflate.findViewById(R.id.learn_more);
        this.a = (Button) inflate.findViewById(R.id.opt_in_allow);
        if (!aync.a.a().u()) {
            this.e.setMovementMethod(LinkMovementMethod.getInstance());
            Spannable spannable = (Spannable) Html.fromHtml(getString(R.string.messages_opt_in_text, new Object[]{Build.VERSION.SDK_INT >= 23 ? getResources().getString(R.string.messages_setting_path_v23) : getResources().getString(R.string.messages_setting_path), arzd.a(aync.a.a().w())}));
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                spannable.setSpan(new UnderlineSpan() {
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                        textPaint.setColor(NearbyMessagesAppOptInChimeraActivity.this.getResources().getColor(R.color.messages_activity_primary));
                    }
                }, spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
            }
            this.e.setText(spannable);
        } else {
            this.e.setVisibility(8);
        }
        this.d.setOnCheckedChangeListener(new vgk(this));
        this.a.requestFocus();
        inflate.requestFocus();
        sr srVar = new sr(this);
        srVar.b(inflate);
        try {
            str = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(this.b, 128)).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            anih anih = (anih) tgc.a.c();
            anih.a((Throwable) e2);
            anih.a("Package name no longer exists: %s", (Object) this.b);
            a();
        }
        srVar.a((View) new vgn(this, str));
        srVar.a.m = new vgl(this);
        ss b2 = srVar.b();
        this.f = b2;
        b2.setCanceledOnTouchOutside(false);
        this.f.show();
        a(this.g);
    }

    public void onDeny(View view) {
        if (this.d.isChecked()) {
            vgm vgm = this.c;
            vgm.a().putBoolean(this.b, false).commit();
        }
        vgm vgm2 = this.c;
        vgm2.b().edit().putBoolean(this.b, true).commit();
        a();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        ss ssVar = this.f;
        if (ssVar != null) {
            ssVar.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        a(this.g);
    }

    private final void a(boolean z) {
        if (z) {
            this.d.setVisibility(0);
        }
    }

    public final void a() {
        this.c.a(this.b, false);
        setResult(0, new Intent());
        finish();
    }
}
