package defpackage;

import android.database.Cursor;
import java.util.concurrent.Executor;

/* renamed from: kkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkr implements kkp {
    private final lgr a;
    private final Executor b;
    private final kkm c;

    public kkr(lgr lgr, kkm kkm, Executor executor) {
        iva.a((Object) lgr);
        this.a = lgr;
        iva.a((Object) executor);
        this.b = executor;
        iva.a((Object) kkm);
        this.c = kkm;
    }

    /* renamed from: b */
    public final kmp a(kqg kqg, Cursor cursor) {
        lgr lgr = this.a;
        kkm kkm = this.c;
        Executor executor = this.b;
        kmy kmy = new kmy(kqg, cursor);
        return new kmp(kqg, lgr.a(kkx.a(kmy.ae)), kkm, executor, kmh.a(kqg, cursor), kmy);
    }
}
