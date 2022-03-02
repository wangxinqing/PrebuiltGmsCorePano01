package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import com.google.android.gms.R;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;
import java.util.List;

/* renamed from: aaqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqv implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ List b;
    final /* synthetic */ aanv c;
    final /* synthetic */ VerifyAppsSettingsChimeraActivity d;

    public aaqv(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, long j, List list, aanv aanv) {
        this.d = verifyAppsSettingsChimeraActivity;
        this.a = j;
        this.b = list;
        this.c = aanv;
    }

    public final void run() {
        aaqu aaqu;
        int i;
        int i2;
        RecyclerView recyclerView = (RecyclerView) this.d.findViewById(16908298);
        if (System.currentTimeMillis() - this.d.m < 150) {
            aaqu = new aaqu(recyclerView, recyclerView.getItemAnimator());
            recyclerView.setItemAnimator((aco) null);
        } else {
            aaqu = null;
        }
        try {
            if (this.d.a.d()) {
                this.d.a(this.a, this.b);
            }
            aaqy aaqy = new aaqy(this.d, this.c);
            aaqy.a(3);
            if (aaqy.a != null) {
                Drawable a2 = aaqy.d.a((int) R.drawable.play_protect_ic_alert_black_24dp, (int) R.color.material_google_red_500);
                for (aanu aanu : aaqy.a) {
                    aaqm aaqm = new aaqm(aaqy.c);
                    aaqm.a(3);
                    aaqz aaqz = new aaqz(aaqy.d.q, aanu.a);
                    if (!aaqz.b) {
                        i = R.string.play_protect_uninstall_pha;
                    } else {
                        i = R.string.play_protect_disable_pha;
                    }
                    aaqm.b(i);
                    aaqm.b(aaqz.a);
                    aaqm.a(a2);
                    aaqm.n = aaqy.a(aanu);
                    aaqm.h();
                    if (!aaqz.b) {
                        i2 = R.string.play_protect_uninstall;
                    } else {
                        i2 = R.string.play_protect_disable;
                    }
                    aaqy.a(aaqm, true, i2, aanu.d);
                    aaqy.e.a((jmc) aaqm);
                }
            }
            int i3 = 4;
            aaqy.a(4);
            if (aaqy.b != null) {
                Drawable a3 = aaqy.d.a((int) R.drawable.play_protect_ic_check_black_24dp, (int) R.color.material_google_green_500);
                Drawable a4 = aaqy.d.a((int) R.drawable.quantum_ic_expand_more_vd_theme_24, (int) R.color.material_grey_600);
                Drawable a5 = aaqy.d.a((int) R.drawable.quantum_ic_expand_less_vd_theme_24, (int) R.color.material_grey_600);
                aanu[] aanuArr = aaqy.b;
                int length = aanuArr.length;
                int i4 = 0;
                while (i4 < length) {
                    aanu aanu2 = aanuArr[i4];
                    aaqm aaqm2 = new aaqm(aaqy.c, a5, a4);
                    aaqm2.a(i3);
                    aaqz aaqz2 = new aaqz(aaqy.d.q, aanu2.a);
                    if (aaqz2.b) {
                        aaqm2.b((int) R.string.play_protect_pha_disabled);
                        aaqm2.b(aaqz2.a);
                    } else {
                        aaqm2.b((int) R.string.play_protect_pha_removed);
                        aaqm2.b((CharSequence) aanu2.e);
                    }
                    aaqm2.a(a3);
                    aaqm2.p = aaqy.a(aanu2);
                    aaqm2.h();
                    aaqy.a(aaqm2, false, R.string.play_protect_hide, aanu2.d);
                    aaqy.e.a((jmc) aaqm2);
                    i4++;
                    i3 = 4;
                }
            }
            aaqy.d.f();
            recyclerView.requestLayout();
            if (aaqu != null) {
                recyclerView.post(aaqu);
            }
        } catch (Throwable th) {
            if (aaqu != null) {
                recyclerView.post(aaqu);
            }
            throw th;
        }
    }
}
