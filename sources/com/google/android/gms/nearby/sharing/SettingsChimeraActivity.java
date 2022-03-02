package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;
import com.google.android.gms.nearby.sharing.view.RadioButtonChoiceView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsChimeraActivity extends bjs {
    public vts a;
    public SwitchCompat b;
    public View c;
    public TextView d;
    public TextView e;
    public GoogleAccountAvatar f;
    public TextView g;
    public ss h;
    public TextView i;
    public TextView j;
    public TextView k;
    public ss l;
    private final BroadcastReceiver m = new nla("nearby") {
        public final void a(Context context, Intent intent) {
            SettingsChimeraActivity.this.e();
        }
    };
    private boolean n = false;

    public static Intent a(Context context) {
        return new Intent().addFlags(268435456).addFlags(32768).setClassName(context, "com.google.android.gms.nearby.sharing.SettingsActivity");
    }

    public final void b(Bundle bundle) {
        View inflate = View.inflate(this, R.layout.sharing_dialog_data_usage, (ViewGroup) null);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.data_usage_radio_group);
        RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.data_usage_button_always);
        RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.data_usage_button_wifi);
        RadioButton radioButton3 = (RadioButton) inflate.findViewById(R.id.data_usage_button_never);
        RadioButtonChoiceView radioButtonChoiceView = (RadioButtonChoiceView) inflate.findViewById(R.id.radioButtonChoices);
        if (radioGroup.getChildCount() == radioButtonChoiceView.getChildCount()) {
            for (int i2 = 0; i2 < radioButtonChoiceView.getChildCount(); i2++) {
                radioButtonChoiceView.getChildAt(i2).setOnTouchListener(new wiw(radioGroup.getChildAt(i2)));
            }
            ajwe ajwe = new ajwe(this);
            ajwe.c((int) R.string.sharing_settings_button_data_usage);
            ajwe.d((int) R.string.common_update, (DialogInterface.OnClickListener) new vpj(this, radioButton, radioButton2, radioButton3));
            ajwe.c((int) R.string.common_cancel, vpl.a);
            ajwe.c(inflate);
            ss b2 = ajwe.b();
            radioGroup.setOnCheckedChangeListener(new vpm(b2, radioButton, radioButton2, radioButton3, radioGroup));
            RadioButton radioButton4 = radioButton;
            RadioButton radioButton5 = radioButton2;
            RadioButton radioButton6 = radioButton3;
            b2.setOnShowListener(new vpn(this, b2, radioButton4, radioButton5, radioButton6, radioGroup));
            this.a.q().a((acvv) new vpo(this, radioGroup, radioButton4, radioButton5, radioButton6, b2, bundle));
            return;
        }
        throw new IllegalArgumentException("Invalid RadioGroup has a different number of children from RadioButtonChoiceView");
    }

    public final void e() {
        this.a.p().a((acvv) new vqa(this));
        this.a.s().a((acvv) new vqb(this));
        this.a.t().a((acvv) new vqc(this));
        this.a.r().a((acvv) new vpa(this, this.i.isLaidOut()));
        this.a.q().a((acvv) new vpb(this));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Account a2;
        switch (i2) {
            case ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS:
                if (i3 != -1) {
                    finish();
                    return;
                }
                return;
            case 1001:
                if (i3 == -1 && (a2 = who.a(intent)) != null) {
                    this.a.b(a2);
                    return;
                }
                return;
            case 1002:
                return;
            default:
                super.onActivityResult(i2, i3, intent);
                return;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ayni.p()) {
            this.n = true;
            finish();
            return;
        }
        setContentView((int) R.layout.sharing_activity_settings);
        a((Toolbar) findViewById(R.id.toolbar));
        aE().b(true);
        aE().a(true);
        aE().e((int) R.string.sharing_settings_home_as_up_description);
        if (this.a == null) {
            this.a = tcn.c(this);
        }
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.enable_switch);
        this.b = switchCompat;
        switchCompat.setOnCheckedChangeListener(new voz(this));
        this.g = (TextView) findViewById(R.id.device_name_label);
        findViewById(R.id.device_name).setOnClickListener(new vpk(this));
        View findViewById = findViewById(R.id.change_account);
        this.c = findViewById;
        this.d = (TextView) findViewById.findViewById(R.id.account_name);
        this.e = (TextView) this.c.findViewById(R.id.account_email);
        this.f = (GoogleAccountAvatar) this.c.findViewById(R.id.sharing_one_google_account_disc);
        this.i = (TextView) findViewById(R.id.visibility_label);
        View findViewById2 = findViewById(R.id.visibility);
        if (!ayni.k() || !jix.b(this)) {
            findViewById2.setOnClickListener(new vpv(this));
        } else {
            ((TextView) findViewById(R.id.sharing_settings_subtitle)).setText(getString(R.string.sharing_settings_subtitle_account_latchsky));
            this.c.setVisibility(8);
            findViewById2.setVisibility(8);
            TextView textView = (TextView) findViewById(R.id.sharing_settings_info_text);
            textView.setText((CharSequence) amsk.a("\n\n").c(textView.getText().toString()).get(0));
        }
        this.j = (TextView) findViewById(R.id.data_usage_title);
        this.k = (TextView) findViewById(R.id.data_usage_label);
        View findViewById3 = findViewById(R.id.data_usage);
        if (!ayni.a.a().aY()) {
            findViewById3.setVisibility(8);
        }
        findViewById3.setOnClickListener(new vpw(this));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sharing_menu_settings, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == R.id.action_help) {
            tcn.c(this).t().a((acvv) new vpx(this));
            return true;
        } else if (menuItem.getItemId() != R.id.action_feedback) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            tcn.c(this).t().a((acvv) new vpy(this));
            return true;
        }
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.action_feedback).setVisible(ayni.K());
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("device_name_dialog")) {
            a(bundle.getBundle("device_name_dialog"));
        }
        if (bundle.containsKey("data_usage_dialog")) {
            b(bundle.getBundle("data_usage_dialog"));
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.a.a().a((acvv) new vpz(this));
        ((anih) vvj.a.d()).a("SettingsChimeraActivity has resumed");
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ss ssVar = this.h;
        if (ssVar != null) {
            bundle.putBundle("device_name_dialog", ssVar.onSaveInstanceState());
        }
        ss ssVar2 = this.l;
        if (ssVar2 != null) {
            bundle.putBundle("data_usage_dialog", ssVar2.onSaveInstanceState());
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        if (!this.n) {
            super.onStart();
            thp.a(this, this.m, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
            e();
            ((anih) vvj.a.d()).a("SettingsChimeraActivity has started");
            return;
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (!this.n) {
            thp.a((Context) this, this.m);
            super.onStop();
            ((anih) vvj.a.d()).a("SettingsChimeraActivity has stopped");
            return;
        }
        super.onStop();
    }

    public final void a(int i2) {
        vts vts = this.a;
        iha b2 = ihb.b();
        b2.a = new vtg(i2);
        b2.b = new Feature[]{tcm.a};
        vts.b(b2.a());
    }

    public final void a(Bundle bundle) {
        View inflate = View.inflate(this, R.layout.sharing_dialog_device_name, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(16908308);
        ajwe ajwe = new ajwe(this);
        ajwe.c((int) R.string.sharing_settings_button_device_name);
        ajwe.d((int) R.string.sharing_action_rename, (DialogInterface.OnClickListener) new vpd(this, editText));
        ajwe.c((int) R.string.common_cancel, vpe.a);
        ajwe.c(inflate);
        ss b2 = ajwe.b();
        editText.setFilters(new InputFilter[]{new arzl(getResources().getInteger(R.integer.sharing_max_name_length_bytes))});
        editText.setOnEditorActionListener(new vpf(this, b2, editText));
        editText.addTextChangedListener(new vqd(b2, editText));
        b2.setOnShowListener(new vpg(this, editText, b2));
        b2.getWindow().setSoftInputMode(36);
        this.a.s().a((acvv) new vph(this, editText, b2, bundle));
    }

    public final void a(CharSequence charSequence) {
        this.a.a(charSequence).a((acvp) new vpi(this));
    }
}
