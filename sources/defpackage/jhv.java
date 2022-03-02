package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: jhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jhv extends jhu {
    public jhv(Context context) {
        super(context);
    }

    public final void a(String str, int i, AppOpsManager.OnOpChangedListener onOpChangedListener) {
        if (i != 0) {
            this.b.startWatchingMode(str, (String) null, 1, onOpChangedListener);
        } else {
            super.a(str, 0, onOpChangedListener);
        }
    }

    public final int e(String str, int i, String str2) {
        if (!awyg.a.a().k()) {
            return this.b.unsafeCheckOpNoThrow(str, i, str2);
        }
        return this.b.unsafeCheckOpRawNoThrow(str, i, str2);
    }
}
