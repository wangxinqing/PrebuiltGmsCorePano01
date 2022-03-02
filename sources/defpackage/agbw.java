package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.R;

/* renamed from: agbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agbw implements Runnable {
    private final agcd a;

    public agbw(agcd agcd) {
        this.a = agcd;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        Bitmap bitmap;
        agcd agcd = this.a;
        ou ouVar = agcf.a;
        ImageView imageView = (ImageView) agcd.a.get();
        if (!agcd.d && imageView != null) {
            Object obj = ((agbq) agcd.c).b;
            if (obj != null) {
                int a2 = agbu.a(imageView);
                agcg agcg = agcd.c;
                String a3 = agcf.a(((agbq) agcg).a, agcd.b, agcg, a2);
                synchronized (agcf.a) {
                    bitmap = (Bitmap) agcf.a.get(a3);
                }
                if (bitmap == null) {
                    agcd.b.a().a(obj, a2, new agbx(agcd, a3, obj, a2));
                } else {
                    agcd.a(bitmap);
                }
            } else {
                Context context = imageView.getContext();
                if (agat.a == null) {
                    agat.a = uj.b(context, R.drawable.quantum_gm_ic_account_circle_vd_theme_24);
                }
                Drawable drawable = agat.a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, agba.a, R.attr.ogAccountParticleDiscStyle, 2132017787);
                try {
                    int color = obtainStyledAttributes.getColor(6, context.getResources().getColor(R.color.og_menu_title_color_light));
                    obtainStyledAttributes.recycle();
                    agcd.a(agbp.a(drawable, color));
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
        }
    }
}
