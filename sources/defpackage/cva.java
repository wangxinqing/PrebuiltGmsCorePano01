package defpackage;

import android.content.Context;
import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: cva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cva implements awdt {
    private final bapu a;
    private final bapu b;

    public cva(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Context b2 = ((crw) this.a).a();
        ae aeVar = (ae) ((awdu) this.b).a;
        ctu ctu = new ctu();
        RepositoryDatabase a2 = RepositoryDatabase.a(b2);
        aoru a3 = jfm.a(9);
        if (a3 instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) a3).setRejectedExecutionHandler(new cuz());
        }
        amsv a4 = amta.a((amsv) new cuy(b2));
        cvs a5 = cvs.a();
        diz.a(aeVar, new cux(a2, a3, a4));
        cuw cuw = new cuw(ctu, a3, a2.k(), a2.l(), a2.m(), a4, a5);
        awdx.a((Object) cuw, "Cannot return null from a non-@Nullable @Provides method");
        return cuw;
    }
}
