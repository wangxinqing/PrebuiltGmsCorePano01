package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: xak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xak extends wzu {
    private final idg a;

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        String str;
        String str2;
        String str3;
        boolean z;
        Status a2 = xbi.a(i, bundle);
        if (bundle2 != null) {
            boolean z2 = bundle2.getBoolean("circles.first_time_add_need_consent");
            String string = bundle2.getString("circles.first_time_add_text");
            String string2 = bundle2.getString("circles.first_time_add_title_text");
            z = z2;
            str3 = string;
            str = bundle2.getString("circles.first_time_add_ok_text");
            str2 = string2;
        } else {
            str3 = null;
            str2 = null;
            str = null;
            z = false;
        }
        this.a.a((Object) new xal(a2, z, str3, str2, str));
    }

    public xak(idg idg) {
        this.a = idg;
    }
}
