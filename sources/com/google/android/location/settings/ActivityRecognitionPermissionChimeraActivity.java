package com.google.android.location.settings;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.setupwizardlib.GlifLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivityRecognitionPermissionChimeraActivity extends bjs {
    public boolean a;

    public static final String a(ContentResolver contentResolver) {
        if (contentResolver != null) {
            return Settings.Secure.getString(contentResolver, "enabled_notification_policy_access_packages");
        }
        return null;
    }

    public static final boolean b(ContentResolver contentResolver) {
        String a2 = a(contentResolver);
        if (!TextUtils.isEmpty(a2)) {
            for (String equalsIgnoreCase : a2.split(":", -1)) {
                if (equalsIgnoreCase.equalsIgnoreCase("com.google.android.gms")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean e() {
        return aycz.a.a().bypassDndNotificationPermissionPreOmr1() && Build.VERSION.SDK_INT < 27;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        if (jkr.e() && aycz.a.a().dndNotificationSwitchTheme()) {
            setTheme(bek.a(jli.a("setupwizard.theme", "")));
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.dnd_notification_information);
        ContentResolver contentResolver = getApplicationContext().getContentResolver();
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.setup_wizard_layout);
        Button button = (Button) findViewById(R.id.next_button);
        Button button2 = (Button) findViewById(R.id.back_button);
        TextView textView = (TextView) findViewById(R.id.body);
        ImageView imageView = (ImageView) findViewById(R.id.illustration);
        TextView textView2 = (TextView) findViewById(R.id.footer_text);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
        }
        Bundle extras = intent.getExtras();
        boolean z2 = true;
        if (extras == null || !extras.getBoolean("ruleAdded")) {
            z = false;
        } else {
            z = true;
        }
        if (extras == null || !extras.getBoolean("secondIntroPage")) {
            z2 = false;
        }
        Context applicationContext = getApplicationContext();
        if (z) {
            glifLayout.b(R.string.dnd_title_rule_added);
            textView.setText(R.string.dnd_text_rule_added);
            imageView.setImageResource(R.drawable.dnd_driving_done);
            button2.setVisibility(8);
            i2 = R.string.common_done;
            i = R.string.common_cancel;
        } else {
            if (aycz.b()) {
                ahol.a(applicationContext).a(2);
            }
            if (z2) {
                glifLayout.b(R.string.dnd_title_continue);
                textView.setText(R.string.dnd_text_continue);
                imageView.setImageResource(R.drawable.dnd_driving_grant_permission);
                i2 = R.string.common_continue;
                i = R.string.common_cancel;
            } else {
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.footerLayout);
                if (!e() || b(contentResolver)) {
                    glifLayout.b(R.string.dnd_title_intro);
                    textView.setText(R.string.dnd_text_intro);
                    imageView.setImageResource(R.drawable.dnd_driving_intro);
                    relativeLayout.setVisibility(8);
                    i2 = R.string.dnd_button_setup;
                    i = R.string.common_cancel;
                } else {
                    glifLayout.b(R.string.dnd_title_intro_full);
                    textView.setText(R.string.dnd_text_intro_full);
                    imageView.setImageResource(R.drawable.dnd_driving_intro);
                    relativeLayout.setVisibility(0);
                    textView2.setText(R.string.dnd_text_footer);
                    i2 = R.string.common_turn_on;
                    i = R.string.dnd_no_thanks;
                }
            }
        }
        button.setText(i2);
        button.setOnClickListener(new ajoc(this, z, z2, applicationContext, contentResolver));
        button2.setText(i);
        button2.setOnClickListener(new ajod(this, applicationContext));
    }
}
