package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: wzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wzs extends ilj {
    private final Bundle c;

    public wzs(DataHolder dataHolder, int i, Bundle bundle) {
        super(dataHolder, i);
        this.c = bundle;
    }

    public final String c() {
        return d("circle_id");
    }

    public final String d() {
        Bundle bundle;
        int e = e();
        if (!(e == -1 || (bundle = this.c.getBundle("localized_group_names")) == null)) {
            String string = bundle.getString(String.valueOf(e));
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return d("name");
    }

    public final int e() {
        int b = b("type");
        if (b == -1 || b == 1 || b == 2 || b == 3 || b == 4) {
            return b;
        }
        return -2;
    }

    public final int f() {
        Bundle bundle = this.c.getBundle("circlevisibility");
        if (bundle == null || !bundle.containsKey(c())) {
            return 0;
        }
        return bundle.getInt(c());
    }

    public final int g() {
        return b("people_count");
    }
}
