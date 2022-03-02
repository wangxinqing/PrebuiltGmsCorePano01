package defpackage;

/* renamed from: img  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class img extends imh {
    private final amzy b;

    public img(String str, amzy amzy) {
        super(str);
        this.b = amzy;
    }

    /* access modifiers changed from: protected */
    public final boolean a(inb inb) {
        anhk i = this.b.listIterator();
        while (i.hasNext()) {
            if (!((imh) i.next()).a(inb)) {
                return false;
            }
        }
        return true;
    }
}
