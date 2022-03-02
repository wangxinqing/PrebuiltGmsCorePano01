package com.google.android.location.settings;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingChimeraActivity extends ajpg {
    private ajpd b;

    /* access modifiers changed from: protected */
    public final String e() {
        return getString(R.string.dnd_desc_driving);
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return getString(R.string.dnd_driving_activated);
    }

    /* access modifiers changed from: protected */
    public final ComponentName h() {
        return new ComponentName(getApplicationContext().getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ajpd i() {
        ajpd ajpd = this.b;
        if (ajpd != null) {
            return ajpd;
        }
        throw new IllegalStateException("Must call createRule before getRule");
    }

    public final boolean onNavigateUp() {
        finish();
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(String str) {
        AutomaticZenRule automaticZenRule;
        iwq a = iwq.a((Context) this);
        if (str != null) {
            if (str.length() == 0) {
                new String("DNDChimeraActivity: rule id = ");
            } else {
                "DNDChimeraActivity: rule id = ".concat(str);
            }
            if (jkr.c()) {
                automaticZenRule = a.a.getAutomaticZenRule(str);
            } else {
                automaticZenRule = null;
            }
            if (automaticZenRule != null) {
                ajpd a2 = ajpd.a(automaticZenRule.getConditionId());
                this.b = a2;
                a2.a = str;
                a2.b = automaticZenRule.isEnabled();
                return;
            }
        }
        ajpd ajpd = new ajpd(true, (int) aycw.c());
        this.b = ajpd;
        try {
            ajpd.a = a.a(ajpd.a((Context) this));
        } catch (Exception e) {
            Log.wtf("DrivingChimeraAct", "DNDChimeraActivity: unable to add rule", e);
        }
    }
}
