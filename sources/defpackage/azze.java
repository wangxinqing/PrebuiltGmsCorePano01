package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: azze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azze {
    public final List a;
    private final azxa b;
    private final Object[][] c;

    public azze(List list, azxa azxa, Object[][] objArr) {
        amrl.a((Object) list, (Object) "addresses are not set");
        this.a = list;
        amrl.a((Object) azxa, (Object) "attrs");
        this.b = azxa;
        this.c = (Object[][]) amrl.a((Object) objArr, (Object) "customOptions");
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("addrs", (Object) this.a);
        a2.a("attrs", (Object) this.b);
        a2.a("customOptions", (Object) Arrays.deepToString(this.c));
        return a2.toString();
    }
}
