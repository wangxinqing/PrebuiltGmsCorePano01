package com.google.android.gms.auth.account.visibility;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RequestAccountsAccessChimeraActivity extends gmz {
    public static final iwd a = ehv.a("RequestAccountsAccess");
    public String b;

    public static Intent a() {
        return new Intent().setClassName(ihs.b(), "com.google.android.gms.auth.account.visibility.RequestAccountsAccessActivity");
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "RequestAccountsAccessActivity";
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        float f;
        super.onCreate(bundle);
        if (!ese.b()) {
            a.b("API to request accounts access is disabled", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        setContentView((int) R.layout.auth_request_accounts_access_activity);
        ((TextView) findViewById(R.id.footnote)).setText(getResources().getString(R.string.auth_app_permission_ok_footnote));
        this.b = jhg.a((Activity) this);
        CharSequence a2 = new fzp(this).a(this.b);
        if (a2 == null) {
            setResult(0);
            finish();
            return;
        }
        String charSequence = a2.toString();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("headerFragment") == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(R.id.header_fragment_layout, gnn.a(charSequence), "headerFragment");
            beginTransaction.commit();
        }
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.auth_request_accounts_list));
        ((LinearLayout) findViewById(R.id.scopes_layout)).addView(textView);
        ((Button) findViewById(R.id.cancel_button)).setOnClickListener(new esg(this));
        ((Button) findViewById(R.id.accept_button)).setOnClickListener(new esh(this));
        Resources resources = getResources();
        if (jix.a(resources)) {
            f = resources.getDimension(R.dimen.plus_auth_dialog_tablet_resize_factor);
        } else {
            f = resources.getDimension(R.dimen.plus_auth_dialog_resize_factor);
        }
        jgv.a(getContainerActivity(), (double) f);
    }
}
