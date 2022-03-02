package defpackage;

import android.content.Intent;
import com.google.android.chimera.BoundService;
import java.util.Collection;

/* renamed from: bki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bki {
    final ou a = new ou();
    final nz b = new nz();
    final /* synthetic */ bkj c;

    public bki(bkj bkj) {
        this.c = bkj;
    }

    public final BoundService a(Intent intent) {
        return (BoundService) this.a.get(intent.getAction());
    }

    public final Collection a() {
        return this.b.values();
    }
}
