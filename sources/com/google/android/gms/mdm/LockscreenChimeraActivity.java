package com.google.android.gms.mdm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LockscreenChimeraActivity extends smf {
    Button f;

    public void onClick(View view) {
        Intent intent;
        if (view == this.b) {
            intent = new Intent("android.intent.action.CALL");
            intent.setData(Uri.parse(String.format("tel:%1$s", new Object[]{this.c})));
            intent.setFlags(8388608);
        } else if (view == this.f) {
            intent = new Intent("com.android.phone.EmergencyDialer.DIAL");
            intent.setFlags(8388608);
        } else {
            intent = null;
        }
        String a = snh.a(getPackageManager(), intent);
        if (a != null) {
            intent.setPackage(a);
        }
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("lock_message");
        if (TextUtils.isEmpty(stringExtra)) {
            snn.a("LockscreenActivity started without a lock message, closing.", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        getWindow().addFlags(2621440);
        setContentView((int) R.layout.mdm_lockscreen_activity);
        ((TextView) findViewById(R.id.lock_message)).setText(stringExtra);
        this.b = (ImageButton) findViewById(R.id.phone_number_call);
        TextView textView = (TextView) findViewById(R.id.phone_number_call_label);
        if (getIntent().hasExtra("phone_number")) {
            this.c = getIntent().getStringExtra("phone_number");
            this.b.setImageDrawable(ma.f(yu.b().a((Context) this, (int) R.drawable.mdm_ic_call)));
            this.b.setOnClickListener(this);
        } else {
            this.b.setVisibility(8);
            textView.setVisibility(8);
        }
        Button button = (Button) findViewById(R.id.emergency_call);
        this.f = button;
        button.setOnClickListener(this);
        if (!jhg.c((Context) this)) {
            this.f.setVisibility(8);
        } else {
            setRequestedOrientation(1);
        }
        this.d = alv.a((Context) this);
        this.d.a(this.e, smf.a);
    }

    public final void onDestroy() {
        this.d.a(this.e);
        super.onDestroy();
    }
}
