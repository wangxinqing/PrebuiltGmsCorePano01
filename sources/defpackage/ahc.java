package defpackage;

/* renamed from: ahc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahc extends agy {
    final /* synthetic */ ahd c;

    public ahc(ahd ahd) {
        this.c = ahd;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        agz agz = (agz) this.c.a.get();
        if (agz == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + agz.a + "]";
    }
}
