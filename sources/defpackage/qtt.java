package defpackage;

import android.database.Cursor;
import java.util.concurrent.TimeUnit;

/* renamed from: qtt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qtt extends qth {
    final /* synthetic */ qtv d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qtt(qtv qtv, long j, int i) {
        super(j, i);
        this.d = qtv;
    }

    /* access modifiers changed from: protected */
    public final Cursor b() {
        new Object[1][0] = Long.valueOf(this.a);
        String valueOf = String.valueOf(this.a);
        return this.d.h.a(qtp.b, qtv.d, qtv.g, new String[]{valueOf, valueOf, String.valueOf(this.b), String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() + qtv.a))}, "date,_id LIMIT 1000");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        qtg b = this.d.b(this.c);
        if (b != null) {
            this.b = b.a();
            this.a = TimeUnit.MILLISECONDS.toSeconds(b.f());
        }
        return b;
    }
}
