package defpackage;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: arwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class arwa {
    private arvz a;
    private arvz b;
    private final tgk c;
    protected final Context f;

    public arwa(Context context) {
        this.f = context;
        this.c = new tgk(context);
    }

    public static auvz a(String str, String str2, int i) {
        aucd o = auvz.k.o();
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auvz auvz = (auvz) o.b;
            str.getClass();
            auvz.a |= 4;
            auvz.c = str;
        }
        if (str2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auvz auvz2 = (auvz) o.b;
            str2.getClass();
            auvz2.a |= 8;
            auvz2.d = str2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        auvz auvz3 = (auvz) o.b;
        auvz3.e = i - 1;
        auvz3.a |= 16;
        return (auvz) o.i();
    }

    public final Long b(String str) {
        if (aynf.e()) {
            return Long.valueOf(this.c.a(str));
        }
        return null;
    }

    public arwa(Context context, byte[] bArr) {
        this(context);
        tgd.a("NearbySettingsLogger");
    }

    public final void a(int i, tdh tdh) {
        aucd o = auwx.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwx auwx = (auwx) o.b;
        auwx.c = 0;
        int i2 = auwx.a | 2;
        auwx.a = i2;
        auwx.e = i - 1;
        int i3 = i2 | 8;
        auwx.a = i3;
        auwx.b = 2;
        int i4 = i3 | 1;
        auwx.a = i4;
        if (tdh instanceof tcu) {
            auwx.d = 1;
            auwx.a = i4 | 4;
        } else {
            if (tdh instanceof tcp) {
                auwx.d = 2;
            } else {
                auwx.d = 0;
            }
            auwx.a = i4 | 4;
        }
        a((auwx) o.i());
    }

    public final void a(int i, tdk tdk) {
        int i2;
        aucd o = auwx.f.o();
        byte b2 = tdk.n;
        int i3 = 3;
        if (b2 == 1) {
            i3 = 2;
        } else if (b2 != 2) {
            i3 = b2 != 3 ? b2 != 4 ? 1 : 5 : 4;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwx auwx = (auwx) o.b;
        auwx.c = i3 - 1;
        int i4 = auwx.a | 2;
        auwx.a = i4;
        auwx.e = i - 1;
        int i5 = i4 | 8;
        auwx.a = i5;
        if (tdk instanceof tdn) {
            auwx.b = 1;
            int i6 = i5 | 1;
            auwx.a = i6;
            if (tdk instanceof tcz) {
                auwx.d = 1;
                auwx.a = i6 | 4;
            } else {
                if (tdk instanceof tct) {
                    auwx.d = 2;
                } else {
                    auwx.d = 0;
                }
                auwx.a = i6 | 4;
            }
        } else {
            if (tdk instanceof tdl) {
                auwx.b = 2;
                int i7 = i5 | 1;
                auwx.a = i7;
                if (tdk instanceof tcw) {
                    auwx.d = 1;
                    auwx.a = i7 | 4;
                } else {
                    if (tdk instanceof tcr) {
                        auwx.d = 2;
                    } else {
                        auwx.d = 0;
                    }
                    i2 = i7 | 4;
                }
            } else {
                auwx.b = 0;
                i2 = i5 | 1;
            }
            auwx.a = i2;
        }
        a((auwx) o.i());
    }

    public final void a(auvz auvz, boolean z) {
        arvz arvz;
        if (Boolean.valueOf(z).booleanValue()) {
            if (this.a == null) {
                this.a = new arvz(new hol(ihs.b(), "COPRESENCE", (String) null));
            }
            arvz = this.a;
        } else {
            if (this.b == null) {
                this.b = new arvz(new hol(ihs.b(), "COPRESENCE_NO_IDS", (String) null));
            }
            arvz = this.b;
        }
        arvz.a.a((audx) auvz).b();
    }

    /* access modifiers changed from: protected */
    public final void a(auwx auwx) {
        auvz a2 = a((String) null, (String) null, 7);
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        auvz auvz = (auvz) aucd.b;
        auvz auvz2 = auvz.k;
        auwx.getClass();
        auvz.h = auwx;
        auvz.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a((auvz) aucd.i(), true);
    }

    public final void a(String str, String str2, auwz auwz) {
        auvz a2 = a(str, str2, 6);
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        auvz auvz = (auvz) aucd.b;
        auvz auvz2 = auvz.k;
        auwz.getClass();
        auvz.g = auwz;
        auvz.a |= 128;
        a((auvz) aucd.i(), false);
    }
}
