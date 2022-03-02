package defpackage;

import java.util.Set;

/* renamed from: aqzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqzy implements apyg {
    private final agfe b = agfe.a(arak.a, agfe.a("BulkInsertContacts"));
    private final anax c = anax.a("https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/peopleapi.readwrite", "https://www.googleapis.com/auth/plus.peopleapi.readwrite");

    public final agfe a() {
        return this.b;
    }

    public final apyi b() {
        return arak.af;
    }

    public final Set c() {
        return this.c.isEmpty() ? arak.af.ag : this.c;
    }

    public final boolean d() {
        return false;
    }

    public final int e() {
        return 3;
    }

    public final String toString() {
        return this.b.a;
    }
}
