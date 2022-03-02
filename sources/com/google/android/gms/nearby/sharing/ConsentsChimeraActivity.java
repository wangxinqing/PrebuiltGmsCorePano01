package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConsentsChimeraActivity extends vhg {
    public ProgressBar h;
    public View i;
    public ImageView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public Button p;
    public Button q;
    public Button r;

    public static Intent a(Context context) {
        return new Intent().addFlags(131072).setClassName(context, "com.google.android.gms.nearby.sharing.ConsentsActivity");
    }

    public final void h() {
        Toast.makeText(this, getResources().getString(R.string.sharing_consents_toast_no_network_error), 0).show();
    }

    public final void i() {
        Toast.makeText(this, getResources().getString(R.string.sharing_consents_toast_no_account_error), 0).show();
    }

    public final void j() {
        setResult(0);
        finishAfterTransition();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ayni.p()) {
            finish();
            return;
        }
        setContentView((int) R.layout.sharing_activity_consents);
        this.h = (ProgressBar) findViewById(R.id.consents_text_loading_progress_bar);
        this.i = findViewById(R.id.account_info);
        this.j = (ImageView) findViewById(R.id.account_icon);
        this.k = (TextView) findViewById(R.id.account_email);
        this.l = (TextView) findViewById(R.id.account_full_name);
        this.m = (TextView) findViewById(R.id.device_contacts_title);
        this.n = (TextView) findViewById(R.id.device_contacts_description);
        this.o = (TextView) findViewById(R.id.device_contacts_footer);
        this.p = (Button) findViewById(R.id.skip_button);
        this.q = (Button) findViewById(R.id.negative_button);
        this.r = (Button) findViewById(R.id.positive_button);
        this.p.setOnClickListener(new vhp(this));
        this.q.setOnClickListener(new vhv(this));
        this.r.setOnClickListener(new vhw(this));
    }

    /* access modifiers changed from: protected */
    public final void e() {
        acwa t = f().t();
        t.a((acvv) new vhx(this));
        t.a((acvs) new vhy(this));
    }
}
