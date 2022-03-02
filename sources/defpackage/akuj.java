package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: akuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akuj implements akjc {
    public final akuv a;
    public final Executor b;
    public final Executor c;
    public final akun d;
    public final akmq e;
    public final akoc f;
    public final akim g;
    public final akuo h;
    private final Executor i;
    private final Context j;
    private akmf k = null;
    private akmf l = null;

    public akuj(Context context, akuv akuv, Executor executor, aksa aksa, Executor executor2, Executor executor3, aoru aoru, aksc aksc, aktg aktg, hol hol) {
        this.a = akuv;
        this.g = new akim(aksc, aktg, aksa);
        this.b = executor;
        this.c = executor2;
        this.i = executor3;
        this.j = context;
        boolean d2 = jix.d(context);
        this.h = new akuo(d2);
        this.d = new akun((ConnectivityManager) context.getSystemService("connectivity"), new akhj(context, hol, 2, aoru), d2, ModuleManager.get(context).getCurrentModule().moduleVersion, new akuk(context));
        this.e = new akmq();
        ou ouVar = new ou();
        try {
            assq assq = ((assp) aucj.a((aucj) assp.b, jjt.b(context.getResources().getAssets().open("on_the_go_model_parameters")))).a;
            if (assq == null) {
                assq = assq.b;
            }
            for (asso asso : assq.a) {
                ouVar.put(asso.a, Float.valueOf((float) asso.b));
            }
        } catch (IOException e2) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", String.format("%s: %s\n%s", new Object[]{"?", "Error loading model weights from on_the_go_model_parameters", Log.getStackTraceString(e2)}));
            }
        }
        this.f = new akoc(ouVar);
    }

    public final akmf a() {
        if (azbh.a.a().b()) {
            alfy.a("Using MDD for weights download");
            if (this.l == null) {
                alfy.a("Using MDD for weights download - recreating MDD manager");
                this.l = new akho(this.h, this.d, this.i, "default_inference_model", this.j);
                akmf akmf = this.k;
                if (!(akmf == null || ((akmn) akmf).b == -1)) {
                    ((akho) this.l).e();
                    this.k.b();
                }
                this.k = null;
                this.i.execute(new akuh(this.j));
            }
            return this.l;
        }
        alfy.a("Not using MDD for weights download");
        if (this.k == null) {
            alfy.a("Recreating Classic manager.");
            this.k = new akmn(this.h, this.g, new akmo(new akui(this.j)), this.d, this.i, this.j.getCacheDir());
            akmf akmf2 = this.l;
            if (!(akmf2 == null || ((akho) akmf2).b == -1)) {
                this.k.a();
                this.l.b();
            }
            this.l = null;
        }
        return this.k;
    }
}
