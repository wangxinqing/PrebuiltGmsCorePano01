package defpackage;

/* renamed from: qox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qox implements amqy {
    final /* synthetic */ Boolean a;
    final /* synthetic */ Boolean b;

    public qox(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        Boolean valueOf = Boolean.valueOf(this.a.booleanValue() && this.b.booleanValue() && bool.booleanValue());
        qoi.a("Batch indexing status=%s", valueOf);
        return valueOf;
    }
}
