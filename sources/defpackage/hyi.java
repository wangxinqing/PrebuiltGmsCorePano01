package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* renamed from: hyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hyi implements aora {
    final /* synthetic */ hyo a;

    public hyi(hyo hyo) {
        this.a = hyo;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wla wla = (wla) obj;
        xfh b = wla.b();
        if (b != null) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                xaa xaa = (xaa) it.next();
                hyo hyo = this.a;
                String c = xaa.c();
                String d = xaa.d();
                if (!TextUtils.isEmpty(d)) {
                    hyk hyk = (hyk) hyo.b.get(c);
                    if (hyk == null) {
                        hyk = new hyk();
                    }
                    hyk.a = d;
                    hyo.b.put(c, hyk);
                }
            }
            b.c();
        }
        wla.c();
    }

    public final void a(Throwable th) {
        Log.e("AccountChipArrayAdapter", "Failed to load owner", th);
    }
}
