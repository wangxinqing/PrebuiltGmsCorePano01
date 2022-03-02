package defpackage;

import com.google.android.gms.awareness.fence.FenceState;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: bzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bzi implements bzn {
    public final atjs a;
    public final int b;
    public audx c;
    public bzm d;
    public int e = 0;
    private final Class f;
    private final int[] g;
    private int h = 0;

    public bzi(Class cls, audx audx, int i, atjs atjs, int[] iArr) {
        iva.a((Object) cls);
        this.f = cls;
        iva.a((Object) audx);
        this.c = audx;
        this.b = i;
        this.a = atjs;
        this.g = iArr;
    }

    public static boolean a(long j, long j2, long j3) {
        return j >= j2 && j <= j2 + j3;
    }

    public boolean a(Collection collection, Collection collection2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        this.e = 0;
        return 0;
    }

    public boolean c() {
        return this.e != this.h;
    }

    public final int d() {
        int i = this.e;
        this.h = i;
        return i;
    }

    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.f.equals(obj.getClass())) {
            return this.c.equals(((bzn) obj).f());
        }
        return false;
    }

    public final audx f() {
        return this.c;
    }

    public int[] g() {
        return this.g;
    }

    public bza h() {
        ((anih) ((anih) bxk.a.c()).a("bzi", "h", 196, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BaseFenceImpl] getTimeIntervalsWhenFenceIsTrue is not supposed to be called without overriding");
        return bza.b();
    }

    public int hashCode() {
        audx audx = this.c;
        return Arrays.hashCode(new Object[]{audx.getClass(), Integer.valueOf(audx.hashCode())});
    }

    public long i() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int a(boolean z) {
        int a2 = FenceState.a(z);
        this.e = a2;
        return a2;
    }

    /* access modifiers changed from: protected */
    public final int a(boolean z, long j) {
        if (z && this.e != 2) {
            cbi.E().a(j, this.d);
        }
        int a2 = FenceState.a(z);
        this.e = a2;
        return a2;
    }
}
