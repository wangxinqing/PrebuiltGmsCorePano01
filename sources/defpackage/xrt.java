package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: xrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xrt implements icm {
    final /* synthetic */ xry a;

    public xrt(xry xry) {
        this.a = xry;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        String str;
        wlq wlq = (wlq) icl;
        Bundle b = wlq.b();
        if (b != null) {
            str = b.getString("log_text");
        } else {
            str = null;
        }
        xry xry = this.a;
        Status aO = wlq.aO();
        if (!aO.c()) {
            String valueOf = String.valueOf(aO);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Failed to load log.  result=");
            sb.append(valueOf);
            xry.a(sb.toString());
            return;
        }
        xry.a(str);
    }
}
