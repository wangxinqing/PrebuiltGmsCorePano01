package com.google.android.gms.usagereporting.settings;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsageReportingChimeraActivity extends bjs implements View.OnClickListener, jmo {
    private SwitchBar a;
    private TextView b;
    private TextView c;
    private boolean d;
    private adsb e;
    private iby f;

    private final View a(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Could not find view: id=");
        sb.append(i);
        Log.e("UsageReportingActivity", sb.toString());
        return null;
    }

    public final void b(boolean z) {
        SwitchBar switchBar = this.a;
        if (switchBar != null) {
            switchBar.setChecked(z);
        }
    }

    public final void e() {
        this.f.o().a((acvp) new adto(this));
    }

    /* access modifiers changed from: protected */
    public final void f() {
        startActivity(new Intent("android.intent.action.VIEW").setData(aeek.a(this, "usage-reporting")));
    }

    public void onClick(View view) {
        if (view == null) {
            throw null;
        } else if (view == this.c) {
            f();
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (aztt.c()) {
            adtm a2 = adtm.a();
            if (!adtl.a()) {
                synchronized (a2.a) {
                    SharedPreferences b2 = a2.b();
                    irk.a((Object) b2, (Object) "Unexpected null from getPrefs.");
                    z = b2.contains("OptInUsageReporting");
                }
            } else {
                z = true;
            }
            this.d = !z;
        }
        setContentView((int) R.layout.usage_reporting);
        sg aE = aE();
        aE.b(true);
        if (jgu.b((Context) this)) {
            aE.b((int) R.drawable.common_red_banner_settings_icon);
        }
        this.a = null;
        int i = Build.VERSION.SDK_INT;
        SwitchBar switchBar = (SwitchBar) a((int) R.id.switch_bar);
        this.a = switchBar;
        if (switchBar != null) {
            switchBar.setEnabled(false);
            if (!this.d) {
                this.a.a = this;
            }
        }
        if (aztt.c()) {
            int i2 = Build.VERSION.SDK_INT;
            UserManager userManager = (UserManager) getSystemService("user");
            if (userManager == null || userManager.getUserCount() <= 1) {
                View a3 = a((int) R.id.multi_user_info);
                if (a3 != null) {
                    a3.setVisibility(8);
                }
            } else {
                TextView textView = (TextView) a((int) R.id.multi_user_info);
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText(R.string.usage_reporting_dialog_multi_user_message);
                }
            }
        }
        TextView textView2 = (TextView) a(16908304);
        this.b = textView2;
        if (textView2 != null) {
            textView2.setText(getString(R.string.usage_reporting_dialog_message) + "\n\n" + getString(R.string.usage_reporting_dialog_more_message) + "\n\n" + getString(R.string.usage_and_diagnostics_consent_message));
        }
        TextView textView3 = (TextView) a((int) R.id.learn_more_text);
        this.c = textView3;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        this.f = adrz.a(this, new adry());
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.usage_reporting_settings_menu, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.settings_help) {
            f();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public final void onStart() {
        super.onStart();
        if (this.d) {
            b(adtl.a(this));
            SwitchBar switchBar = this.a;
            if (switchBar != null) {
                switchBar.setEnabled(false);
                return;
            }
            return;
        }
        SwitchBar switchBar2 = this.a;
        if (switchBar2 != null) {
            switchBar2.setEnabled(true);
        }
        adtp adtp = new adtp(this);
        this.e = adtp;
        iby iby = this.f;
        ige a2 = igf.a(adtp, iby.h, adsb.class.getSimpleName());
        adsc adsc = new adsc(iby, a2, ((adry) iby.f).b);
        adsd adsd = new adsd(iby);
        ign a3 = igo.a();
        a3.a = adsc;
        a3.b = adsd;
        a3.c = a2;
        a3.d = new Feature[]{adru.a};
        iby.a(a3.a());
        e();
    }

    public final void onStop() {
        adsb adsb;
        if (!this.d && (adsb = this.e) != null) {
            iby iby = this.f;
            igc igc = igf.a(adsb, iby.h, adsb.class.getSimpleName()).b;
            iva.a((Object) igc, (Object) "Key must not be null");
            iby.a(igc);
        }
        super.onStop();
    }

    public final void a(boolean z) {
        int i;
        if (!z) {
            i = 2;
        } else {
            i = 1;
        }
        this.f.a(new UsageReportingOptInOptions(i));
        if (!z) {
            iby a2 = znu.a(this);
            iha b2 = ihb.b();
            b2.a = new znw();
            a2.b(b2.a());
        }
    }
}
