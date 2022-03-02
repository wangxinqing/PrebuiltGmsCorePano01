package defpackage;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.preference.ListPreference;
import com.google.android.chimera.ConditionProviderService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.SwitchBar;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ajpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ajpg extends bjs implements jmo, ahnt {
    static final String a;
    private SwitchBar b;
    private ahnu c;

    static {
        String valueOf = String.valueOf(ahnu.class.getSimpleName());
        a = valueOf.length() == 0 ? new String("ZenRuleConAct-") : "ZenRuleConAct-".concat(valueOf);
    }

    public final void a(String str) {
        int i;
        ajpd i2 = i();
        if (!getResources().getString(R.string.interruption_option_no_interruptions).equals(str)) {
            i = getResources().getString(R.string.interruption_option_alarms).equals(str) ? 4 : 2;
        } else {
            i = 3;
        }
        i2.c = i;
        j();
    }

    /* access modifiers changed from: protected */
    public abstract void b(String str);

    /* access modifiers changed from: protected */
    public abstract String e();

    /* access modifiers changed from: protected */
    public abstract String f();

    /* access modifiers changed from: protected */
    public abstract ComponentName h();

    /* access modifiers changed from: protected */
    public abstract ajpd i();

    /* access modifiers changed from: protected */
    public final void j() {
        iwq a2 = iwq.a((Context) this);
        if (a2 != null) {
            ajpd i = i();
            String str = i.a;
            if (str != null) {
                a2.a(str, i.a((Context) this));
            }
            if (i.b && jkr.e()) {
                ConditionProviderService.requestRebind(h());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        SwitchBar switchBar;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_zen_mode_rule_config);
        if (!awqd.d() || (!awqd.a.a().a() && (!aycw.a.a().routeDndRuleToDrivingModeForAuto() || !ajpe.a((Context) this)))) {
            aE().b(true);
            this.b = (SwitchBar) findViewById(R.id.switch_bar);
            TextView textView = (TextView) findViewById(R.id.rule_description);
            if (textView != null) {
                textView.setText(e());
            }
            findViewById(R.id.btn_delete).setOnClickListener(new ajpf(this));
            b(getIntent().getStringExtra("android.service.notification.extra.RULE_ID"));
            j();
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            ahnu ahnu = new ahnu();
            this.c = ahnu;
            beginTransaction.add(R.id.fragment_interruption_preference, ahnu, a);
            beginTransaction.commitAllowingStateLoss();
            ahnu ahnu2 = this.c;
            if (ahnu2 != null) {
                ahnu2.d = this;
            }
            ajpd i = i();
            ahnu ahnu3 = this.c;
            if (ahnu3 != null) {
                int i2 = i.c;
                if (i2 == 2) {
                    str = getResources().getString(R.string.interruption_option_important_interruptions);
                } else if (i2 == 3) {
                    str = getResources().getString(R.string.interruption_option_no_interruptions);
                } else if (i2 == 4) {
                    str = getResources().getString(R.string.interruption_option_alarms);
                } else {
                    throw new IllegalArgumentException("invalid interruption filter");
                }
                ListPreference listPreference = ahnu3.c;
                if (listPreference != null) {
                    listPreference.a(str);
                    listPreference.a((CharSequence) str);
                }
            }
            SwitchBar switchBar2 = this.b;
            if (switchBar2 != null) {
                switchBar2.setChecked(i().b);
            }
            if (Build.VERSION.SDK_INT >= 26 && (switchBar = this.b) != null) {
                switchBar.a().setTextColor(-16777216);
                return;
            }
            return;
        }
        iwq a2 = iwq.a((Context) this);
        ComponentName componentName = new ComponentName(getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
        Iterator it = a2.d().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                if (componentName.equals(((AutomaticZenRule) ((Map.Entry) it.next()).getValue()).getOwner())) {
                    break;
                }
            } else {
                ajom.a(this, a2, false);
                break;
            }
        }
        Intent intent = new Intent();
        intent.setComponent(lto.b());
        intent.addFlags(268468224);
        startActivity(intent);
    }

    public boolean onNavigateUp() {
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        SwitchBar switchBar = this.b;
        if (switchBar != null) {
            switchBar.a = this;
        } else {
            finish();
        }
    }

    public final void a(boolean z) {
        i().b = z;
        j();
        if (z) {
            Toast.makeText(this, f(), 0).show();
        }
    }
}
