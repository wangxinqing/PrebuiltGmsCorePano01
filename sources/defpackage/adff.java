package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* renamed from: adff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adff {
    public static final jjg a = jjg.a();
    public final ImageView b;
    public final iby c;
    public final iby d;
    private final TextView e;
    private final TextView f;
    private final adgq g;

    public adff(Context context, View view, int i, int i2, int i3, adgq adgq, wls wls) {
        iby a2 = wlt.a(context, wls);
        iby d2 = wlt.d(context, wls);
        this.b = (ImageView) view.findViewById(i);
        this.e = (TextView) view.findViewById(i2);
        this.f = (TextView) view.findViewById(i3);
        this.g = adgq;
        this.c = a2;
        this.d = d2;
    }

    private static xaa a(xfh xfh, String str) {
        if (xfh == null) {
            ((anih) ((anih) a.c()).a("adff", "a", 162, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No owners data arrived with successful response");
            return null;
        }
        Iterator it = xfh.iterator();
        while (it.hasNext()) {
            xaa xaa = (xaa) it.next();
            if (xaa.c().equals(str)) {
                return xaa;
            }
        }
        ((anih) ((anih) a.c()).a("adff", "a", 172, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No Owner found for the current account");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bitmap bitmap, wlj wlj) {
        Bitmap bitmap2;
        try {
            Status aO = wlj.aO();
            if (!aO.c()) {
                ((anih) ((anih) a.c()).a("adff", "a", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error (%d) loading owner avatar: %s", aO.i, (Object) aO.j);
                bitmap2 = null;
            } else {
                bitmap2 = iqw.a(wlu.a(wlj.b()));
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
            }
            this.b.setImageBitmap(bitmap);
        } finally {
            wlj.c();
        }
    }

    public final void a(String str, atzn atzn) {
        if (str == null) {
            this.g.a(this.e, atzn, false, (String) null);
            this.f.setVisibility(8);
            return;
        }
        this.e.setText(str);
        if (!adgq.a(atzn)) {
            this.g.a(this.f, atzn, false, (String) null);
            this.f.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, atzn atzn, wla wla) {
        xaa xaa;
        try {
            Status aO = wla.aO();
            String str2 = null;
            if (!aO.c()) {
                ((anih) ((anih) a.c()).a("adff", "a", 147, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error (%d) loading owner data: %s", aO.i, (Object) aO.j);
            } else {
                xfh b2 = wla.b();
                if (b2 != null) {
                    Iterator it = b2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            xaa = (xaa) it.next();
                            if (xaa.c().equals(str)) {
                                break;
                            }
                        } else {
                            ((anih) ((anih) a.c()).a("adff", "a", 172, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No Owner found for the current account");
                            xaa = null;
                            break;
                        }
                    }
                } else {
                    ((anih) ((anih) a.c()).a("adff", "a", 162, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No owners data arrived with successful response");
                    xaa = null;
                }
                if (xaa != null && xaa.e()) {
                    str2 = xaa.d();
                }
            }
            a(str2, atzn);
        } finally {
            wla.c();
        }
    }
}
