package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;

/* renamed from: sme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class sme extends Activity {
    /* access modifiers changed from: protected */
    public abstract Class a();

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            jhg.c((Activity) this);
            startActivity(getIntent().setClassName(this, aann.a(a())));
            finish();
        } catch (SecurityException e) {
            snn.a("LockscreenActivity calling app incorrectly signed, closing.", new Object[0]);
            setResult(1);
            finish();
        }
    }
}
