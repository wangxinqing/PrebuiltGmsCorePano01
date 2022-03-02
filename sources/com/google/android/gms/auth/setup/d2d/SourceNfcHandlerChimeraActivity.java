package com.google.android.gms.auth.setup.d2d;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceNfcHandlerChimeraActivity extends Activity {
    private final void a() {
        Toast.makeText(this, R.string.common_something_went_wrong, 0).show();
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if (parcelableArrayExtra == null || parcelableArrayExtra.length == 0) {
            a();
            return;
        }
        NdefMessage ndefMessage = (NdefMessage) parcelableArrayExtra[0];
        if (ndefMessage == null) {
            a();
            return;
        }
        NdefRecord[] records = ndefMessage.getRecords();
        if (records != null && records.length > 0) {
            startActivity(SourceChimeraActivity.a(this, records[0].getPayload()));
        }
        finish();
    }
}
