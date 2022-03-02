package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ydk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydk {
    public final Long a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public String f;
    public final String g;
    public final String h;
    public aqxz i;
    public aqya j;
    public aqyd k;
    public final long l;
    public final int m;
    public final List n = new ArrayList();

    public ydk(Long l2, Long l3, String str, String str2, String str3, int i2, long j2, String str4, String str5) {
        this.a = l2;
        this.b = l3;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.m = i2;
        this.l = j2;
        this.g = str4;
        this.h = str5;
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.e);
    }
}
