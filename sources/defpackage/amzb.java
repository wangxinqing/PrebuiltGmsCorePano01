package defpackage;

/* renamed from: amzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzb extends amze {
    final /* synthetic */ amzf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amzb(amzf amzf) {
        super(amzf);
        this.a = amzf;
    }

    public final Object a(int i) {
        return this.a.a[i];
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        int a2 = amzi.a(obj);
        int a3 = this.a.a(obj, a2);
        if (a3 == -1) {
            return false;
        }
        this.a.a(a3, a2);
        return true;
    }
}
