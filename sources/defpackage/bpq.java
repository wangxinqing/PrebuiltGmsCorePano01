package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: bpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bpq {
    public final ExecutorService a;
    public final Object b = new Object();
    public final ArrayDeque c;
    public final ArrayList d;
    public int e = 0;
    public final heq f;

    public bpq(heq heq, ExecutorService executorService) {
        this.f = heq;
        this.a = executorService;
        this.c = new ArrayDeque();
        this.d = new ArrayList();
    }
}
