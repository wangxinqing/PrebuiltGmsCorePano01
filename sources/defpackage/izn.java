package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: izn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izn {
    public static volatile izn a;

    public static final azxi a(Context context, azxi azxi, String str, String str2, baaf baaf, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new bacg(context, str, z));
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new babz(str2));
        }
        if (baaf != null) {
            arrayList.add(new bapd(baaf));
        }
        return !arrayList.isEmpty() ? azxq.a(azxi, (List) arrayList) : azxi;
    }

    public static final Object a(azxi azxi, baaj baaj, Object obj, azxh azxh) {
        azxl a2;
        try {
            a2 = azxi.a(baaj, azxh);
            izl izl = new izl();
            a2.a((azxk) izl, new baaf());
            a2.a(2);
            a2.a(obj);
            a2.b();
            izl.c.await();
            if (izl.a.a()) {
                return izl.b;
            }
            throw izl.a.b();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (Throwable th) {
            a2.a("send failed", th);
            throw th;
        }
    }
}
