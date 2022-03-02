package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: ams  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ams {
    final int a;
    final int b;
    final String c;

    public ams(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.B;
        this.b = preference.C;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ams) {
            ams ams = (ams) obj;
            if (this.a == ams.a && this.b == ams.b && TextUtils.equals(this.c, ams.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
