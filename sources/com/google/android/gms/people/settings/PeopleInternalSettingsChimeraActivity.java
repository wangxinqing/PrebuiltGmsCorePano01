package com.google.android.gms.people.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleInternalSettingsChimeraActivity extends bjs {
    private xry a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class DebugUploaderListSettingsOperation extends hea {
        public final GoogleSettingsItem b() {
            xip.a();
            if (!((Boolean) xhx.a.a()).booleanValue()) {
                return null;
            }
            Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS");
            intent.putExtra("settings_mode", 3);
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "Debug Data Uploaders", 21);
            googleSettingsItem.g = true;
            xip.a();
            googleSettingsItem.h = ((Boolean) xhv.a.a()).booleanValue();
            return googleSettingsItem;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class MenagerieInternalDebugSettingsOperation extends hea {
        public final GoogleSettingsItem b() {
            xip.a();
            boolean booleanValue = ((Boolean) xhx.a.a()).booleanValue();
            xip.a();
            boolean booleanValue2 = Boolean.valueOf(aywy.a.a().aW()).booleanValue();
            if (!booleanValue || !booleanValue2) {
                return null;
            }
            Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS");
            intent.putExtra("settings_mode", 4);
            return new GoogleSettingsItem(intent, 2, "Menagerie Debug Settings", 39);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class PeopleInternalSettingsOperation extends hea {
        public final GoogleSettingsItem b() {
            Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS");
            xip.a();
            if (((Boolean) xhx.a.a()).booleanValue()) {
                intent.putExtra("settings_mode", 1);
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "People debug", 47);
            googleSettingsItem.g = true;
            googleSettingsItem.h = ((Boolean) iks.h.c()).booleanValue();
            return googleSettingsItem;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        xip.a();
        if (((Boolean) xhx.a.a()).booleanValue()) {
            setContentView((int) R.layout.people_settings_fragment_container);
            int intExtra = getIntent().getIntExtra("settings_mode", 0);
            if (intExtra == 1) {
                fragment = new xrq();
            } else if (intExtra == 2) {
                fragment = new xqz();
            } else if (intExtra == 3) {
                fragment = new xrg();
            } else if (intExtra != 4) {
                xdt.b("PeopleISA", "PeopleInternalSettings requires a '%s' extra but did not recognize the value %s", "settings_mode", Integer.valueOf(intExtra));
                finish();
                fragment = null;
            } else {
                fragment = new xrp();
            }
            if (fragment != null) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.add((int) R.id.people_settings_fragment_container, fragment);
                beginTransaction.commit();
                return;
            }
            return;
        }
        xry xry = new xry();
        this.a = xry;
        xry.a((bjs) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        viewGroup.addView(this.a.a(getLayoutInflater(), viewGroup));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        xry xry = this.a;
        if (xry != null) {
            xry.a(getMenuInflater(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        xry xry = this.a;
        if (xry != null) {
            xry.a(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        xry xry = this.a;
        if (xry != null) {
            xry.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        xry xry = this.a;
        if (xry != null) {
            xry.b();
        }
        super.onStop();
    }
}
