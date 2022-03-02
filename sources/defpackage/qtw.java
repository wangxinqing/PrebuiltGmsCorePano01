package defpackage;

import android.content.Intent;
import android.util.Log;

/* renamed from: qtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qtw extends boa {
    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        Log.w("KidSetupActivity", "Requested features are not present");
        if (intent == null) {
            intent = new Intent();
        }
        setResult(0, intent.putExtra("intentionally_canceled", true));
        finish();
    }
}
