package com.google.android.gms.app.phone.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BasicGoogleSettingsChimeraActivity extends drp {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class GoogleSettingsIntentCompleteOperation extends dro {
    }

    /* access modifiers changed from: protected */
    public final Intent a(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("id", i);
        intent.putExtra("title", str);
        intent.setClassName("com.google.android.gms", "com.google.android.gms.app.settings.SettingsSubPageActivity");
        return intent;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (jkr.b()) {
            setTitle((CharSequence) getString(R.string.common_google));
        } else {
            setTitle((CharSequence) getString(R.string.common_google_settings));
        }
    }

    /* access modifiers changed from: protected */
    public final jmw a(CharSequence charSequence, int i) {
        return new jmw(charSequence, i);
    }
}
