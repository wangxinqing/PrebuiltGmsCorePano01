package com.google.android.gms.chromesync.phone.ui;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CustomPassphrasePhoneChimeraDialog extends hoa {
    public EditText a;
    public TextView b;
    public View c;
    public View d;

    /* access modifiers changed from: protected */
    public final CustomPassphrasePhoneChimeraDialog a() {
        setContentView((int) R.layout.chromesync_custom_passphrase_dialog);
        this.a = (EditText) findViewById(R.id.chromesync_enter_passphrase);
        this.b = (TextView) findViewById(R.id.chromesync_custom_passphrase_description);
        this.c = findViewById(R.id.chromesync_custom_passphrase_continue);
        this.d = findViewById(R.id.chromesync_custom_passphrase_cancel);
        return this;
    }

    public final void a(boolean z) {
        findViewById(R.id.chromesync_custom_passphrase_error).setVisibility(!z ? 8 : 0);
    }
}
