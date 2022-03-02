package defpackage;

import android.content.Intent;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: yku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yku extends yld {
    final /* synthetic */ AccountSignUpChimeraActivity a;

    public yku(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        this.a = accountSignUpChimeraActivity;
    }

    public final boolean c() {
        return this.a.d == 0;
    }

    public final void d() {
        Intent intent = new Intent();
        intent.setClassName(this.a, "com.google.android.gms.plus.oob.PlusActivity");
        if (this.a.getIntent().hasExtra("com.google.android.gms.plus.OVERRIDE_THEME")) {
            intent.putExtra("com.google.android.gms.plus.OVERRIDE_THEME", this.a.getIntent().getIntExtra("com.google.android.gms.plus.OVERRIDE_THEME", 0));
        }
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", this.a.b);
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", this.a.a);
        intent.putExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", this.a.g);
        this.a.j.a(intent);
        this.a.startActivityForResult(intent, 2);
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.a;
        izr.a(accountSignUpChimeraActivity, accountSignUpChimeraActivity.a, ibb.b, iar.b, this.a.g);
    }
}
