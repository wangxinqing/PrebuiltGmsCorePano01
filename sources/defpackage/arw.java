package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: arw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arw {
    public final Map a = new HashMap();
    public View b;
    final ArrayList c = new ArrayList();

    @Deprecated
    public arw() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof arw)) {
            return false;
        }
        arw arw = (arw) obj;
        return this.b == arw.b && this.a.equals(arw.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }

    public arw(View view) {
        this.b = view;
    }
}
