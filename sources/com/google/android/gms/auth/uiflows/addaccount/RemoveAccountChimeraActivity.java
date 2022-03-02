package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService;
import com.google.android.setupdesign.SetupWizardLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RemoveAccountChimeraActivity extends gnx implements aljq {
    public static final fzk a = fzk.a("account");
    private static final fzk b = fzk.a("reason");
    private SetupWizardLayout c;

    public static Intent a(Context context, Account account, int i, boolean z, ijn ijn) {
        Bundle bundle;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.RemoveAccountActivity");
        fzl fzl = new fzl();
        fzl.b(a, account);
        fzl.b(b, Integer.valueOf(i));
        fzl.b(gmz.j, Boolean.valueOf(z));
        fzk fzk = gmz.i;
        if (ijn != null) {
            bundle = ijn.a();
        } else {
            bundle = null;
        }
        fzl.b(fzk, bundle);
        return className.putExtras(fzl.a);
    }

    public final void aL() {
        a(-1, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "RemoveAccountActivity";
    }

    public final void onBackPressed() {
        a(-1, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        String str;
        super.onCreate(bundle);
        int intValue = ((Integer) f().a(b)).intValue();
        startService(RemoveAccountChimeraIntentService.a(this, (Account) f().a(a)));
        SetupWizardLayout setupWizardLayout = (SetupWizardLayout) LayoutInflater.from(this).inflate(R.layout.auth_account_removed, (ViewGroup) null);
        this.c = setupWizardLayout;
        setContentView((View) setupWizardLayout);
        SetupWizardLayout setupWizardLayout2 = this.c;
        switch (intValue) {
            case 1:
                charSequence = getString(R.string.auth_account_removed_dm_setup_failed_title);
                break;
            case 2:
                charSequence = getString(R.string.auth_account_removed_dm_setup_skipped_title);
                break;
            case 3:
            case 4:
                charSequence = getString(R.string.common_something_went_wrong);
                break;
            case 5:
                charSequence = getString(R.string.auth_account_removed_dm_not_supported_title);
                break;
            case 6:
                charSequence = getString(R.string.auth_account_removed_restricted_by_admin_title);
                break;
            default:
                charSequence = getTitle();
                break;
        }
        setupWizardLayout2.a(charSequence);
        this.c.c().a((aljq) this);
        ijm.a((ViewGroup) this.c);
        TextView textView = (TextView) findViewById(R.id.auth_account_removed_description);
        if (intValue == 1) {
            str = getString(R.string.auth_account_removed_dm_setup_failed_description, new Object[]{getString(R.string.auth_account_start_over_and_signin_again)});
        } else if (intValue == 3 || intValue == 4) {
            str = getString(R.string.auth_account_removed_dm_bad_result_description, new Object[]{getString(R.string.auth_account_start_over_and_signin_again)});
        } else if (intValue == 5) {
            str = getString(R.string.auth_account_removed_dm_not_supported_description);
        } else if (intValue != 6) {
            str = getString(R.string.auth_account_removed_default_description, new Object[]{getString(R.string.auth_account_start_over_and_signin_again)});
        } else {
            str = getString(R.string.auth_account_removed_restricted_by_admin_description);
        }
        textView.setText(str);
        if (!(intValue == 5 || intValue == 6)) {
            Button button = this.c.c().a;
            button.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            String string = getString(R.string.auth_remove_account_start_over);
            button.setText(string);
            button.setContentDescription(string);
        }
        this.c.c().b.setVisibility(4);
    }

    public final void a() {
        a(-1, (Intent) null);
    }
}
