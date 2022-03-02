package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: vgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgx {
    public long a;
    public final tgh b;
    public final LinkedList c = new LinkedList();
    public final LinkedList d = new LinkedList();
    public final LinkedList e = new LinkedList();
    public int f;
    private final long g;
    private final auyt h;

    public vgx(tgh tgh, auyt auyt) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        auyz auyz = auyt.i;
        this.g = elapsedRealtime + (auyz == null ? auyz.f : auyz).e;
        this.b = tgh;
        this.f = 1;
        this.h = auyt;
        a();
    }

    private static void a(List list, String str, LinkedList linkedList) {
        if (!linkedList.isEmpty()) {
            list.add(String.format("%s %sms ago", new Object[]{str, Long.valueOf(System.currentTimeMillis() - ((avam) linkedList.getLast()).d)}));
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, "audio", this.c);
        a(arrayList, "BLE", this.d);
        a(arrayList, "bluetooth", this.e);
        String a2 = this.b.a();
        String a3 = amre.a(",").a((Iterable) arrayList);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 9 + String.valueOf(a3).length());
        sb.append(a2);
        sb.append(" seen on ");
        sb.append(a3);
        return sb.toString();
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        auyz auyz = this.h.i;
        if (auyz == null) {
            auyz = auyz.f;
        }
        long j = elapsedRealtime + auyz.d;
        this.a = j;
        long j2 = this.g;
        if (j > j2) {
            this.a = j2;
        }
    }

    public final void a(List list) {
        while (true) {
            long size = (long) list.size();
            auyz auyz = this.h.i;
            if (auyz == null) {
                auyz = auyz.f;
            }
            if (size > auyz.c) {
                list.remove(0);
            } else {
                return;
            }
        }
    }
}
