package defpackage;

import android.os.Bundle;

/* renamed from: qhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhx extends qfd {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhx(qij qij) {
        super("getUidForPackage");
        this.b = qij;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        String string = bundle.getString("packageName");
        Integer a = this.b.d.a(string);
        Bundle bundle2 = new Bundle();
        if (a != null && this.b.a(qfc, string)) {
            bundle2.putInt("result", a.intValue());
        }
        return bundle2;
    }
}
