package defpackage;

import java.util.ArrayList;

/* renamed from: yct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yct {
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();

    public yct() {
        a("");
    }

    public synchronized void a() {
        throw null;
    }

    public synchronized void a(String str) {
        this.a.add(Long.valueOf(System.currentTimeMillis()));
        this.b.add(str);
    }
}
