package defpackage;

import android.os.Bundle;

/* renamed from: qhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhz extends qfd {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhz(qij qij) {
        super("isInstantApp");
        this.b = qij;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        String string = bundle.getString("packageName");
        boolean z = false;
        if (jkr.e()) {
            z = this.b.c.getPackageManager().isInstantApp(string);
        } else if (this.b.d.a(string) != null && this.b.a(qfc, string)) {
            z = true;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("result", z);
        return bundle2;
    }
}
