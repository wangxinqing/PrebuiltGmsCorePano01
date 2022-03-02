package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.widget.ImageView;
import com.google.android.gms.R;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: agcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agcf implements ComponentCallbacks2, agbv, agbt {
    public static final ou a = new ou();
    public final agce b = new agce();
    public final Executor c;

    public agcf(Executor executor) {
        amrl.a((Object) executor);
        this.c = executor;
    }

    public static String a(agck agck, agcj agcj, agcg agcg, int i) {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[2];
        Locale locale2 = Locale.ROOT;
        Object[] objArr2 = new Object[3];
        objArr2[0] = agck.a().getName();
        objArr2[1] = agck.b();
        agao d = agcj.d();
        Object obj = ((agbq) agcg).b;
        agaf agaf = d.a;
        if (obj != null) {
            str = agaf.a(obj);
        } else {
            str = "null";
        }
        objArr2[2] = str;
        objArr[0] = String.format(locale2, "%s:%s:%s", objArr2);
        objArr[1] = Integer.valueOf(i);
        return String.format(locale, "%s:%s", objArr);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        synchronized (a) {
            a.clear();
        }
    }

    public static void a(ImageView imageView, agcd agcd) {
        agzj.b();
        agcd agcd2 = (agcd) imageView.getTag(R.id.tag_account_image_request);
        if (agcd2 != null) {
            agcd2.d = true;
        }
        imageView.setTag(R.id.tag_account_image_request, agcd);
    }
}
