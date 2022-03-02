package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;
import com.google.android.gms.chromesync.phone.ui.CustomPassphrasePhoneChimeraDialog;

/* renamed from: hoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hoa extends FragmentActivity implements View.OnClickListener {
    private Account a;
    public CustomPassphrasePhoneChimeraDialog e;

    public static PendingIntent a(Context context, Account account) {
        amrl.a((Object) context);
        amrl.a((Object) account);
        Intent className = new Intent().setClassName(context, "com.google.android.gms.chromesync.ui.CustomPassphraseDialog");
        className.setData(Uri.parse(String.format("content://com.google.android.gms.chromesync.ui.CustomPassphraseDialog/%s", new Object[]{account})));
        className.putExtra("account", account);
        return PendingIntent.getActivity(context, 0, className, 134217728);
    }

    /* access modifiers changed from: protected */
    public abstract CustomPassphrasePhoneChimeraDialog a();

    public void onClick(View view) {
        if (view.getId() == this.e.b.getId()) {
            a(Uri.parse((String) his.a.c()));
        } else if (view.getId() == this.e.c.getId()) {
            this.e.a(false);
            view.setEnabled(false);
            hic a2 = hid.a();
            a2.a = this.a;
            iby d = hhz.d(this, a2.a());
            String obj = this.e.a.getText().toString();
            iva.c(obj);
            d.b((ihb) new hib(obj)).a((acvp) new hny(this, view));
        } else if (view.getId() == this.e.d.getId()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        if (bundle == null || !bundle.containsKey("account")) {
            finish();
            return;
        }
        this.a = (Account) bundle.getParcelable("account");
        CustomPassphrasePhoneChimeraDialog a2 = a();
        this.e = a2;
        a2.a.addTextChangedListener(new hnz(this));
        TextView textView = this.e.b;
        textView.setText(Html.fromHtml(getResources().getString(R.string.chromesync_custom_passphrase_explanation, new Object[]{this.a.name, his.a.c()})));
        textView.setOnClickListener(this);
        this.e.c.setOnClickListener(this);
        this.e.d.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("account", this.a);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void a(Uri uri) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e2) {
            Toast.makeText(this, getString(R.string.common_no_browser_found), 1).show();
        }
    }
}
