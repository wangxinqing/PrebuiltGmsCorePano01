package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.Iterator;

/* renamed from: agak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agak implements Runnable {
    private final AccountParticleDisc a;
    private final Object b;

    public agak(AccountParticleDisc accountParticleDisc, Object obj) {
        this.a = accountParticleDisc;
        this.b = obj;
    }

    public final void run() {
        ampu ampu;
        AccountParticleDisc accountParticleDisc = this.a;
        Object obj = this.b;
        amrl.b(accountParticleDisc.a(), (Object) "initialize must be called first");
        if (obj != accountParticleDisc.h) {
            accountParticleDisc.c();
            ImageView imageView = accountParticleDisc.a;
            int i = accountParticleDisc.g;
            imageView.setPadding(i, i, i, i);
            agbh agbh = accountParticleDisc.e;
            if (agbh != null) {
                agzj.b();
                agbh.a.setImageDrawable((Drawable) null);
            }
        }
        accountParticleDisc.h = obj;
        agbc agbc = accountParticleDisc.d;
        agzj.b();
        for (agau agau : agbc.a) {
            if (agbc.b != null) {
                agas a2 = agau.a();
                a2.a.remove(agbc.c);
            }
            agbc.a(obj);
        }
        agbc.b = obj;
        agzj.b();
        if (accountParticleDisc.f) {
            agbc agbc2 = accountParticleDisc.d;
            agzj.b();
            if (agbc2.b != null) {
                for (agau agau2 : agbc2.a) {
                    Object obj2 = agbc2.b;
                    agau.a();
                }
            }
            ampu = ampu.a;
        } else {
            ampu = ampu.a;
        }
        accountParticleDisc.i = ampu;
        accountParticleDisc.a(obj, accountParticleDisc.a);
        accountParticleDisc.post(new agam(accountParticleDisc));
        agzj.b();
        agbh agbh2 = accountParticleDisc.e;
        if (agbh2 != null) {
            amri amri = accountParticleDisc.i;
            agzj.b();
            if (!amri.equals(agbh2.d)) {
                agbh2.d = amri;
                amzt j = amzy.j();
                if (agbh2.a.getDrawable() != null) {
                    ObjectAnimator duration = ObjectAnimator.ofInt(agbh2.a, agbh.f, new int[]{agbh2.c, 0}).setDuration(200);
                    duration.addListener(new agbd(agbh2));
                    j.c(duration);
                }
                if (amri.a()) {
                    ObjectAnimator duration2 = ObjectAnimator.ofInt(agbh2.a, agbh.f, new int[]{0, agbh2.c}).setDuration(200);
                    duration2.addListener(new agbe(agbh2, amri));
                    j.c(duration2);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(j.a());
                animatorSet.addListener(new agbf(agbh2));
                AnimatorSet animatorSet2 = agbh2.e;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                agbh2.e = animatorSet;
                agbh2.e.start();
            }
        }
        Iterator it = accountParticleDisc.c.iterator();
        while (it.hasNext()) {
            ((agap) it.next()).a();
        }
    }
}
