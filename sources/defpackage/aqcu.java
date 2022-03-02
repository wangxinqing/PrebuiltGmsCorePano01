package defpackage;

/* renamed from: aqcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqcu implements anji {
    private final amzy a;

    public aqcu(anji... anjiArr) {
        this.a = amzy.a((Object[]) anjiArr);
    }

    public final anis a(String str) {
        amzt j = amzy.j();
        anhk i = this.a.listIterator();
        while (i.hasNext()) {
            j.c(((anji) i.next()).a(str));
        }
        return new aqct(str, j.a());
    }
}
