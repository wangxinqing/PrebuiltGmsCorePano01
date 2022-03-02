package defpackage;

import java.util.Locale;

/* renamed from: kqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqr {
    public final String a;
    public final boolean b;

    public kqr(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        return String.format(Locale.US, "TableDefinition[%s]", new Object[]{this.a});
    }
}
