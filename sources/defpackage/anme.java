package defpackage;

/* renamed from: anme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anme implements Appendable {
    int a;
    final /* synthetic */ int b = 2;
    final /* synthetic */ Appendable c;
    final /* synthetic */ String d;

    public anme(Appendable appendable, String str) {
        this.c = appendable;
        this.d = str;
        this.a = this.b;
    }

    public final Appendable append(char c2) {
        if (this.a == 0) {
            this.c.append(this.d);
            this.a = this.b;
        }
        this.c.append(c2);
        this.a--;
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
