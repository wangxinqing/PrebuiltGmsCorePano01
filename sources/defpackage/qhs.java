package defpackage;

import android.content.ComponentName;
import android.os.Bundle;

/* renamed from: qhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhs extends qfd {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhs(qij qij) {
        super("getCallingActivity");
        this.b = qij;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        if (jkr.e()) {
            return new Bundle();
        }
        ComponentName componentName = (ComponentName) ((qhk) this.b.d).b.a.get(bundle.getString("shadowActivity"));
        Bundle bundle2 = new Bundle();
        if (componentName != null && this.b.a(qfc, componentName.getPackageName())) {
            bundle2.putParcelable("result", componentName);
        }
        return bundle2;
    }
}
