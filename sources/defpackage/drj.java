package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: drj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class drj extends hec {
    private final void e() {
        for (String a : a()) {
            a(a);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context);

    /* access modifiers changed from: protected */
    public abstract String[] a();

    public final void b(Intent intent) {
        e();
        d();
    }

    private final void a(String str) {
        try {
            jhg.a(getBaseContext(), str, true);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            Log.e("CoreUiInitIntntOp", valueOf.length() == 0 ? new String("Component invalid: ") : "Component invalid: ".concat(valueOf), e);
        }
    }

    private final void d() {
        Context baseContext = getBaseContext();
        if (jgu.e(baseContext)) {
            Log.i("CoreUiInitIntntOp", "Disabling Google Settings Activity for this profile.");
            a(baseContext);
        }
    }

    public final void a(Intent intent) {
        d();
    }

    public final void a(Intent intent, boolean z) {
        e();
        if (jkr.g()) {
            jix.g(getBaseContext());
            a("com.google.android.gms.app.search.GmsSearchIndexablesProvider");
        }
        d();
    }
}
