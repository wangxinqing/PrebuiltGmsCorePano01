package defpackage;

import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;

/* renamed from: abtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abtj implements abtl {
    private final abnn a;
    private final DisplayText b;

    public abtj(abnn abnn, DisplayText displayText) {
        iva.a((Object) abnn, (Object) "callbacks cannot be null.");
        this.a = abnn;
        iva.a((Object) displayText, (Object) "displayText cannot be null.");
        this.b = displayText;
    }

    public final void a() {
        abtm.d.a("Processing DisplayText", new Object[0]);
        String str = this.b.b;
        if (!TextUtils.isEmpty(str)) {
            this.a.a(str);
        }
    }
}
