package defpackage;

import android.content.Context;
import com.google.android.gms.R;

/* renamed from: aapt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aapt extends jnd {
    public int k = Integer.MAX_VALUE;
    public int l;
    public CharSequence m;

    public aapt(Context context) {
        super(context);
    }

    public static int a(jly jly, jly jly2) {
        int i;
        if (jly == jly2) {
            return 0;
        }
        aapt aapt = (aapt) jly;
        int i2 = aapt.k;
        int c = jly2.c();
        if (i2 < c) {
            i = -1;
        } else {
            i = i2 == c ? 0 : 1;
        }
        if (i != 0) {
            return i;
        }
        CharSequence charSequence = aapt.m;
        CharSequence b = jly2.b();
        if (charSequence != null && b != null) {
            return String.CASE_INSENSITIVE_ORDER.compare(charSequence.toString(), b.toString());
        }
        if (charSequence == b) {
            return 0;
        }
        if (charSequence != null) {
            return 1;
        }
        return -1;
    }

    public final int a() {
        return this.l;
    }

    public final void a(int i) {
        this.k = i;
    }

    public final void a(CharSequence charSequence) {
        this.m = charSequence;
    }

    public final void a(jmw jmw) {
    }

    public final CharSequence b() {
        return this.m;
    }

    public final int c() {
        return this.k;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a(this, (jly) obj);
    }

    public final void d(int i) {
        this.l = i;
    }

    public final boolean d() {
        return false;
    }

    public final int e() {
        return R.layout.find_my_device_top_toggle;
    }

    public final jms f() {
        return aaps.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int identityHashCode = System.identityHashCode(this);
        int i = this.k;
        String valueOf = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 25 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append("@");
        sb.append(identityHashCode);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }

    public final int a(jly jly) {
        return a(this, jly);
    }
}
