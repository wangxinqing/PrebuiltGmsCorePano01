package defpackage;

import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aadn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aadn {
    public static int a(int i) {
        if (i != 0) {
            return i != 1 ? 2 : 4;
        }
        return 3;
    }

    public static int b(int i) {
        return i != 1 ? 2 : 3;
    }

    public static int c(int i) {
        return i != 1 ? 1 : 2;
    }

    public static int d(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 4) {
            return 9;
        }
        if (i != 8) {
            if (i == 32) {
                return 11;
            }
            if (i == 64) {
                return 13;
            }
            if (i == 256) {
                return 12;
            }
            if (i != 512) {
                if (i != 1024) {
                    return i != 2048 ? 1 : 7;
                }
                return 10;
            }
        }
        return 8;
    }

    public static int e(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 4;
    }

    public static synchronized List a(Iterable iterable) {
        ArrayList arrayList;
        synchronized (aadn.class) {
            nz nzVar = new nz();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                aabq aabq = (aabq) it.next();
                aucd aucd = (aucd) nzVar.get(Integer.valueOf((int) aabq.a.e));
                if (aucd == null) {
                    aucd = nxl.e.o();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    nxl nxl = (nxl) aucd.b;
                    int i = nxl.a | 4;
                    nxl.a = i;
                    nxl.d = 0;
                    int i2 = i | 2;
                    nxl.a = i2;
                    nxl.c = 0;
                    nxc nxc = aabq.a;
                    long j = nxc.e;
                    nxl.a = i2 | 1;
                    nxl.b = (long) ((int) j);
                    nzVar.put(Integer.valueOf((int) nxc.e), aucd);
                }
                if (!aabq.o()) {
                    long j2 = ((nxl) aucd.b).c + 1;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    nxl nxl2 = (nxl) aucd.b;
                    nxl nxl3 = nxl.e;
                    nxl2.a |= 2;
                    nxl2.c = j2;
                } else {
                    long j3 = ((nxl) aucd.b).d + 1;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    nxl nxl4 = (nxl) aucd.b;
                    nxl nxl5 = nxl.e;
                    nxl4.a |= 4;
                    nxl4.d = j3;
                }
            }
            arrayList = new ArrayList(nzVar.h);
            for (aucd g : nzVar.values()) {
                arrayList.add((nxl) g.i());
            }
        }
        return arrayList;
    }

    public static nwi a(int i, int i2) {
        aucd o = nwi.d.o();
        String valueOf = String.valueOf(i2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        nwi nwi = (nwi) o.b;
        valueOf.getClass();
        int i3 = 2;
        int i4 = nwi.a | 2;
        nwi.a = i4;
        nwi.c = valueOf;
        if (i != 1) {
            i3 = i != 2 ? i != 4 ? i != 8 ? i != 16 ? 1 : 6 : 5 : 4 : 3;
        }
        nwi.b = i3 - 1;
        nwi.a = i4 | 1;
        return (nwi) o.i();
    }

    public static nwq a(qxx qxx) {
        aucd o = nwq.i.o();
        int a = a(qxx.n);
        if (o.c) {
            o.c();
            o.c = false;
        }
        nwq nwq = (nwq) o.b;
        nwq.c = a - 1;
        nwq.a |= 8;
        int a2 = a(qxx.o);
        if (o.c) {
            o.c();
            o.c = false;
        }
        nwq nwq2 = (nwq) o.b;
        nwq2.e = a2 - 1;
        nwq2.a |= 32;
        int b = b(qxx.p);
        if (o.c) {
            o.c();
            o.c = false;
        }
        nwq nwq3 = (nwq) o.b;
        nwq3.d = b - 1;
        nwq3.a |= 16;
        int b2 = b(qxx.q);
        if (o.c) {
            o.c();
            o.c = false;
        }
        nwq nwq4 = (nwq) o.b;
        nwq4.f = b2 - 1;
        nwq4.a |= 64;
        if (axbn.a.a().n()) {
            int c = c(qxx.a(qxr.a));
            if (o.c) {
                o.c();
                o.c = false;
            }
            nwq nwq5 = (nwq) o.b;
            nwq5.g = c - 1;
            nwq5.a |= 128;
            int c2 = c(qxx.b(qxr.a));
            if (o.c) {
                o.c();
                o.c = false;
            }
            nwq nwq6 = (nwq) o.b;
            nwq6.h = c2 - 1;
            nwq6.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        for (Uri uri : qxx.k) {
            o.h(uri.toString());
        }
        return (nwq) o.i();
    }

    public static nwz a(aabq aabq) {
        aucd o = nwz.e.o();
        Bundle bundle = aabq.n.m;
        boolean z = true;
        if (bundle == null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            nwz nwz = (nwz) o.b;
            int i = nwz.a | 4;
            nwz.a = i;
            nwz.d = true;
            int i2 = 1 | i;
            nwz.a = i2;
            nwz.b = 0;
            nwz.a = i2 | 2;
            nwz.c = 0;
            return (nwz) o.i();
        }
        try {
            Bundle bundle2 = new Bundle(bundle);
            long c = (long) qxx.c(bundle2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            nwz nwz2 = (nwz) o.b;
            nwz2.a |= 2;
            nwz2.c = c;
            long size = (long) bundle2.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nwz nwz3 = (nwz) o.b;
            nwz3.a |= 1;
            nwz3.b = size;
            try {
                qxx.b(bundle2);
            } catch (IllegalArgumentException e) {
                z = false;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            nwz nwz4 = (nwz) o.b;
            nwz4.a |= 4;
            nwz4.d = z;
        } catch (BadParcelableException e2) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            nwz nwz5 = (nwz) o.b;
            nwz5.a |= 4;
            nwz5.d = false;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ClassNotFoundException) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nwz nwz6 = (nwz) o.b;
                nwz6.a |= 4;
                nwz6.d = false;
            } else {
                throw e3;
            }
        }
        return (nwz) o.i();
    }

    public static nxf a(long j, long j2) {
        aucd o = nxf.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nxf nxf = (nxf) o.b;
        nxf.d = 2;
        nxf.a |= 1;
        aucd o2 = nwy.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nwy nwy = (nwy) o2.b;
        int i = nwy.a | 1;
        nwy.a = i;
        nwy.b = j;
        nwy.a = i | 2;
        nwy.c = j2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        nxf nxf2 = (nxf) o.b;
        nwy nwy2 = (nwy) o2.i();
        nwy2.getClass();
        nxf2.c = nwy2;
        nxf2.b = 2;
        return (nxf) o.i();
    }
}
