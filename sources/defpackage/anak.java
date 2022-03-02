package defpackage;

import java.util.Map;

/* renamed from: anak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anak extends anhj {
    final anhj a = this.b.a.entrySet().iterator();
    final /* synthetic */ anan b;

    public anak(anan anan) {
        this.b = anan;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
