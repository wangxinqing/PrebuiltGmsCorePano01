package defpackage;

import android.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: afzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afzd implements avyy {
    private static final String b = afzd.class.getSimpleName();
    private final boolean c;
    private final afzg d;
    private final afzh e;

    public afzd() {
        this(new afzf(), new afzc());
    }

    private static final List d(String str) {
        if (str == null) {
            throw new UnknownHostException("null == hostname");
        }
        new Object[1][0] = str;
        throw null;
    }

    public final List a(String str) {
        if (this.c) {
            return c(str);
        }
        return d(str);
    }

    public final void b(String str) {
        long j;
        try {
            if (!this.c) {
                j = (long) d(str).size();
            } else {
                j = (long) c(str).size();
            }
            Object[] objArr = {str, Long.valueOf(j)};
        } catch (UnknownHostException e2) {
            Log.i(b, String.format("Hinting triggered for %s: No usable result.", new Object[]{str}));
        }
    }

    public final synchronized List c(String str) {
        ArrayList arrayList;
        if (str != null) {
            new Object[1][0] = str;
            arrayList = new ArrayList();
            try {
                List<InetAddress> asList = Arrays.asList(InetAddress.getAllByName(str));
                for (InetAddress inetAddress : asList) {
                    if (this.d.a(str, inetAddress)) {
                        arrayList.add(inetAddress);
                    }
                }
                Object[] objArr = {str, Integer.valueOf(arrayList.size()), Integer.valueOf(asList.size())};
            } catch (UnknownHostException e2) {
            }
            if (arrayList.isEmpty()) {
                new Object[1][0] = str;
                if (arrayList.addAll(this.e.a(str))) {
                    Object[] objArr2 = {str, amre.a(",").a((Iterable) arrayList)};
                } else {
                    Log.w(b, String.format("No verified mapping and No cache for %s.", new Object[]{str}));
                    throw new UnknownHostException(str.concat(" cannot be resolved, or poisoned but cannot fixed"));
                }
            } else {
                Object[] objArr3 = {str, amre.a(",").a((Iterable) arrayList)};
                this.e.a(str, arrayList);
            }
        } else {
            throw new UnknownHostException("null == hostname");
        }
        return Collections.unmodifiableList(arrayList);
    }

    public afzd(afzh afzh, afzg afzg) {
        this.e = afzh;
        this.d = afzg;
        this.c = true;
    }
}
