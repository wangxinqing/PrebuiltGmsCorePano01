package defpackage;

import android.content.ComponentName;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: plv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plv {
    public final String a;
    private final String b;

    public plv(ComponentName componentName, String str) {
        this.a = componentName.flattenToString();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof plv) {
            plv plv = (plv) obj;
            return TextUtils.equals(this.a, plv.a) && TextUtils.equals(this.b, plv.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
        sb.append("ComponentData: flattenedComponentName=");
        sb.append(str);
        sb.append(", displayname=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
