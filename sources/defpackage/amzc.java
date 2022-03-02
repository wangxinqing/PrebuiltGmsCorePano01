package defpackage;

/* renamed from: amzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzc extends amze {
    final /* synthetic */ amzf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amzc(amzf amzf) {
        super(amzf);
        this.a = amzf;
    }

    public final Object a(int i) {
        return this.a.b[i];
    }

    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public final boolean remove(Object obj) {
        int a2 = amzi.a(obj);
        int b = this.a.b(obj, a2);
        if (b == -1) {
            return false;
        }
        this.a.b(b, a2);
        return true;
    }
}
