package com.google.android.gms.drive.ui.create;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreateFileChimeraActivityDelegate extends lnx {
    private loj c;

    /* access modifiers changed from: protected */
    public final void e() {
        this.c.a();
    }

    public final void onBackPressed() {
        this.c.a(2);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String[] stringArray;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("dialogTitle");
        if (stringExtra == null) {
            stringExtra = getString(R.string.drive_create_file_dialog_title);
            intent.putExtra("dialogTitle", stringExtra);
        }
        setTitle((CharSequence) stringExtra);
        loj loj = (loj) getSupportFragmentManager().findFragmentByTag("CreateDocumentActivity");
        this.c = loj;
        if (loj == null) {
            Bundle extras = intent.getExtras();
            if (extras == null || TextUtils.isEmpty(extras.getString("accountName")) || (stringArray = extras.getStringArray("clientScopes")) == null || stringArray.length <= 0) {
                setResult(0);
                finish();
                return;
            }
            loj loj2 = new loj();
            this.c = loj2;
            loj2.setArguments(extras);
            getSupportFragmentManager().beginTransaction().add(16908290, this.c, "CreateDocumentActivity").commit();
        }
        this.c.i = this.a;
        if (bundle == null) {
            setResult(0);
        }
    }
}
