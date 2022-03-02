package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zow implements amqy {
    private final AtomicReference a;
    private final zqz b;
    private final String c;
    private final String d;

    public zow(AtomicReference atomicReference, zqz zqz, String str, String str2) {
        this.a = atomicReference;
        this.b = zqz;
        this.c = str;
        this.d = str2;
    }

    public final Object a(Object obj) {
        AtomicReference atomicReference = this.a;
        zqz zqz = this.b;
        String str = this.c;
        String str2 = this.d;
        zra zra = (zra) obj;
        atomicReference.set(zra);
        aucd aucd = (aucd) zqz.c(5);
        aucd.a((aucj) zqz);
        String b2 = zox.b(str, str2);
        b2.getClass();
        zra.getClass();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        zqz zqz2 = (zqz) aucd.b;
        zqz zqz3 = zqz.b;
        audr audr = zqz2.a;
        if (!audr.a) {
            zqz2.a = audr.a();
        }
        zqz2.a.put(b2, zra);
        return (zqz) aucd.i();
    }
}
