package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: ztl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ztl {
    public final String a;
    public final String b;
    private final long c = 0;
    private final String d = null;

    public ztl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.b);
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ztl) {
            ztl ztl = (ztl) obj;
            long j = ztl.c;
            String str = ztl.d;
            if (!TextUtils.equals((CharSequence) null, (CharSequence) null) || !TextUtils.equals(this.a, ztl.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a});
    }
}
