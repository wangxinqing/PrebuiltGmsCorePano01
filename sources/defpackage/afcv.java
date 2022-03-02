package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: afcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afcv {
    final ReentrantReadWriteLock a = new ReentrantReadWriteLock(true);
    public final awdn b;
    public final afcj c;
    public final aeri d;
    public final awdn e;
    public final afca f;

    public afcv(awdn awdn, afcj afcj, aeri aeri, awdn awdn2, afca afca) {
        this.b = awdn;
        this.c = afcj;
        this.d = aeri;
        this.e = awdn2;
        this.f = afca;
    }

    public final afdo a() {
        return new afct(this);
    }

    public final afdp b() {
        return new afcu(this);
    }
}
