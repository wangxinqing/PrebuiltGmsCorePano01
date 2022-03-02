package com.google.android.gms.app.settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ManageSpaceChimeraActivity extends bjs implements View.OnClickListener {
    public TextView a;
    public TextView b;
    public TextView c;
    private Button d;
    private Button e;
    private CharSequence f;
    private Button g;

    public void onClick(View view) {
        if (view == this.d) {
            startActivity(new Intent().setClassName(this, "com.google.android.gms.icing.ui.IcingManageSpaceActivity"));
        } else if (view == this.e) {
            new drv().show(getSupportFragmentManager(), "clearDataDialog");
        } else if (view == this.g) {
            startActivity(new Intent(this, aebw.class));
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.manage_space_activity);
        this.f = getText(R.string.storage_managment_computing_size);
        this.a = (TextView) findViewById(R.id.icing_storage_size_text);
        Button button = (Button) findViewById(R.id.manage_icing_storage);
        this.d = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.manage_wear_storage);
        this.g = button2;
        button2.setOnClickListener(this);
        this.b = (TextView) findViewById(R.id.wear_storage_size_text);
        findViewById(R.id.clear_all_data_section);
        int i = Build.VERSION.SDK_INT;
        this.c = (TextView) findViewById(R.id.total_storage_size_text);
        Button button3 = (Button) findViewById(R.id.clear_all_data);
        this.e = button3;
        button3.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.a.setText(this.f);
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(this.f);
        }
        acwa a2 = aafi.b(this).a();
        a2.a((acvv) new drt(this));
        a2.a(drr.a);
        icc icc = adyr.b(this).j;
        adzw adzw = new adzw(icc);
        icc.a((idf) adzw);
        acwa a3 = iux.a((icf) adzw, adzy.a);
        a3.a((acvv) new dru(this));
        a3.a(drs.a);
    }
}
