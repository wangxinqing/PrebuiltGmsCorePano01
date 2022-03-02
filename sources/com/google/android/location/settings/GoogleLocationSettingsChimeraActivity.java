package com.google.android.location.settings;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleLocationSettingsChimeraActivity extends bjs implements DialogInterface.OnClickListener {
    public ajlk a;
    private final ajon b = new ajon(this);

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class GoogleLocationSettingsOperation extends hea {
        public final GoogleSettingsItem b() {
            if (!aycm.a.a().hideSettings()) {
                int i = Build.VERSION.SDK_INT;
                return new GoogleSettingsItem(new Intent("com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS"), 4, (int) R.string.common_location_settings_title, 35);
            }
            int i2 = Build.VERSION.SDK_INT;
            return null;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ajnw.a((Context) this);
        getIntent();
        int i = Build.VERSION.SDK_INT;
        if (!ajoz.a(this)) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
        finish();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) null);
        builder.setMessage(getString(R.string.location_settings_see_global_settings_dialog_message));
        builder.setPositiveButton(17039370, this);
        builder.setNegativeButton(17039360, this);
        return builder.create();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, R.string.common_list_apps_menu_help_and_feedback);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != 1) {
            return false;
        } else {
            Uri a2 = aeek.a(this, "ulr_googlelocation");
            GoogleHelp a3 = GoogleHelp.a("android_location");
            a3.q = a2;
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.b = ThemeSettings.a(this);
            a3.s = themeSettings;
            new nyw(this).a(a3.a());
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (this.a != null) {
            jca.a().a((Context) this, (ServiceConnection) this.b);
            this.a = null;
        }
    }
}
