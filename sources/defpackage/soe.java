package defpackage;

import com.google.android.gms.mdns.MdnsServiceInfo;

/* renamed from: soe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class soe extends sok {
    final /* synthetic */ MdnsServiceInfo a;

    public soe(MdnsServiceInfo mdnsServiceInfo) {
        this.a = mdnsServiceInfo;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        uow uow = (uow) obj;
        uow.b.a((Runnable) new uop(uow, uow.a, this.a, uow.c));
    }
}
