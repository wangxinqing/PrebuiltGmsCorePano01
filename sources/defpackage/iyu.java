package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: iyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iyu {
    private final ArrayList a = new ArrayList();

    public iyu() {
        new HashMap();
    }

    public final void a(String str) {
        this.a.add(str);
    }

    public final void a(StringBuilder sb) {
        iyv.a(sb, "prettyPrint", String.valueOf(!jix.a()));
        if (!this.a.isEmpty()) {
            iyv.a(sb, "fields", TextUtils.join(",", this.a.toArray()));
        }
    }
}
