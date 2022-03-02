package defpackage;

import android.database.Cursor;

/* renamed from: qts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qts extends qth {
    final /* synthetic */ qtv d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qts(qtv qtv, long j, int i) {
        super(j, i);
        this.d = qtv;
    }

    /* access modifiers changed from: protected */
    public final Cursor b() {
        new Object[1][0] = Long.valueOf(this.a);
        String valueOf = String.valueOf(this.a);
        return this.d.h.a(qtp.a, qtv.c, qtv.f, new String[]{valueOf, valueOf, String.valueOf(this.b), String.valueOf(System.currentTimeMillis() + qtv.a)}, "date,_id LIMIT 1000");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        qtg a = this.d.a(this.c);
        if (a != null) {
            this.b = a.a();
            this.a = a.f();
        }
        return a;
    }
}
