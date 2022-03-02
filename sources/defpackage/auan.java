package defpackage;

import java.util.NoSuchElementException;

/* renamed from: auan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auan extends auao {
    final /* synthetic */ auay a;
    private int b = 0;
    private final int c = this.a.a();

    public auan(auay auay) {
        this.a = auay;
    }

    public final byte a() {
        int i = this.b;
        if (i < this.c) {
            this.b = i + 1;
            return this.a.b(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.b < this.c;
    }
}
