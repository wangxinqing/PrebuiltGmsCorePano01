package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: xai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xai extends wzu {
    private final idg a;

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        String str;
        String str2;
        Status a2 = xbi.a(i, bundle);
        String[] strArr = null;
        if (bundle2 != null) {
            str = bundle2.getString("circle_id");
        } else {
            str = null;
        }
        if (bundle2 != null) {
            str2 = bundle2.getString("circle_name");
        } else {
            str2 = null;
        }
        if (bundle2 != null) {
            strArr = bundle2.getStringArray("added_people");
        }
        this.a.a((Object) new xaj(a2, str, str2, strArr));
    }

    public xai(idg idg) {
        this.a = idg;
    }
}
