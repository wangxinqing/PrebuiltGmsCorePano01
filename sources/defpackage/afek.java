package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afek implements afbu {
    public final awdn a;
    public final aetj b;
    public final afeb c;
    public final Context d;
    public final afgs e;
    public final awdn f;
    private final aeri g;
    private final awdn h;
    private final pbw i;
    private final pdd j;

    public afek(awdn awdn, aetj aetj, afeb afeb, Context context, pbw pbw, pdd pdd, aeri aeri, awdn awdn2, afgs afgs, awdn awdn3) {
        this.a = awdn;
        this.b = aetj;
        this.c = afeb;
        this.d = context;
        this.i = pbw;
        this.j = pdd;
        this.g = aeri;
        this.h = awdn2;
        this.e = afgs;
        this.f = awdn3;
    }

    public static boolean a(String str, Context context) {
        return (context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags & 2097152) != 0;
    }

    public static boolean b(String str, Context context) {
        return context.getPackageManager().getPackageInfo(str, 0).applicationInfo.enabled;
    }

    public final aorr a(Bundle bundle) {
        if (!this.g.u()) {
            return aopr.a(this.j.a(), (aoqb) new afeh(this), (Executor) this.i);
        }
        pbw pbw = this.i;
        afeb afeb = this.c;
        afeb.getClass();
        return aopr.a(pbw.a(new afei(afeb)), (aoqb) new afeg(this), (Executor) this.i);
    }

    public final aorr a(List list) {
        if (((Boolean) pba.ag.a()).booleanValue()) {
            return aopr.a((aorr) this.h.a(), (aoqb) new afej(this, list), (Executor) this.i);
        }
        return aorl.a((Object) null);
    }
}
