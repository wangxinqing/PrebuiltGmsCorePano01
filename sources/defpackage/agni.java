package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: agni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agni {
    String a;
    final long b;
    final long c;
    final long d;
    public volatile List e;
    final int f = 1;
    final int g;

    static {
        new agni("", SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);
    }

    private agni(String str, long j, long j2, long j3, int i) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.g = i;
        if (i == 1) {
            this.e = Collections.synchronizedList(new ArrayList());
        } else {
            this.e = Collections.emptyList();
        }
    }

    public static agni a(aghz aghz, String str, long j, long j2, long j3) {
        amrl.a((Object) aghz);
        return new agni(str, j, j2, j3, 4);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.g == 1;
    }

    static agni a(String str, long j, int i) {
        return new agni(str, SystemClock.elapsedRealtime(), -1, j, i);
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        if (this.e == Collections.EMPTY_LIST) {
            this.e = new ArrayList();
        }
        this.e.addAll(list);
    }
}
