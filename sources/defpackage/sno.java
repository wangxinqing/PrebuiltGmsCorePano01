package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sno {
    public static final Map a = new ConcurrentHashMap();
    public final String b;
    public String c;
    public long d;
    public long e;

    public sno(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j;
    }

    public static List a(Context context, long j) {
        ArrayList arrayList = new ArrayList();
        if (azfv.i() && new aaal(context).a()) {
            for (sno sno : a.values()) {
                if (sno.d - azfv.e() <= j && j <= sno.e + azfv.e()) {
                    arrayList.add(sno);
                }
            }
        }
        return arrayList;
    }
}
