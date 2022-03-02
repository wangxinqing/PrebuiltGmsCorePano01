package defpackage;

/* renamed from: nt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class nt implements np {
    private final ns a;

    public nt(ns nsVar) {
        this.a = nsVar;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    public final boolean a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        ns nsVar = this.a;
        if (nsVar == null) {
            return a();
        }
        int a2 = nsVar.a(charSequence, i);
        if (a2 == 0) {
            return true;
        }
        if (a2 != 1) {
            return a();
        }
        return false;
    }
}
