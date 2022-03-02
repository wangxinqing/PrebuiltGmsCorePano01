package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: acrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acrr extends acrl {
    public long h;
    private final boolean i;
    private final int j;
    private final String[] k;
    private final avvo[] l;
    private final avsd m;
    private final boolean n;

    public acrr() {
        super("UnifiedDumpsysTask", "", "", false, (byte[]) null);
        this.h = TimeUnit.DAYS.toSeconds(1);
        this.i = false;
        this.j = -1;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = false;
    }

    public final int a() {
        avsd avsd = this.m;
        if (avsd != null) {
            return avsd.f;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public final avwc b(Context context, InputStream inputStream, long j2, long j3, hph hph) {
        return a(context, inputStream, j2, j3, hph, this.n);
    }

    public final long c() {
        return this.h;
    }

    public final long d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final String[] a(long j2, long j3) {
        String str;
        avvo[] avvoArr = this.l;
        if (avvoArr == null || avvoArr.length == 0) {
            return this.k;
        }
        String[] strArr = this.k;
        avvo avvo = avvo.START_MILLIS;
        int ordinal = avvoArr[0].ordinal();
        if (ordinal == 0) {
            str = String.valueOf(j2);
        } else if (ordinal != 1) {
            str = "";
        } else {
            str = String.valueOf(TimeUnit.HOURS.convert(j3 - j2, TimeUnit.MILLISECONDS));
        }
        return (String[]) jhx.b(strArr, str);
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= this.j && this.i;
    }

    public acrr(String str, avvp avvp) {
        super(str, avvp.b, avvp.e, avvp.f, (byte[]) null);
        this.h = TimeUnit.DAYS.toSeconds(1);
        this.i = avvp.a;
        this.j = avvp.d;
        this.k = (String[]) avvp.c.toArray(new String[0]);
        this.l = (avvo[]) new aucu(avvp.h, avvp.i).toArray(new avvo[0]);
        avsd a = avsd.a(avvp.g);
        this.m = a == null ? avsd.UNMETERED_OR_DAILY : a;
        this.n = avvp.j;
        this.h = avvp.k;
    }
}
