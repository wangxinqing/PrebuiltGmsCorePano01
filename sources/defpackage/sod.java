package defpackage;

import com.google.android.gms.mdns.MdnsServiceInfo;

/* renamed from: sod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sod extends sok {
    final /* synthetic */ MdnsServiceInfo a;

    public sod(MdnsServiceInfo mdnsServiceInfo) {
        this.a = mdnsServiceInfo;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        uow uow = (uow) obj;
        uow.b.a((Runnable) new uoo(uow, uow.a, this.a, uow.c));
    }
}
