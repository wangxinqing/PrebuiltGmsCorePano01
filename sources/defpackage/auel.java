package defpackage;

import java.util.NoSuchElementException;

/* renamed from: auel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auel extends auao {
    final auen a = new auen(this.c);
    auas b = b();
    final /* synthetic */ auep c;

    public auel(auep auep) {
        this.c = auep;
    }

    private final auas b() {
        if (this.a.hasNext()) {
            return this.a.next().iterator();
        }
        return null;
    }

    public final byte a() {
        auas auas = this.b;
        if (auas != null) {
            byte a2 = auas.a();
            if (!this.b.hasNext()) {
                this.b = b();
            }
            return a2;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.b != null;
    }
}
