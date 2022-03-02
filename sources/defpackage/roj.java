package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: roj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class roj implements icm {
    final /* synthetic */ rol a;
    final /* synthetic */ Object b;
    final /* synthetic */ rom c;

    public roj(rom rom, rol rol, Object obj) {
        this.c = rom;
        this.a = rol;
        this.b = obj;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        if (((Status) icl).c() && !this.a.e) {
            synchronized (this.c.c) {
                if (this.c.c.get(this.b) == this.a) {
                    this.c.c.remove(this.b);
                }
            }
        }
    }
}
