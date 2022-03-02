package defpackage;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: nvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvi {
    public nuv a;
    Socket b;
    public int c = -1;
    volatile Thread d;
    volatile Thread e;
    public volatile boolean f;
    public boolean g;
    long h;
    public boolean i;
    int j;
    boolean k = false;
    boolean l = false;
    final ArrayList m = new ArrayList();
    final Map n = new TreeMap();
    final BlockingQueue o = new LinkedBlockingQueue();
    int p;
    int q = 1;
    int r;

    public nvi(nuv nuv) {
        this.a = nuv;
    }

    public final int a() {
        return this.a.b;
    }

    public final void a(int i2) {
        this.a.b = i2;
    }

    public final void a(String str) {
        this.a.a = str;
    }
}
