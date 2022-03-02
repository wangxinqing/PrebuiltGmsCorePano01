package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: altw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class altw implements alsn {
    final /* synthetic */ altx a;
    private final Set b = new HashSet();

    public altw(altx altx) {
        this.a = altx;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(alsk alsk);

    /* access modifiers changed from: protected */
    public abstract Object a(amic amic);

    public final Object a(amjf amjf) {
        if (amjf.b != amje.REFERENCED_ID) {
            return a(amjf.a());
        }
        String b2 = amjf.b();
        if (this.b.contains(b2)) {
            return b(this.a.b.b(b2));
        }
        this.b.add(b2);
        return a((alsk) this.a.b.b(b2));
    }

    /* access modifiers changed from: protected */
    public abstract Object b(alsk alsk);
}
