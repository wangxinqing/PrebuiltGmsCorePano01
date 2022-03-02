package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jtl();
    public static final int[] a = {0, 1};
    public static cbg c = null;
    public atjl b;
    private byte[] d;
    private jue e;
    private jut f;
    private jun g;

    public ContextData(atjl atjl) {
        iva.a((Object) atjl);
        this.b = atjl;
        this.d = null;
        o();
    }

    public static final boolean a(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    private final void n() {
        byte[] bArr;
        if (!a() && (bArr = this.d) != null) {
            try {
                this.b = (atjl) aucj.a((aucj) atjl.k, bArr, aubs.c());
                this.d = null;
            } catch (auda e2) {
                Log.e("ContextData", "Could not deserialize context bytes.", e2);
                throw new IllegalStateException(e2);
            }
        }
    }

    private final void o() {
        atjl atjl = this.b;
        if (atjl == null && this.d != null) {
            return;
        }
        if (atjl != null && this.d == null) {
            return;
        }
        if (atjl != null && this.d != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (atjl == null && this.d == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.b != null;
    }

    public final byte[] b() {
        byte[] bArr = this.d;
        return bArr == null ? this.b.k() : bArr;
    }

    public final atjl c() {
        n();
        return this.b;
    }

    public final String d() {
        n();
        return this.b.b;
    }

    public final jue e() {
        n();
        atjl atjl = this.b;
        if ((atjl.a & 2) == 0) {
            return null;
        }
        atjw atjw = atjl.c;
        if (atjw == null) {
            atjw = atjw.g;
        }
        if (TextUtils.isEmpty(atjw.e) || TextUtils.isEmpty(atjw.f)) {
            return null;
        }
        if (this.e == null) {
            atjw atjw2 = this.b.c;
            if (atjw2 == null) {
                atjw2 = atjw.g;
            }
            this.e = new jue(atjw2);
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextData) {
            ContextData contextData = (ContextData) obj;
            n();
            contextData.n();
            if (d().equals(contextData.d())) {
                atjw atjw = this.b.c;
                if (atjw == null) {
                    atjw = atjw.g;
                }
                int i = atjw.d;
                atjw atjw2 = contextData.b.c;
                if (atjw2 == null) {
                    atjw2 = atjw.g;
                }
                if (i == atjw2.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int f() {
        n();
        int a2 = atjo.a(this.b.d);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final int g() {
        n();
        atjv a2 = atjv.a(this.b.e);
        if (a2 == null) {
            a2 = atjv.UNKNOWN_CONTEXT_NAME;
        }
        return a2.bA;
    }

    public final atjv h() {
        n();
        atjv a2 = atjv.a(this.b.e);
        return a2 == null ? atjv.UNKNOWN_CONTEXT_NAME : a2;
    }

    public final int hashCode() {
        n();
        Object[] objArr = new Object[2];
        objArr[0] = d();
        atjw atjw = this.b.c;
        if (atjw == null) {
            atjw = atjw.g;
        }
        objArr[1] = Integer.valueOf(atjw.d);
        return Arrays.hashCode(objArr);
    }

    public final int i() {
        n();
        int a2 = atjk.a(this.b.f);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final jut j() {
        n();
        atjl atjl = this.b;
        if ((atjl.a & 32) == 0) {
            return null;
        }
        if (this.f == null) {
            atmb atmb = atjl.g;
            if (atmb == null) {
                atmb = atmb.e;
            }
            this.f = new jut(atmb);
        }
        return this.f;
    }

    public final byte[] k() {
        n();
        return a(this.b);
    }

    public final jun l() {
        n();
        atjl atjl = this.b;
        if ((atjl.a & 128) == 0) {
            return null;
        }
        if (this.g == null) {
            atkq atkq = atjl.j;
            if (atkq == null) {
                atkq = atkq.e;
            }
            this.g = new jun(atkq);
        }
        return this.g;
    }

    public final int m() {
        if (!a()) {
            return this.d.length;
        }
        atjl atjl = this.b;
        int i = atjl.U;
        if (i != -1) {
            return i;
        }
        int b2 = aueh.a.a((Object) atjl).b(atjl);
        atjl.U = b2;
        return b2;
    }

    public final String toString() {
        n();
        return c == null ? this.b.toString() : Base64.encodeToString(this.b.k(), 2);
    }

    public static byte[] a(atjl atjl) {
        if ((atjl.a & 64) == 0) {
            return null;
        }
        atjm atjm = atjl.h;
        if (atjm == null) {
            atjm = atjm.a;
        }
        byte[] k = atjm.k();
        if (k.length == 0) {
            return k;
        }
        aubc a2 = aubc.a(k);
        try {
            a2.a();
            return a2.e(a2.t());
        } catch (IOException e2) {
            Log.e("ContextData", "Could not read extension.", e2);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, b(), false);
        ivx.b(parcel, a2);
    }

    public ContextData(byte[] bArr) {
        this.b = null;
        this.d = (byte[]) iva.a((Object) bArr);
        o();
    }

    public final Object a(aubq aubq) {
        n();
        atjm atjm = this.b.h;
        if (atjm == null) {
            atjm = atjm.a;
        }
        auci auci = (auci) aubq;
        atjm.a(auci);
        if (!atjm.m.a(auci.d)) {
            return null;
        }
        atjm atjm2 = this.b.h;
        if (atjm2 == null) {
            atjm2 = atjm.a;
        }
        atjm2.a(auci);
        Object b2 = atjm2.m.b(auci.d);
        if (b2 == null) {
            return auci.b;
        }
        auci.a(b2);
        return b2;
    }

    public final void a(String str, String str2) {
        n();
        atjl atjl = this.b;
        aucd aucd = (aucd) atjl.c(5);
        aucd.a((aucj) atjl);
        atjw atjw = this.b.c;
        if (atjw == null) {
            atjw = atjw.g;
        }
        aucd aucd2 = (aucd) atjw.c(5);
        aucd2.a((aucj) atjw);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        atjw atjw2 = (atjw) aucd2.b;
        str.getClass();
        int i = atjw2.a | 16;
        atjw2.a = i;
        atjw2.f = str;
        str2.getClass();
        atjw2.a = i | 8;
        atjw2.e = str2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        atjl atjl2 = (atjl) aucd.b;
        atjw atjw3 = (atjw) aucd2.i();
        atjl atjl3 = atjl.k;
        atjw3.getClass();
        atjl2.c = atjw3;
        atjl2.a |= 2;
        this.b = (atjl) aucd.i();
        atjw atjw4 = this.b.c;
        if (atjw4 == null) {
            atjw4 = atjw.g;
        }
        this.e = new jue(atjw4);
    }
}
