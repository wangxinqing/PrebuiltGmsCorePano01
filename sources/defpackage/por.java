package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.TimeUnit;

/* renamed from: por  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class por extends poc {
    final /* synthetic */ pou d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public por(pou pou, long j, int i) {
        super(j, i);
        this.d = pou;
    }

    /* access modifiers changed from: protected */
    public final Cursor b() {
        pnz.d("Processing SMS messages newer than date: %d", Long.valueOf(this.a));
        String valueOf = String.valueOf(this.a);
        return this.d.k.a(poo.a, pou.d, pou.h, new String[]{valueOf, valueOf, String.valueOf(this.b), String.valueOf(System.currentTimeMillis() + pou.a)}, "date,_id LIMIT 1000");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        Long b;
        try {
            boolean z = false;
            Integer a = jit.a(this.c, 0);
            if (a == null || (b = jit.b(this.c, 4)) == null) {
                return null;
            }
            this.b = a.intValue();
            this.a = b.longValue();
            int i = this.b;
            StringBuilder sb = new StringBuilder(25);
            sb.append("content://sms/");
            sb.append(i);
            String sb2 = sb.toString();
            poa n = pob.n();
            n.a(this.b);
            n.a = "sms";
            n.b(sb2);
            n.b = jit.a(this.c, 1);
            n.c = jit.a(this.c, 2);
            n.d = pof.a(this.d.j, jit.c(this.c, 3));
            n.a(this.a);
            n.e = jit.c(this.c, 5);
            n.f = jit.c(this.c, 6);
            n.b((int) TimeUnit.MILLISECONDS.toSeconds(this.a));
            n.a("text_plain");
            if (jit.a(this.c, 7, (Integer) 0).intValue() != 0) {
                z = true;
            }
            n.a(z);
            return n.a();
        } catch (SQLiteException e) {
            return null;
        }
    }
}
