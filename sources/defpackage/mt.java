package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: mt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mt implements ms {
    private final LocaleList a;

    public mt(LocaleList localeList) {
        this.a = localeList;
    }

    public final Object a() {
        return this.a;
    }

    public final int b() {
        return this.a.size();
    }

    public final String c() {
        return this.a.toLanguageTags();
    }

    public final Locale d() {
        return this.a.get(0);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((ms) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
