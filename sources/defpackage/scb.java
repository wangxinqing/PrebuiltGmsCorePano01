package defpackage;

import android.content.Context;
import javax.net.SocketFactory;

/* renamed from: scb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class scb implements amsv {
    private final int a;
    private final Context b;
    private final agzs c;

    public scb(int i, Context context, agzs agzs) {
        this.a = i;
        this.b = context;
        this.c = agzs;
    }

    public final Object a() {
        int i = this.a;
        Context context = this.b;
        agzs agzs = this.c;
        avze avze = new avze();
        avze.h = new afne(SocketFactory.getDefault(), i);
        return new afnb(context, new agab(new agad(avze), context, jfb.a((int) axss.b(), 10)), agzs, (afnf) null);
    }
}
