package defpackage;

import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: iwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iwz implements xfj {
    private final AudienceMember a;

    public iwz(AudienceMember audienceMember) {
        iva.b(audienceMember.c(), "AudienceMember must be a person.");
        this.a = audienceMember;
    }

    public final String a() {
        return this.a.e;
    }

    public final String b() {
        throw new UnsupportedOperationException();
    }

    public final String c() {
        return this.a.f;
    }

    public final String d() {
        return this.a.g;
    }

    public final String[] e() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xfj) {
            return a().equals(((xfj) obj).a());
        }
        return false;
    }

    public final Iterable f() {
        throw new UnsupportedOperationException();
    }

    public final Iterable g() {
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
