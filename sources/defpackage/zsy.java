package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zsy {
    public final Long a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Long h;
    public final boolean i;
    public String j;
    public String k;
    public aqxz l;
    public aqya m;
    public aqyd n;
    public final List o;

    public zsy(Long l2, Long l3, String str, String str2, String str3, String str4, Long l4, Long l5, int i2) {
        this.a = l2;
        this.b = l3;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = l4;
        this.h = l5;
        this.i = i2 != 1 ? false : true;
        this.o = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return !TextUtils.isEmpty(this.d);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return !TextUtils.isEmpty(this.e);
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return !TextUtils.isEmpty(this.f);
    }
}
