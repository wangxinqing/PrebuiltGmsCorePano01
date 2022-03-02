package defpackage;

import com.google.android.gms.R;

/* renamed from: muo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class muo {
    public final Integer a;
    public final String b;
    final int c;
    final String d;
    public final Object e;
    public final String f;

    public muo(String str, Integer num, Object obj, String str2, int i, String str3) {
        this.d = str;
        this.e = obj;
        this.a = num;
        this.b = str2;
        this.c = i;
        this.f = str3;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        Integer num = this.a;
        return num != null && num.equals(Integer.valueOf(R.string.common_loading));
    }

    public final boolean b() {
        return (this.b == null || this.f == null) ? false : true;
    }
}
