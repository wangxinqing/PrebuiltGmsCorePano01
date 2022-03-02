package defpackage;

import com.android.volley.Header;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfe {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public bfe(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    public static bfe a(bff bff) {
        if (DiskBasedCache.a((InputStream) bff) == 538247942) {
            String a2 = DiskBasedCache.a(bff);
            String a3 = DiskBasedCache.a(bff);
            long b2 = DiskBasedCache.b((InputStream) bff);
            long b3 = DiskBasedCache.b((InputStream) bff);
            long b4 = DiskBasedCache.b((InputStream) bff);
            long b5 = DiskBasedCache.b((InputStream) bff);
            int a4 = DiskBasedCache.a((InputStream) bff);
            if (a4 >= 0) {
                List arrayList = a4 != 0 ? new ArrayList() : Collections.emptyList();
                for (int i = 0; i < a4; i++) {
                    arrayList.add(new Header(DiskBasedCache.a(bff).intern(), DiskBasedCache.a(bff).intern()));
                }
                return new bfe(a2, a3, b2, b3, b4, b5, arrayList);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(a4);
            throw new IOException(sb.toString());
        }
        throw new IOException();
    }
}
