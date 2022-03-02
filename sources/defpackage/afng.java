package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.net.SocketFactory;

/* renamed from: afng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afng implements amsv {
    final /* synthetic */ amri a;
    final /* synthetic */ Executor b;
    final /* synthetic */ Context c;
    final /* synthetic */ amri d;
    final /* synthetic */ agzs e;
    final /* synthetic */ amri f;

    public afng(amri amri, Executor executor, Context context, amri amri2, agzs agzs, amri amri3) {
        this.a = amri;
        this.b = executor;
        this.c = context;
        this.d = amri2;
        this.e = agzs;
        this.f = amri3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        avze avze = new avze();
        if (this.a.a()) {
            avze.h = new afne(SocketFactory.getDefault(), ((Integer) this.a.b()).intValue());
        }
        agab agab = new agab(new agad(avze), this.c, new afnd(this.b, (int) axss.b()));
        if (this.d.a()) {
            agab.a((afzz) this.d.b());
        }
        Context context = this.c;
        agzs agzs = this.e;
        afnf afnf = null;
        if (this.f.a() && ((awdn) this.f.b()).a() != null) {
            afnf = new afnf(this.f);
        }
        return new afnb(context, agab, agzs, afnf);
    }
}
